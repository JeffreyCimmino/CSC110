println("What is the number of inches to convert?");
val x = readInt();
val y = x/12;
val z = x%12;
if(x < 0){
	println("Negative numbers are not allowed.");
}
else if(y == 0){
	if(x == 1){
		println(x + " inch is " + x + " inch.");
	}
	else{
		println(x + " inches is " + x + " inches.");
	}
}
else if(z == 0){
	if(y == 1){
		println(x + " inches is " + y + " foot.");
	}
	else{
		println(x + " inches is " + y + " feet.");
	}
}
else{
	if(y == 1){
		if(z == 1){
			println(x + " inches is " + y + " foot " + z + " inch.");
		}
		else{
			println(x + " inches is " + y + " foot " + z + " inches.");
		}
	}
	else{
		if(z == 1){
			println(x + " inches is " + y + " feet " + z + " inch.");
		}
		else{
			println(x + " inches is " + y + " feet " + z + " inches.");
		}
	}
}
