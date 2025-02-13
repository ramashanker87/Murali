package Custom;

public class TestingAgeForVote {
    public static void main(String[] args) {
        TestingAgeForVote test=new TestingAgeForVote();
        try{
            test.validateAge(16);
        }catch(MuraliAgeValidationException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally{
            System.out.println("This is executed");
        }
    }

    public void validateAge(int age) throws MuraliAgeValidationException {
        if (age <=18) {
            throw new MuraliAgeValidationException("Age must be above 18 to vote.");
        }
    }
}
