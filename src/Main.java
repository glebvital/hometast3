public class Main{
    public static void main(String[] args) {
        System.out.println("helo, i am realy glad that you're looking that. So i decided to sing beautiful song. Wachamelaindisama..... Wanabrokdisaout.....Siouot.....Whenamisterbrown");
        System.out.println("---");
        MassiveProblem(0);
        MassiveProblem(1);
        MassiveProblem(2);
        MassiveProblem(3);
        MassiveProblem(4);
        MassiveProblem(5);
        MassiveProblem(6);
        ExtraMassive(6,7,7,3);
    }
    public static void MassiveProblem(int day){
        String[] week = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        System.out.println(week[day]);
        System.out.println("---");
    }
    public static void ExtraMassive(int num1,int num2,int num3,int num4){
        String[] something = {"a","b","c","d","e","f","g","o"};
        System.out.println(something[num1]+something[num2]+something[num3]+something[num4]);
    }
}
//git init == create project
//git add . == add file for git that he's following
//git commit -m "add login & password" == saving project
//git remote add origin https://github.com/glebvital/hometast3.git == add project in interned
//https://github.com/glebvital/hometast3/blob/master/src/Main.java