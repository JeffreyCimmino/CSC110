println("How many numbers should I read?")
var num:Int = readInt()

println("What is the threshold?")
var t:Double = readLine().toDouble

println("Please enter " + num + " numbers.")
var i:Int = 0
var result:Int = 0
while(i < num){
	var x = readLine().toDouble
	if(x > t){
		result = result + 1
	}
	i = i + 1
}
println("There were " + result + " values above the threshold.")