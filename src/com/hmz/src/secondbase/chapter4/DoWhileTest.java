package com.hmz.src.secondbase.chapter4;

/*
do-whileѭ����ʹ��

һ��ѭ���ṹ��4��Ҫ��
�� ��ʼ������
�� ѭ������  --->��boolean����
�� ѭ����
�� ��������

����do-whileѭ���ṹ��

��
do{
	��;
	��;

}while(��);

ִ�й��̣��� - �� - �� - �� - �� - �� - ... - ��

˵����
1.do-whileѭ�����ٻ�ִ��һ��ѭ���壡
2.�����У�ʹ��for��while����һЩ������ʹ��do-while

*/
class DoWhileTest {
	public static void main(String[] args) {
		
		//����100���ڵ�ż��,����������ż���ĺͼ�ż���ĸ���
		int num = 1;
		int sum = 0;//��¼�ܺ�
		int count = 0;//��¼����
		do{
			
			if(num % 2 == 0){
				System.out.println(num);
				sum += num;
				count++;
			}

			num++;

		}while(num <= 100);
		

		System.out.println("�ܺ�Ϊ��" + sum);
		System.out.println("����Ϊ��" + count);

		//*************���do-while����ִ��һ��ѭ����***************
		int number1 = 10;
		while(number1 > 10){
			System.out.println("hello:while");
			number1--;
		}

		int number2 = 10;
		do{
			System.out.println("hello:do-while");
			number2--;
		}while(number2 > 10);

	}
}
