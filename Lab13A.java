import java.util.Scanner;

class Enemy
{

    int HP,damage;

    boolean alive = true;


    Enemy(int h,int d)
    {
        HP = h;
        damage = d;
    }


    public void takeDamage(int d)
    {
        HP = HP - d;


        if(HP <= 0)
        {
            alive = false;
        }
    }

}

class Hero
{

    int HP,damage;

    boolean alive = true;


    Hero(int h,int d)
    {
        HP = h;
        damage = d;
    }

    public void takeDamage(int d)
    {
        HP = HP - d;


        if(HP <= 0)
        {
            alive = false;
        }
    }


    public static int left(Enemy e[])
    {

        int c=0;


        for(int i=0;i<e.length;i++)
        {

            if(e[i].alive)
            {
                c++;
            }
        }


        return c;
    }


    public static void print_hp(Enemy e[])
    {
        for(int i=0;i<e.length;i++)
        {
            System.out.print("|"+e[i].HP);
        }

        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);


        System.out.print("Enter the number of enemies: ");
        int n = in.nextInt();


        System.out.print("Enter the enemy damage: ");
        int ed = in.nextInt();


        System.out.print("Enter the hero's starting HP: ");
        int h = in.nextInt();


        System.out.print("Enter the hero's damage: ");
        int hd = in.nextInt();


        Hero hero = new Hero(h,hd);


        Enemy enemy[] = new Enemy[n];


        for(int i=0;i<n;i++)
        {
            int temp = 10 + (2*i);
            enemy[i] = new Enemy(temp,ed);
        }


        int r = 0;
        int d = hd;


        do
        {
            r++;


            int dh = 0;


            for(int i=0;i<n;i++)
            {
                if(enemy[i].alive)
                {
                    dh = dh + ed;
                }
            }


            hero.takeDamage(dh);


            for(int i=0;i<n;i++)
            {

                if(enemy[i].alive == false)
                {
                    d = d+hd;
                    continue;
                }

                enemy[i].takeDamage(hd);
                d = hd;
            }


            System.out.println("==== After round "+r+" ====");
            System.out.println("Num enemies left: "+left(enemy));
            print_hp(enemy);
            System.out.println("Hero HP: "+hero.HP);


            if(hero.HP <= 0)
            {
                System.out.println("Enemies win!");
                break;
            }


            if(left(enemy) == 0)
            {
                System.out.println("Hero wins!");
                break;
            }
        }while(true);

    }
}

