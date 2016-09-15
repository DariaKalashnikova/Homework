package Module3.universityDataBase;


import java.util.Date;

public class Course {

    private Date startDate;
    private String name;
    private int hoursDuration;
    private String teacherName;

    public Course(String name, int hoursDuration, String teacherName) {
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
    }

    public Course(Date startDate, String name) {

        this.startDate = startDate;
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public int getHoursDuration() {
        return hoursDuration;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setStartDate() {
        this.startDate = startDate;
    }

    public void setName() {
        this.name = name;
    }

    public void setHoursDuration() {
        this.hoursDuration = hoursDuration;
    }

    public void setTeacherName() {
        this.teacherName = teacherName;
    }
}

