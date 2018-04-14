package com.thinktik.demo04.controller;

/**
 * @author think
 * 2018年1月16日下午11:43:34
 * 
 */
/*
 * A:continue的使用场景
 * 只能在循环中  
 * 可以在switch中   continue在switch语句中没有用处
 */
class Demo2_Continue {
	public static void main(String[] args) {
		for (int x = 1;x <= 10 ;x++ ) {
			if (x == 4) {
				continue;							//终止本次循环,继续下次循环
			}

			System.out.println("x = " + x);
		}
		
		int sum=0;
		 for(int i=1;i<=4;i++)
		 {
		    switch(i)
		    {
		       case 1:
		           sum=sum+1;
		       case 2:
		           sum=sum+2;
		           continue;  //可以 跳出本次for 循环
		       case 3:
		           sum=sum+3;
		           break; //可以  但是跳出的是switch不是for循环
		       case 4:
		    	   sum = sum+4;
		    }
		 }
		 System.out.println(sum);//0+1+2  +2 +3 +4

		 sum = 0;
		 int i = 2;
		 switch(i)
		    {
		       case 1:
		           sum=sum+1;
		       case 2:
		           sum=sum+2;
		           //continue;  //error 不可以
		       case 3:
		           sum=sum+3;
		           break; 
		       case 4:
		    	   sum = sum+4;
		    }
		 System.out.println(sum);
//		 在switch case 语句中能否使用continue 关键字？为什么？
//		 
//		 不能。
//
//		 continue语句一般形式为"continue"。
//
//		 其作用为结束本次循环。即跳出循环体中下面尚未执行的语句，对于while循环，继续求解循环条件。
//		 而对于for循环程序流程接着求解for语句头中的第三个部分expression表达式。　
//
//		 continue语句的作用是跳过循环本中剩余的语句，并到循环末尾。
//
//		 continue语句只用在for、while、do-while等循环体中, 常与if条件语句一起使用, 用来加速循环
	}
}
