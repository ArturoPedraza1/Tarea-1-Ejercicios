public class ejercicios
{

        public static void main(String[] args){
        
        System.out.println("La palabra introducida es Holaaa, y se esta usando el comando lenght");
        String s = "Holaaa";{
        int x = s.length();
            System.out.println(x);
        }
System.out.println("----------------------------------");
{
        System.out.println("La palabra introducida es texto otra vez, y se usan los comandos booleanos");
        String s1 = "texto otra vez";{
        boolean b1 = s1.isEmpty();
        String s2 = "";
        boolean b2 = s2.isEmpty();
            System.out.println(b1);
            System.out.println(b2);
        }
        
System.out.println("----------------------------------");
{
        System.out.println("La palabra es ejemplo, y se usa el comando equals");
        String x1 = "ejemplo";
        String y = "ejemplo";
        if( x1.equals(y) )
        {
                System.out.println("Si es correcto");
        }
System.out.println("----------------------------------");
{
        System.out.println("Las palabras usadas son:Una orden de tacos por favor, y se usa el comando index para: orden, y last index para: favor");
        String ss1 = "Una orden de tacos por favor";{
        int p1 = ss1.indexOf("orden");
        int p2 = ss1.lastIndexOf("favor");
        System.out.println(p1);
        System.out.println(p2);
        }
System.out.println("----------------------------------");
        System.out.println("Las palabras usadas son: quiero un gatito y se usan los comandos uppercase y lowercase");
        String s3 = "Quiero un gatito";{
        String may = s3.toUpperCase();
        String min = s3.toLowerCase();
        System.out.println(may);
        System.out.println(min);
        }
System.out.println("----------------------------------");
{
        System.out.println("Las palabras que se usan son: programar es divertido, y se usan los comandos substring");
        String s4 = "programar es divertido";
        String sss1 = s4.substring(0,9);
        String sss2 = s4.substring(10,12);
        String sss3 = s4.substring(13);
        System.out.println(sss1);
        System.out.println(sss2);
        System.out.println(sss3);
}
System.out.println("----------------------------------");
        System.out.println("Los numeros usados son 1405 y se usan los comandos parseint y tostring");
        String s5 = "1405";
        int i = Integer.parseInt(s5);
        String t1 = Integer.toString(i);
        System.out.println(i);
        System.out.println(t1);
        }
System.out.println("----------------------------------");
{
    System.out.println("Las palabras que se usan son: objeto nuevo de ejemplo, y se usan los comandos stringbuilder");
    StringBuilder sb = new StringBuilder();
    sb.append("Objeto nuevo ");
    sb.append("de ejemplo");
    System.out.println(sb);
}
}
}
}
}
