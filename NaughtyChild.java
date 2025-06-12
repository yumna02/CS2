public class NaughtyChild
{
  Name child;
  String COAL = "Coal";
  
  NaughtyChild( Name n ) { child = n; }
  public String toString()
  {
    return "\n" + child.toString() + " = " + COAL; 
  }
}