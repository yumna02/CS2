import java.util.*;

public class NiceChild
{
  Name child;
  List<String> giftList = new ArrayList<>();
  
  NiceChild( Name n, List<String> l )
  {
    child = n;
    giftList = l;
  }
  
  public String toString()
  {
    Object[] a = giftList.toArray();
    String l = "";
    for( int i=0; i < a.length; i++ )
      l += a[i].toString();
    return "\n" + child + " = " + l;
  }
}