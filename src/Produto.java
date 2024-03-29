import java.security.PublicKey;
import java.util.Scanner;


public abstract class Produto {
	
	
	int escolhaopcao = ' ', escolhahamburguer = ' ', escolhabebida = ' ', escolhaacompanhamento = ' ', escolhasobremesa = ' ',escolhaConta = ' ';
	int hamCHI = 0, hamTAS = 0, hamCBO = 0, hamROY = 0, hamCHE = 0; // Quantidades separada de Hamburgers
	int bebAGU = 0, bebCOL = 0, bebICE = 0, bebMON = 0, bebSUM = 0; // Quantidades separada de Bebida
	int acBAT = 0, acSOP = 0, acSAL = 0; // Quantidades separada de Acompanhamento
	int sobGEL = 0, sobCAF = 0, sobPAN = 0; // Quantidades separada de Sobremesa
	
	// Essencial <
	int menucont = 0; // Quantidades de menu
	double ham, beb, aco, sob; // Valor dos Produtos
	double hamM = 0, bebM = 0, acoM = 0, sobM = 0, descontomenu = 0; // Valor dos lanches do Menu
	double menuPreco = 0, produtoPreco = 0, totalPreco = 0;  // Preço final do menu
	// >
	
	// Apenas para fins visuais <
	int contvisuHam,h1=0,h2=0,h3=0,h4=0,h5=0;
	int contvisuBeb,b1=0,b2=0,b3=0,b4=0,b5=0;
	int contvisuAco,a1=0,a2=0,a3=0;
    int contvisuSob,s1=0,s2=0,s3=0;
    // >
    
    
    Autenticacao login = new Autenticacao();
    CreditCard cartao = new CreditCard ();
    
    public void LoginP() {
    	login.Login();
    	cartao.nomeCartao = login.nome1.toUpperCase();
    	cartao.Gerador();
    }
    
    public void CartaoP() {
    	System.out.println("╔═════════════════════════════════════════════════════════════╗\r\n"
		    	         + "║     Conta      ║    Produtos   ║    Menu   ║    Carrinho    ║\r\n"
		    			 + "╚═════════════════════════════════════════════════════════════╝\r\n"
						 + "║                ║\r\n"
		    			 + "║╭────  1   ────╮║\r\n"
						 + "║|    Cartao    |║\r\n"
						 + "║╰──────────────╯║\r\n"
						 + "║                ║\r\n"
						 + "║╭────  2   ────╮║\r\n"
						 + "║ Encerrar Sessão║\r\n"
						 + "║╰──────────────╯║\r\n"
						 + "╚════════════════╝");
    	Scanner entrada = new Scanner(System.in);  	
 		escolhaConta  = entrada.nextInt();
		switch (escolhaConta) {
		case 1:
    	cartao.Visualizar();
    	break;
		case 2:
	    	break;
		default:
			System.out.println("Opcao invalida");
    	}
    }
    
	public void inicio() {

		System.out.println("╔═════════════════════════════════════════════════════════════╗\n"
						 + "║  1 - Conta  ║  2 - Produtos  ║  3 - Menu  ║  4 - Carrinho   ║\n"
						 + "╚═════════════════════════════════════════════════════════════╝");
		Scanner entrada = new Scanner(System.in);   	
		escolhaopcao  = entrada.nextInt();
		
	}
	
	
	
