package DIO.utils.Operacao;

import DIO.utils.Operacao.internal.DivHelper;
import DIO.utils.Operacao.internal.MultiHelper;
import DIO.utils.Operacao.internal.SubHelper;
import DIO.utils.Operacao.internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private SumHelper sumHelper;
    private MultiHelper multiHelper;
    private SubHelper subHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
        multiHelper = new MultiHelper();
    }
    public int sum(int a, int b){
        return  sumHelper.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a,b);
    }

    public int div(int a, int b){
        return divHelper.execute(a,b);
    }

    public int multi(int a, int b){
        return multiHelper.execute(a,b);
    }
}