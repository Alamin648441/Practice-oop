class Super:
    def __init__(self):
        self.name = "Alamin"
        self.semester = "4th"

    def info(self):
        print(f"Name: {self.name}")
        print(f"Semester: {self.semester}")


class Child(Super):
    def __init__(self):
        super().__init__()
        self.roll = 648441

    def show(self):
        self.info()
        print(f"Roll: {self.roll}")


class OtherChild(Child):
    def __init__(self):
        super().__init__()
        self.shift = "2nd"

    def full_data(self):
        self.show()
        print(f"Shift: {self.shift}")


if __name__ == "__main__":
    ob = OtherChild()
    ob.full_data()
