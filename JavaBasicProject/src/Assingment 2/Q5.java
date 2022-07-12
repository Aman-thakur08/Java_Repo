class A
{
	int d,m,k,c,dd;
	A(int d,int m,int k,int c,int dd)
	{
		this.d=d;
		this.m=m;
		this.k=k;
		this.c=c;
		this.dd=dd;
		System.out.println((d+m+k+c+dd)/5);
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
	}
	
}
