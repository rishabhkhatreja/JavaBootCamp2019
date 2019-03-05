package DesignPattern.Question7;

class NonTechnical implements Directory {
    String name;

    public NonTechnical(String name) {
        this.name = name;
    }

    @Override
    public void showDirectoryInfo() {
        System.out.println("NonTechnicalEmployee{" +
                "name='" + name + '\'' +
                '}');
    }
}
