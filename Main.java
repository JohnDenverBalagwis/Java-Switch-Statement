class Main {
  public static void main(String[] args) {
    String language = "Tagalog";

    switch (language) {
    case "Chinese":
      System.out.println(" Ni hao ma");
      break;
    case "Tagalog":
      System.out.println("Putangina mo");
      break;
    case "Bisaya":
      System.out.println(" Putang ina mo din");
      break;
    case "Korean":
      System.out.println("Annyeonghaseyo");
      break;
    case "Indonesia":
      System.out.println("Kontol");
      break;
    case "Vietnamese":
      System.out.println("Con me may");
      break;
    case "Japanese":
      System.out.println("Baka");
      break;
    case "Singapore":
      System.out.println("Babi");
      break;
    default:
      System.out.println("I don't know what you're saying");
      break;
    }
  }
}