	public void opcoes() {
	
		System.out.println("                         ╔══════════════════════════════════════════╗                       \r\n"
						 + "                         ║            Escolha um Produto            ║                       \r\n"
						 + "╔══════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
						 + "|    1 - Hambúrguer     |     2 - Bebidas    |  3 - Acompanhamentos   |   4 - Sobremesa    |\r\n"     
						 + "╚══════════════════════════════════════════════════════════════════════════════════════════╝");
		
		           
		
		
		
		
		Scanner entrada = new Scanner(System.in);   	
 		int escolha  = entrada.nextInt();
		switch (escolha) {
		case 1:
		hamburguerP();
		break;
		case 2:
		bebidaP();
		break;
		case 3:
		acompanhamentoP();
		break;
		case 4:
		sobremesaP();		
		break;
		
		}	
	}
	public void hamburguerP() {
	
		System.out.println(
				      "╔══════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
				    + "║       Hambúrguer      ║       Bebidas      ║     Acompanhamentos    ║      Sobremesa     ║\r\n"
				    + "╚══════════════════════════════════════════════════════════════════════════════════════════╝\r\n"
				    + "║                       ║\r\n"
				    + "║ 1 - TW Chicken 4.20Є  ║\r\n"
				    + "║                       ║\r\n"
				    + "║ 2 - TW BigTasty 7.70Є ║\r\n"
				    + "║                       ║\r\n"
				    + "║ 3 - TW CBO 6.00Є      ║\r\n"
				    + "║                       ║\r\n"
				    + "║ 4 - TW Royal 5.20Є    ║\r\n"
				    + "║                       ║\r\n"
				    + "║ 5 - TW Cheese 4.20Є   ║\r\n"
				    + "╚═══════════════════════╝");
		
		Hamburguer c1 = new Hamburguer ();
		Scanner entrada = new Scanner(System.in);   	
		escolhahamburguer = entrada.nextInt();
		switch (escolhahamburguer) {
		case 1:
		c1.mcChicken();
		hamCHI += 1;
		ham += 4.20;
		break;
		case 2:
		c1.bigTasty();
		hamTAS += 1;
		ham += 7.70;
		break;
		case 3:
		c1.cbo();
		hamCBO += 1;
		ham += 6.00;
		break;
		case 4:
		c1.mcRoyal();
		hamROY += 1;
		ham += 5.20;
		break;
		case 5:
		c1.mcChese();
		hamCHE += 1;
		ham += 4.20;
		break;
		default:
				System.out.println("Você inseriu a opção errada");
		break;
			
		}	
		
	}
	
	
	
	public void bebidaP() {
 
		System.out.println(
			      "╔══════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
			    + "║       Hambúrguer      ║       Bebidas      ║     Acompanhamentos    ║      Sobremesa     ║\r\n"
			    + "╚══════════════════════════════════════════════════════════════════════════════════════════╝\r\n"
				+ "                        ║                    ║\r\n"
				+ "                        ║ 1 - Agua 1.50Є     ║\r\n"
				+ "                        ║                    ║\r\n"
				+ "                        ║ 2 - CocaCola 2.40Є ║\r\n"
				+ "                        ║                    ║\r\n"
				+ "                        ║ 3 - IceTea 2.20Є   ║\r\n"
				+ "                        ║                    ║\r\n"
				+ "                        ║ 4 - Monster 3.20Є  ║\r\n"
				+ "                        ║                    ║\r\n"
				+ "                        ║ 5 - Sumo Nat 1.90Є ║\r\n"
				+ "                        ╚════════════════════╝");
		
		
		Bebidas c1 = new Bebidas ();
		Scanner entrada = new Scanner(System.in);   	
 		escolhabebida  = entrada.nextInt();
		switch (escolhabebida) {
		case 1:
		c1.agua();
		bebAGU += 1;
		beb += 1.50;
		break;
		case 2:
		c1.colaCola();
		bebCOL += 1;
		beb += 2.40;
		break;
		case 3:
		c1.iceTea();
		bebICE += 1;
		beb += 2.20;
		break;
		case 4:
		c1.monster();
		bebMON += 1;
		beb += 3.20;
		break;
		case 5:
		c1.sumoNatural();
		bebSUM += 1;
		beb += 1.90;
		break;
		default:
			System.out.println("Você inseriu a opção errada");
		break;
		}			
	}
	
