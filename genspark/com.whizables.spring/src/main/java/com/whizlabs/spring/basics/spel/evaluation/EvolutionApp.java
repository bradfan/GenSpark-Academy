package com.whizlabs.spring.basics.spel.evaluation;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class EvolutionApp {
    public static void main(String[] args) throws Exception {
        ExpressionParser parser = new SpelExpressionParser();

        Expression simpleExpression = parser.parseExpression("'Hello World!'");
        Object simpleResult = simpleExpression.getValue();
        System.out.println(simpleResult);

        Expression instanceMethodExpression = parser.parseExpression("'Hello World'.toUpperCase()");
        Object instanceMethodResult = instanceMethodExpression.getValue();
        System.out.println(instanceMethodResult);

        Expression propertyExpression = parser.parseExpression("'Hello World'.bytes.length");
        int propertyResult = (int) propertyExpression.getValue();
        System.out.println(propertyResult);

        Expression staticMethodExpression = parser.parseExpression("T(String).join(' ', 'Hello', 'World')");
        String staticMethodResult = staticMethodExpression.getValue(String.class);
        System.out.println(staticMethodResult);

        Company company = new Company("Whizlabs");
        Expression objectRootExpression = parser.parseExpression("name");
        String objectRootedResult = objectRootExpression.getValue(company, String.class);
        System.out.println(objectRootedResult);
    }
}
