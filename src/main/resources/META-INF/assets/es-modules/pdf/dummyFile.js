import jquery from "jquery";

export function dummyFileLog(parameter) {
	console.log(parameter);
	var counter = 0;
	setInterval(function() {
		// document.getElementById("message").innerHTML = "message " + counter;
		jquery("#message").text("parameter " + counter);
		counter++;
	}, 1000);
}