package javax0.serviceprovider;

import javax0.serviceinterface.ServiceInterface;

public class Provider2 implements ServiceInterface {
    private Student student;

    @Override
    public int theAnswer() {
        student = new Student("Anhvv", 40F);
        System.out.println(student.getName());
        return 40;
    }
}
