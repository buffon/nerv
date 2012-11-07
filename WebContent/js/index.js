$(document).ready(
		function() {
			$("#addcontent").hide();
			$("#addlink").click(function() {
				$("#addcontent").toggle();
				return true;
			});
			$("#addlink2").click(
					function() {
						var params="email="+$("#email").val()+"&username="+$("#username").val()
						+"&password="+$("#password").val();
						$.ajax({
							method : "get",
							url : "./login",
							data : params,
							success : function(data) {
								if (data == "false") {
									alert("false");
								} else {
									alert("success");
								}
							}
						});
					});
			$("#querylink").click(function(){
				var params = "email="+"chen";
				function t(data){
					alert(data);
				}
				
				COMMON.ajax("get","./login",params,t);
			});
		});
