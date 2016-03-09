println("Player 1, what is your name?");
val p1Name = readLine();
println("Ok, " + p1Name + ", what is your age?");
val p1Age = readInt();
println("Player 2, what is your name?");
val p2Name = readLine();
println("Ok, " + p2Name + ", what is your age?");
val p2Age = readInt();
if(p1Age > p2Age){
	println(p1Name + " is older than " + p2Name + ".");
	println(p2Name + " is younger than " + p1Name + ".");
}
else if(p1Age < p2Age){
	println(p2Name + " is older than " + p1Name + ".");
	println(p1Name + " is younger than " + p2Name + ".");
}
else if(p1Age == p2Age){
	println("Wow! " + p1Name + " and " + p2Name + " are the same age.");
}
