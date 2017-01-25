
public interface Promocional {
	
	boolean aplicarDesconto (double porcentagem);
	
	default boolean aplicarDesconto10Porcento() {
		return aplicarDesconto(0.1);
	} 
}
