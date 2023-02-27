
class Movies {
    public static void main(String[] args) {

        String[] films = { "Indiana Jones et le Royaume du Crâne de Cristal", "Indiana Jones et la Dernière Croisade",
                "Indiana Jones et le Temple maudit" };
        String[] actors = { "Harrison Ford, Shia LaBeouf, Karen Allen", "Harrison Ford, Sean Connery, Denholm Elliott",
                "Harrison Ford, Kate Capshaw, Ke Huy Quan" };

        String[][] filmsActors = {
                films,
                actors
        };

        for (int i = 0; i < films.length; i++) {
            System.out.println("Dans le film " + filmsActors[0][i] + ", les acteurs sont : " + filmsActors[1][i]);
        }

    }
}