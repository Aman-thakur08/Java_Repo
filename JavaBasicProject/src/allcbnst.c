//#include<stdio.h>
//#include<math.h>
//int main()
//{
//    double x;
//    scanf("%lf",&x);
//    int a;
//    scanf("%d",&a);
//    printf("Truncate\n");
//    long long int b=x*pow(10,a);
//    double y=(double)b/pow(10,a);
//    printf("Truncated value %lf\n",y);
//    double A_E = fabs(x-y);
//    printf("Absolute Error: %lf\n", A_E);
//    double R_E = fabs(A_E/x);
//    printf("Relative Error: %lf\n", R_E);
//    double P_E = R_E*100;
//    printf("Percentage Error: %lf\n", P_E);
//    printf("For Roundoff Case - \n");
//    b = x*pow(10,a+1);	//146749
//    int c = b%10;
//    b= b/(float)10;
//    if (c>5){
//        b++;
//    }
//    y = (float)b/pow(10,a);
//    printf("Roundoff: %lf\n",y);
//    A_E = fabs(x-y);
//printf("Absolute Error: %lf\n", A_E); R_E = fabs(A_E/x);
//printf("Relative Error: %lf\n", R_E); P_E = R_E*100;
//printf("Percentage Error: %lf\n", P_E); return 0;
//
//}
//#include<stdio.h>
//#include<math.h>
//float f(float x)
//{
//    return x*x*x-2*x-5;
//}
//float fdash(float x)
//{
//    return 3*x*x-2;
//}
//float fx(float x)
//{
//    return cbrt(2*x+5);
//}
//float fxdash(float x)
//{
//    return 2/3*cbrt((2*x+5)*(2*x+5));
//}
//void bisect(float x,float a,float b)
//{
//    do
//    {
//        x=(a+b)/2;
//        printf("%f\n",x);
//        if(f(a)*f(x)<0)
//            b=x;
//        else a=x;
//    }while(fabs(x-a)>=0.0001||fabs(x-b)>=0.0001);
//}
//void regula(float x,float a,float b)
//{
//    float x1,fa,fb;
//    do{
//        fa=f(a);
//        fb=f(b);
//        x=(a*fb-b*fa)/(fb-fa);
//        printf("%f\n",x);
//        if(fa*f(x)<0)
//        {
//            x1=b;
//            b=x;
//        }
//        else
//        {
//            x1=a;
//            a=x;
//        }
//    }while(fabs(x-x1)>=0.0001);
//
//}
//void newton(float x,float a,float b)
//{
//    x=(a+b)/2;
//    float x1;
//    do{
//        x1=x;
//        x=x-f(x)/fdash(x);
//        printf("%f\n",x);
//
//    }while(fabs(x-x1)>=0.0001);
//}
//void iterative(float x,float a,float b)
//{
//    x=(a+b)/2;
//    float x1;
//    if(fabs(fxdash(x))<=1) printf("Valid\n");
//    do{
//        x1=x;
//        x=fx(x);
//        printf("%f\n",x);
//
//    }while(fabs(x-x1)>=0.0001);
//}
//int main()
//{
//    float x,a,b;
//    for(a=0;;a++)
//    {
//        if(f(a)>0)
//            break;
//    }
//    for(b=a+1;;b--)
//    {
//        if(f(b)<0) break;
//    }
//    bisect(x,a,b);
//    printf("\n");
//    regula(x,a,b);
//
//    printf("\n");
//    newton(x,a,b);
//    printf("\n");
//    iterative(x,a,b);
//    printf("\n");
//}
//#include<stdio.h>
//int main()
//{
//    int n;
//    scanf("%d",&n);
//    float arr[n][n+1],ans[n],a;
//    for(int i=0;i<n;i++)
//    {
//        for(int j=0;j<=n;j++)
//        {
//            scanf("%f",&arr[i][j]);
//        }
//    }
//    for(int i=0;i<n-1;i++)
//    {
//        if(arr[i][i]==0.0) return 0;
//        for(int j=i+1;j<n;j++)
//        {
//            a=arr[j][i]/arr[i][i];
//            for(int k=0;k<=n;k++)
//            {
//                arr[j][k]-=a*arr[i][k];
//            }
//        }
//    }
//    ans[n-1]=arr[n-1][n]/arr[n-1][n-1];
//    for(int i=n-2;i>=0;i--)
//    {
//        ans[i]=arr[i][n];
//        for(int j=i+1;j<n;j++)
//        {
//            ans[i]-=ans[j]*arr[i][j];
//        }
//        ans[i]=ans[i]/arr[i][i];
//        printf("%f\n",ans[i]);
//
//    }
//    printf("%f",ans[n-1]);
//}
#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    float arr[n][n+1],ans[n],a;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=n;j++)
        {
            scanf("%f",&arr[i][j]);
        }
    }
    for(int i=0;i<n;i++)
    {
//        if(arr[i][i]==0.0) return 0;
        for(int j=0;j<n;j++)
        {
            if(i!=j){
            a=arr[j][i]/arr[i][i];
            for(int k=0;k<=n;k++)
            {
                arr[j][k]-=a*arr[i][k];
            }}
        }
    }
//    ans[n-1]=arr[n-1][n]/arr[n-1][n-1];
    for(int i=0;i<n;i++)
    {
        ans[i]=arr[i][n]/arr[i][i];
        printf("%f\n",ans[i]);

    }
//    printf("%f",ans[n-1]);
}
