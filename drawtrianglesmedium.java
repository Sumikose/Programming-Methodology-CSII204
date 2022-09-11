import javakara.JavaKaraProgram;
/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class drawtrianglesmedium extends JavaKaraProgram {
  //
   boolean checkright(){
     kara.turnLeft();
     kara.move();

 

 if(kara.onLeaf())
       {kara.turnLeft(); kara.turnLeft();    kara.move() ;kara.turnLeft(); return true;}
else 
     {kara.turnLeft(); kara.turnLeft();    kara.move() ;kara.turnLeft(); return false;    
    }}
boolean checkleft(){
     kara.turnRight();
kara.move() ;

 

 if(kara.onLeaf())
       {kara.turnRight();kara.turnRight();kara.move() ;kara.turnRight(); return true;      } 
     
else 
       {kara.turnRight();kara.turnRight();kara.move() ;kara.turnRight(); return false;      } 
    }
  //
  public void myProgram() {
    // put your main program here, for example:

 

   int i=0; 
    while (true) {
            
        
    if(i==0)
        {if(checkright()==true) {
             kara.putLeaf();
               kara.move() ;   
                } 
        else 
            {    kara.putLeaf();
                 kara.move() ;                 
                 kara.turnRight();
                 kara.move() ;   
                 kara.putLeaf();
                 kara.turnRight();
                 kara.move() ;
                 i=1;
            }}
       else{ if(checkleft()==true) {
             kara.putLeaf();
               kara.move() ;   
                } 
        else 
            {    kara.putLeaf();
                 kara.move() ;                 
                 kara.turnLeft();
                 kara.move() ;   
                 kara.putLeaf();
                 kara.turnLeft();
                 kara.move() ;
                 i=0;
            }
       }
    }
  }
}