package movement;

public class TurtleSpecification {
	int x_coordinate,y_coordinate;
	char direction;
	public TurtleSpecification() {
		direction='N';		//Initial direction the turtle faces
		x_coordinate=1;		//Initial x position of turtle
		y_coordinate=1;		//Initial y position of turtle
	}
	void moveLeft(){
        if(direction=='N')
            direction= 'W';
       else if(direction=='W')
            direction='S';
       else if(direction=='S')
            direction='E';
        else 
        	direction='N';
       printDirection(direction); 
    }
    void moveRight(){
        if(direction=='N')
            direction= 'E';
        else if(direction=='E')
            direction='S';
        else if(direction=='S')
            direction='W';
        else 
        	direction='N';
        printDirection(direction);
    }
    void moveForward(){
        if(direction=='N'){
            y_coordinate++;
            System.out.println("Position of Olive ridley is "+x_coordinate+" "+y_coordinate+" "+direction);}
        else if(direction=='S'){
            y_coordinate--;
            System.out.println("Position of Olive ridley is "+x_coordinate+" "+y_coordinate+" "+direction);}
        else if(direction=='E'){
            x_coordinate++;
            System.out.println("Position of Olive ridley is "+x_coordinate+" "+y_coordinate+" "+direction);}
        else {
        	x_coordinate--;
        	System.out.println("Position of Olive ridley is "+x_coordinate+" "+y_coordinate+" "+direction);}
        
    }
    public void printDirection(char direction){
    	System.out.print("Turtle changes direction and walks in "+"  "+direction);
    	System.out.println();
    }
}
