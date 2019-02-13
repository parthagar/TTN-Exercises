function checkPalin(){
			var str = prompt('Enter string to be checked: ');
			document.getElementById('response').innerHTML = 'String entered:<br>' + str + "<br><br>";

			if (str == str.split("").reverse().join("")){
				document.getElementById('response').insertAdjacentHTML('beforeend', "<br>String IS A palindrome");
			}

			else{
				document.getElementById('response').insertAdjacentHTML('beforeend', "<br>String is NOT a palindrome");
			}
		}