import java.util.Scanner;

public class ac670 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(), str2 = sc.nextLine(), str3 = sc.nextLine();
        String res = "";
        switch (str1) {
            case "vertebrado":
                switch (str2) {
                    case "ave":
                        if (str3.equals("carnivoro"))
                            res = "aguia";
                        else
                            res = "pomba";
                        break;
                    case "mamifero":
                        if (str3.equals("onivoro"))
                            res = "homem";
                        else
                            res = "vaca";
                        break;
                }
                break;
            case "invertebrado":
                switch (str2) {
                    case "inseto":
                        if (str3.equals("hematofago"))
                            res = "pulga";
                        else
                            res = "lagarta";
                        break;
                    case "anelideo":
                        if (str3.equals("hematofago"))
                            res = "sanguessuga";
                        else
                            res = "minhoca";
                        break;
                }
                break;
        }

        System.out.println(res);
    }
}
