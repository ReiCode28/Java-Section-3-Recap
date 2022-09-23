public class Championship {
    public static void main(String[] args) {

        int gryffindor = 850;    //gryffindor points
        int ravenclaw = 500;    //ravenclaw points
        int margin = gryffindor - ravenclaw;

        if (margin >= 300) {
            System.out.println("Gryffindor takes the house cup!");
        } else if (margin >= 0) {
            System.out.println("In second place, Gryffindor!");
        } else if (margin >= -100) {
            System.out.println("In third place, Gryfindor!");
        } else {
            System.out.println("In fourth place, Gryffindor!");
        }
        
    }
    // CONVERTING THIS PASSAGE INTO CODE: 
    // "If Gryffindor beats Ravenclaw by a margin of three hundred points, they would win the championship. 
    // If they win by any number of points or tie, they would come second. If they lose by less than a hundred points, 
    // they come third behind Hufflepuff. If they lose by more than a hundred points, they would be in fourth place"
}