package iterazione;

public class QuadratoSommaNNumeriDispari {

	public static void main(String[] args) {
		// 121=1+3+5+7+9+11+13+15+17+19+21=11^2
		
		int n=11;
		int somma=0;
		String msg="";
		String txt="";
		
		for (int i=0;i<n;i++)
		{
			txt+=(i!=0 ? "+": "")+(i*2+1);
			somma+=i*2+1;
		}
		msg=somma+"="+txt+"="+n+"^2";
		
		System.out.println(msg);

	}

}
