public interface Egglayer extends Animal{
   default public String identifyMyself()
    {
        return "I am able to lay eggs";
    }
}