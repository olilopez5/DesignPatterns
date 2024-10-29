package structuralpatterns.facade;

public class TestFacade {
    public static void main(String[] args) {
        FacadeSmithy facade = new FacadeSmithy();
        facade.work("Shield", false);
    }
}
