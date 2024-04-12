package company;

public class Department {
    private final String name;
    private int budget;
    
    public Department(String name, String departmentId, int budget){
        this.name = name;
        this.budget = budget;
    }
    
    // 会議を開催する
    public void meeting() {
        System.out.println("都内会議を開催します。部長：" + name + "予算：" + budget);
    }
    
    // nameのgetter
    public String getName() {
        return name;
    }
    
    // budgetのgetter
    public double getBudget() {
        return budget;
    }
    
    // budgetのsetter
    public void setBudget(int budget) {
        if(budget < 0) {
            throw new IllegalArgumentException("予算はマイナスにできません.");
        }
        this.budget = budget;
    }
}
