
public class bits {

	public static void main(String[] args) {

            System.out.println(ithbit(5, 1));
            System.out.println(setithbit(5, 2));
            System.out.println(resetbit(5, 1));
	    System.out.println(rytsetbit(8));
	    System.out.println(addone(6));
	    System.out.println(magicalno(4));
	    System.out.println(power(0));

	}
	public static int ithbit(int n,int i) {
		int mask=1;
		mask=(1<<(i-1));
		n=n&mask;
		return n;
		
	}
	
	public static int setithbit(int n,int i) {
		int mask=1;
		mask=(1<<(i-1));
		n=n|mask;
		return n;
		
	}
	
	public static int resetbit(int n,int i) {
		int mask=1;
		mask=(~(1<<(i-1)));
		n=n&mask;
		return n;
		
	}
	
	public static int rytsetbit(int n) {
		int pos=0;
		int mask=1;
		while((n&mask)==0) {
			mask=mask<<1;
			pos++;
		}
		return pos;
	}
	
    public static int addone(int n) {
    	int mask=1;
    	while((n&mask)!=0) {
    		mask=mask<<1;
    		n=n^mask;
    	}
    	n=n^mask;
    	return n;
    }
	
     public static int magicalno(int i) {
	int pow=1;
	int ans=0;
	while(i!=0){
		pow=pow*5;
		if((i&1)!=0) {
		ans=ans+pow;
		}
		i=(i>>1);
	}
	return ans;
}

     public static boolean power(int n) {
	if(n!=0) {
		if((n&(n-1))==0) {
			return true;
		}
	}
	return false;
}

}
