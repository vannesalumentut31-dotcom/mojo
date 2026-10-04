package realmojo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	 static class account {
		 String user;
		 String pass;
		 int isi;
		 int id;
		 
		 
		 account(String user,String pass,int isi,int id){
			 this.user=user;
			 this.pass=pass;
			 this.isi=isi;
			 this.id=id;
		 }
		 
		
	}

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		ArrayList<account> Ac= new ArrayList<Main.account>();
		
		int choose=0;
		
		do {
				System.out.println("welcom to the bank");
				System.out.println("1.create account");
				System.out.println("2.login account");
				System.out.println("3.exit");
				
				
				
				System.out.println("choose:");
				choose=scan.nextInt();
				scan.nextLine();
				if (choose>3) {
					System.out.println("plis enter valid number");	
				}else if (choose==1){
					String nama;
					String passw;
					int isi=0;
					int id=Ac.size();
					System.out.println("masukkan username:");
					nama=scan.nextLine();
					System.out.println("masukkan password:");
					passw=scan.nextLine();
					Ac.add(new account(nama,passw,isi,id));
					
				}else if (choose==2) {
					String cari;
					String p;
					
					
					
					
					System.out.println("masukkan user login");
					cari=scan.nextLine();
					boolean tanda=false;
					for(account a: Ac) {
							if (a.user.equals(cari)) {
								tanda=true;
								System.out.println("pass:");
								p=scan.nextLine();
								
								if (a.pass.equals(p)) {
									
										int c=0;
										
										do 
										{
												System.out.printf("Hello %s\n",a.user);
												System.out.println("1.account information");
												System.out.println("2.deposit cash");
												System.out.println("3. tf another account");
												System.out.println("4.logout");
												System.out.println("pilih:");
												c=scan.nextInt();
												scan.nextLine();
												if (c==1) {
													System.out.printf("account id: %d\n",a.id);
													System.out.printf("username: %s\n",a.user);
													System.out.printf("saldo: %d\n",a.isi);
													
													
												}else if(c==2) {
													int tambah;
													System.out.println("mau deposit berapa");
													tambah=scan.nextInt();
													scan.nextLine();
													a.isi+=tambah;
												}else if(c==3){
													String tf;
													int jumlah;
													System.out.println("mau tf ke siapa:");
													tf=scan.nextLine();
											
													
													for (account i:Ac) {
														if (i.user.equals(tf)) {
															System.out.println("berapa:");
															jumlah=scan.nextInt();
															scan.nextLine();
															if (a.isi>=jumlah) {
																i.isi+=jumlah;
																a.isi-=jumlah;
																
															}else {
																System.out.println("saldo ga cukup");
															}
															
														}else {
															continue;
														}
														
														
													}
													
													
													
													
													
													
												}
												if (c==4) {
													break;
												}
												System.out.println("pliss enter");
												scan.nextLine();
												
										}while (c!=4);
									
								}
								else  {
									System.out.println("incorrect");
									continue;
								}
								
								
								
					
							}else {
								continue;
							}	
					}
					
					
					
					if (tanda==false) {
						System.out.println("not found");
					}
					
					
				}
				System.out.println("pliss enter");
				scan.nextLine();
		}while(choose!=3);
		

	}

}
