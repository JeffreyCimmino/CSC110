val monthString = Array("January","February","March","April","May","June","July","August","September","October","November","December");
println("Please enter a month as a numeric value.");
val month = readInt();
val monthArray = month - 1;
if(month <= 0 || month >= 12){
	println("Invalid Month");
}
else{
	//println(monthString[monthArray]);
	for( i <- 1 to monthString.length){
		if(i-1 == monthArray){
			println(monthString(monthArray));
		}
	} 
}
