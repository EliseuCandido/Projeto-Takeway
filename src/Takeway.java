import java.util.Scanner;
import javax.swing.JFrame;
import java.io.IOException;

public class Takeway {

	public static void main(String[] args) {
    
	ProdutoMenu P1 = new ProdutoMenu ();

	  /* COMENTARIOS REPETIDOS
	   *  A - Se escolha do Consumidor nao for VOLTAR, entao ele entra nesse if  
	   *  
	   *  B - Quando aperta o botao VOLTAR tira a atribuição de valor da escolha. (Para não ficar em loop) 
	   */
	
	 P1.LoginP();
	 do {P1.escolhahamburguer = ' '; P1.escolhasobremesa = ' ';
     P1.inicio();           // Tela Principal 
     
     if (P1.escolhaopcao == 1){ // Opção 1 == Conta  ,
    	P1.CartaoP();
    	if (P1.escolhaConta == 2){
			 System.out.println("Sessão Finalizada!");
			 break;
		 }

     }
     
	 else if (P1.escolhaopcao == 2) {  // Opção 2 == Produtos , Vai para parte da escolha do produto
		 P1.opcoes();
         
     }
     
	 else if (P1.escolhaopcao == 3) {  // Opção 3 == Menu , Vai fazer a sequencia OBRIGATORIA --> Hamburguer - Bebida - Acompanhamento - Sobremesa
			do {P1.escolhabebida = ' ';  //COMENTARIO B
			if (P1.escolhahamburguer > 0 && P1.escolhahamburguer <= 5 ) {
				if (P1.escolhahamburguer == 1) {
					P1.hamCHI -= 1;}
				else if (P1.escolhahamburguer == 2) {
					P1.hamTAS -= 1;}
				else if (P1.escolhahamburguer == 3) {
					P1.hamCBO -= 1;}
				else if (P1.escolhahamburguer == 4) {
					P1.hamROY -= 1;}
				else if (P1.escolhahamburguer == 5) {
					P1.hamCHE -= 1;}
			}
			P1.hamburguer(); 
			
			 if (P1.escolhahamburguer > 0 && P1.escolhahamburguer <= 5 )  //COMENTARIO A 
				do {P1.escolhaacompanhamento = ' '; //COMENTARIO B
				
				if (P1.escolhabebida > 0 && P1.escolhabebida <= 5 ) {
					if (P1.escolhabebida == 1) {
						P1.bebAGU -= 1;}
					else if (P1.escolhabebida == 2) {
						P1.bebCOL -= 1;}
					else if (P1.escolhabebida == 3) {
						P1.bebICE -= 1;}
					else if (P1.escolhabebida == 4) {
						P1.bebMON -= 1;}
					else if (P1.escolhabebida == 5) {
						P1.bebSUM -= 1;}
				}
				P1.bebida();
			
			    if (P1.escolhabebida != 0 && P1.escolhabebida <= 5 ) //COMENTARIO A 
			    	do{P1.escolhasobremesa = ' '; //COMENTARIO B
			    	
					if (P1.escolhaacompanhamento > 0 && P1.escolhaacompanhamento <= 3 ) {
						if (P1.escolhaacompanhamento == 1) {
							P1.acBAT -= 1;}
						else if (P1.escolhaacompanhamento == 2) {
							P1.acSOP -= 1;}
						else if (P1.escolhaacompanhamento == 3) {
							P1.acSAL -= 1;}
					}
			    		P1.acompanhamento();
			    
				    if (P1.escolhaacompanhamento > 0 && P1.escolhaacompanhamento <= 4 ) { //COMENTARIO A 
				    	P1.sobremesa(); // Vai para sobremesas
					    if (P1.escolhasobremesa > 0 && P1.escolhasobremesa <= 4 ) { //Verificar se o cliente finalizou a conta
					    	 P1.menucont += 1;
							 P1.menuPreco += P1.hamM + P1.sobM;
							 P1.descontomenu += P1.hamM + P1.bebM + P1.acoM + P1.sobM;}
					    	}
		    
		      } while (P1.escolhasobremesa == 0); 
		    }while (P1.escolhaacompanhamento == 0); 
		}while (P1.escolhabebida == 0); 	
       }
     
	 if (P1.escolhaopcao == 4) {
		 P1.PagamentoMenu(); }

	  } while (P1.escolhahamburguer == 0 || P1.escolhaopcao == 2 || P1.escolhaopcao == 4
			  || (P1.escolhasobremesa > 0 && P1.escolhasobremesa <= 4)
			  || (P1.escolhaopcao == 1 && P1.escolhaConta == 1));
	 
	}

}
