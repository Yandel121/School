import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Student1 implements Comparable<Student1> {
    private final int id;
    private final String name;
    private final String matricula;
    private final int[] grades;

    public Student1(int id, String name, String matricula, int[] grades) {
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
    public int compareTo(Student1 other) {
        return Double.compare(other.calculateAverage(), this.calculateAverage());
    }

    public static Student1[] registerStudents(int numStudents) {
        Scanner input = new Scanner(System.in);
        Student1[] students = new Student1[numStudents];
        String [] materias = {"Español","Ingles","Matematicas"};
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

            students[i] = new Student1(id, name,matricula, grades);
        }
        return students;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student1[] students = registerStudents(2);
        Arrays.sort(students, Comparator.comparingInt(Student1::getId));

        JFrame frame = new JFrame("Menu Principal");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");
        
        // Crear elementos del menú
        JMenuItem buscarItem = new JMenuItem("1. Buscar Estudiante");
        JMenuItem mostrarItem = new JMenuItem("2. Tabla de estudiantes");
        JMenuItem estadisticasItem = new JMenuItem("3. Estadísticas");
        JMenuItem guardarItem = new JMenuItem("4. Guardar en Archivo");
        JMenuItem salirItem = new JMenuItem("5. Salir");
        
        // Acción para buscar estudiante
        buscarItem.addActionListener(e -> {
            String idStr = JOptionPane.showInputDialog(frame, "Ingrese el ID del estudiante:");
            try {
                int searchId = Integer.parseInt(idStr);
                boolean found = false;
                for (Student1 s : students) {
                    if (s.getId() == searchId) {
                        found = true;
                        String mensaje = String.format("""
                            Información del Estudiante:
                            ID: %d
                            Nombre: %s
                            Matrícula: %s
                            Español: %d
                            Inglés: %d
                            Matemáticas: %d
                            Promedio: %.2f
                            Estado: %s
                            """, 
                            s.getId(), s.getName(), s.getMatricula(),
                            s.getGrade()[0], s.getGrade()[1], s.getGrade()[2],
                            s.calculateAverage(), s.getStatus());
                        JOptionPane.showMessageDialog(frame, mensaje);
                        break;
                    }
                }
                if (!found) {
                    JOptionPane.showMessageDialog(frame, "Estudiante no encontrado.");
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Por favor ingrese un número válido.");
            }
        });
        
        // Acción para guardar en archivo
        guardarItem.addActionListener(e -> {
            try {
                FileWriter writer = new FileWriter("estudiantes.txt");
                writer.write("REGISTRO DE ESTUDIANTES\n\n");
                for (Student1 s : students) {
                    writer.write(String.format("""
                        ID: %d
                        Nombre: %s
                        Matrícula: %s
                        Español: %d
                        Inglés: %d
                        Matemáticas: %d
                        Promedio: %.2f
                        Estado: %s
                        ----------------------
                        """,
                        s.getId(), s.getName(), s.getMatricula(),
                        s.getGrade()[0], s.getGrade()[1], s.getGrade()[2],
                        s.calculateAverage(), s.getStatus()));
                }
                writer.close();
                JOptionPane.showMessageDialog(frame, "Datos guardados en estudiantes.txt");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error al guardar el archivo: " + ex.getMessage());
            }
        });
        
        // Modify action listeners to show GUI windows
        mostrarItem.addActionListener(e -> {
            // Create a new window for the student table
            JFrame tableFrame = new JFrame("Tabla de Estudiantes");
            tableFrame.setSize(600, 400);
            
            // Create table model with columns
            String[] columnNames = {"ID", "Nombre", "Matrícula", "Español", "Inglés", "Matemáticas", "Promedio", "Estado"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0);
            
            // Add student data to table
            for (Student1 s : students) {
                model.addRow(new Object[]{
                    s.getId(),
                    s.getName(),
                    s.getMatricula(),
                    s.getGrade()[0],
                    s.getGrade()[1],
                    s.getGrade()[2],
                    String.format("%.2f", s.calculateAverage()),
                    s.getStatus()
                });
            }
            
            // Create and configure the table
            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);
            tableFrame.add(scrollPane);
            
            tableFrame.setVisible(true);
        });
        
        estadisticasItem.addActionListener(e -> {
            // Create statistics window
            JFrame statsFrame = new JFrame("Estadísticas");
            statsFrame.setSize(300, 200);
            
            // Calculate statistics
            int passed = 0, failed = 0;
            double totalAverage = 0;
            for (Student1 s : students) {
                totalAverage += s.calculateAverage();
                if (s.getStatus().equals("Aprobado")) {
                    passed++;
                } else {
                    failed++;
                }
            }
            double groupAverage = totalAverage / students.length;
            
            // Create panel with statistics
            JPanel statsPanel = new JPanel();
            statsPanel.setLayout(new BoxLayout(statsPanel, BoxLayout.Y_AXIS));
            statsPanel.add(new JLabel("Total aprobados: " + passed));
            statsPanel.add(new JLabel("Total reprobados: " + failed));
            statsPanel.add(new JLabel(String.format("Promedio general: %.2f", groupAverage)));
            
            statsFrame.add(statsPanel);
            statsFrame.setVisible(true);
        });
        
        salirItem.addActionListener(e -> System.exit(0));
        
        // Agregar elementos al menú
        menu.add(buscarItem);
        menu.addSeparator();
        menu.add(mostrarItem);
        menu.addSeparator();
        menu.add(estadisticasItem);
        menu.addSeparator();
        menu.add(guardarItem);
        menu.addSeparator();
        menu.add(salirItem);
        
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}