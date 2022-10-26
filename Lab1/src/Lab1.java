
public class Lab1 {

	public static void main(String[] args) {
		//Solves Problem 1
		for(int i=15; i<=21; i++) {
			if (i%2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//Solves Problem 2
		String townName= new String("A_sbu#2ry!32Pa+98rk");
		StringBuilder letters = new StringBuilder();
		
		for(int i=0; i<townName.length(); i++) {
			char currentChar=townName.charAt(i);
			if(Character.isLetter(currentChar)) {
				letters.append(currentChar);
			}
		}
		System.out.println(letters);
		
		//Solves Problem 3
		String value = new String("XMonmouth UniversityX");
		for(int i=1; i<value.length()-1;i++) {
			
			System.out.println(value.charAt(i));
		}
		
		//Solves Problem 4
		int theSum=0;
		for(int i=6; i<=14;i++) {
			if (i%2 == 0) {
				theSum= theSum+i;
			}
		}
		System.out.println(theSum);
		
		//Solves Problem 5
		for(int i=20; i>=4; i--) {
			if(i%4 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//Solves Problem 6
		String value2 = new String("devlos melborp");
		for(int i=value2.length()-1; i>=0; i--) {
			System.out.println(value2.charAt(i));
		}
		
	}
	
}
/* Output
15 17 19 21 
AsburyPark
M
o
n
m
o
u
t
h
 
U
n
i
v
e
r
s
i
t
y
50
20 16 12 8 4 
p
r
o
b
l
e
m
 
s
o
l
v
e
d
*/
