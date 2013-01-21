(function($){
	$wc = {
		fancyBox : function(el){
			el.fancybox({
				openEffect  : 'none',
				closeEffect	: 'none'
			});
		},
		clearError : function(){
			$('.errormsg').each(function(index) {
				$(this).remove();
			});
		},
		clearClass : function(clsName){
			$('.'+clsName).each(function(index) {
				$(this).remove();
			});
		},
		clearForm : function(form){
			var data = $('#'+form).serializeArray();
			var dataKeys = Object.keys(data);
			for(var i = 0; i < dataKeys.length; i++){	
				if($valid.digitRegex.test(dataKeys[i]))
					$('#'+data[dataKeys[i]]['name']).val('');
			}
		},
		createOverlay : function(){
			var bod = document.getElementsByTagName('body')[0];
			var table = bod.getElementsByTagName('table')[0];
			
			var overlay = document.createElement('div');
			overlay.id = 'contentOverlay';
			overlay.style.position = 'absolute';
			document.body.insertBefore(overlay,table);	
		},
		loadOverlay : function(){	
			var ht = document.body.offsetHeight;
			if (navigator.appName == 'Microsoft Internet Explorer')
				ht = ht*2;
			$('#contentOverlay').addClass('ui-widget-overlay');
			$('#contentOverlay').css('width','100%');
			$('#contentOverlay').css('height',ht);
			$('#contentOverlay').css('overflow','hidden');
		},
		unloadOverlay : function(){
			$('#contentOverlay').removeClass('ui-widget-overlay');
			$('#contentOverlay').css('width',0);
			$('#contentOverlay').css('height',0);
		}
	}
})(jQuery);
    
    