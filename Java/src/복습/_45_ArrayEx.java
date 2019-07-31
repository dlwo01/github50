package 복습;

public class _45_ArrayEx {
	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		char ch = 'A';//A,65 B,66
		
		alphabets[0] = 'A';
		for(int i = 0; i<alphabets.length; i++) {
			alphabets[i] = (char)(65+i);
			System.out.println(alphabets[i] + " : " +(int)alphabets[i]);
		}
	}

}
/*
A : 65
B : 66
C : 67
D : 68
E : 69
F : 70
G : 71
H : 72
I : 73
J : 74
K : 75
L : 76
M : 77
N : 78
O : 79
P : 80
Q : 81
R : 82
S : 83
T : 84
U : 85
V : 86
W : 87
X : 88
Y : 89
Z : 90
*/