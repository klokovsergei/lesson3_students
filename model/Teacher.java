package less3_student.model;

import java.util.List;

public class Teacher extends User{
    private static int countID;
    private List<String> spesializationList;
    public Teacher(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.id = countID++;
    }

    public List<String> getSpesializationList() {
        return spesializationList;
    }

    public void addSpesializationList(String spesialization) {
        spesializationList.add(spesialization);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", spesializationList=" + spesializationList +
                '}';
    }
}
