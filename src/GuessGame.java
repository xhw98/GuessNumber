
class GuessGame{
    //代表player的3个实例变量
    Player p1;
    Player p2;
    Player p3;

    //startGame()方法是游戏的起点。创建3个player，然后挑出要猜测的随机数字。它会要求player猜测并检查结果，过程会被列出来
     void startGame(){
        //创建出Player对象
        p1=new Player();
        p2=new Player();
        p3=new Player();
        //声明3个变量来保存player猜测的数字
        int guess1 = 0;
        int guess2 = 0;
        int guess3 = 0;
        //声明3个变量来保存是否猜中
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;
        //产生谜底数字
        int targetNumber = (int) (Math.random() * 10);//随机产生0~9的数字
        System.out.println("想象0到9之间的某个数……");

        while(true){
            System.out.println("谜底是"+targetNumber);
            //调用Player的guess()方法，开始猜数字
            p1.guess();
            p2.guess();
            p3.guess();
            //取得player猜测的数字并列出
            guess1=p1.number;
            System.out.println("玩家1 猜的数字是"+guess1);
            guess2=p2.number;
            System.out.println("玩家2 猜的数字是"+guess2);
            guess3=p3.number;
            System.out.println("玩家3 猜的数字是"+guess3);
            //检查是否猜中，并将结果赋值给是否猜中的变量
            if (guess1 == targetNumber){
                p1isRight=true;
                System.out.println("玩家1 猜对了！");
            }
            if (guess2 == targetNumber){
                p2isRight=true;
                System.out.println("玩家2 猜对了！");
            }
            if (guess3 == targetNumber){
                p3isRight=true;
                System.out.println("玩家3 猜对了！");
            }
            //如果有一个或者多个猜中，循环结束
            if (p1isRight || p2isRight || p3isRight){
                break;
            }
            else{
                System.out.println("没人猜中，游戏继续！");
            }
        }
    }
}

class Player{
    int number = 0;//此player猜测的数字
    //执行猜测方法
    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("我猜的数字是"+number);
    }
}

//GameLauncher带有main方法，是应用程序的入口点
 class GameLauncher{
    //创建出GuessGame对象，并调用它的startGame()方法
    public static void main(String[] args){
        GuessGame game=new GuessGame();
        game.startGame();
        System.out.println("游戏结束！");
    }
}
