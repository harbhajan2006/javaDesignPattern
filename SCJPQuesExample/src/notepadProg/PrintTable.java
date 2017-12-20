package notepadProg;
/*// bravo !! written prog correct in first attempt.
// total complexity O(n sq 2) 
// polynomial func - (1c1+c2)+(2c1+c2)+· · ·+(nc1+c2) = c1n(n + 1)/2 +nc2 = c1/2*n^2+(c2+ c1/2)n
 * 
 * */
public class PrintTable {

public static void main(String args[]){

int tableCnt=10;
for(int i=1 ; i<=tableCnt; i++){ // n

for(int j=1 ; j<=i;j++){// 2 n


System.out.print(j*i + " "); //3 c1 -- c1n^2
}

System.out.println();//4 c2 -->c2n
}
}
}