	public void acompanhamentoP() {
		System.out.println(
			      "╔══════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
			    + "║       Hambúrguer      ║       Bebidas      ║     Acompanhamentos    ║      Sobremesa     ║\r\n"
			    + "╚══════════════════════════════════════════════════════════════════════════════════════════╝\r\n"
				+ "                                             ║                        ║\r\n"
				+ "                                             ║ 1 - Batata Frita 2.50Є ║\r\n"
				+ "                                             ║                        ║\r\n"
				+ "                                             ║ 2 - Sopa 2.50Є         ║\r\n"
				+ "                                             ║                        ║\r\n"
				+ "                                             ║ 3 - Salada 2.50Є       ║\r\n"
				+ "                                             ╚════════════════════════╝");
		
		Acompanhamento c1 = new Acompanhamento ();
		Scanner entrada = new Scanner(System.in);   	
 		escolhaacompanhamento  = entrada.nextInt();
		switch (escolhaacompanhamento) {
		case 1:
		c1.batataFrita();
		acBAT += 1;
		aco = 2.50;
		break;
		case 2:
		c1.sopa();
		acSOP += 1;
		aco = 2.50;
		break;
		case 3:
		c1.salada();
		acSAL += 1;
		aco = 2.50;
		break;
		default:
			System.out.println("Você inseriu a opção errada");
		break;
		}
	}
	
