package oops.abstopic.interfacetopic;

/*
 * Abstrcation:-
------------

	Abstract class			interface
	--------------			--------------
	1) 0 to 100%			2) 100%
	--------------			--------------


interface:-
----------
	1) Constant Variables[public static final]
	2) methods
		1) Abstract Methods---Rules defined
		----------------------	
		public abstract void test1();[public abstract]


		2) NonAbstract Methods
		----------------------
		===> private[V.9]
			
			private void test2()
			{

			}
	
		===> default[V.8]
			default void test2()
			{

			}
		===> static[V.8]

			static void test2()
			{

			}
	
	class		interface		interface
	  |--extends	  |--extends		  |--implements
	class		interface		class


		class
		  |---[Not Possible in Java]---X
		interface


 */
//  1) 0 to 100%||===>[Abstract class] 

public abstract interface Vehicle 
{
//	1) Constant Variables[public static final]
	
	int no = 10;//public static final
	
//			2) methods
//				1) Abstract Methods---Rules defined
//				----------------------	
				void getSpec();//[public abstract]

//				2) NonAbstract Methods
//				----------------------
//				===> private[V.9]
				
				private void test2()
				{
					System.out.println("Vehicle : private--test2()");
				}
		
//				===> default[V.8]
				default void test3()
				{
					System.out.println("Vehicle : default--test2()");
				}
//				===> static[V.8]

				static void test4()
				{
					System.out.println("Vehicle : static--test2()");
				}
}