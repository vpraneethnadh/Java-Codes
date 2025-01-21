#include<iostream.h>
#include<conio.h>

class temp
{
	int i;
public:
	static int j;

	temp()
	{
		i=100;
		j=j+1;
	}
	static void display()
	{
		cout<<"\n"<<j;
	}
};
int temp::j=100;

void main()
{
	clrscr();
	temp t1;
	t1.display();
}