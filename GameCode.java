
public class GameCode {
	private int[][] a;
	
	public GameCode()
	{
		a=new int[3][3];
		int k=3;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j]=k++;
		
	}
	
	public void init()
	{
		int k=3;
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				a[i][j]=k++;
	}
	public boolean checkWin(int i,int j,int k)
	{
		
		if(k==1)
			a[i][j]=0;
		else
			a[i][j]=1;
		
		if(a[0][0]==a[0][1] && a[0][1]==a[0][2])
			return true;
		else 
			if(a[1][0]==a[1][1] && a[1][1]==a[1][2])
				return true;
			else 
				if(a[2][0]==a[2][1] && a[2][1]==a[2][2])
					return true;
				else 
					if(a[0][0]==a[1][0] && a[1][0]==a[2][0])
						return true;
					else 
						if(a[0][1]==a[1][1] && a[1][1]==a[2][1])
							return true;
						else 
							if(a[0][2]==a[1][2] && a[1][2]==a[2][2])
								return true;
							else 
								if(a[0][0]==a[1][1] && a[1][1]==a[2][2])
									return true;
								else 
									if(a[0][2]==a[1][1] && a[1][1]==a[2][0])
										return true;
		
		
		return false;
	}

}
