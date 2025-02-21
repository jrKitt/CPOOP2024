/**
 * @author นายกิตติชัย รักษาวงค์ 673380028-2 Section.1
 */
public class Department {
    private int deptId;
    private String departmentName;

    public Department(int deptId, String departmentName) {
        this.deptId = deptId;
        this.departmentName = departmentName;
    }

    public int getDeptId() {
        return deptId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString() {
        return "Department [deptId=" + deptId + ", departmentName=" + departmentName + "]";
    }
}
