			var today = new Date();
			var dd = today.getDate()-2;
			var mm = today.getMonth() + 1;
			var yyyy = today.getFullYear();
			if (dd < 10) {
				dd = '0' + dd
			}
			if (mm < 10) {
				mm = '0' + mm
			}

			today = yyyy + '-' + mm + '-' + dd;
			document.getElementById("servdate").setAttribute("max", today);
			
			today = new Date();
		    dd = today.getDate();
		    mm = today.getMonth() + 1;
		    yyyy = today.getFullYear();
			if (dd < 10) {
				dd = '0' + dd
			}
			if (mm < 10) {
				mm = '0' + mm
			}

			today = yyyy + '-' + mm + '-' + dd;
			document.getElementById("servdate").setAttribute("max", today);