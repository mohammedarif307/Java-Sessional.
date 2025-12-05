public class PersonalInfo {
    public static void main(String[] args) {
        String name = "Mohammed Arif";
        String studentId = "E251043";
        int age = 20;
        String email = "mohammedarif5629689@gmail.com";
        String phone = "+8801639229053";
        String address = "Goschi,Raozan,Chattogram";

        
        System.out.println("Personal Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);

        System.out.printf("\nFormatted Personal Information:\n");       
        System.out.printf("Name: %s\n", name);
        System.out.printf("Student ID: %s\n", studentId);   
        System.out.printf("Age: %d\n", age);
        System.out.printf("Email: %s\n", email);        
        System.out.printf("Phone: %s\n", phone);
        System.out.printf("Address: %s\n", address);
                
    }
}
