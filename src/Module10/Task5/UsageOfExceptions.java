package Module10.Task5;


public class UsageOfExceptions {

    public void shelter (String string) throws Exception{
        if (string.startsWith("C")){
            throw new FirstException("Cat is meowing");
        }else if (string.startsWith("K")){
            throw new SecondException("OMG, she's pregnant");
        }else if (string.startsWith("D")){
            throw new ThirdException("Dogs are coming");
        }
    }
}
