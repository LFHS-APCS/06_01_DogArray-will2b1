public class DogArray
{
  
    /**
     *  Returns the index of the youngest dog in the given array
     */
    public static int getYoungestIndex(Dog[] dogs)
    {
      Dog youngest = new Dog("start", 100);
      int x = 0;
      for(int i = 0; i < dogs.length; i++){
        if (dogs[i].getAge() < youngest.getAge()){
          youngest = dogs[i];
          x = i;
        }
      }
      return x;
    }

    /**
     *  Returns the name of the youngest dog in the given array
     */
    public static String getYoungestName(Dog[] dogs)
    {
      Dog youngest = new Dog("start", 100);
      for(Dog v : dogs){
        if (v.getAge() < youngest.getAge())
          youngest = v;
      }
      return youngest.getName();
    }
}
