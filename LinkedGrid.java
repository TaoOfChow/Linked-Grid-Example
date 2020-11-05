package code;

public class LinkedGrid {

	private Node first;
	
	
	public void display(){
		
		Node temp = first;
		Node rowMarker = first;
		
		while(temp!=null){
			while(temp!=null){
				System.out.print(temp.getData() + " ");
				temp = temp.getRight();
			}
			temp = rowMarker.getDown();
			rowMarker = temp;
			System.out.println();
		}
		
		
		
		
	}
	
	
	public LinkedGrid(int dimension)
	{
		first = new Node();
		Node rowMarker = first;
		Node columnMarker = first;
		
		for(int x = 0; x < dimension-1; x++){
			Node temp = new Node();
			columnMarker.setRight(temp);
			temp.setLeft(columnMarker);
			columnMarker = temp;
		}
		
		for(int y = 0 ; y < dimension-1; y++)
		{
			Node temp = new Node();
			temp.setUp(rowMarker);
			rowMarker.setDown(temp);
			columnMarker = temp;
			
			for(int x = 0; x < dimension-1; x++){
				temp = new Node();
				temp.setLeft(columnMarker);
				columnMarker.setRight(temp);
				temp.setUp(columnMarker.getUp().getRight());
				temp.getUp().setDown(temp);
				columnMarker = temp;
			}
			
			rowMarker = rowMarker.getDown();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
