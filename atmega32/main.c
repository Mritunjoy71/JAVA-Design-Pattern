#include<avr/io.h>
#define F_CPU 1000000
#include<util/delay.h>

int main(void)
{
unsigned char c=1,in=0;
DDRB = 0b11111100;
DDRA= 0xFF;

    PORTA = c;
    while(1)
    {
        PORTA=c;
    }
}
