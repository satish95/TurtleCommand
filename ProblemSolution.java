package movement;
import java.util.*;
public class ProblemSolution{
	private static Scanner input;
	public static TurtleSpecification getFinalPosition(String direction_specification,TurtleSpecification turtlename){
			if(direction_specification.length()==0){
	            return turtlename;
	        }
	          
	        for(int i=0;i<direction_specification.length();i++){
	            if(direction_specification.charAt(i)=='F')
	                turtlename.moveForward();
	            else if(direction_specification.charAt(i)=='L')
	                turtlename.moveLeft();
	            else
	            	turtlename.moveRight();
	        }
	        return turtlename;
	    }
	public static void main(String[] args) { 
	     String command;
	     System.out.println("Enter the command for Olive ridley to walk");
	     input = new Scanner(System.in);
	     command=input.nextLine();
	     System.out.println("Olive ridley is Walking.......");
	     TurtleSpecification Olive_ridley= new TurtleSpecification();  
	    getFinalPosition(command,Olive_ridley);
	     System.out.println("Final Position of Olive Ridley Turtle is"+" "+Olive_ridley.x_coordinate+" "+Olive_ridley.y_coordinate+" "+Olive_ridley.direction);
	}
}
