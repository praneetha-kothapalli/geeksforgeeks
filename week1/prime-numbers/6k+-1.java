//every prime number after 3 is greater than or equal to 6k+1 or 6k-1
class Prime{
  public boolean isPrime(int n){
    if(n<=1){
      return false;
    }
    if(n==2||n==3){
      return true;
    }
    for(int i=5;Math.sqrt(n);i+=6){
      if(n%i==0||n%(i+2)==0){ //we check both n%i and n%(i+2) because we know 6k+1 as well as 6k-1 is the form of prime number
        return false;
      }
      return true;
    }
  }
  public static void main(String[] a){
    int n=23;
    if(prime(n)){
      print(true);
    }
    print(false);
  }
}
    
