class fact{
      int n;
      int fact=0;
      public void facto(){
          for(int i=1; i<=n; i++){
            fact=fact+(n*i);
        
          }
        System.out.println("Factorial of "+n+" is "+fact);
      }
    }
}
