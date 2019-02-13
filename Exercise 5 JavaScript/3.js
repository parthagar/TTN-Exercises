function createCircle(){
			var r = prompt('Enter radius of circle: ');
			document.getElementById('response').innerHTML = 'Radius entered:<br>' + r + "<br><br>Area of circle: " + Math.PI * r * r;
			document.getElementById('circle').setAttribute('style', "width: " + (2 * r).toString() + "px; " + 
																	"height: " + (2 * r).toString() + "px; " +
																	"border-radius: " + r.toString() + "px; " +
																	"background: red;" +
																	"display: inline-block");
			
		}