package fit.iuh.se.beans.xmlbased;

public class Class_ {
    private String classId;

    private String className;

    @Override
    public String toString() {
        return "Class_{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                '}';
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Class_() {
    }

    public Class_(String classId, String className) {
        this.classId = classId;
        this.className = className;
    }
}
