package studentlist;

/**
 * This class +++ Insert class description here +++
 *
 * @author Jerome Acosta
 */

public class PartTimeStudent extends Student {

    private int numOfCourses;

    public PartTimeStudent(String name, int numOfCourses) {
        super(name);
        this.numOfCourses = numOfCourses;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public void setNumOfCourses(int numOfCourses) {
        this.numOfCourses = numOfCourses;
    }
    
}
