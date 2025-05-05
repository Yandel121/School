import java.util.*;
public class Student implements Comparable<Student> {

    private final int id;
    private final String name;
    private final String matricula;
    private final int[] grades;

    public Student(int id, String name, String matricula, int[] grades) {
        this.id = id;
        this.name = name;
        this.grades = grades;
        this.matricula=matricula;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMatricula() {
        return matricula;
    }

    public int[] getGrade() {
        return grades;
    }


    public double calculateAverage() {
        return (grades[0] + grades[1] + grades[2]) / 3.0;
    }

    public String getStatus() {
        return calculateAverage() >= 70 ? "Aprobado" : "Reprobado";
    }

    //Constructors,getters, setters
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.calculateAverage(), this.calculateAverage());
    }

    public static Student[] registerStudents(int numStudents) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[numStudents];
        String [] materias = {"Español","Ingles","Math"};
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Ingrese el ID del estudiante: ");
            int id = input.nextInt();
            System.out.print("Ingrese el nombre del estudiante: ");
            String name = input.next();
            System.out.print("Ingrese el matricula del estudiante: ");
            String matricula = input.next();

            int[] grades = new int[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese la calificación de: " + materias[j]+ ": ");
                grades[j] = input.nextInt();
            }

            students[i] = new Student(id, name,matricula, grades);
        }
        return students;
    }

    public static void displayResults(Student[] students) {
        System.out.println("\nNúmero | Nombre | Matrícula | Calificaciones | Promedio | Estado");
        for (Student s : students) {
            System.out.printf("%d | %s | %s | %d, %d, %d | %.2f | %s%n",
                    s.getId(), s.getName(), s.getMatricula(),
                    s.getGrade()[0], s.getGrade()[1], s.getGrade()[2],
                    s.calculateAverage(), s.getStatus());
        }
    }

    public static void searchByMatricula(Student[] students, Scanner input) {
        System.out.print("\nIngrese matrícula a buscar:");
        String matriculaSearch = input.next();
        for (Student s : students) {
            if (s.getMatricula().equalsIgnoreCase(matriculaSearch)) {
                System.out.printf("\nEstudiante encontrado: %d | %s | %s | Promedio: %.2f | Estado: %s%n",
                        s.getId(), s.getName(), s.getMatricula(), s.calculateAverage(), s.getStatus());
                return;
            }
        }
        System.out.println("\nMatrícula no encontrada.");
    }
    public static void displayStatistics(Student[] students){
        int passed=0, failed=0;
        double totalAverage=0;
        for(Student s: students){
            totalAverage+= s.calculateAverage();
            if(s.getStatus().equals("Aprobado")){
            }else{
                failed++;
            }
        }
        System.out.printf("\nTotal aprobados: %d%n",passed);
        System.out.printf("Total reprobados: %d%n", failed);
        System.out.printf("Promedio general del grupo: %.2f%n",totalAverage/ students.length);
    }
 public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Student[] students=registerStudents(1);


        Arrays.sort(students);

        boolean running=true;
        while(running){
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Mostrar tabla de estudiantes");
            System.out.println("2. Buscar estudiante por matrícula");
            System.out.println("3. Ver estadísticas");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            int choice= input.nextInt();
            switch (choice){
                case 1:displayResults(students); break;
                case 2:searchByMatricula(students,input); break;
                case 3: displayStatistics(students); break;
                case 4: running= false; System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida");
            }
        }

 }
}


