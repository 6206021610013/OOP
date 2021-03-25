public class EmployeeTest {
    public static void main( String args[] )
    {
        Date birth = new Date( 7, 24, 1949 );
        Date hire = new Date( 3, 12, 1988 );
        Employee employee = new Employee( "Bob", "Jones", birth, hire );
        // Employee employee = new Employee( "Bob", "Jones",
        // new Date( 7, 24, 1949 ) , new Date( 3, 12, 1988 ) );
        System.out.println("Testing Class Employee");
        System.out.println( employee.toEmployeeString() );
    }
}
