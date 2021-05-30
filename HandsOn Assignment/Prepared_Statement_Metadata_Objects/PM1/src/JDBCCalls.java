
public class JDBCCalls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option = Integer.parseInt(args[0]);
		
		DAOClass dao = new DAOClass();
		
		switch(option)
		{
		case 1:
			int rn = Integer.parseInt(args[1]);
			String n=args[2];
			String g=args[3];
			String dob=args[4];
			int fee = Integer.parseInt(args[5]);
			
			if(dao.insert(rn,n,g,dob,fee))
				System.out.println("Inserted Successfully");
			else
				System.out.println("Insertion Error");
			break;
		
		case 2:
			rn = Integer.parseInt(args[1]);
			
			if(dao.delete(rn))
				System.out.println("Deleted Successfully");
			else
				System.out.println("Deletion Error");
			break;
			
		case 3:
			rn = Integer.parseInt(args[1]);
			fee = Integer.parseInt(args[5]);
			
			if(dao.modify(rn, fee))
				System.out.println("Modified Successfully");
			else
				System.out.println("Modification Error");
			break;
		case 4:
			try
			{
				rn=Integer.parseInt(args[1]);
				dao.display(rn);
			}
			catch(Exception e)
			{
				dao.display();
			}
		}
	}

}
