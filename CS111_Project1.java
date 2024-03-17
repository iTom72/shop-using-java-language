import java.util.Scanner;

public class CS111_Project1 {
	public static void main(String[] args) {
		final int ID_SODA = 100, ID_CHIPS = 200, ID_CHOCO = 300, ID_WATER = 400, ID_CANDY = 500;
		final String SODA = "Soda", CHIPS = "Chips", CHOCO = "Chocolate", WATER = "Water", CANDY = "Candy";
		final double sodaPrice = 2.5, chipsPrice = 1.5, chocoPrice = 3, waterPrice = 0.95, candyPrice = 2;
		int sodaAmount = 100, chipsAmount = 80, chocoAmount = 100, waterAmount = 250, candyAmount = 50;

		int sodaAmountThisRound, chipsAmountThisRound, chocoAmountThisRound, waterAmountThisRound, candyAmountThisRound;
		int sodaAmountSelected, chipsAmountSelected, chocoAmountSelected, waterAmountSelected, candyAmountSelected,
				selection_2, amountSelected, totalSelection, quit;
		int sodaTotalSells = 0, chipsTotalSells = 0, chocoTotalSells = 0, waterTotalSells = 0, candyTotalSells = 0;

		boolean customerConfirmThisRound;

		double totalPrice, totalProfit = 0;

		String selection_1, shopName = "Royals";

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("********** Menu **************\n");
			System.out.println("Welcome to " + shopName + " shop!");
			System.out.println("(customer) for customers");
			System.out.println("(owner) for store owner");
			System.out.println("(exit) to exit");
			System.out.print("Select: ");

			// update products amount
			sodaAmountThisRound = sodaAmount;
			chipsAmountThisRound = chipsAmount;
			chocoAmountThisRound = chocoAmount;
			waterAmountThisRound = waterAmount;
			candyAmountThisRound = candyAmount;

			// update amount of product selected
			sodaAmountSelected = 0;
			chipsAmountSelected = 0;
			chocoAmountSelected = 0;
			waterAmountSelected = 0;
			candyAmountSelected = 0;

			// check if the customer does confirm or not
			customerConfirmThisRound = false;

			totalSelection = sodaAmount + chipsAmount + chocoAmount + waterAmount + candyAmount;

			selection_1 = scanner.next();
			scanner.nextLine();

			if (selection_1.equalsIgnoreCase("customer")) {
				if (totalSelection == 0) {
					System.out.println(shopName + " shop is out of stock.");
					selection_1 = "";
				} else {
					do {
						System.out.print("You can select items you wanna buy from the list below:\n");
						System.out.println(
								"\t1." + SODA + " (" + sodaPrice + " SR)" + " - Amount: " + sodaAmountThisRound);
						System.out.println(
								"\t2." + CHIPS + " (" + chipsPrice + " SR)" + " - Amount: " + chipsAmountThisRound);
						System.out.println(
								"\t3." + CHOCO + " (" + chocoPrice + " SR)" + " - Amount: " + chocoAmountThisRound);
						System.out.println(
								"\t4." + WATER + " (" + waterPrice + " SR)" + " - Amount: " + waterAmountThisRound);
						System.out.println(
								"\t5." + CANDY + " (" + candyPrice + " SR)" + " - Amount: " + candyAmountThisRound);
						System.out.println("\t6.Check-out");
						System.out.println("\t7.Cancel");
						System.out.print("Select item: ");
						selection_2 = scanner.nextInt();

						// reset quit value
						quit = 0;

						// soda
						if (selection_2 == 1) {
							if (sodaAmountThisRound == 0)
								System.out.println(SODA + " is out of stock.");
							else {
								do {
									System.out.println("Avilable amount: " + sodaAmountThisRound);
									System.out.print("Select amount: ");
									amountSelected = scanner.nextInt();

									if (amountSelected > sodaAmountThisRound) {
										System.out.println(
												"You cannot buy more than " + sodaAmountThisRound + " of this item.");
									} else if (amountSelected < 1)
										System.out.println("Invalid number.");
									else {

										System.out.println("You selected " + amountSelected + " of Soda Cans.");
										sodaAmountThisRound -= amountSelected;
										sodaAmountSelected = amountSelected;
										customerConfirmThisRound = true;
										quit = 5;
									}

								} while (quit != 5);
							}

							// chips
						} else if (selection_2 == 2) {
							if (chipsAmountThisRound == 0)
								System.out.println(CHIPS + " is out of stock.");
							else {
								do {
									System.out.println("Avilable amount: " + chipsAmountThisRound);
									System.out.print("Select amount: ");
									amountSelected = scanner.nextInt();

									if (amountSelected > chipsAmountThisRound) {
										System.out.println(
												"You cannot buy more than " + chipsAmountThisRound + " of this item.");
									} else if (amountSelected < 1)
										System.out.println("Invalid number.");
									else {

										System.out.println("You selected " + amountSelected + " of Chips Bags.");
										chipsAmountThisRound -= amountSelected;
										chipsAmountSelected = amountSelected;
										customerConfirmThisRound = true;
										quit = 5;
									}

								} while (quit != 5);
							}

							// chocolate
						} else if (selection_2 == 3) {
							if (chocoAmountThisRound == 0)
								System.out.println(CHOCO + " is out of stock.");
							else {
								do {
									System.out.println("Avilable amount: " + chocoAmountThisRound);
									System.out.print("Select amount: ");
									amountSelected = scanner.nextInt();

									if (amountSelected > chocoAmountThisRound) {
										System.out.println(
												"You cannot buy more than " + chocoAmountThisRound + " of this item.");
									} else if (amountSelected < 1)
										System.out.println("Invald number.");
									else {

										System.out.println("You selected " + amountSelected + " of Chocolate bars.");
										chocoAmountThisRound -= amountSelected;
										chocoAmountSelected = amountSelected;
										customerConfirmThisRound = true;
										quit = 5;
									}

								} while (quit != 5);
							}

							// water
						} else if (selection_2 == 4) {
							if (waterAmountThisRound == 0)
								System.out.println(WATER + " is out of stock.");
							else {
								do {
									System.out.println("Avilable amount: " + waterAmountThisRound);
									System.out.print("Select amount: ");
									amountSelected = scanner.nextInt();

									if (amountSelected > waterAmountThisRound) {
										System.out.println(
												"You cannot buy more than " + waterAmountThisRound + " of this item.");
									} else if (amountSelected < 1)
										System.out.println("Invalid number.");

									else {

										System.out.println("You selected " + amountSelected + " bottles of water.");
										waterAmountThisRound -= amountSelected;
										waterAmountSelected = amountSelected;
										customerConfirmThisRound = true;
										quit = 5;
									}

								} while (quit != 5);
							}

							// candy
						} else if (selection_2 == 5) {
							if (candyAmountThisRound == 0)
								System.out.println(CANDY + " is out of stock.");
							else {
								do {
									System.out.println("Avilable amount: " + candyAmountThisRound);
									System.out.print("Select amount: ");
									amountSelected = scanner.nextInt();

									if (amountSelected > candyAmountThisRound) {
										System.out.println(
												"You cannot buy more than " + candyAmountThisRound + " of this item.");
									} else if (amountSelected < 1)
										System.out.println("Invalid number.");
									else {

										System.out.println("You selected " + amountSelected + " bags of candy.");
										candyAmountThisRound -= amountSelected;
										candyAmountSelected = amountSelected;
										customerConfirmThisRound = true;
										quit = 5;
									}

								} while (quit != 5);
							}

							// check-out
						} else if (selection_2 == 6) {
							if (customerConfirmThisRound == false)
								System.out.println("You didn't select any item!");
							else {
								totalPrice = (sodaAmountSelected * sodaPrice) + (chipsAmountSelected * chipsPrice)
										+ (chocoAmountSelected * chocoPrice) + (waterAmountSelected * waterPrice)
										+ (candyAmountSelected * candyPrice);
								totalProfit += totalPrice;
								System.out.println("Here's your bill:");
								if (sodaAmountSelected > 0) {
									System.out.println("\t" + SODA + " x" + sodaAmountSelected + ", ("
											+ (sodaAmountSelected * sodaPrice) + " SR)");
									sodaAmount -= sodaAmountSelected;
									sodaTotalSells += sodaAmountSelected;
								}
								if (chipsAmountSelected > 0) {
									System.out.println("\t" + CHIPS + " x" + chipsAmountSelected + ", ("
											+ (chipsAmountSelected * chipsPrice) + " SR)");
									chipsAmount -= chipsAmountSelected;
									chipsTotalSells += chipsAmountSelected;
								}
								if (chocoAmountSelected > 0) {
									System.out.println("\t" + CHOCO + " x" + chocoAmountSelected + ", ("
											+ (chocoAmountSelected * chocoPrice) + " SR)");
									chocoAmount -= chocoAmountSelected;
									chocoTotalSells += chocoAmountSelected;
								}
								if (waterAmountSelected > 0) {
									System.out.println("\t" + WATER + " x" + waterAmountSelected + ", ("
											+ (waterAmountSelected * waterPrice) + " SR)");
									waterAmount -= waterAmountSelected;
									waterTotalSells += waterAmountSelected;
								}
								if (candyAmountSelected > 0) {
									System.out.println("\t" + CANDY + " x" + candyAmountSelected + ", ("
											+ (candyAmountSelected * candyPrice) + " SR)");
									candyAmount -= candyAmountSelected;
									candyTotalSells += candyAmountSelected;
								}
								System.out.println("\n#### Total Price: " + totalPrice + " SR ####");
								selection_2 = 6;
							}

							// cancel
						} else if (selection_2 == 7) {
							System.out.println("Your order has been cancelled.");
							selection_2 = 6;
						}

						selection_1 = "";
						scanner.nextLine();
					} while (selection_2 != 6);
				}
			} else if (selection_1.equalsIgnoreCase("owner")) {
				do {
					System.out.println("Welcome to " + shopName + " shop!");
					System.out.println("You can choose what action you wanna do: ");
					System.out.println("1. View total profit");
					System.out.println("2. Most popular item");
					System.out.println("3. return to the main menu");
					System.out.print("Select action: ");
					selection_2 = scanner.nextInt();

					if (selection_2 == 1) {
						if (totalProfit < 1)
							System.out.println("no one buys from the shop yet.");
						else
							System.out.println("Total profit is: " + totalProfit);

					} else if (selection_2 == 2) {
						int mostPopularItem = Math.max(Math.max(Math.max(sodaTotalSells, chipsTotalSells),
								Math.max(chocoTotalSells, waterTotalSells)), candyTotalSells);

						if (mostPopularItem > 0) {
							if (mostPopularItem == sodaTotalSells)
								System.out.println(SODA + " is the most popular item.");
							if (mostPopularItem == chipsTotalSells)
								System.out.println(CHIPS + " is the most popular item.");
							if (mostPopularItem == chocoTotalSells)
								System.out.println(CHOCO + " is the most popular item.");
							if (mostPopularItem == waterTotalSells)
								System.out.println(WATER + " is the most popular item.");
							if (mostPopularItem == candyTotalSells)
								System.out.println(CANDY + " is the most popular item.");
						} else
							System.out.println("no one buys from the shop yet.");
					} else if (selection_2 == 3) {
						System.out.println("See you soon");
						selection_1 = "";
					}

				} while (selection_2 != 3);

			} else if (selection_1.equalsIgnoreCase("exit")) {
				System.out.print("See you soon!");
				System.exit(0);
			}

		} while (!(selection_1.equalsIgnoreCase("customer") || selection_1.equalsIgnoreCase("owner")
				|| selection_1.equalsIgnoreCase("exit")));
	}

}
