$(document).ready(
		function(){
			
			$("#reg").click(function(e){
				e.stopPropagation();
				e.preventDefault();
				var U1 = document.getElementById("register");
				U1.style.display="block"; 
				return false;
			});
			
			$("#button").click(function(){
				var U1 = document.getElementById("register");
				U1.style.display="none"; 
				return false;
			});
			
		});
