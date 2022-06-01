import sys

from PyQt6.QtWidgets import QApplication
from PyQt6.QtWidgets import QHBoxLayout
from PyQt6.QtWidgets import QPushButton
from PyQt6.QtWidgets import QWidget
from PyQt6.QtWidgets import *
from PyQt6.QtGui import *
from PyQt6.QtCore import *


class Dialog(QDialog):
    def __init__(self,parent=None):
        super().__init__(parent)
        self.setWindowTitle('Login page')
        dlgLayout = QVBoxLayout()
        formLayout = QFormLayout()
        l1 = QLineEdit()
        l1.setEchoMode(QLineEdit.EchoMode.Password)
        l2 = QLineEdit()
        formLayout.addRow('Username',l2)
        formLayout.addRow('Password',l1)
        loginbt = QPushButton('Login')
        formLayout.addRow(loginbt)
        loginbt.clicked.connect(login_info)
        dlgLayout.addLayout(formLayout)        
        self.setLayout(dlgLayout)
    
   
def login_info():
    print("p")

if __name__ == '__main__':
    app = QApplication(sys.argv)
    dlg = Dialog()
    dlg.show()
    sys.exit(app.exec())