	public void sobremesaP() {

		System.out.println(
			      "╔══════════════════════════════════════════════════════════════════════════════════════════╗\r\n"
			    + "║       Hambúrguer      ║       Bebidas      ║     Acompanhamentos    ║      Sobremesa     ║\r\n"
			    + "╚══════════════════════════════════════════════════════════════════════════════════════════╝\r\n"
				+ "                                                                      ║                    ║\r\n"
				+ "                                                                      ║ 1 - Gelado 1.00Є   ║\r\n"
				+ "                                                                      ║                    ║\r\n"
				+ "                                                                      ║ 2 - Cafe 1.00Є     ║\r\n"
				+ "                                                                      ║                    ║\r\n"
				+ "                                                                      ║ 3 - Panqueca 1.00Є ║\r\n"
				+ "                                                                      ╚════════════════════╝");
		
		Sobremesa c1 = new Sobremesa();
		Scanner entrada = new Scanner(System.in);   	
		escolhasobremesa  = entrada.nextInt();
		switch (escolhasobremesa) {
		case 1:
		c1.gelado();
		sobGEL += 1;
		sob += 1;
		break;
		case 2:
		c1.cafe();
		sobCAF += 1;
		sob += 1;
		break;
		case 3:
		c1.panqueca();
		sobPAN += 1;
		sob += 1;
		break;
		default:
			System.out.println("Você inseriu a opção errada");
		break;
	
		}
		
	}
	public void PagamentoMenu() {

		
		produtoPreco = ham + beb + aco + sob;
		if (produtoPreco == 0 && menuPreco == 0) {
			System.out.printf("                 |￣￣￣￣￣￣￣￣|\r\n"
							+ "                 | Seu Carrinho |\r\n"
							+ "                 |  Está Vazio  |\r\n"
							+ "                 | ＿＿＿＿＿____|\r\n"
							+ "                 (\\__/) ||\r\n"
							+ "                 (•ㅅ•) ||\r\n"
							+ "                 / 　 づ\n");
					
		}
		
		
		if (produtoPreco > 0 || menuPreco > 0) {// Só passa se o cliente escolheu algo
			
			int visuHam = (hamCHI + hamTAS + hamCBO + hamROY + hamCHE);
	
			
			if (visuHam > 0) {
				System.out.print("━━━━━━━━━━━━┑");
				if (hamCHI > 0) { System.out.print("─────────────╮"); h1 = 1;}
				if (hamTAS > 0) { System.out.print("─────────────╮"); h2 = 1; ;}
				if (hamCBO > 0) { System.out.print("─────────────╮"); h3 = 1; ;}
				if (hamROY > 0) { System.out.print("─────────────╮"); h4 = 1; ;}
				if (hamCHE > 0) { System.out.print("─────────────╮"); h5 = 1; ;}
				System.out.print("\n Hambúrguers|");
				contvisuHam = h1+h2+h3+h4+h5;
				if (hamCHI > 0) {
					if (hamCHI < 10) {System.out.printf(" %d Chicken    ", hamCHI);}
					else if (hamCHI < 100) {System.out.printf(" %d Chicken   ", hamCHI);}
					else {System.out.printf(" %d Chicken  ", hamCHI);}
				}
				
				if (hamTAS > 0) {
					if (hamTAS < 10) {System.out.printf(" %d Tasty      ", hamTAS);}
					else if (hamTAS < 100) {System.out.printf(" %d Tasty     ", hamTAS);}
					else {System.out.printf(" %d Tasty    ", hamTAS);}
				}
				
				if (hamCBO > 0) {
					if (hamCBO < 10) {System.out.printf(" %d CBO        ", hamCBO);}
					else if (hamCBO < 100) {System.out.printf(" %d CBO       ", hamCBO);}
					else {System.out.printf(" %d CBO      ", hamCBO);}
				}
				if (hamROY > 0) {
					if (hamROY < 10) {System.out.printf(" %d Royal      ", hamROY);}
					else if (hamROY < 100) {System.out.printf(" %d Royal     ", hamROY);}
					else {System.out.printf(" %d Royal    ", hamROY);}
				}
				if (hamCHE > 0) {
					if (hamCHE < 10) {System.out.printf(" %d Cheese     ", hamCHE);}
					else if (hamCHE < 100) {System.out.printf(" %d Cheese    ", hamCHE);}
					else {System.out.printf(" %d Cheese   ", hamCHE);}
				}
				System.out.print("\n━━━━━━━━━━━━┙");
				if (hamCHI > 0) {System.out.print("─────────────╯");};
				if (hamTAS > 0) {System.out.print("─────────────╯");};
				if (hamCBO > 0) {System.out.print("─────────────╯");};
				if (hamROY > 0) {System.out.print("─────────────╯");};
				if (hamCHE > 0) {System.out.print("─────────────╯");};
			}
			
			int visuBeb = (bebAGU + bebCOL + bebICE + bebMON + bebSUM); // Soma de todas as quantidade de bebida para a parte grafica
			
			if (visuBeb > 0) {
				if (bebAGU > 0)b1 = 1;if (bebCOL > 0)b2 = 1;if (bebICE > 0)b3 = 1;
				if (bebMON > 0)b4 = 1;if (bebSUM > 0)b5 = 1;
				
				contvisuBeb = (b1 + b2 + b3 + b4 + b5);
				

				System.out.print("\n━━━━━━━━━━━━┑");
				if (bebAGU > 0) System.out.print("─────────────╮");
				if (bebCOL > 0) System.out.print("─────────────╮"); 
				if (bebICE > 0) System.out.print("─────────────╮"); 
				if (bebMON > 0) System.out.print("─────────────╮"); 
				if (bebSUM > 0) System.out.print("─────────────╮"); 
					

				System.out.print("\n Bebidas    |");

				if (bebAGU > 0) {
					if (bebAGU < 10) {System.out.printf(" %d  Agua      ", bebAGU);}
					else if (bebAGU < 100) {System.out.printf(" %d  Agua     ", bebAGU);}
					else {System.out.printf(" %d Agua     ", bebAGU);}
				}
				
				if (bebCOL > 0) {
					if (bebCOL < 10) {System.out.printf(" %d CocaCola  ", bebCOL);}
					else if (bebCOL < 100) {System.out.printf(" %d CocaCola  ", bebCOL);}
					else {System.out.printf(" %d CocaCola ", bebCOL);}
				}
				
				if (bebICE > 0) {
					if (bebICE < 10) {System.out.printf(" %d IceTea     ", bebICE);}
					else if (bebICE < 100) {System.out.printf(" %d IceTea    ", bebICE);}
					else {System.out.printf(" %d IceTea   ", bebICE);}
				}
				if (bebMON > 0) {
					if (bebMON < 10) {System.out.printf(" %d Monster    ", bebMON);}
					else if (bebMON < 100) {System.out.printf(" %d Monster   ", bebMON);}
					else {System.out.printf(" %d Monster  ", bebMON);}
				}
				if (bebSUM > 0) {
					if (bebSUM < 10) {System.out.printf(" %d Sumo       ", bebSUM);}
					else if (bebSUM < 100) {System.out.printf(" %d Sumo:     ", bebSUM);}
					else {System.out.printf(" %d Sumo     ", bebSUM);}
				}
				System.out.print("\n━━━━━━━━━━━━┙");
				if (bebAGU > 0) {System.out.print("─────────────╯");};
				if (bebCOL > 0) {System.out.print("─────────────╯");};
				if (bebICE > 0) {System.out.print("─────────────╯");};
				if (bebMON > 0) {System.out.print("─────────────╯");};
				if (bebSUM > 0) {System.out.print("─────────────╯");};
			}
			
			
			
			int visuAco = (acBAT + acSOP + acSAL);

			
			if (visuAco > 0) {
				
				if (acBAT > 0)a1 = 1;if (acSOP > 0)a2 = 1;if (acSAL > 0)a3 = 1;
				
				int contvisuAco = (a1 + a2 + a3);
				
			    System.out.print("\n━━━━━━━━━━━━┑");
				if (acBAT > 0) System.out.print("─────────────╮");
				if (acSOP > 0) System.out.print("─────────────╮"); 
				if (acSAL > 0) System.out.print("─────────────╮"); 
				
			
				
				
				System.out.print("\n Acompanham/|");

				if (acBAT > 0) {
					if (acBAT < 10) {System.out.printf(" %d Batata F   ", acBAT);}
					else if (acBAT < 100) {System.out.printf(" %d Batata F  ", acBAT);}
					else {System.out.printf(" %d Batata F ", acBAT);}
				}
				
				if (acSOP > 0) {
					if (acSOP < 10) {System.out.printf(" %d Sopa       ", acSOP);}
					else if (acSOP < 100) {System.out.printf(" %d Sopa     ", acSOP);}
					else {System.out.printf(" %d Sopa     ", acSOP);}
				}
				
				if (acSAL > 0) {
					if (acSAL < 10) {System.out.printf(" %d Salada      ", acSAL);}
					else if (acSAL < 100) {System.out.printf(" %d Salada     ", acSAL);}
					else {System.out.printf(" %d Salada    ", acSAL);}
				}
				
				
				System.out.print("\n━━━━━━━━━━━━┙");
				if (acBAT > 0) {System.out.print("─────────────╯");};
				if (acSOP > 0) {System.out.print("─────────────╯");};
				if (acSAL > 0) {System.out.print("─────────────╯");};
			}
			
		
		
			int visuSob = (sobGEL + sobCAF + sobPAN);
			
			
			if (visuSob > 0) {
				
				if (sobGEL > 0)a1 = 1;if (sobCAF > 0)a2 = 1;if (sobPAN > 0)a3 = 1;
				
				int contvisuSob = (a1 + a2 + a3);
				
			    System.out.print("\n━━━━━━━━━━━━┑");
				if (sobGEL > 0) System.out.print("─────────────╮");
				if (sobCAF > 0) System.out.print("─────────────╮"); 
				if (sobPAN > 0) System.out.print("─────────────╮"); 
				
			
				
				
				System.out.print("\n Sobremesa  |");
	
				if (sobGEL > 0) {
					if (sobGEL < 10) {System.out.printf(" %d Gelado     ", sobGEL);}
					else if (sobGEL < 100) {System.out.printf(" %d Gelado    ", sobGEL);}
					else {System.out.printf(" %d Gelado   ", sobGEL);}
				}
				
				if (sobCAF > 0) {
					if (sobCAF < 10) {System.out.printf(" %d Café       ", sobCAF);}
					else if (sobCAF < 100) {System.out.printf(" %d Café     ", sobCAF);}
					else {System.out.printf(" %d Café     ", sobCAF);}
				}
				
				if (sobPAN > 0) {
					if (sobPAN < 10) {System.out.printf(" %d Panqueca    ", sobPAN);}
					else if (sobPAN < 100) {System.out.printf(" %d Panqueca   ", sobPAN);}
					else {System.out.printf(" %d Panqueca  ", sobPAN);}
				}
				
				
				System.out.print("\n━━━━━━━━━━━━┙");
				if (sobGEL > 0) {System.out.print("─────────────╯");};
				if (sobCAF > 0) {System.out.print("─────────────╯");};
				if (sobPAN > 0) {System.out.print("─────────────╯");};
			}
			System.out.print("\n");
			
	    	// Valor individual e total do produto e menu <......................................................
			produtoPreco = ham + beb + aco + sob; 
			totalPreco = menuPreco + produtoPreco;
			// >     ............................................................................................
			
			System.out.print("━━━━━━━━━━━━┑");
			if (menuPreco > 0) System.out.print("╭──────────────────╮");
			if (produtoPreco > 0) System.out.print("╭──────────────────╮"); 
			if (totalPreco > 0) System.out.print("╔──────────────────╗"); 
			System.out.print("\n Preço      |");
			
			if (produtoPreco > 0) {
				if (produtoPreco < 10) {System.out.printf("| Produto: %.2f    |", produtoPreco);}
				else if (produtoPreco < 100) {System.out.printf("| Produto: %.2f   |", produtoPreco);}
				else {System.out.printf("| Produto: %.2f   |", produtoPreco);}
			}
			
			if (menuPreco > 0) {
				if (menuPreco < 10) {System.out.printf("| Menu: %.2f       |", menuPreco);}
				else if (menuPreco < 100) {System.out.printf("| Menu: %.2f      |", menuPreco);}
				else {System.out.printf("| Menu: %.2f     |", menuPreco);}
			}

			if (totalPreco > 0) {
				if (totalPreco < 10) {System.out.printf("| TOTAL: %.2f      |", totalPreco);}
				else if (totalPreco < 100) {System.out.printf("| TOTAL: %.2f     |", totalPreco);}
				else if (totalPreco < 1000) {System.out.printf("| TOTAL: %.2f     |", totalPreco);}
				else {System.out.printf("| TOTAL: %.2f    |", totalPreco);}
			}
			
			System.out.print("\n━━━━━━━━━━━━┙");
			if (menuPreco > 0) System.out.print("╰──────────────────╯");
			if (produtoPreco > 0) System.out.print("╰──────────────────╯"); 
			if (totalPreco > 0) System.out.print("╚──────────────────╝"); 
			
	    	
		    char escolhacarrinho;
			
			System.out.println( "\n╔──────────────────────────────────────────────╗\r\n"
								+ "║  Deseja Finalizar a Compra [S]im ou [N]ao ?  ║\r\n"
								+ "╚──────────────────────────────────────────────╝");
			do{
			Scanner entrada = new Scanner(System.in);   	
			escolhacarrinho  = entrada.nextLine().charAt(0);
			
			
		    if (escolhacarrinho == 's' || escolhacarrinho == 'S') {
		    	char escolhaLimpar = ' ';
		    	
		    	if (cartao.balanco >= totalPreco) {
		    		
		    		String numTotal = String.format("%.2f",totalPreco);
		    		int numTotal2 = numTotal.length();
		    		
		    		if (numTotal2 < 8) {
		    			while (numTotal2 < 8){
		    				numTotal2 ++;
		    				numTotal = String.format("%s ",numTotal);
		    			}
		    		}
		    		
			    	System.out.printf("╔──────────────────────────────────────────────╗\r\n"
					    			+ "║  Fatura                         ║   VALOR    ║\r\n"
					    			+ "║                                 ║            ║\r\n"
					    			+ "║ Takeway                         ║            ║\r\n"
					    			+ "║ Marqueza, Palmela               ║            ║\r\n"
					    			+ "║ 2950-557                        ║  %sЄ ║\r\n"
					    			+ "╚═────────────────────────────────────────────═╝\r\n",numTotal);
			        cartao.balanco -= totalPreco;
			        
			        System.out.println("\n    ╭── Seu Lanche está a caminho ...\r\n"
						        	 + "    ╰╮┏━┳┳┳┓\r\n"
						        	 + "     ┏┻╋━╋┻┻┫\r\n"
						        	 + "     ┗ⓞ━━━┻ⓞ━┻\r\n");
	    			
			        ham = 0; beb = 0; aco = 0; sob = 0; 
	    			hamM = 0;bebM = 0;acoM = 0;sobM = 0;menuPreco = 0;descontomenu = 0;
	    			hamCHI = 0; hamTAS = 0; hamCBO = 0; hamROY = 0; hamCHE = 0; // Quantidades separada de Hamburgers
	    			bebAGU = 0; bebCOL = 0; bebICE = 0; bebMON = 0; bebSUM = 0; // Quantidades separada de Bebida
	    			acBAT = 0; acSOP = 0; acSAL = 0; // Quantidades separada de Acompanhamento
	    			sobGEL = 0; sobCAF = 0; sobPAN = 0; // Quantidades separada de Sobremesa
		    		
		    	}
		    	else {
		    		System.out.println("\n╔══════════════════════════════════════════════════╗\r\n"
				    				   + "║ Voce não tem dinheiro para completar a transação ║\r\n"
				    				   + "║                                                  ║\r\n"
				    				   + "║ Deseja limpar o carrinho?                        ║\r\n"
				    				   + "║ [S]im                                            ║\r\n"
				    				   + "║ [N]ão                                            ║\r\n"
				    				   + "╚══════════════════════════════════════════════════╝");
		    		do {
		    		Scanner entrada2 = new Scanner(System.in);   	
					escolhaLimpar  = entrada2.nextLine().charAt(0);
		    		
					if (escolhaLimpar == 'S' || escolhaLimpar == 's') {
		    			ham = 0; beb = 0; aco = 0; sob = 0; 
		    			hamM = 0;bebM = 0;acoM = 0;sobM = 0;menuPreco = 0;descontomenu = 0;
		    			hamCHI = 0; hamTAS = 0; hamCBO = 0; hamROY = 0; hamCHE = 0; // Quantidades separada de Hamburgers
		    			bebAGU = 0; bebCOL = 0; bebICE = 0; bebMON = 0; bebSUM = 0; // Quantidades separada de Bebida
		    			acBAT = 0; acSOP = 0; acSAL = 0; // Quantidades separada de Acompanhamento
		    			sobGEL = 0; sobCAF = 0; sobPAN = 0; // Quantidades separada de Sobremesa
		    		}
		    		else if (escolhaLimpar == 'N' || escolhaLimpar == 'n') {
		    			
		    		}
		    		else {
		    			System.out.println("╔──────────────────────────────────────────────╗\r\n"
				    					 + "║                   Escolha                    ║\r\n"
				    					 + "║                                              ║\r\n"
				    					 + "║ [S]im para limpar carrinho                   ║\r\n"
				    					 + "║ [N]ao para continuar com o carrinho cheio    ║\r\n"
				    					 + "╚──────────────────────────────────────────────╝");escolhaLimpar = 'e';
		    		}
		    	}while (escolhaLimpar == 'e');
		    	}
		    	

		    	}  
		    
		    else if (escolhacarrinho == 'n' || escolhacarrinho == 'N') {}
		    
		    else{System.out.println("╔──────────────────────────────────────────────╗\r\n"
					    		  + "║                   Escolha                    ║\r\n"
					    		  + "║                                              ║\r\n"
					    		  + "║ [S] para finalizar a compra                  ║\r\n"
					    		  + "║ [N] para sair do carrinho                    ║\r\n"
					    		  + "╚──────────────────────────────────────────────╝"); escolhacarrinho = 'e';}
			
			}while (escolhacarrinho == 'e'); // Loop se o usuario não escolher entre [S] ou [N]
			
			
			
		}
		
			
			
	}
		    
	} 
	 

