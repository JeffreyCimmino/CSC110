println("Please enter two numbers defining the range.")

var a:Int = readInt()
var b:Int = readInt()

if(a > b){
	var c:Int = a
	var d:Int = b
	a = d
	b = c
}
println("Please enter a number between " + a + " and " + b + ".")
var x:Int = readInt()
while(x < a || x > b){
	println("That number is not between " + a + " and " + b + ".")
	println("Please enter a number between " + a + " and " + b + ".")
	x = readInt()
}
println("The number " + x + " is between " + a + " and " + b + ".")