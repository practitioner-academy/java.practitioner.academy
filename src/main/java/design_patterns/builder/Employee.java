package design_patterns.builder;

public class Employee {

    private String employeeId;

    private String employeeName;

    private Integer employeeSalary;

    private Integer employeeAge;

    private Employee(Builder builder) {
        this.employeeId = builder.employeeId;
        this.employeeName = builder.employeeName;
        this.employeeSalary = builder.employeeSalary;
        this.employeeAge = builder.employeeAge;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String employeeId;

        private String employeeName;

        private Integer employeeSalary;

        private Integer employeeAge;

        public Builder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder employeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public Builder employeeSalary(Integer employeeSalary) {
            this.employeeSalary = employeeSalary;
            return this;
        }

        public Builder employeeAge(Integer employeeAge) {
            this.employeeAge = employeeAge;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                ", employeeAge=" + employeeAge +
                '}';
    }
}
