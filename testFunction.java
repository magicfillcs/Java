

package testFunction;

import java.util.Scanner;

public class testFunction {
	
	public static boolean isPrime(int i)
	{
		boolean isPrime = true;
		for(int k = 2; k <i ;k++)
		{
			if(i % k == 0)
			{
				isPrime = false;
				break;
			
			}
		}
		
		return isPrime;	
	}// 判断输入 i 是否为素数的函数
	
	
	
	
//	public static void cSum(int a,int b)
//	{
//		int sum = 0;
//		
//		for(int i = a; i < b ;i++)
//		{
//			sum += i;
//				
//		}
//
//		System.out.println(a + "到" + b + "的和是：" + sum);
//		
//	}// 求a到b 之间所有数的和
//	
//	
//	
//	//函数是一块代码，接受零个或者多个参数，做一件事，并返回零个或者一个值
//	
//	

	
	
	
	
//	public static void swap(int a,int b)
//	{
//		int t ;
//		t = a;
//		a = b;
//		b = t;					// Input 5 6
//		System.out.println(a);	// 6
//		System.out.println(b);	// 5
//	}// 交换a b 但调用后，a b值不会交换.因为java 参数 传递 是 值传递
//	
	
	
//此段程序来自		http://blog.csdn.net/magi1201/article/details/45368833
	 /** 
    * 分解质因数 
    * @param num 待分解的数字 
    * @return 分解后的数字结果 
    */  
   public static String resolvePrime(int num) {  
         
       // 定义结果字符串缓存对象，用来保存结果字符  
       StringBuffer sb = new StringBuffer(num + "=");  
         
       // 定义最小素数   
       int i = 2;  
         
       // 进行辗转相除法  
       while (i <= num) {  
             
           // 若num 能整除 i ，则i 是num 的一个因数  
           if (num % i == 0) {  
                 
               // 将i 保存进sb 且 后面接上 *  
               sb.append(i + "*");  
                 
               // 同时将 num除以i 的值赋给 num  
               num = num / i;  
                 
               // 将i重新置为2  
               i = 2;  
           } else {  
                 
               // 若无法整除，则i 自增  
               i++;  
           }  
       }  
         
       // 去除字符串缓存对象最后的一个*，将结果返回  
       return sb.toString().substring(0, sb.toString().length() - 1);  	
	
   }
//	-------------------------------------------------
	
	
	
	
	
	
	public static void main(String[] args)	//main函数入口
	{
		System.out.println("Hello World!");
		
		
//		System.out.println("Please Input a number: ");
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
//		
//		if(isPrime(a))		//isPrime(a) 调用函数
//		{
//			System.out.println(a + "是素数！");
//			
//		}
//		
//		
//		cSum(1,10);		// 此处如果设置断点，debug时候，使用Step into 进入cSum函数中调试，若使用Step Over，则直接到下一行，不进入cSum函数
//		
//		
		
		
		
		
//		int a1 = 5;
//		int b1 = 6;
//		swap(a1,b1);		//此处只传递 值 
//		System.out.println(a1+ " " +b1);	// 5 6
//		// java语言在调用函数时，永远只能传值给函数
		
		
		
		
		
		//函数的每次运行，就产生了一个独立的变量空间，在这个空间中的变量，是函数的这次运行所独有的，称为本地变量。
		//定义在函数内部的变量就是本地变量
		//参数也是本地变量
		
		//本地变量是定义在块内的
		//	它可以是定义在函数的块内
		//	也可以是定义在语句的块内
		//	甚至可以随便拉一对大括号来定义变量
		//	
		//程序运行进入这个块之前，其中的变量不存在，离开这个块，其中的变量就消失了
		//块外面定义的变量在里面仍然有效
		//不能在一个块内定义同名的变量，也不能定义块外面定义过的变量
		//本地变量不会被默认初始化
		//参数在进入函数的时候被初始化了

		
		
		
		
//		分解质因数
//		题目内容：
//		每个非素数（合数）都可以写成几个素数（也可称为质数）相乘的形式，这几个素数就都叫做这个合数的质因数。比如，6可以被分解为2x3，而24可以被分解为2x2x2x3。
//		现在，你的程序要读入一个[2,100000]范围内的整数，然后输出它的质因数分解式；当读到的就是素数时，输出它本身。
//		
//		输入格式:
//		一个整数，范围在[2,100000]内。
//		
//		输出格式：
//		形如：
//		n=axbxcxd
//		或
//		n=n
//		所有的符号之间都没有空格，x是小写字母x。
//		
//		输入样例：
//		18
//		
//		输出样例：
//		18=2x3x3
//		

		
		//生成 素数表
		int sushu_table_size = 100;
		int [] sushu = new int [sushu_table_size];
		for(int i = 2,count = 0; count < sushu_table_size ; i ++)
		{
			if(isPrime(i))
			{
				sushu[count] = i;
				count ++ ;
			}	
		}
		
		//输出素数表
		for(int i = 0; i< sushu_table_size ; i++)
		{
			System.out.print(sushu[i] + " ");
		}
		
		System.out.println();
		
		System.out.println( resolvePrime(90) );
		
//		Scanner in = new Scanner(System.in);
//		int x = in.nextInt();
//		if((x < 2)||(x >10000))
//		{
//			System.out.println("Wrong Number!");
//		}
//		else
//		{
//			if(isPrime(x))
//			{
//				System.out.println(x + "是素数，没有质因数分解");
//			}
//			else
//			{
//				for(int i = 2; i < x ; i++)
//				{
//					
//					
//				}
//				
//			}	
//		}
//		
		
		
		
		

		
		
// -------------------------------------------------		
		
		//程序末端
	}
}
