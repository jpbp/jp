public class MeuListener extends SomeLanguageBaseListener {
    @Override
    public void enterClassDeclaration(SomeLanguageParser.ClassDeclarationContext ctx) {
        super.enterClassDeclaration(ctx);


        System.out.println("Entrou no classDeclaration: "+ctx.method());
        System.out.println("{");
        System.out.println("Nome: "+ctx.className()+",");

    }

    @Override
    public void exitClassDeclaration(SomeLanguageParser.ClassDeclarationContext ctx) {
        super.exitClassDeclaration(ctx);

        //quando sair do classde
    }

    @Override
    public void enterMethod(SomeLanguageParser.MethodContext ctx) {
        super.enterMethod(ctx);

    }

    @Override
    public void exitMethod(SomeLanguageParser.MethodContext ctx) {
        super.exitMethod(ctx);
        System.out.println("}");
    }
}
