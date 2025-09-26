package fit.iuh.se.beans.xmlbased;

public class Student {
    private long id;
    private String name;
    private Class_ class_;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", class_=" + class_ +
                '}';
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(long id, String name, Class_ class_) {
        this.id = id;
        this.name = name;
        this.class_ = class_;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Class_ getClass_() {
        return class_;
    }

    public void setClass_(Class_ class_) {
        this.class_ = class_;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
