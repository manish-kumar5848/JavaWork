public class Generics {
    public static void main(String[] args) {
        GenT <Integer> iObj = new GenT<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        GenT <String> sObj = new GenT<String>("Manish Kumar Yadav");
        System.out.println(sObj.getObject());

        System.out.println(iObj.genericDisplay(12));


    }
}

class GenT<T>
{
    // An object of type T is declared
    T obj;
    GenT(T obj)
    {  this.obj = obj;  }
    public T getObject()
    { return this.obj; }

    public T genericDisplay (T element){
        return element;
    }


}


