package Module3.universityDataBase;


import java.util.Date;

public class Solution {

    public static void main(String[] args) {

        Date date = new Date(1994);

        Course anthropology = new Course("Dexter", 550, "Pretzel");
        Course history = new Course(date, "Hans");
        Course[] courses = {anthropology, history};

        Student firstYear = new Student("Twilight", "Sparkle", 3);
        Student secondYear = new Student("Shimmer", courses);
        Student[] students = {firstYear, secondYear};

        CollegeStudent thirdYear = new CollegeStudent("Applejack", "Pony", 8);
        CollegeStudent fourthYear = new CollegeStudent("SpongeBob", courses);
        CollegeStudent fifthYear = new CollegeStudent("Cassie", "Jones", 7, "Harvard", 98, 123598);
        CollegeStudent[] collegeStudents = {thirdYear, fourthYear, fifthYear};

        SpecialStudent Australia = new SpecialStudent("Kangaroo", courses);
        SpecialStudent Germany = new SpecialStudent("Hansel", "Cookie", 15, "HellKitchen", 79, 321034);
        SpecialStudent Ukraine = new SpecialStudent("Vasil", "Kozakevich", 5, 345087541);
        SpecialStudent[] internationalStudents = {Australia, Germany, Ukraine};
    }
}
