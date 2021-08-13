package com.salah.Item2;

public class Main {
    public static void main(String[] args) {
//        NutritionFactsTelescopingConstructorPattern nutritionFacts = new NutritionFactsTelescopingConstructorPattern(2, 4);
//        System.out.println(nutritionFacts);

        NutritionFacts nutritionFactsBuilderPattern = new NutritionFacts
                .Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();

        System.out.println(nutritionFactsBuilderPattern);

    }
}
