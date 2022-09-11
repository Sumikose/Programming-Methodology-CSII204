import javakara.JavaKaraProgram;

/*
 * COMMANDS:
 *   kara.move()           kara.turnRight()      kara.turnLeft()
 *   kara.putLeaf()        kara.removeLeaf()
 * SENSORS:
 *   kara.treeFront()      kara.treeLeft()       kara.treeRight()
 *   kara.mushroomFront()  kara.onLeaf()
 */
public class sorting extends JavaKaraProgram {
  //
  // you can define your methods here:
  //
  int count(int i){
   int j=0,s=0;
    for( j=0;j<world.getSizeX();j++)
        if(world.isLeaf(j,i)==true)
        s++;

 

 tools.showMessage("s="+s);
   return s;
}
  //
  public void myProgram() {
    // put your main program here, for example:

 

      int i=0;
 int []k;      
k = new int[world.getSizeY()];
    
     for(i=0;i<world.getSizeY();i++)
        {  k[i]=count(i);  
        }

 


     int max; 
 

 

    int n=0,m=0,tmp;

 

     for(n=0;n<world.getSizeY()-1;n++)
        {max=k[n];
          for(m=n+1;m<world.getSizeY();m++)
             {
                     if(max<k[m])
                         {  tmp=max;
                            max=k[m];
                            k[m]=tmp;
                          }
              }
     
         }
 
    world.clearAll();
   
    for(n=0;n<world.getSizeY();n++)
       {
             for(m=0;m<k[n];m++)
                  world.setLeaf(n,m,true);
       }
  }
}