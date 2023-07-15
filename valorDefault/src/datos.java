/**
 *
 * @author Mikkel
 */
public class datos {
   public static void main(String[] args) {
       byte byt=0;
       short srt=0;
       int inte=0;
       long log=0;
       float ft=0.0F;
       double db=0.0;
       boolean boo = false;
       char cr = 0;
       System.out.println("Valor por default de");
       System.out.println("byte:"+byt+"\n"+"short:"+srt+"\n"+"int:"+inte+"\n"+"float:"+ft+"\n"+"double:"+db+"\n"+"boolean:"+boo+"\n"+"char:"+cr);
        System.out.println("Primitivo:\t"+"Valor máximo"+"\t\t"+"Valor meinimo");
        System.out.println("byte\t\t"+Byte.MAX_VALUE+ "\t\t\t" + Byte.MIN_VALUE);
        System.out.println("short\t\t"+Short.MAX_VALUE+ "\t\t\t" + Short.MIN_VALUE);
        System.out.println("int\t\t"+Integer.MAX_VALUE+"\t\t"+ Integer.MIN_VALUE);        
        System.out.println("long\t\t"+Long.MAX_VALUE+"\t"+Long.MIN_VALUE);
        System.out.println("float\t\t"+Float.MAX_VALUE+"\t\t"+Float.MIN_VALUE);
        System.out.println("double\t\t"+Double.MAX_VALUE+"\t"+Double.MIN_VALUE);
    }
}