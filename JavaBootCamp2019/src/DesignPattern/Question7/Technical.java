package DesignPattern.Question7;

class Technical implements Directory {
    private String name;
    private String specialization;

    public Technical(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public void showDirectoryInfo() {
        System.out.println("TechnicalEmployee{" +
                "name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                '}');

    }
}