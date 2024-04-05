package company;

public class ObjectSample {

    public static void main(String[] args) {
        // インスタンスの作成
        Department salesDepartment = new Department("営業部", "xx", 1000000);
        Employee sales = new Sales("鈴木", salesDepartment, "課長", 100);
        
        // インスタンスメソッドの呼び出し
        sales.report();
        sales.report(2);
        sales.joinMeeting();
        
        // 1行空ける
        System.out.println("");
        
        // インスタンスの作成
        Department devDepartment = new Department("開発部", "yy", 0);
        Engineer engineer = new Engineer("田中", devDepartment, "一般社員", 88, "Java");
        
        // インスタンスの呼び出し
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        // 1行空ける
        System.out.println("");
        
        // ポリモーフィズムの確認
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");
        
        // インスタンスメソッドの呼び出し
        projectManager.report();
        projectManager.joinMeeting();
        if(projectManager instanceof Engineer) {
            ((Engineer)projectManager).developSoftware();
        }
        
        // 1行空ける
        System.out.println("");
        
        // アルバイトインスタンスの作成
        ParttimeWorker parttimeWorker = new ParttimeWorker("太田", salesDepartment);
        
        // 実装したメソッドの呼び出し
        ((Workable) sales).work();
        ((Workable) engineer).work();
        ((Workable) projectManager).work();
        ((Workable) parttimeWorker).work();
    }

}
