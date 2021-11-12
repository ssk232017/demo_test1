class fact{
      int n;
      int fact=1;
      public void facto(){
          for(int i=0; i<n; i++){
            fact=fact*(n-i);
            System.out.println(fact);
          }
        System.out.println("Factorial of "+n+" is "+fact);
      }
    }

