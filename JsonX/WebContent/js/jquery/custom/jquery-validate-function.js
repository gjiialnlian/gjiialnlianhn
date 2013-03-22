(function($j){
	$jerrormsg = {
		password : '%%label%% is invalid.',	
		allowed : '%%label%% contains invalid characters.',	
		ascii : '%%label%% contains non-ASCII characters.',
		xss : '%%label%% contains XSS.',
		alphanum : '%%label%% contains non-alpha-numeric characters.',
		digit : '%%label%% is not a number.',
		email : '%%label%% is not valid email.',
		notallow : '%%label%% email not allowed.',
		minlength : 'Minimum size for %%label%% is %%length%% characters.',
		maxlength : 'Maximum size for %%label%% is %%length%% characters.',
		empty : '%%label%% is required.',
		match : '%%label%% does not match.'
	},
	$jvalid = {
		allowedChar : /^([a-zA-Z0-9 \\'\\\"/.,@#!&_=;:%?*+^$[\]\\(){}|-]+)$/,	
		asciiPrintCharRegex : /^[\x20-\x7E\x0A\x0D]*$/,
		alphaNumRegex : /^([a-zA-Z0-9_-]+)$/,
		digitRegex : /^\d+$/,
		emailRegex : /^(([^<>()[\]\\.,;:\s@\""]+(\.[^<>()[\]\\.,;:\s@\""]+)*)|(\"".+\""))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/i,
		currencyRegex : /(?:^\d{1,3}(?:\.?\d{3})*(?:,\d{2})?$)|(?:^\d{1,3}(?:,?\d{3})*(?:\.\d{2})?$)/,
		zipCodeRegex: /(^\d{5}$)|(^\d{5}-\d{4}$)/,
		isNotBlankRegex: /^.+$/,
		// format is mm/dd/yyyy
		dateRegex: /^((0?[1-9]|1[012])[- /.](0?[1-9]|[12][0-9]|3[01])[- /.](19|20)?[0-9]{2})*$/,
		password: /^([a-zA-Z0-9!@#$%^&*_=+-]+)$/,

		isAllowPassword : function(text,label,evt){
			return $jvalid.execute({
				validate: function(){
					if(text != null && text.length > 0)
						return $jvalid.password.test(text);
					else
						return true;
				},event:evt,msg:$jerrormsg.password.replace('%%label%%', label)
			});
		},
		isAllowChar : function(text,label,evt){
			return $jvalid.execute({
				validate: function(){
					if(text != null && text.length > 0)
						return $jvalid.allowedChar.test(text);
					else
						return true;
				},event:evt,msg:$jerrormsg.allowed.replace('%%label%%', label)
			});
		},
		isAlphaNum : function(text,label,evt){
			return $jvalid.execute({
				validate: function(){
					return $jvalid.alphaNumRegex.test(text);
				},event:evt,msg:$jerrormsg.alphanum.replace('%%label%%', label)
			});
		},
		isAscii : function(text,label,evt){
			return $jvalid.execute({
				validate: function(){
					return $jvalid.asciiPrintCharRegex.test(text);
				},event:evt,msg:$jerrormsg.ascii.replace('%%label%%', label)
			});
		},
		isXSSValid : function(text,label,evt){
			return $jvalid.execute({
				validate: function(){
					return $jvalid.isAscii(text) && !((text.indexOf("<") >= 0) || (text.indexOf(">") >= 0) || (text.indexOf("&lt;") >= 0) || (text.indexOf("&gt;") >= 0));
				},event:evt,msg:$jerrormsg.xss.replace('%%label%%', label)
			});
		},
		isDigit : function(text,label,evt){
			return $jvalid.execute({
				validate: function(){
					return $jvalid.digitRegex.test(text) && !$j.isEmptyObject(text) && text.length > 0;
				},event:evt,msg:$jerrormsg.digit.replace('%%label%%', label)
			});
		},
		isEmailValid : function(text,label,evt) {
			return $jvalid.execute({
				validate: function(){
					if(!$j.isEmptyObject(text))
						return $jvalid.emailRegex.test(text);
					return false;
				},event:evt,msg:$jerrormsg.email.replace('%%label%%', label)
			});
		},
		isEmailAllow : function(text,label,evt) {
			return $jvalid.execute({
				validate: function(){
					if(!$j.isEmptyObject(text)) {
						var dm = text.indexOf('@');
						if(text.toLowerCase().substring(dm,text.length).indexOf('pcmall.com') < 0)
							return true;
					}
					return false;
				},event:evt,msg:$jerrormsg.notallow.replace('%%label%%', 'PC Mall')
			});
		},
		isNotEmpty : function(text,label,evt){
			return $jvalid.execute({
				validate: function(){
					return !$j.isEmptyObject(text) && $j.trim(text).length > 0;
				},event:evt,msg:$jerrormsg.empty.replace('%%label%%', label)
			});
		},
		isMatch : function(text1,text2,label,evt){
			return $jvalid.execute({
				validate: function(){
					return text1 == text2;
				},event:evt,msg:$jerrormsg.match.replace('%%label%%', label)
			});
		},
		execute : function(e){
			if($j.isEmptyObject(e.event))
				return e.validate();
			else{
				try{
					if(e.validate())
						return true;
					else
						return e.event.message(e.msg);
				}catch(err){}
				return false;
			}	
		},
		execute2 : function(e){
			return e.validate();
		},
		isLengthValid : function(text,minL,maxL,label,evt){
			return $jvalid.execute2({
				validate: function(){
					var msg = null;
					if (!$j.isEmptyObject(text)){
						if(text.length < minL)
							msg = $jerrormsg.minlength.replace('%%label%%',label).replace('%%length%%',minL);
						else if(text.length > maxL)
							msg = $jerrormsg.maxlength.replace('%%label%%',label).replace('%%length%%',maxL);
				
						if(msg != null){
							if(!$j.isEmptyObject(evt))
								evt.message(msg);
							return false
						}
						return true;
					}	
					return false;
				}
			});
		},
		isFormFieldValid : function(e){
			var valid = $jvalid.execute2({
				validate: function(){
					var data = e.data;
					var dataKeys = Object.keys(data);
					var fields = e.fields; 
					var fieldKeys = Object.keys(fields);
					var messages = '';
					
					for(var i = 0; i < dataKeys.length; i++){	
						if($jvalid.digitRegex.test(dataKeys[i])){
							for(var j = 0; j < fieldKeys.length; j++){		
								if(fieldKeys[j] == data[dataKeys[i]]['name']){
									var method = fields[fieldKeys[j]]['method'].split(',');
									for(var k = 0; k < method.length; k++){
										if(method[k] == 'empty'){
											if($jvalid.isNotEmpty(data[dataKeys[i]]['value'],fields[fieldKeys[j]]['label'],{
												message:function(msg){		
													if(messages == '')
														messages = '{"'+fieldKeys[j]+'" : "'+msg+'"';
													else
														messages += ',"'+fieldKeys[j]+'" : "'+msg+'"';
												}
											}))	continue;
											else break;
										}
										if(method[k] == 'password'){
											if($jvalid.isAllowPassword(data[dataKeys[i]]['value'],fields[fieldKeys[j]]['minL'],fields[fieldKeys[j]]['maxL'],fields[fieldKeys[j]]['label'],{
												message:function(msg){		
													if(messages == '')
														messages = '{"'+fieldKeys[j]+'" : "'+msg+'"';
													else
														messages += ',"'+fieldKeys[j]+'" : "'+msg+'"';
												}
											})) continue;
											else break;
										}
										if(method[k] == 'length'){
											if($jvalid.isLengthValid(data[dataKeys[i]]['value'],fields[fieldKeys[j]]['minL'],fields[fieldKeys[j]]['maxL'],fields[fieldKeys[j]]['label'],{
												message:function(msg){		
													if(messages == '')
														messages = '{"'+fieldKeys[j]+'" : "'+msg+'"';
													else
														messages += ',"'+fieldKeys[j]+'" : "'+msg+'"';
												}
											})) continue;
											else break;
										}
										if(method[k] == 'allow'){
											if($jvalid.isAllowChar(data[dataKeys[i]]['value'],fields[fieldKeys[j]]['label'],{
												message:function(msg){		
													if(messages == '')
														messages = '{"'+fieldKeys[j]+'" : "'+msg+'"';
													else
														messages += ',"'+fieldKeys[j]+'" : "'+msg+'"';
												}
											})) continue;
											else break;
										}
										if(method[k] == 'alphanum'){
											if($jvalid.isAlphaNum(data[dataKeys[i]]['value'],fields[fieldKeys[j]]['label'],{
												message:function(msg){		
													if(messages == '')
														messages = '{"'+fieldKeys[j]+'" : "'+msg+'"';
													else
														messages += ',"'+fieldKeys[j]+'" : "'+msg+'"';
												}
											})) continue;
											else break;
										}
										if(method[k] == 'ascii'){
											if($jvalid.isAscii(data[dataKeys[i]]['value'],fields[fieldKeys[j]]['label'],{
												message:function(msg){		
													if(messages == '')
														messages = '{"'+fieldKeys[j]+'" : "'+msg+'"';
													else
														messages += ',"'+fieldKeys[j]+'" : "'+msg+'"';
												}
											})) continue;
											else break;
										}
										if(method[k] == 'xss'){
											if($jvalid.isXSSValid(data[dataKeys[i]]['value'],fields[fieldKeys[j]]['label'],{
												message:function(msg){		
													if(messages == '')
														messages = '{"'+fieldKeys[j]+'" : "'+msg+'"';
													else
														messages += ',"'+fieldKeys[j]+'" : "'+msg+'"';
												}
											})) continue;
											else break;
										}
										if(method[k] == 'number'){
											if(data[dataKeys[i]]['value'] == '')
												continue;
											
											if($jvalid.isDigit(data[dataKeys[i]]['value'],fields[fieldKeys[j]]['label'],{
												message:function(msg){		
													if(messages == '')
														messages = '{"'+fieldKeys[j]+'" : "'+msg+'"';
													else
														messages += ',"'+fieldKeys[j]+'" : "'+msg+'"';
												}
											})) continue;
											else break;
										}
										if(method[k] == 'email'){
											if($jvalid.isEmailValid(data[dataKeys[i]]['value'],fields[fieldKeys[j]]['label'],{
												message:function(msg){		
													if(messages == '')
														messages = '{"'+fieldKeys[j]+'" : "'+msg+'"';
													else
														messages += ',"'+fieldKeys[j]+'" : "'+msg+'"'; 
												}
											})){
												if($jvalid.isEmailAllow(data[dataKeys[i]]['value'],fields[fieldKeys[j]]['label'],{
												message:function(msg){		
													if(messages == '')
														messages = '{"'+fieldKeys[j]+'" : "'+msg+'"';
													else
														messages += ',"'+fieldKeys[j]+'" : "'+msg+'"'; 
												}
												})) continue;	
												else break;
											}
											else break; 
										}
										if(method[k] == 'match'){
											var isMatch = false;
											for(var a = 0; a < dataKeys.length; a++){
												if(data[dataKeys[a]]['name'] == fields[fieldKeys[j]]['match']){
													if($jvalid.isMatch(data[dataKeys[i]]['value'],data[dataKeys[a]]['value'],fields[fieldKeys[j]]['label'],{
														message:function(msg){		
															if(messages == '')
																messages = '{"'+fieldKeys[j]+'" : "'+msg+'"';
															else
																messages += ',"'+fieldKeys[j]+'" : "'+msg+'"';
														}
													})){
														isMatch = true;
														break;
													}
													else break;	
												}	
											}
											
											if(isMatch)
												continue;
											break;
										}
									}
									break;
								}
							}	
						}	
					}
					if(messages.length > 0){	
						messages += '}';
						e.message($j.parseJSON(messages));
						return false;
					}else
						return true;
				}
			});	
			return valid;
		}		
	}	
})(jQuery);





