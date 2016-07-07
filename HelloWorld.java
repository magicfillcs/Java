import java.util.Scanner;

/******************************************************************************
 *  Compilation:  javac HelloWorld.java
 *  Execution:    java HelloWorld
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloWorld
 *  Hello, World
 *
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such 
 *  lines in our programs and encourage you to do the same.
 *
 ******************************************************************************/



//public class HelloWorld {
//
//    public static void main(String[] args) {
//        // Prints "Hello, World" to the terminal window.
//        System.out.println("Hello, World");
//    }
//
//}

public class HelloWorld{
	

	public static void main(String[] args){
		
		System.out.println("Hello World!");
//		System.out.print("请输入面额：");
//		Scanner in = new Scanner(System.in);
//		System.out.print("请输入面额：");
//	
//	 	int amount = 0;
//	 	amount = in.nextInt();
//	 	
//	 	System.out.print("请输入金额：");
//		
//	 	int price = in.nextInt();
//	 	
//	 	
//		System.out.println("Amount - Price = " + (amount - price));
		
		
//		华氏摄氏度转换程序
//		int F;	//华氏
//		int S;	//摄氏度
//				
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please input 华氏:");
//		F = in.nextInt();
//		
////		F = (9/5)*S + 32;	//华氏摄氏度转换公式
//		S = (int)((F-32)*5/9);
//		
//		System.out.println("answer is :" + S);
//		
		
		
//		
//		int limit = 100;
//		int num1 = 15;
//		int num2 = 40;
//		if ( limit <= limit)
//		{
//		    if ( num1 == num2 )
//		        System.out.println("lemon");
//		    System.out.println("lime");
//		}
//		System.out.println("grape");
		

		
//		Scanner in = new Scanner(System.in);
//		int number  = in.nextInt();
//		int count = 0;
//		
//		while(number>0)
//		{
//			number = number/10;
//			count = count + 1;
//			
//		}
//		
//		System.out.println(count);
//		
//		
		
		
//		int count = 10;
//		while(count > 0)
//		{
//			System.out.println(count);
//			count = count - 1;
//			
//			
//		}

		
				//		do
				//		{
				//			System.out.println(count);
				//			count = count - 1;
				//			
				//		}while(count > 0);
//		
//		
//		System.out.println("------ ------");
//		
//		System.out.println(count);
//		System.out.println("发射！");
//		
		
				
//	猜数游戏	
//		Scanner in = new Scanner(System.in);
//		
//		int number = (int)(Math.random()*100 + 1) ;	//[0,1) --> [0,100) -->[1,100] 生成0-100之间的随机数
//		
//		int a ;
//		int count = 0;
//		
//		do{
//			a =in.nextInt();
//			count = count + 1;
//			
//			if(a > number)
//			{
//				System.out.println("偏大");
//			}
//			else if(a < number)
//			{
//				System.out.println("偏小");
//			}
//			
//		}while(a!=number);
//		
//		
//		
//		
//		System.out.println("恭喜你，猜对了！您猜了"+ count + "次！");
//		
//	
//	
	
		
//		-------------------------------------------------

//		整数分解
//		
//		352 % 10  = 2	//n％10 得到个位
//		352 /10   = 35	//n/10 扔掉最低位
//
//		
//		
//		Scanner in = new Scanner(System.in);
//		
//		int number ;
//		number = in.nextInt();
//		
//		int result = 0;
//		
//		do{
//			
//			int digit = number % 10 ;
//			
//			result = result*10 + digit; //构造逆序输出结果
//			System.out.println(digit);
//			number = number / 10;
//			
//			
//		}while(number > 0);
//		
//		System.out.println();
//		System.out.println(result);
//		
//		
//		整数分解程序末尾
//		2016-07-03  magicfillcs  
//		
		

		
		
//		练习题
//		
//		
//		Scanner in = new Scanner(System.in);
//		int number = in.nextInt();
//		
//		int count_o = 0;	//用于统计偶数个数
//		int count_j = 0;	//用于统计奇数个数
//		
//		
//		while(number != -1)
//		{
//			if(number % 2 == 0)
//			{
//				count_o = count_o + 1;
//			}
//			else
//			{
//				 count_j = count_j +1;
//			}
//			number = in.nextInt();
//						
//		}
//		System.out.println();
//		System.out.println("奇数"+count_j +"个，偶数"+count_o + "个");
//		
//		-------------------------------------------------	
		
		
		
//		
//		阶乘算法
//		
//		
//		System.out.print("Please Input a number n: ");
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		
//
//		long factor = 1;
////		int i = 1;
////		while(i <= n){
////			
////		factor = factor * i;
////		i = i + 1;
////		}
//		
//		for(int i = 1; i <= n ; i++) // int i =1 ;定义一个仅存在于for循环中的i变量
//		{
//			factor = factor * i;	
//		}
//		
//		
//		System.out.println(factor);
//	
//		
		
		
		
//		
//		素数算法
//		
//		
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int isPrime = 1;
//			
//		for(int i = 2 ; i < n ; i++)
//		{
//			if( n % i == 0 )
//			{
//				isPrime = 0;
//				System.out.println(n + "不是素数，i= "+i);
//				break;	
//			}
//			
//		}
//		
//		if(isPrime == 1)
//		{
//			System.out.println(n + "是素数");
//			
//		}
		

//		-------------------------------------------------
//		
//		找出100以内的所有素数
//		
//		
//
 
	
		
//		-------------------------------------------------
//		输出前50个素数
//		
//		
//
//		int count = 0;
//		int n = 2;
//		
//		
//		while(count < 50 )
//		{
//			int isPrime = 1;
//
//			for(int i = 2 ; i < n ; i++)
//			{
//				if( n % i == 0 )
//				{
//					isPrime = 0;
//					break;	
//				}
//
//			}	
//			if(isPrime == 1)
//			{
//				System.out.print(n + "	");
//				count++ ;
//				if(count % 10 == 0)
//				{
//					System.out.println();
//				}
//			}
//			
//			n++;
//		}


		
		
//		凑100以内零钱，最小面额一块
//		Scanner in = new Scanner(System.in);
//		int amount = in.nextInt();
//		
//		OUT: //标号 用于使break直接跳出到该位置
//		for(int one = 0; one <= amount ; ++one)
//		{
//			for(int five = 0; five <= amount/5 ; ++five)
//			{
//				for(int ten = 0; ten <= amount/10 ; ++ten)
//				{
//					for(int twenty = 0; twenty <= amount/20 ; ++twenty)
//					{
//						
//						if(one +five*5+ten*10+twenty*20 == amount)
//						{
//							
//							System.out.println(one+"张1元,"+five+"张5元,"+ten+"张10元,"+twenty+"张20元");
//							break OUT;
//							
//						}
//						
//					}
//					
//				}
//				
//			}
//		}//for循环结尾
//		
//		
//		
		
	
//		f(n) = 1 + 1/2 + 1/3 + ... + 1/n
//		求和程序
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
////		此处注意浮点数的问题，要注意的点 double声明 0.0 1.0/n
//		double ans =  0.0 ;
//		
//		for(int i = 1;i<= n ; i++)
//		{
//			ans = ans + 1.0/i;
//			
//			
//		}
//		System.out.println(ans);		// 输入5时 2.283333333333333
//
//		System.out.printf("%.2f",ans);	// 输入5时 2.28
//		
	
		
		
		
//		
////		f(n) = 1 - 1/2 + 1/3 - 1/4 + ... + 1/n
////		求和程序		
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		
//		double ans =  0.0 ;
//		int sign = 1;
//		
//		for(int i = 1;i<= n ; i++,sign = -sign) 	//最后的sign ＝－sign 前，此处用 , 号
//		{
//			ans = ans + sign*1.0/i;	
//		}
//		
////		
////		//另一种算法
////		for(int i = 1;i<= n ; i++) 	
////		{
////			ans = ans + sign*1.0/i;	
////			if(i % 2 == 0)
////			{
////				ans = ans + 1.0/i ;
////			}
////			else
////			{
////				ans = ans - 1.0/i ;
////			}
////		}
////		
//		
//		
//		System.out.println(ans);		// 输入5时 2.283333333333333
//
//		System.out.printf("%.2f",ans);	// 输入5时 2.28
//		
//		
		
	
//		
//		最大公约数
//		
//
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
//		int b = in.nextInt();
//		
//		int gcd = 1; //最大公约数 Greatest Common Divisor
//		
////		//穷举法算法
////		for(int i = 2; i<=a && i<=b ; i++ )
////		{
////			if(a % i == 0 && b % i == 0 )
////			{
////				gcd = i ;
////			}
////			
////		}
////		System.out.println(gcd);
//		
//		
//		
//		//辗转相除法 （欧几里德法）
//		//1.如果b等于0，计算结束，a就是最大公约数；
//		//2.否则，计算a除以b的余数，让a等于b，而b等于那个余数；
//		//3.回到第一步
//		int oa = a;
//		int ob = b;
//		while(b!=0)
//		{
//			int r = a % b ;
//			a = b;
//			b = r;
//				
//		}
//		System.out.println(oa+"和"+ob+"的最大公约数是：" +a );
//		
//
//		
	
		
		
//		-------------------------------------------------
//		Scanner in = new Scanner(System.in);
//		int x;
//		int [] number = new int[100];	//定于数组
//		
//		double sum = 0;
//		int cnt = 0;
//		x = in.nextInt();
//		
//		while( x != -1 )
//		{
//			number[cnt] = x;			//数组元素赋值
//			sum += x;
//			cnt ++;
//			x= in.nextInt();
//					
//		}
//			
//		if(cnt > 0)
//		{
//			double average = sum/cnt;
//			for(int i = 0; i< cnt; i++)
//			{
//				if(number[i] > average)
//				{
//					System.out.println(number[i]);
//					
//				}
//				
//			}
//			System.out.println(sum/cnt);	
//		}
//		
		
		
//		数组遍历
//		int [] grade = new int[100];
//		for(int i = 0; i<grade.length ; i++)
//		{
//			System.out.println(grade[i]+" ");
//			
//		}
//		
		
	
		
//		int [] a = new int[10];
//		a[0] = 5;
//		int [] b = a;
//		System.out.println(a[0]);	// 5
//		
//		b[0] = 16;
//		System.out.println(b[0]);	//16
//		
//		System.out.println(a[0]);	//16
//		
		
		
//		
//		int [] a1 = {1,2,3,4,5};
//		int [] a2 = a1;				//a2 和a1相当于管理同一个数组空间
//		
//		for(int i =0 ;i< a2.length ; i++)
//		{
//			a2[i] ++;	
//		}
//		for(int i=0; i < a1.length ; i++)
//		{
//			System.out.print(a1[i]+" ");
//			
//		}
//		// 显示应该是 2 3 4 5 6 
//		

		
//		int [] a = {1,2,3,4,5};
//		int [] b = {1,2,3,4,5};
//		System.out.println(a==b);	// false	
////		此处，a和b是不同的数组管理者 a和b不相同
//		
		
		
		
//		//输入一个数，看在不在数组中
//		int [] a = {1,43,21,17,18,54,2,38,98,52,19,55};
//		Scanner in = new Scanner(System.in);
//		int x = in.nextInt();
//		
//		int loc = -1  ;	//loc 存储数字在数组中的位置序号
//		
//		for(int i = 0; i< a.length ; i++)
//		{
//			if(x == a[i])
//			{
//				loc = i;
//				break;
//			}
//			
//		}
//		if(loc > -1)
//		{
//			System.out.println(x + "在数组第"+(loc+1)+"位！");
//		}
//		else
//		{
//			System.out.println(x + "不在数组中！");
//		}
		
		
		
		
//		//foreach循环
//		int [] data = {1,43,21,17,18,54,2,38,98,52,19,55};
//		boolean found = false;
//		for(int k :data)		//for each循环 
//		{
//			if( k == x)
//			{
//				found = true;
//				break;
//			}
//			
//		}
//		if(found)
//		{
//			System.out.println("在其中");
//		}
//		else
//		{
//			System.out.println("不在其中");
//		}
//		
//		
//		
		
		
		
		
//		int [][] a = new int[2][5];
//		
//		int [][] b = {
//				{1,2,3,4},
//				{1,2,3},		
//		};
//		//1. 编译器来数数
//		//2. 每行一个{},逗号分割
//		//3. 最后的逗号可以存在，有古老的传统
//		//4. 如果省略，表示补零
		

		
//		-------------------------------------------------	
//  		
//		//井字棋游戏
//		// 程序默认3行3列，只要有任意一条线 三个一样，就获胜
//		// SIZE为尺寸限制 
//		// 2016-07-06  magicfillcs  
//		
//		
//		System.out.println("Start:");
//		
//		
//		Scanner in = new Scanner(System.in);
//		final int SIZE = 3;
//		int [][] board = new int[SIZE][SIZE];
//		
//		boolean gotResult = false;
//		
//		int numOfX = 0;
//		int numOfO = 0;
//		
//		//读入矩阵
//		for(int i = 0 ; i < board.length ; i++ )
//		{
//			for(int j = 0; j < board[i].length ; j++ )
//			{
//				board[i][j] = in.nextInt();
//				
//			}
//		}
//		
//		System.out.println("InPut Over!");
//		
//		
//		//检查行
//		for(int i = 0; i < board.length ; i++)
//		{
//			numOfX = 0;
//			numOfO = 0;
//			
//			for(int j = 0; j < board[i].length ; j++)
//			{
//				if(board[i][j] == 1)
//				{
//					numOfX ++ ;
//				}
//				else
//				{
//					numOfO ++ ;	
//				}
//											
//			}
//			if(numOfX == SIZE || numOfO == SIZE)
//			{
//				gotResult = true ;
//				System.out.println("hang");
//				break;
//				
//			}		
//			
//			
//		}
//		
//		System.out.println("检查行程序 is over! ");
//		
//		
//		
//		//检查列
//		
//		if(!gotResult)
//		{
//
//
//		    for(int i = 0 ; i < board.length; i++)
//		    {
//				numOfX = 0;
//			    numOfO = 0;
//			    
//				for(int j = 0 ; j < board[i].length ; j++)
//				{
//				
//					if(board[j][i] == 1)
//					{
//						numOfX ++ ;
//					}
//					else
//					{
//						numOfO ++ ;	
//					}
//					
//					
//				}
//				if(numOfX == SIZE || numOfO == SIZE)
//				{
//					gotResult = true ;
//					System.out.println("lie");
//					break;
//					
//				}
//				
//		    }
//			
//		}
//		
//		System.out.println("检查列程序 is over！");
//		
//		
//		
//		
//		//检查对角线
//		if(!gotResult)
//		{
//			numOfX = 0;
//		    numOfO = 0;
//		    
//			for(int i = 0 ; i<board.length ; i++)
//			{
//				
//				if(board[i][i] == 1)
//				{
//					numOfX ++ ;
//				}
//				else
//				{
//					numOfO ++ ;	
//				}
//				
//			}
//			if(numOfX == SIZE || numOfO == SIZE)
//			{
//				gotResult = true ;
//				System.out.println("duijiaoxian");	
//			}
//		}
//		
//		System.out.println("检查对角线程序 is over! ");
//		
//	
//		
//		//检查反对角线
//		
//		if(!gotResult)
//		{
//			
//			numOfX = 0;
//		    numOfO = 0;		//清零计数器
//			for(int i = 0; i < board.length ; i++)
//			{
//				if(board[i][SIZE-i-1] == 1)
//				{
//					numOfX ++ ;
//				}
//				else
//				{
//					numOfO ++ ;	
//				}
//				
//			}
//			if(numOfX == SIZE || numOfO == SIZE)
//			{
//				gotResult = true ;
//				System.out.println("fanduijiaoxian");	
//			}			
//			
//		}
//		
//		System.out.println("检查反对角线程序 is over! ");
//		
//		if(!gotResult)
//		{
//			System.out.println();
//			System.out.println("没有人获胜！ ");
//		}
//		
//		
//		//井字棋游戏末端
//		
		
		
//		
//		字符类型
//		char
//		'a' '1'
//		java使用Unicode来表示字符
		
//		char c = 'a';
//		char d = (char)(c + 'A'-'a'); 	//小写变大写
//		
//		System.out.println(c);
//		System.out.println();
//		System.out.println( d );
		
//		包裹类型
//		Integer Character ...
//		System.out.println(Integer.MAX_VALUE);				// 2147483647
//		System.out.println(Character.isDigit('1'));			// true
//		System.out.println(Character.toLowerCase('A'));		// a
//		
//		
//		
		
		
//	
////		
////		字符串 部分笔记
////		
////		
//		
//		String s = new String ("This is a string"); //	
//													1.创建了一个String的对象
//													2.用"This is a string"初始化这个对象
//													3.创建管理这个对象的变量s
	
//		
//		
//		String a = "abc";
//		String b ="abc";
//		String c = "abcd";
//		
//		
//		if( a == b)		//只有a和b管理同一个字符串，a＝＝b才为true
//		{
//			System.out.println("两个字符串变量管理的是同一个字符串。");	//此句执行
//		}
//		else
//		{
//			System.out.println("两个字符串变量管理的不是同一个字符串！");	
//		}
//		
//		if( a.equals(b))	//a.equals(b) 用于比较a和b中字符串内容是否相等
//		{
//			System.out.println("a和b的字符串内容相同");//此句执行
//		}
//		else
//		{
//			System.out.println("a和b的字符串内容不相同");	
//		}
//		
//		//	程序显示内容
//		//	两个字符串变量管理的是同一个字符串。
//		//	a和b的字符串内容相同
//
//		
//		
		
		
		
//		in.next() 读入一个单词，单词的标志是空格(空格包括 空格、tab和换行)
//		in.nextLine() 读入一整行
//		
//		
//		Scanner in = new Scanner(System.in);
//		
//		//当输入This is a line!
//		
//		//String s = in.next(); 			// This 
//		String s = in.nextLine();		// This is a line!
//		System.out.println(s);
//		
		
//		Scanner in = new Scanner(System.in);
//		String s;
//		s = in.next();
//		
//		System.out.println(s);
//		System.out.println(s.equals("bye"));		//判断输入是否为 bye，此处只能使用 .equals()方法， == 是不能的，详细看line 830 附近
//													// ＝＝ 比较是否为同一个东西，equals比较内容是否相同
//		
//		
		
		
		
		
//		
////				//s1.compareTo(s2) //比较字符串的大小
////		
//		String s1 = "abc";
//		String s2 = "abcd";
//		System.out.println(s1.compareTo(s2));	//返回－1 则 s1小于s2
//												//    1      大于
//												//    0      等于
//		
//		System.out.println(s1.length() );	// 3
//		
//		System.out.println(s1.charAt(2) );	// c  /* charAt(index) */
//		
//		String s3 = "0123456789汉字";
//		System.out.println(s3.substring(2));		//	23456789汉字
//		System.out.println(s3.substring(2, 4));		//	23 			//索引2 到 索引4 之前 ********重要********
//		
//		System.out.println(s3.indexOf('4'));		//	4
//		System.out.println(s3.indexOf("456"));		//	4
//		
//		
//		
//		System.out.println("-------------------------------------------------");
//		String s4 = "01234563089汉字";
//		int loc = s4.indexOf('3');					// 记录第一个'3'出现的index索引号码
//		System.out.println(s4.indexOf('3',loc+1));	// 求出第二个'3'出现的index索引号码
//		//
//		//	-------------------------------------------------
//		//	7
//		
//		
//		String s5 = "abcdefg";
//		s5.toUpperCase();
//		System.out.println(s5);			//	abcdefg
//		// toUpperCase() 并不能改变原来的字符串，只是重新制造一个新的字符串
//		//	字符串不能被修改
//		String s6 = s5.toUpperCase();
//		System.out.println(s6);			//	ABCDEFG
		
		
		
		
		
//		
//		Scanner in = new Scanner(System.in);
//		String s = in.next();	
//		
//		switch(s){
//		case"this": break;
//		case"that":	break;
//		//...
//		}//此段代码无意义，Java 1.7及以上 可以使用字符串作为case的条件 示例中的 "this" "that"
//		
		

		

		
		
		
//程序末端		
	}
}