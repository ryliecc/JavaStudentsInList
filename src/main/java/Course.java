public class Course {
    String courseName;
    String professor;
    int roomNumber;

    public Course(String courseName, String professor, int roomNumber) {
        this.courseName = courseName;
        this.professor = professor;
        this.roomNumber = roomNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getProfessor() {
        return professor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
