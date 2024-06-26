package less3_student.model;

import less3_student.util.UserComparator;

public abstract class User extends UserComparator<User> implements Comparable<User>{
    protected int id;
    protected String name;
    protected String lastName;

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(User o) {
        return compare(this, o);
    }
}
