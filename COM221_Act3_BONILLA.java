import java.util.*;

public class App  {
    public static Scanner sc = new Scanner(System.in);
    public static String figure = "";

    public static void select(){
        System.out.print("\nA:Square\nB:Left Half Triangle\nC:Inverted Left Half Triangle\nD:Left Hollow Half Triangle");
        System.out.print("\nE:Inverted Left Hollow Half Triangle\nF:Right Half Triangle\nG:Inverted Right Half Triangle\nH:Left Hollow Half Triangle");
        System.out.print("\nI:Inverted Right Hollow Half Triangle\nJ:Full Triangle\nK:Inverted Full Triangle\nL:Full Hollow Triangle");
        System.out.print("\nM:Inverted Full Hollow Triangle\nN:Left Half Diamond\nO:Right Half Diamond");
        System.out.print("\nSelect a figure (A-O): ");
        String a = sc.next().toLowerCase();
        System.out.println();

        System.out.print("Input n: ");
        int n = sc.nextInt();

        switch(a){
            case "a":
            System.out.print(square(n));
            break;
            
            case "b":
            System.out.print(leftHalfTriangle(n));
            break;

            case "c":
            System.out.print(invertedLeftHalfTriangle(n));
            break;

            case "d":
            System.out.print(leftHollowHalfTriangle(n));
            break;

            case "e":
            System.out.print(invertedLefHollowHalfTriangle(n));
            break;

            case "f":
            System.out.print(rightHalfTriangle(n));
            break;

            case "g":
            System.out.print(invertedRightHalfTriangle(n));
            break;

            case "h":
            System.out.print(rightHollowHalfTriangle(n));
            break;

            case "i":
            System.out.print(invertedRightHollowHalfTriangle(n));
            break;

            case "j":
            System.out.print(fullTriangle(n));
            break;

            case "k":
            System.out.print(invertedFullTriangle(n));
            break;

            case "l":
            System.out.print(fullHollowTriangle(n));
            break;

            case "m":
            System.out.print(invertedHollowTriangle(n));
            break;

            case "n":
            System.out.print(halfLeftDiamond(n));
            break;

            case "o":
            System.out.print(halfRightDiamond(n));
            break;

        }
    }

    public static String square(int n){  
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                    figure +="* ";
            }
            figure +="\n";
        }
    return figure;
    }

    public static String leftHalfTriangle(int n){
        for(int r=1; r<=n; ++r){
            for(int c=1; c<=r; ++c){
                figure+="* ";
            }
            figure+="\n";
        }
    return figure;
    }

    public static String invertedLeftHalfTriangle(int n){
        for(int r=n; r>=1; r--){
            for(int c=1; c<=r; ++c){
                figure+="* ";
            }
            figure +="\n";
        }
    return figure;
    }

    public static String leftHollowHalfTriangle(int n){
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

    public static String invertedLefHollowHalfTriangle(int n){
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

    public static String rightHalfTriangle(int n){
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

    public static String invertedRightHalfTriangle(int n){
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

    public static String rightHollowHalfTriangle(int n){  
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

    public static String invertedRightHollowHalfTriangle(int n){
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

    public static String fullTriangle(int n){
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

    public static String invertedFullTriangle(int n){
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

    public static String fullHollowTriangle(int n){
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

    public static String invertedHollowTriangle(int n){
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

    public static String halfLeftDiamond(int n){
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

    public static String halfRightDiamond(int n){
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
    public static void main(String[] args) {
        select();
    }
}
