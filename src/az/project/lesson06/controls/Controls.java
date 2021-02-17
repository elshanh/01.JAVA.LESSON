package az.project.lesson06.controls;

public class Controls {
	
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;

		//IF ELSE CONTROL
		System.out.println("*****IF ELSE CONTROL*****");
		if ( x < y ) {
			System.out.println((x + y) * y / 10);
		}
		
		if ( x < y ) 
			System.out.println(x + y);
		
		if ( x > y ) {
			System.out.println( x - y );
		} else {
			System.out.println( x * y - 2 );
		}

		int c = (x > y) ? x : y;
		System.out.println(c);
		
		//SWITHCH CASE CONTROL
		System.out.println("*****SWITHCH CASE CONTROL*****");
		int day = 5;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
		//WHILE LOOP CONTROL
		System.out.println("*****WHILE LOOP CONTROL*****");
		int z = 0;
		while (z < 5) {
		  System.out.println(z);
		  z++;
		}
		//DO WHILE LOOP CONTROL
		System.out.println("*****DO WHILE LOOP CONTROL*****");
		int w = 0;
		do {
		  System.out.println(w);
		  w++;
		}
		while (w < 5);
		//FOR CONTROL
		System.out.println("*****FOR CONTROL*****");
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		System.out.println("----------");
        for(int i = 10; i > 0; i--){
            System.out.println("i = " + i);
        }
		//BREAK CONTROL
		System.out.println("*****BREAK CONTROL*****");        
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
              break;
            }
            System.out.println("Break " +i);
          }
		//CONTINUE CONTROL
		System.out.println("*****CONTINUE CONTROL*****");
        for (int i = 0; i < 10; i++) {
          if (i == 4) {
            continue;
          }
          System.out.println("Continue " +i);
        }

	}

}
