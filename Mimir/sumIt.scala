var sum:Int = 0

println("Please enter a list of numbers terminated by a 0.")

var n:Int = readInt()

while(n != 0){
	sum = sum + n
	
	n = readInt()
}
println(sum)

