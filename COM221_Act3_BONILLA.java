import java.util.*;

public class COM221_Act3_BONILLA  {
    public static Scanner sc = new Scanner(System.in);

    public static void select(){
        System.out.print("A:Square\nB:Left Half Triangle\nC:Inverted Left Half Triangle\nD:leftHollowHalfTriangle");
        System.out.print("\nE:Inverted Left Hollow Half Triangle\nF:Right Half Triangle\nG:Inverted Right Half Triangle\nH:Left Hollow Half Triangle");
        System.out.print("\nI:Inverted Right Hollow Half Triangle\nJ:Full Triangle\nK:Inverted Full Triangle\nL:Full Hollow Triangle");
        System.out.print("\nM:Inverted Full Hollow Triangle\nN:Left Half Diamond\nO:Right Half Diamond");
        System.out.print("\nSelect a figure (A-O): ");
        String a = sc.next().toLowerCase();
        System.out.println();

        switch(a){
            case "a":
            System.out.print(square());
            break;
            
            case "b":
            System.out.print(leftHalfTriangle());
            break;

            case "c":
            System.out.print(invertedLeftHalfTriangle());
            break;

            case "d":
            System.out.print(leftHollowHalfTriangle());
            break;

            case "e":
            System.out.print(invertedLefHollowHalfTriangle());
            break;

            case "f":
            System.out.print(rightHalfTriangle());
            break;

            case "g":
            System.out.print(invertedRightHalfTriangle());
            break;

            case "h":
            System.out.print(rightHollowHalfTriangle());
            break;

            case "i":
            System.out.print(invertedRightHollowHalfTriangle());
            break;

            case "j":
            System.out.print(fullTriangle());
            break;

            case "k":
            System.out.print(invertedFullTriangle());
            break;

            case "l":
            System.out.print(fullHollowTriangle());
            break;

            case "m":
            System.out.print(invertedHollowTriangle());
            break;

            case "n":
            System.out.print(halfLeftDiamond());
            break;

            case "o":
            System.out.print(halfRightDiamond());
            break;

        }
    }

    public static String square(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure = "";
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                    figure +="* ";
            }
            figure +="\n";
        }
    return figure;
    }

    public static String leftHalfTriangle(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure = "";
        for(int r=1; r<=n; ++r){
            for(int c=1; c<=r; ++c){
                figure+="* ";
            }
            figure+="\n";
        }
    return figure;
    }

    public static String invertedLeftHalfTriangle(){
        System.out.print("Input n: ");      
        int n = sc.nextInt();
        String figure = "";
        for(int r=n; r>=1; r--){
            for(int c=1; c<=r; ++c){
                figure+="* ";
            }
            figure +="\n";
        }
    return figure;
    }

    public static String leftHollowHalfTriangle(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure ="";
        for(int r=1; r<=n; r++){
            for(int c=1; c<=r; ++c){
                if(c==1 || r==n || c==r){
                    figure +="* ";
                } else {
                    figure +="  ";
                }
            }
            figure +="\n";
        }
    return figure;
    }

    public static String invertedLefHollowHalfTriangle(){
        System.out.print("Input n: ");
        String figure = "";
        int n = sc.nextInt();
        for(int r=n; r>=1; r--){
            for(int c=1; c<=r; ++c){
                if(c==1 || r==n || c==r){
                    figure +="* ";
                } else {
                    figure +="  ";
                }
            }
            figure +="\n";
        }
    return figure;
    }

    public static String rightHalfTriangle(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure = "";
        for(int r=1; r<=n; r++){
            for(int s=n; s>=r; s-=1){
                figure +="  ";
            }
            for(int o=1; o<=r; ++o){
                figure +="* ";
            
            }
            figure += "\n";
        }

    return figure;
    }

    public static String invertedRightHalfTriangle(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure = "";
        for(int r=n; r>=1; r--){
            for(int s=n; s>=r; s-=1){
                figure +="  ";
            }
            for(int o=1; o<=r; ++o){
                figure +="* ";
            }
            figure += "\n";
        }

    return figure;
    }

    public static String rightHollowHalfTriangle(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure = "";
        for(int r=1; r<=n; r++){
            for(int s=n; s>=r; s-=1){
               figure+="  ";
            }
            for(int o=1; o<=r; ++o){
                if(o==1 || r==n || o==r){
                    figure+="* ";
                } else {
                    figure+="  ";
                }
            }
            figure+="\n";
        }

    return figure;
    }

    public static String invertedRightHollowHalfTriangle(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure = "";
        for(int r=n; r>=1; r--){
            for(int s=n; s>=r; s-=1){
                System.out.print("  ");
            }
            for(int o=1; o<=r; ++o){
                if(o==1 || r==n || o==r){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
        return figure;
    }

    public static String fullTriangle(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure = "";
        for(int r=1; r<=n; r++){
            for(int s=n; s>=r; s-=1){
                figure+="  ";
            }
            for(int o=1; o<=r*2-1; ++o){
                figure+="* ";
            }
            figure+="\n";
        }
        return figure;
    }

    public static String invertedFullTriangle(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure = "";
        for(int r=n; r>=1; r--){
            for(int s=n; s>=r; s-=1){
                figure +="  ";
            }
            for(int o=1; o<=r*2-1; ++o){
                figure +="* ";
            }
            figure +="\n";
        }
        return figure;
    }

    public static String fullHollowTriangle(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure = "";
        for(int r=1; r<=n; r++){
            for(int s=n; s>=r; s-=1){
                figure+="  ";
            }
            for(int o=1; o<=r*2-1; ++o){
                if(o==1 || r==n || o==r*2-1){
                    figure+="* ";
                } else {
                    figure+="  ";
                }
            }
            figure+="\n";
        }
        return figure;
    }

    public static String invertedHollowTriangle(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure = "";
        for(int r=n; r>=1; r--){
            for(int s=n; s>=r; s-=1){
                figure+="  ";
            }
            for(int o=1; o<=r*2-1; ++o){
                if(o==1 || r==n || o==r*2-1){
                    figure+="* ";
                } else {
                    figure+="  ";
                }
            }
            figure+="\n";
        }
        return figure;
    }

    public static String halfLeftDiamond(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure = "";
        for(int r=1; r<=n/2; r++){
            for(int o=1; o<=r; ++o){
                figure +="* ";
            }
            figure +="\n";
        }
        for(int r=n/2+1; r>=1; r--){
            for(int o=1; o<=r; ++o){
                figure +="* ";
            }
            figure +="\n";
        }
        return figure;
    }

    public static String halfRightDiamond(){
        System.out.print("Input n: ");
        int n = sc.nextInt();
        String figure = "";
        for(int r=1; r<=n/2; r++){
            for(int s=n/2; s>=r; s-=1){
                figure+="  ";
            }
            for(int o=1; o<=r; ++o){
                figure+="* ";
            }
            figure+="\n";
        }
        for(int r=n/2+1; r>=1; r--){
            for(int s=n/2; s>=r; s-=1){
                figure+="  ";
            }
            for(int o=1; o<=r; ++o){
                figure+="* ";
            }
            figure+="\n";
        }
        return figure;
    }
    public static void main(String[] args) throws Exception {
        select();
    }
}
