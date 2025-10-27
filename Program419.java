// Customised Database Management System

class node
{
    public int Rno;
    public String Name;
    public String City;
    public int Marks;

    public node next;

    public node(int A, String B, String C, int D)
    {
        Rno = A;
        Name = B;
        City = C;
        Marks = D;
        next = null;
    }
}

class DBMS
{
    private node first;

    public DBMS()
    {
        first = null;
        System.out.println("DBMS initailised succesfully...");
        System.out.println("Student Table gets created succesfully...");
    }

    // InsertLast
    public void Insert_Into_Table(int Rno, String Name, String City, int Marks)
    {
        node newn = new node(Rno,Name,City,Marks);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            node temp = first;
            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }
        System.out.println("One record gets inserted succesfully...");
    }
}

class Program419
{
    public static void main(String Arg[])
    {
        DBMS obj = new DBMS();

        obj.Insert_Into_Table(1,"Amit","Pune",89);
        obj.Insert_Into_Table(2,"Pooja","Mumbai",95);
        obj.Insert_Into_Table(3,"Rahul","Satara",80);
        obj.Insert_Into_Table(4,"Neha","Pune",78);

    }
}