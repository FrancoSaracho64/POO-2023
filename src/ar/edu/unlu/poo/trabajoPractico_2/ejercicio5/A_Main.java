package ar.edu.unlu.poo.trabajoPractico_2.ejercicio5;

import java.util.Scanner;

public class A_Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        CuentaNormal cuenta = new CuentaNormal();
        CuentaCredito cuentaCredito = new CuentaCredito();
        Cliente cliente = new Cliente("Franco", cuenta, cuentaCredito);

        double monto;

        System.out.print("Ingrese el monto que desea agregar a su billetera normal:  $");
        monto = teclado.nextDouble();
        cliente.agregarSaldo(monto);

        System.out.println("Su saldo actual es:  $" + cliente.getSaldo());
        System.out.println("Limite de sobregiro:  $" + cliente.getLimiteGiroEnDescubierto());
        System.out.println();

        System.out.print("Ingrese el monto que desea invertir a su billetera normal:  $");
        monto = teclado.nextDouble();
        System.out.print("Ahora ingrese la cantidad de dias: ");
        int dias = teclado.nextInt();

        if (cliente.invertirSaldo(monto, dias)) {
            System.out.println("El dinero que usted invirtio es:  $" + cliente.getMontoInvertido());
        } else {
            System.out.println("No puede invertir nuevamenete, debe esperar...");
        }
        System.out.println();

        System.out.print("Ingrese el monto a gastar:  $");
        monto = teclado.nextDouble();
        cliente.gastar(monto, true);
        System.out.println("Su saldo actual es:  $" + cliente.getSaldo());
        System.out.println("Giro en descubierto utilizado:  $" + cliente.getDeudaGiroDescubierto());
        System.out.println();

        System.out.print("Ingrese el monto que desea agregar a su billetera normal:  $");
        monto = teclado.nextDouble();
        cliente.agregarSaldo(monto);
        System.out.println("Su saldo actual es:  $" + cliente.getSaldo());
        System.out.println("Giro en descubierto utilizado:  $" + cliente.getDeudaGiroDescubierto());
        System.out.println();

        System.out.print("Ingrese el monto que desea invertir a su billetera normal:  $");
        monto = teclado.nextDouble();
        System.out.print("Ahora ingrese la cantidad de dias:  ");
        dias = teclado.nextInt();
        if (cliente.invertirSaldo(monto, dias)) {
            System.out.println("El dinero que usted invirtio es:  $" + cliente.getMontoInvertido());
        } else {
            System.out.println("No puede invertir nuevamenete, debe esperar...");
        }
        System.out.println();
        // intento depositar nuevamente.
        if (!cliente.invertirSaldo(monto, dias)) {
            System.out.println("No puede invertir nuevamenete, debe esperar.");
            System.out.println();
        }

        System.out.println("\n--------Cuenta credito--------");
        System.out.println("Monto disponible para compras a credito:  $"  + cliente.getMontoCompraCredito());
        System.out.println("Saldo deudor:  $"  + cliente.getSaldoDeudor());
        System.out.println();
        System.out.print("Ingrese el monto que desea usar de su  billetera a credito:  $");
        monto = teclado.nextDouble();
        cliente.compraCredito(monto);
        System.out.println();
        System.out.println("Saldo deudor:  $"  + cliente.getSaldoDeudor());
        System.out.println("Monto disponible para realizar compras a credito:  $"  + cliente.getMontoCompraCredito());
        System.out.println();
        System.out.print("Ingrese el monto que desea pagar:  $");
        monto = teclado.nextDouble();
        cliente.pagarCredito(monto);
        System.out.println();
        System.out.println("Saldo deudor final:  $"  + cliente.getSaldoDeudor());
    }
}
