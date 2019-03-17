package nptel.pij.week7.io.lec32;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class Inventory {

static	DataInputStream din=new DataInputStream(System.in);
static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		
		try {
			DataOutputStream dos=new DataOutputStream(new FileOutputStream("inventory.dat"));
			//Read from console
			System.out.println("Enter the code number");
			st=new StringTokenizer(din.readLine());
			int code=Integer.parseInt(st.nextToken());
			
			System.out.println("Enter the no of items");
			st=new StringTokenizer(din.readLine());
			int items=Integer.parseInt(st.nextToken());
			
			System.out.println("Enter the cost");
			st=new StringTokenizer(din.readLine());
			double cost=Double.parseDouble(st.nextToken());
			
			//Writing to the file inventory.dat"
			dos.writeInt(code);
			dos.writeInt(items);
			dos.writeDouble(cost);
			dos.close();
			
			//Processing data from the files:
			DataInputStream dis=new DataInputStream(new FileInputStream("inventory.dat"));
			int codeNumbar=dis.readInt();
			int totalItems=dis.readInt();
			double itemCost=dis.readDouble();
			double totalCost=totalItems+itemCost;
			dis.close();
			
			//Writing to consloe
			System.out.println();
			System.out.println("Code Number : "+codeNumbar);
			System.out.println("Total items : "+totalItems);
			System.out.println("Item Cost : "+itemCost);
			System.out.println("Total item cost : "+totalCost);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
