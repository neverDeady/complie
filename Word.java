

public class Word {
    //type表示各终结符类型，0-过滤符,1-int,2-main,3-return,4-数字,5-(,6-),7-{,8-},9-;,10--,
    // 11-+,12-*,13-/,14-%,15-const,16-, 17-标识符,18-=,20-if,21-else
    //22-!,23-==,24-!=,25-<,26->,27-<=,28->=,29-||,30-&&
    //31-while,32-break,33-continue
    //34-[,35-],36-void
    public int type;

    public String word;

    public String outPut;


    public String getOutPut() {
        return outPut;
    }

    public void setOutPut(String outPut) {
        this.outPut = outPut;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Word(String word){
        this.word = word;
        if(this.word.equals("int")){
            this.type = 1;
            this.outPut = "define dso_local i32";
        }
        else if(this.word.equals("main")){
            this.type = 2;
            this.outPut = "@main";
        }
        else if(this.word.equals("return")){
            this.type = 3;
            this.outPut = "ret i32";
        }
        else if(this.word.equals("if")){
            this.type = 20;
            this.outPut = this.word;
        }
        else if(this.word.equals("else")){
            this.type = 21;
            this.outPut = this.word;
        }
        else if(this.word.equals("const")){
            this.type = 15;
            this.outPut = this.word;
        }
        else if(isNumber(this.word)){
            this.type = 4;
            this.outPut = this.word;
        }
        else if(this.word.equals("(")){
            this.type = 5;
            this.outPut = this.word;
        }
        else if(this.word.equals(")")){
            this.type = 6;
            this.outPut = this.word;
        }
        else if(this.word.equals("{")){
            this.type = 7;
            this.outPut = this.word;
        }
        else if(this.word.equals("}")){
            this.type = 8;
            this.outPut = this.word;
        }
        else if(this.word.equals(";")){
            this.type = 9;
            this.outPut = "";
        }
        else if(this.word.equals("!")){
            this.type = 22;
            this.outPut = this.word;
        }
        else if(this.word.equals("!=")){
            this.type = 24;
            this.outPut = this.word;
        }
        else if(this.word.equals("==")){
            this.type = 23;
            this.outPut = this.word;
        }
        else if(this.word.equals("<")){
            this.type = 25;
            this.outPut = this.word;
        }
        else if(this.word.equals(">")){
            this.type = 26;
            this.outPut = this.word;
        }
        else if(this.word.equals("<=")){
            this.type = 27;
            this.outPut = this.word;
        }
        else if(this.word.equals(">=")){
            this.type = 28;
            this.outPut = this.word;
        }
        else if(this.word.equals("||")){
            this.type = 29;
            this.outPut = this.word;
        }
        else if(this.word.equals("&&")){
            this.type = 30;
            this.outPut = this.word;
        }
        else if(this.word.equals("while")){
            this.type = 31;
            this.outPut = this.word;
        }
        else if(this.word.equals("break")){
            this.type = 32;
            this.outPut = this.word;
        }
        else if(this.word.equals("continue")){
            this.type = 33;
            this.outPut = this.word;
        }
        else if(this.word.equals("[")){
            this.type = 34;
            this.outPut = this.word;
        }
        else if(this.word.equals("]")){
            this.type = 35;
            this.outPut = this.word;
        }
        else if(this.word.equals("void")){
            this.type = 36;
            this.outPut = this.word;
        }
        else if(Lexer.isFilter(this.word.charAt(0))){
            this.type = 0;
            this.outPut = this.word;
//            System.out.println("filter");
        }
        else if(this.word.equals("-")){
            this.type = 10;
            this.outPut = this.word;
        }
        else if(this.word.equals("+")){
            this.type = 11;
            this.outPut = this.word;
        }
        else if(this.word.equals("*")){
            this.type = 12;
            this.outPut = this.word;
        }
        else if(this.word.equals("/")){
            this.type = 13;
            this.outPut = this.word;
        }
        else if(this.word.equals("%")){
            this.type = 14;
            this.outPut = this.word;
        }
        else if(this.word.equals(",")){
            this.type = 16;
            this.outPut = this.word;
        }
        else if(this.word.equals("=")){
            this.type = 18;
            this.outPut = this.word;
        }
        else{
            this.type = 17;
            this.outPut = this.word;
        }
    }

    public static boolean isNumber(String num){
        for(int i = 0; i < num.length(); i++){
            if(!Character.isDigit(num.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
