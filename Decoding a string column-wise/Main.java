import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    int colcount = s.nextInt();
    StringBuilder sb = new StringBuilder(str); 
    int sblen = sb.length();
    deletespaces(sb, sblen);
    sblen = sb.length();
    int rowcount = sblen / colcount;
    if((sblen % colcount) > 0)
    {
        rowcount++;
    }
    for(int colidx = 0; colidx < colcount; colidx++)
    {
        for(int rowidx = 0; rowidx < rowcount; rowidx++)
        {
            int currcharidx = colidx + (rowidx * colcount);
            
            if(rowidx % 2 == 1){
                int charidx = (colcount - 1) + (rowidx * colcount);
                currcharidx = charidx - colidx;
            }
            char ch;
            if(currcharidx >= sblen)
            {
                ch = 'X';
            }
            else{
                ch = sb.charAt(currcharidx);
            }
            System.out.print(ch);
        }
    }
  }
  public static void deletespaces(StringBuilder sb, int sblen)
  {
    StringBuilder temp = new StringBuilder("");
    for(int i = 0; i < sblen; i++)
    {
        if(sb.charAt(i) != ' ')
        {
            temp.append(sb.charAt(i));
        }
    }
    sb.setLength(0);
    int templen = temp.length();
    for(int i = 0; i < templen; i++){
        sb.append(temp.charAt(i));           
    }
  }
}