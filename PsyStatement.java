public enum PsyStatement {
    GREAT("10001111010010100010110000011010100"),
    SOSO("1010011100111110100111001111"),
    DEPRESSION("1000100100010110100001010010100010110100111010011100100110011111001110");
private  String code;
PsyStatement(String code){
    this.code = code;
}
public  String getCode(){
    return this.code;
}
}
