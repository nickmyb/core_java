public class CodePointAndCodeUnit {
    public static void main(String[] args) {
        String octonions = "\uD835\uDD46";
        // octonions的Code Point = U+1D546
        int octonionsCodePoint = 0X1D546;
        // octonions的Code Unit = U+D835 U+DD46
        int octonionsCodeUnit1 = 0XD835;
        int octonionsCodeUnit2 = 0XDD46;
        int octonionsSumCodeUnit = octonionsCodeUnit1 + octonionsCodeUnit2;

        // 在基本的多语言级别中,每个字符用16位表示,通常被称为代码单元
        // 在Java中, char类型描述了UTF-16编码中的一个代码单元
        char octonionsCodeUnitChar1 = '\uD835';
        char octonionsCodeUnitChar2 = '\uDD46';

        boolean codePointEqualSumCodeUnit = octonionsCodePoint == (octonionsCodeUnit1 + octonionsCodeUnit2);
        String codePointEqualSumCodeUnitSymbol;
        if (codePointEqualSumCodeUnit)
        {
            codePointEqualSumCodeUnitSymbol = "=";
        }
        else
        {
            codePointEqualSumCodeUnitSymbol = "!=";
        }

        System.out.println("octonionsCodePoint(0X1D546) " + codePointEqualSumCodeUnitSymbol + " (octonionsCodeUnit1(0XD835) + octonionsCodeUnit2(0XDD46))(" + octonionsSumCodeUnit + ")");
        System.out.println("octonions(" + octonions + ")(\"\\uD835\\uDD46\")" + " = " + "octonionsCodeUnitChar1(" + octonionsCodeUnitChar1 + ")(" + "'\\uD835'" + ") + " + "octonionsCodeUnitChar2(" + octonionsCodeUnitChar2 + ")(" + "'\\uDD46'" + ") = " + ("" + octonionsCodeUnitChar1 + octonionsCodeUnitChar2));
    }
}
