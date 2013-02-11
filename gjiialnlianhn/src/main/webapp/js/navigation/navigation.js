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
		
		nav.init();
	});
})(jQuery);

