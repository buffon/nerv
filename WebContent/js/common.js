;
$.extend({COMMONajax:function(method,url,params,t){
	$.ajax({
		method : method,
		url : url,
		data : params,
		success : function(data) {
			t(data);
		}
	});
}});