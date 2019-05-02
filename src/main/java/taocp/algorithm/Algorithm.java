/*CODE CURRENTLY NOT SUBJECTED TO ANY COPYRIGHT,
*HOWEVER, IT IS EXPECTED TO WORK PERFECTLY AS INTENDED.
*
*ALL METHODS HAVE THEIR COMMENT, SO READ THORUGH TO SEE WHAT THEY DO, AND HOW THEY WORKS
*/
public class Algorithm{


	/*Euclid algorithm : Greatest commong divisor of two integers
	*
	*	Euclid algorithm steps
	*	[S = Step]
	*	[S1 = Step 1 ... SN = Step N]
	*	Given two positive integers x and y
	*	S1. [Determine the greatest integer] If x > y, x = greatest, y = smallest (vice-versa)
	*	S2. [Find zero remainder] Let z = greatest % smallest, if z = 0 ( z is the GCD), otherwise goto next
	*	step
	*	S3. [Substitute] Since z = greatest % smallest, if z is not zero Replace ( ← ) : greatest with 		*	smallest( x ← y ) and smallest with remainder ( y ← z ), go back to previous step ( S2) Example.
	*	X = 54
	*	Y = 879
	*	S1. Y is the greatest, X is the smallest
	*	S2. Z = 879 % 54 = 16, go to next step
	*	S3. Y = 54, X = 16, go back to step 2 and keep repeating until the remainder is zero.
	*
	*	Real life application of Euclid
	*		1.House foundation construction
	*		2.Industrial packaging
	*		3.Analysis
	*
	*/
	public static int euclid(final int x, final int y){
		
		int smallest = Integer.min(x, y);
		int greatest = Integer.max(x, y);

		int remainder = greatest % smallest;
		if( remainder != 0 ){
		    do{
			greatest = smallest;
			smallest = remainder;
			remainder = greatest % smallest;
			if( remainder == 0 ){
			    remainder = smallest;
			    break;
			}
		     }while(remainder != 0);
		}else{
		       remainder = smallest;
		}
		return remainder;
	}


}
