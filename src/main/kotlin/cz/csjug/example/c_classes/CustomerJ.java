package cz.csjug.example.c_classes;


final public class CustomerJ {
    final private String cluid;
    private String name;
    final private Integer yearOfBirth;

    public CustomerJ(String cluid, String name, Integer yearOfBirth) {
        if(cluid == null) {
            throw new IllegalArgumentException("cluid can'nt be null");
        }
        if(name == null) {
            throw new IllegalArgumentException("name can'nt be null");
        }

        this.cluid = cluid;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public CustomerJ(String cluid, String name) {
        this(cluid, name, null);
    }

    public String getCluid() {
        return cluid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public Integer getYearOfBirth() {
        return yearOfBirth;
    }

    public String toString() {
        return "CustomerJ(cluid=" + this.cluid + ", name=" + this.name + ", yearOfBirth=" + this.yearOfBirth + ")";
    }

    public int hashCode() {
        String cluid1 = this.cluid;
        int var1 = (cluid1 != null ? cluid1.hashCode() : 0) * 31;
        String name1 = this.name;
        var1 = (var1 + (name1 != null ? name1.hashCode() : 0)) * 31;
        Integer yearOfBirth1 = this.yearOfBirth;
        return var1 + (yearOfBirth1 != null ? yearOfBirth1.hashCode() : 0);
    }

    // TODO
//    public boolean equals(Object var1) {
//        if (this != var1) {
//            if (var1 instanceof CustomerK) {
//                CustomerK var2 = (CustomerK)var1;
//            if (Intrinsics.areEqual(this.cluid, var2.getCluid()) &&
//                        Intrinsics.areEqual(this.name, var2.getName()) &&
//                        Intrinsics.areEqual(this.yearOfBirth, var2.getYearOfBirth())) {
//                    return true;
//                }
//            }
//
//            return false;
//        } else {
//            return true;
//        }
//    }


    public static void main(String[] args) {
        CustomerJ pepa = new CustomerJ("aaa", "Pepa", 1980);
        CustomerJ lada = new CustomerJ("bbb", "Lada");
        System.out.println(pepa);
        pepa.setName("Josef");
        System.out.println(pepa);
    }
}

