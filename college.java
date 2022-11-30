package inheritance;
//method override
public class college extends university{
	@Override
	public void ConductExams()
	{
		System.out.println("exams over");
	}
	@Override
	public void ReleaseResult()
	{
		System.out.println("Give result fast");
	}
	public void CollectFee()
	{
		System.out.println("Pay the Fee");
		super.ConductExams();
		super.ReleaseResult();
	}
	public static void main(String[] args) {
		college obj=new college();
		obj.ConductExams();
		obj.ReleaseResult();
		obj.CollectFee();
	}
	
}
