public class Division implements iOperation {
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        // Вычисляем знаменатель
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        // Вычисляем действительную часть результата
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        // Вычисляем мнимую часть результата
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        // Возвращаем новое комплексное число
        return new ComplexNumber(real, imaginary);
    }
}
