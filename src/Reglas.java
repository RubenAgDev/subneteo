package Direccionamiento_IP;
public class Reglas {
    
    private String octeto1;
    private String octeto2;
    private String octeto3;
    private String octeto4;
    private String prefijo;
    
    private int oct1Mascara;
    private int oct2Mascara;
    private int oct3Mascara;
    private int oct4Mascara;
    
    private String direccionDeRed;
    
    public Reglas(String oct1, String oct2, String oct3, String oct4, String pre)
    {
        this.octeto1 = oct1;
        this.octeto2 = oct2;
        this.octeto3 = oct3;
        this.octeto4 = oct4;
        this.prefijo = pre;
    }
    
    public boolean isCorrectIP()
    {
        try
        {
            if(Integer.parseInt(this.octeto1) > 255)
                return false;
            if(Integer.parseInt(this.octeto2) > 255)
                return false;
            if(Integer.parseInt(this.octeto3) > 255)
                return false;
            if(Integer.parseInt(this.octeto4) > 255)
                return false;
            if(Integer.parseInt(this.prefijo) > 32 || Integer.parseInt(prefijo) < 1)
                return false;
        
            return true;
        }
        catch(NumberFormatException e)
        {
        }
        return false;
    }
    
    public String getMascaraDeSubredBinaria()
    {
        String mascaraBinaria = "";
        
        for(int i = 0; i<Integer.parseInt(prefijo); i++)
            mascaraBinaria += "1";
        
        for(int i = Integer.parseInt(prefijo); i < 32; i++)
            mascaraBinaria += "0";
        
        oct1Mascara = Integer.parseInt(mascaraBinaria.substring(0, 8), 2);
        oct2Mascara = Integer.parseInt(mascaraBinaria.substring(8, 16), 2);
        oct3Mascara = Integer.parseInt(mascaraBinaria.substring(16, 24), 2);
        oct4Mascara = Integer.parseInt(mascaraBinaria.substring(24, 32), 2);
        
        return String.valueOf(oct1Mascara) + "." + String.valueOf(oct2Mascara) + "." + String.valueOf(oct3Mascara) + "." + String.valueOf(oct4Mascara);
    }
    
    public String getDireccionDeRed()
    {
        int oct1Red = Integer.parseInt(this.octeto1) & this.oct1Mascara;
        int oct2Red = Integer.parseInt(this.octeto2) & this.oct2Mascara;
        int oct3Red = Integer.parseInt(this.octeto3) & this.oct3Mascara;
        int oct4Red = Integer.parseInt(this.octeto4) & this.oct4Mascara;
        
        this.direccionDeRed = this.getBinaryNumber(oct1Red);
        this.direccionDeRed += this.getBinaryNumber(oct2Red);
        this.direccionDeRed += this.getBinaryNumber(oct3Red);
        this.direccionDeRed += this.getBinaryNumber(oct4Red);
        
        return String.valueOf(oct1Red) + "." + String.valueOf(oct2Red) + "." + String.valueOf(oct3Red) + "." + String.valueOf(oct4Red);
    }
    
    public String getDireccionBroadcast()
    {
        int parteRed = Integer.parseInt(prefijo);
        
        String broadcast = this.direccionDeRed.substring(0, parteRed);
        
        while(broadcast.length() < 32)
            broadcast += "1";
        
        return String.valueOf(Integer.parseInt(broadcast.substring(0, 8), 2)) + "." + String.valueOf(Integer.parseInt(broadcast.substring(8, 16), 2)) + "." + String.valueOf(Integer.parseInt(broadcast.substring(16, 24), 2)) + "." + String.valueOf(Integer.parseInt(broadcast.substring(24, 32), 2));
    }
    
    private String getBinaryNumber(int entero)
    {
        String binaryNumber = Integer.toBinaryString(entero);
        int longitud = binaryNumber.length();
        
        if(longitud == 8)
            return binaryNumber;
        if(longitud == 7)
            return "0" + binaryNumber;
        if(longitud == 6)
            return "00" + binaryNumber;
        if(longitud == 5)
            return "000" + binaryNumber;
        if(longitud == 4)
            return "0000" + binaryNumber;
        if(longitud == 3)
            return "00000" + binaryNumber;
        if(longitud == 2)
            return "000000" + binaryNumber;
        if(longitud == 1)
            return "0000000" + binaryNumber;
        else
            return "000000000";
    }
}
