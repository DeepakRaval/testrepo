package progrmaize_que;

public class Swapping {
public static void main(String[]args){
	int a = 10 ;
	int b = 43;
	swapping (a,b);
		
}

static void swapping (int x,int y){
	int temp = x;
	x = y;
	y = temp;
	System.out.println("Now value of a after swapping = "+ x);
	System.out.println("Now value of b after swapping = "+ y);
}
}
