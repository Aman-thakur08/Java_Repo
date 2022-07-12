class A
{
	int d,m,k,c,dd;
	static int min=0,max=0;
	static String s="",ct="";
	A(int d,int m,int k,int c,int dd)
	{
		this.d=d;
		this.m=m;
		this.k=k;
		this.c=c;
		this.dd=dd;
		if(d<=m&&d<=c&&d<=dd&&d<=k){
			min=d;ct="Delhi";}
		else if(m<=d&&m<=c&&m<=dd&&m<=k){
			min=m;ct="Mumbai";}
		else if(k<=d&&k<=m&&k<=dd&&k<=c){
			min=k;ct="Kolkata";}
		else if(c<=d&&c<=m&&c<=dd&&c<=k){
			min=c;ct="Chennai";}
		else{ min=dd;ct="Dehradun";}
		if(d>=m&&d>=c&&d>=dd&&d>=k){
			max=d;s="Delhi";}
		else if(m>=d&&m>=c&&m>=dd&&m>=k){
			max=m;s="Mumbai";}
		else if(k>=d&&k>=m&&k>=dd&&k>=c){
			max=k;s="Kolkata";}
		else if(c>=d&&c>=m&&c>=dd&&c>=k){
			max=c;s="Chennai";}
		else{ max=dd;s="Dehradun";}
	}
	A()
	{
		System.out.println(min+" "+ct);
		System.out.println(max+" "+s);
	}
	public static void main(String args[])
	{
		A d0=new A(24,4,15,35,60);
		A d1=new A(14,10,2,5,6);
		A d2=new A(4,5,3,2,30);
		A d3=new A(4,15,35,2,40);
		A d4=new A(26,1,35,35,60);
		A d5=new A(24,15,2,5,60);
		A d6=new A(24,15,3,35,60);
		A d7=new A(0,15,35,4,60);
		A d8=new A(24,10,3,35,60);
		A d9=new A(4,15,8,15,60);
		A obj=new A();
	}
	
}
