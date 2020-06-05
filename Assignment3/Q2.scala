
object Q2 {
  def main(args:Array[String])
  {
     println("Enter the number: ")
     var p_number=scala.io.StdIn.readInt()
     
     println("Prime numbers which less than "+p_number+": ")
     var ans=primeseq(p_number)
  }
  
  def prime(num:Int, x:Int=2):Boolean=
  { x match
    {
    case x if(num==x)=>true
    
    case x if(gcd(num,x)>1)=>false
    
    case _ =>prime(num,x+1)
    }
  
  }
  
  def gcd(a:Int,b:Int):Int=
  {b match
    {
    case 0=>a
    case b if b>a =>gcd(b,a)
    case _ =>gcd(b,a%b)
    }
  }
  def primeseq(n:Int):Unit=
  {
    if(prime(n)) 
     println(n)
     primeseq(n-1)
  
  }

}