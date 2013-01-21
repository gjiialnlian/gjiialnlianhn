(function($){
	
	$(document).ready(function(){ 
		
		nav = {
			init : function(){
				$('.navtab').each(function() {
					$(this).find('li:eq(0) > a').on({
						click : function(){
							nav.select($(this).parent().parent());
						}
					});	
				});
				
				nav.select($('.dashboard').parent());
			},
			select : function(e){
				$('.navtab').each(function() {
					if($(this).attr('class').indexOf('current') > -1){
						$(this).removeClass('current');
						$(this).addClass('select');
					}
				});
				
				e.removeClass('select');
				e.addClass('current');
				$('#page-heading > h1:eq(0)').html(e.find('li:eq(0)').attr('class').toUpperCase());
				nav.getContent(e.find('li:eq(0)').attr('class'));
			},
			getContent : function(navid){	
				$.ajax({
					  url: navid,
					  success: function(data) {
					    $('#navContent').html(data);
					    nav.loadNav(navid);
					  }
				});
			},
			loadNav : function(id){
				if(id.indexOf('category') > -1) 
					category.init();
	
			}
		}
		
		category = {
			
			init : function(){
				$('.catnav').each(function() { 
					$(this).on({
						click : function(){
							category.select($(this).parent().parent());
						}
					});	
				});
				
				category.select($('.details').parent().parent());
			},
			select : function(e){
				$('.catnav').each(function() {
					if($(this).parent().parent().find('div:eq(1)').attr('class').indexOf('dark') > -1){
						$(this).parent().parent().find('div:eq(1)').removeClass('step-dark-left');
						$(this).parent().parent().find('div:eq(1)').addClass('step-light-left');	
					}
					if($(this).parent().parent().find('div:eq(2)').attr('class').indexOf('dark') > -1){
						$(this).parent().parent().find('div:eq(2)').removeClass('step-dark-right');
						$(this).parent().parent().find('div:eq(2)').addClass('step-light-right');	
					}
				});
				
			
				e.find('div:eq(1)').removeClass('step-light-left');
				e.find('div:eq(2)').removeClass('step-light-right');
				e.find('div:eq(1)').addClass('step-dark-left');
				e.find('div:eq(2)').addClass('step-dark-right');
				//$('#page-heading > h1:eq(0)').html(e.find('li:eq(0)').attr('class').toUpperCase());
				category.getContent(e.find('div:eq(1) > a:eq(0)').attr('class'));
			},
			getContent : function(catNav){	
				if(catNav.indexOf('add') > -1)
					catNav = 'addCategory'
				
				$.ajax({
					  url: catNav,
					  success: function(data) {
					    $('#detailsContent').html(data);
					    category.loadCategory();
					  }
				});
			},
			loadCategory : function(){
				
				CategoryDWR.getAll({
					callback:function(data){ 
						for(var i = 0; i < data.length; i++){	
							$('#catOpt').append(new Option(data[i].name,data[i].id));
						}
					}		
				});
				
				
				$('.form-submit').on({
					click : function(){
						category.addItem();
						$('#uploadForm').submit();
					}
				});	
				
				$('.form-reset').on({
					click : function(){
						alert('rest');
					}
				});	
			},
			addItem : function(){
				
				var fields = {
						name:{method:'empty,length,allow,xss',label:'Name',minL:0,maxL:255},
						catOpt:{method:'empty',label:'Category'},
						url:{method:'empty,length,allow,xss',label:'Url',minL:0,maxL:2000}
				}
				
				var form = $('#addCategoryForm');
				if($valid.isFormFieldValid({	
						data: form.serializeArray(),
						fields: fields,
						message : function(msgs){
							var keys = Object.keys(msgs); 
							for(var i = 0; i < keys.length ; i++){
								alert(msgs[keys[i]]);
								break;
							}
						}
					}
				)){
					ItemDWR.add(form.find('#name').val(), form.find('#catOpt').val(), form.find('#url').val(),{
						callback:function(data){
							if(data == '1'){
								alert('Item was added succesfully.');
								nav.loadNav('category');
							}else{
								alert('Error processing your request.');
							}	
						}		
					});
				}
			}
		}
		
		nav.init();

	});
})(jQuery);

