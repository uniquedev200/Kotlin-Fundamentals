//some functions written to learn and test conditionals and functions in Kotlin
fun main(){
    //main to test all functions and run the program
    eligible_to_vote(17);
    var a:Int = 1;
    var b:Int = 1;
    var result = if(max(a,b)==-1) "equal" else max(a,b)
    println("Greater number is:$result")
    println("Sum function:${sum(1,2,3,4,5,6,7,8,9,10)}")

}
fun eligible_to_vote(age:Int){
    //prints eligibility to vote
   if(age>=18){
       println("You are eligible to vote")
   }else{
       println("You are not eligible to vote")
   }
}
fun max(a:Int,b:Int):Int{
    //returns greater of the two parameters if equal returns -1
    //return type defined , will throw error if value not returned
    if(a>b){
        return a
    }
    else if(b>a){
        return b
    }else{
        return -1
    }
}
fun sum(vararg numbers:Int):Int{
    //returns the sum of all parameters
    //uses vararg type to take in multiple parameters without explicit definition
    var result:Int = 0
    for(i in numbers){
        result+=i;
    }
    return result;
}