package bt;

public class Main {
    public static final String[] BookCodes = new String[]{"BOOK0001", "BOOK0002", "BOOK0003", "BOOK0004", "BOOK0005"};
    public static final String[] EmployeeCodes = new String[]{"NV0001", "NV0002", "NV0003", "NV0001", "NV0002"};
    public static final String[] StudentCodes = new String[]{"HV0001", "HV0002", "HV0003", "HV0001", "HV0002"};

    public static void main(String[] args) {
        BookCode bookCode = new BookCode();
        EmployeeCode employeeCode = new EmployeeCode();
        StudentCode studentCode = new StudentCode();

        System.out.println("Book Codes:");
        for (String code : BookCodes) {
            boolean isValid = bookCode.validate(code);
            System.out.println(code + " is valid: " + isValid);
        }

        System.out.println("\nEmployee Codes:");
        for (String code : EmployeeCodes) {
            boolean isValid = employeeCode.validate(code);
            System.out.println(code + " is valid: " + isValid);
        }

        System.out.println("\nStudent Codes:");
        for (String code : StudentCodes) {
            boolean isValid = studentCode.validate(code);
            System.out.println(code + " is valid: " + isValid);
        }
    }
}
