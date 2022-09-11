import javakara.JavaKaraProgram;
/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class gameoflife extends JavaKaraProgram {
  //
  int check(int x,int y){
    int s=0;
      if(world.isLeaf(x-1,y-1)==true) s=s+1;
      if(world.isLeaf(x-1,y)==true) s=s+1;
      if(world.isLeaf(x-1,y+1)==true) s=s+1;
      if(world.isLeaf(x,y-1)==true) s=s+1;
      if(world.isLeaf(x,y+1)==true) s=s+1;
      if(world.isLeaf(x+1,y-1)==true) s=s+1;
      if(world.isLeaf(x+1,y)==true) s=s+1;
      if(world.isLeaf(x+1,y+1)==true) s=s+1;

 

   return s;

 

   }
  //
  public void myProgram() {
    // put your main program here, for example:
   int m=world.getSizeX();
  int n = world.getSizeY();
  int i,j;

 

  for(i=1;i<m-1;i++) {
     for(j=1;j<n-1;j++){
              
              if(world.isLeaf(i,j)==false)  {
                    if(check(i,j)==3)
                       world.setLeaf(i,j,true);

 

                  }
             else { if(check(i,j)!=3)
                        world.setLeaf(i,j,false);
                  }   
     }
  }
  }
}