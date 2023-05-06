// You are using Java
class ExamlyStrOperation1 {   //return the vowel of each string in the array of string
    String[] getVowels(String  s){
        String[] words = s.split("[ ]+");
        String[] vowels = new String[words.length];

        for(int i = 0; i < words.length; i++){
            String word = words[i];
            String vowelsInword = "";
            for(int j= 0; j< word.length(); j++){
                char c = word.charAt(j);
                if(c=='a'|| c == 'e'|| c== 'i'|| c=='o'|| c== 'u' || c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U'){
                    vowelsInword = vowelsInword + c;
                }
            }
            vowels[i]= vowelsInword;
        }
        return vowels;


    }
    public static void main(String  params[]){
        ExamlyStrOperation1 object = new ExamlyStrOperation1();
        java.util.Scanner scan = new java.util.Scanner(System.in);
        String  s = scan.nextLine();
        String ans[] = object.getVowels(s);

        for ( String w:  ans)
            System.out.println(w + " ");
    }
}