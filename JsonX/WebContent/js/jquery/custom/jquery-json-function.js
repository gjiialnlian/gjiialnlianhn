(function($j){
	$jjson = {
		url : 'jsonCall/',
		sendReq : function(req,evt){	
			try{evt.onLoad();}catch(err){}
			var data_ = null;
			var newData = null;

			if(req.type == 'get'){
				data_ = req.data;
				data_.opType = req.opType;
			}else if(req.type == 'post'){
				var data = req.data;
				var dataKeys = Object.keys(data);
				for(var i = 0; i < dataKeys.length; i++){	
					if($jvalid.digitRegex.test(dataKeys[i])){
						if(newData == null)
							newData = '{"'+data[dataKeys[i]]['name']+'" : "'+data[dataKeys[i]]['value']+'"';
						else
							newData += ',"'+data[dataKeys[i]]['name']+'" : "'+data[dataKeys[i]]['value']+'"';
					}	
				}
				
				if(newData != null){	
					newData += '}';
					data_ = $j.parseJSON(newData);
					data_.opType = req.opType;
					newData = null;
					data = null;
				}
			}

			var xhr = $j.ajax({
				  cache: false,
				  url:req.url,
				  type:req.type,
				  data:data_,
				  dataType: 'json',
				  beforeSend:function(xhr) {
					try{evt.onBefore();}catch(err){}
				  },
				  success:function(res){
					 if(res.responseStatus == '1') 
						 try{evt.onSuccess(res);}catch(err){}
					 else
						 try{evt.onFailed(res);}catch(err){}
					 try{evt.onUnload();}catch(err){}
				  },
				  error: function(){
					  try{evt.onError();}catch(err){}
					  try{evt.onUnload();}catch(err){}
				  }
			});
			
			if(req.abort != null && req.abort)
				return xhr;
			else 
				return false;
		},
		abort : function(xhr){
			if(xhr instanceof window.XMLHttpRequest)
				xhr.abort();
		}
	}
})(jQuery);
    
    