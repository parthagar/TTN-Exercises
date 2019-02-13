function submitDetails(){
			var amt = prompt('Enter amount: ');
			if (amt != null) {
				document.getElementById("amt").innerHTML = "Amount: " + amt;
			}
			
			var ir = prompt('Enter interest rate: ');
			if (ir != null) {
				document.getElementById('interest-rate').innerHTML = "Interest Rate: " + ir;
			}

			var noy = prompt('Enter number of years: ');
			if (noy != null) {
				document.getElementById('no-of-years').innerHTML = "Number of years: " + noy;
			}

			var si = amt * noy * ir / 100;
			document.getElementById('si').innerHTML = "<br><br> Simple Interest: " + si;
		}