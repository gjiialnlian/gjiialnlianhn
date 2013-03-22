(function($j){	
	$j(document).ready(function(){ 
		
		registration = {
		
			init : function(){
				$j('#register').unbind('click').on({
					click : function(){
						registration.submit();
					}
				});
			},
			submit : function(){
				
				var fields = {
						firstname:{method:'empty',label:'Firstname'},
						lastname:{method:'empty',label:'Lastname'},
						email:{method:'email',label:'Email'},
						password:{method:'empty,length,password',label:'Password',minL:8,maxL:25}
				};
				
				if($jvalid.isFormFieldValid({	
					data: $j('#registrationForm').serializeArray(),
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
					$jjson.sendReq({
						url : $jjson.url+'register',
						type : 'post',
						opType : 'add',
						data : $j('#registrationForm').serializeArray()},{
							onSuccess : function(res){
									alert(res.responseMessage);
							},
							onFailed : function(res){
								alert(res.responseMessage);							
							},
							onLoad : function(){
								alert('OnLoading ...');
							},
							onUnload : function(){
								alert('OnUnLoading ...');
							}
						}
					);
				}
			}
		};
		
		registration.init();
		
	});
})(jQuery);