import lab6.Coffee;

import java.util.Collection;

public interface InterfaceList<Coffee> extends Iterable<Coffee>  {

      boolean add(Coffee coffee);
      boolean remove(Coffee coffee);
      int size();
      boolean contains(Coffee coffee);
      public Coffee get(int index);

}
