package feature.lambda;

import org.omg.Messaging.SyncScopeHelper;

public class LambdaWithMultiplesSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiStatementInMethod ms = (a,b)->
					{
						int result=0;
					if	((a+b)>10){
						result = 90;
					}else
						result = a+b;
						
					return result;
					
					};
					
				System.out.println(ms.doCalculation(2, 3));
				System.out.println(ms.doCalculation(12, 3));
	}

}

interface MultiStatementInMethod{
	
	int doCalculation(int a, int b);
}
