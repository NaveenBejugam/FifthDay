package com.simplilearnExceptions;

public class testCustomException {
	
	

		void check(int age) throws NotValidAgeException
		{
			if(age<18)
				throw new NotValidAgeException("Age is less than 18");
			else
				System.out.println("Valid");
		}
		
		public static void main(String[] args) throws NotValidAgeException {
			
			testCustomException t=new testCustomException();
			
			t.check(67);
		}

}
