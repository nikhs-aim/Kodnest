
public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
//		***** 
//		***** 
//		***** 
//		***** 
//		***** 
		for (int i=1; i<=n;i++) {
			for (int j=1;j<=n;j++) {
			System.out.print("*");
		}
			System.out.println(" ");
		}
		System.out.println("-----------------");
//		
//		11111 
//		22222 
//		33333 
//		44444 
//		55555 
		for (int i=1; i<=n;i++) {
			for (int j=1;j<=n;j++) {
			System.out.print(i);
		}
			System.out.println(" ");
		}
		System.out.println("-----------------");
//		
//		12345 
//		12345 
//		12345 
//		12345 
//		12345 
		for (int i=1; i<=n;i++) {
			for (int j=1;j<=n;j++) {
			System.out.print(j);
		}
			System.out.println(" ");
		}
		System.out.println("-----------------");
		
//		* 
//		** 
//		*** 
//		**** 
//		***** 
		for (int i3=1; i3<=n;i3++) {
			for (int j3=1;j3<=i3;j3++) {
			System.out.print("*");
		}
			System.out.println(" ");
		}
		System.out.println("-----------------");
//		
//		1 
//		22 
//		333 
//		4444 
//		55555 
		for (int i4=1; i4<=n;i4++) {
			for (int j4=1;j4<=i4;j4++) {
			System.out.print(i4);
		}
			System.out.println(" ");
		}
		System.out.println("-----------------");
//		
//		1 
//		12 
//		123 
//		1234 
//		12345 
		for (int i5=1; i5<=n;i5++) {
			for (int j5=1;j5<=i5;j5++) {
			System.out.print(j5);
		}
			System.out.println(" ");
		}
		System.out.println("-----------------");
//		
//		***** 
//		**** 
//		*** 
//		** 
//		*
		for (int i6=1; i6<=n;i6++) {
			for (int j6=n;j6>=i6;j6--) {
			System.out.print("*");
		}
			System.out.println(" ");
		}
		System.out.println("-----------------");
		
//		11111 
//		2222 
//		333 
//		44 
//		5 
		for (int i7=1; i7<=n;i7++) {
			for (int j7=n;j7>=i7;j7--) {
			System.out.print(i7);
		}
			System.out.println(" ");
		}
		System.out.println("-----------------");
		
//		12345 
//		1234 
//		123 
//		12 
//		1 
		for (int i8=n; i8>0;i8--) {
			for (int j8=1;j8<=i8;j8++) {
			System.out.print(j8);
		}
			System.out.println(" ");
		}
		System.out.println("-----------------");
		
//		54321 
//		5432 
//		543 
//		54 
//		5
		for (int i9=1; i9<=n;i9++) {
			for (int j9=n;j9>=i9;j9--) {
			System.out.print(j9);
		}
			System.out.println(" ");
		}
		System.out.println("-----------------");
//		
//	      * 
//	     ** 
//	    *** 
//	   **** 
//	  ***** 
		for (int k=1; k<=n;k++) {
			for (int l=n;l>=k;l--) {
			System.out.print(" ");
		}
		for(int m=1;m<=k;m++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
		System.out.println("-----------------");
		
//	     1 
//	    12 
//	   123 
//	  1234 
//	 12345 
		for (int k=1; k<=n;k++) {
			for (int l=n;l>=k;l--) {
			System.out.print(" ");
		}
		for(int m=1;m<=k;m++) {
			System.out.print(m);
		}
		System.out.println(" ");
	}
		System.out.println("-----------------");
		
//	      1 
//	     22 
//	    333 
//	   4444 
//	  55555 
		for (int k=1; k<=n;k++) {
			for (int l=n;l>=k;l--) {
			System.out.print(" ");
		}
		for(int m=1;m<=k;m++) {
			System.out.print(k);
		}
		System.out.println(" ");
	}
		System.out.println("-----------------");
		
//		
//	     1 
//	    21 
//	   321 
//	  4321 
//	 54321 
		for (int k=1; k<=n;k++) {
			for (int l=n-k;l>0;l--) {
			System.out.print(" ");
		}
		for(int m=k;m>0;m--) {
			System.out.print(m);
		}
		System.out.println(" ");
	}
		System.out.println("-----------------");
		
		
//		 ***** 
//		  **** 
//		   *** 
//		    ** 
//		     * 
		for (int k=n; k>0;k--) {
			for (int l=n;l>=k;l--) {
			System.out.print(" ");
		}
		for(int m=1;m<=k;m++) {
			System.out.print("*");
		}
		System.out.println(" ");
	}
		System.out.println("-----------------");
		
		
//		11111 
//		 2222 
//		  333 
//		   44 
//		    5 
		
		for (int k=1; k<=n;k++) {
			for (int l=1;l<k;l++) {
			System.out.print(" ");
		}
		for(int m=k;m<=n;m++) {
			System.out.print(k);
		}
		System.out.println(" ");
	}
		System.out.println("-----------------");
		
//		
//		 12345 
//		  1234 
//		   123 
//		    12 
//		     1
		for (int k=n; k>0;k--) {
			for (int l=n;l>=k;l--) {
			System.out.print(" ");
		}
		for(int m=1;m<=k;m++) {
			System.out.print(m);
		}
		System.out.println(" ");
	}
		System.out.println("-----------------");
//		
//	      *  
//	     * *  
//	    * * *  
//	   * * * *  
//	  * * * * *  

		for (int k=1; k<=n;k++) {
			for (int l=n;l>=k;l--) {
			System.out.print(" ");
		}
		for(int m=1;m<=k;m++) {
			System.out.print("*"+" ");
		}
		System.out.println(" ");
		}
		System.out.println("-----------------");
		
//		
//		 * * * * *  
//		  * * * *  
//		   * * *  
//		    * *  
//		     *  
		

		for (int k=1; k<=n;k++) {
			for (int l=0;l<k;l++) {
			System.out.print(" ");
		}
		for(int m=n;m>=k;m--) {
			System.out.print("*"+" ");
		}
		System.out.println(" ");
		}
		System.out.println("-----------------");
		
		
//	      *  
//	     * *  
//	    * * *  
//	   * * * *  
//	  * * * * *  
//	  * * * * *  
//	   * * * *  
//	    * * *  
//	     * *  
//	      * 
		
		
		for (int k=1; k<=n;k++) {
			for (int l=n;l>=k;l--) {
			System.out.print(" ");
		}
		for(int m=1;m<=k;m++) {
			System.out.print("*"+" ");
		}
		System.out.println(" ");
		}
		

		for (int k=1; k<=n;k++) {
			for (int l=0;l<k;l++) {
			System.out.print(" ");
		}
		for(int m=n;m>=k;m--) {
			System.out.print("*"+" ");
		}
		System.out.println(" ");
		}
		System.out.println("-----------------");
		
//		
//		***** 
//		*   * 
//		*   * 
//		*   * 
//		*****
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		System.out.println("-----------------");
		
		
//	      *  
//	     * *  
//	    *   *  
//	   *     *  
//	  * * * * * 
		for (int k=1; k<=n;k++) {
			for (int l=1;l<=n-k;l++) {
			System.out.print(" ");
		}
			
		for(int m=1;m<=k;m++) {
			if(m==1 || m==k || k==n) {
			System.out.print("* ");
		}
			else{
				System.out.print("  ");}
			}
		System.out.println(" ");
		}
		System.out.println("-----------------");
		
		
		

}
}