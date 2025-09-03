//naive approach
main method{
  for(int i=1;i<n;i++){
    if(n%i==0){
      divisors.add(i);
    }
  }
}
//optimised approach
main method{
  for(int i=0;i<math.sqrt(n);i++){
    if(n%i==0){
      divisors.add(i);
      divisors.add(n/i);
    }
  }
}
