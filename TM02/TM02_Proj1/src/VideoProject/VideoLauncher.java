package VideoProject;

import java.util.Scanner;

public class VideoLauncher {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int i=0;
	VideoStore vs=new VideoStore();
	
	while(i!=6)
	{
		System.out.println("MAIN MENU : "+"\n"+"----------"+"\n");
		System.out.println("1.Add Videos : "+"\n"+"2.Check Out Video : "+"\n"+"3.Return Video : "+"\n"+"4.Receive Rating : "+"\n"+"5.List Inventory : "+"\n"+"6.Exit : ");
		System.out.print("Enter your choice (1..6) : ");
		
		i=sc.nextInt();
		String name="";
		//System.out.println();
		sc.nextLine();
		switch(i)
		{
		case 1:
			System.out.print("Enter the name of the video you want to add : ");
			name=sc.nextLine();
			vs.addVideo(name);
			//System.out.println("Enter the name of the video you want to add : "+name);
			System.out.println("Video "+name+" added successfully");
			System.out.println();
			break;
		case 2:
			System.out.print("Enter the name of the video you want to checkout : ");
			name=sc.nextLine();
			//System.out.println("Enter the name of the video you want to checkout : "+name);
			if(vs.checkVideo(name)==0)
				{System.out.println("Video does not exists");
			System.out.println();}
			else
			{
				vs.doCheckout(name);
				System.out.println("Video "+name+" checked out successfully");
				System.out.println();
			}
			break;
		case 3:
			System.out.print("Enter the name of the video you want to return : ");
			name=sc.nextLine();
			//System.out.println("Enter the name of the video you want to return : "+name);
			if(vs.checkVideo(name)==0)
				{System.out.println("Video does not exists");
			System.out.println();}
			else
			{
				vs.doReturn(name);
				System.out.println("Video "+name+" returned successfully");
				System.out.println();
			}
			break;
		case 4:
			System.out.print("Enter the name of the video you want to rate : ");
			name=sc.nextLine();
			//System.out.println("Enter the name of the video you want to rate : "+name);
			if(vs.checkVideo(name)==0)
				{System.out.println("Video does not exists");
				System.out.println();}
			else
			{
				System.out.print("Enter the rating for this video : ");
				int r=sc.nextInt();
				vs.receiveRating(name,r);
				System.out.println("Rating "+r+" has been mapped to the video "+name);
				System.out.println();
			}
			break;
		case 5:
			vs.listInventory();
			break;
		default:
				System.out.println("Exiting...!! Thanks for using the application");
		}
	}
}
}
