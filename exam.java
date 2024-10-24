class Exam:
    def __init__(self):
        # Initialize an empty list to hold student marks
        self.student_marks = []

    def input_marks(self):
        # Ask for the number of students
        num_students = int(input("Enter the number of students: "))
        
        # Loop through the number of students to input their marks
        for i in range(num_students):
            print(f"\nEntering marks for Student {i + 1}:")
            assignment1 = float(input("Enter marks for Assignment 1: "))
            assignment2 = float(input("Enter marks for Assignment 2: "))
            cat1 = float(input("Enter marks for CAT 1: "))
            cat2 = float(input("Enter marks for CAT 2: "))
            
            # Store the marks in a tuple
            self.student_marks.append((assignment1, assignment2, cat1, cat2))

    def calculate_average(self, marks):
        # Calculate the average of the provided marks
        return sum(marks) / len(marks)

    def determine_grade(self, average):
        # Determine the grade based on the average marks
        if 40 <= average <= 50:
            return "A"
        elif 30 <= average < 40:
            return "B"
        elif 20 <= average < 30:
            return "C"
        elif 10 <= average < 20:
            return "D"
        elif 0 <= average < 10:
            return "Fail"
        else:
            return "Invalid marks"

    def evaluate_students(self):
        # Evaluate each student's marks and print the grade
        for i, marks in enumerate(self.student_marks):
            average = self.calculate_average(marks)
            grade = self.determine_grade(average)
            print(f"\nStudent {i + 1}: Average = {average:.2f}, Grade = {grade}")

# Main program execution
if __name__ == "__main__":
    exam = Exam()            # Create an instance of the Exam class
    exam.input_marks()      # Input marks for students
    exam.evaluate_students() # Evaluate and print grades for each student