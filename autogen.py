import os

name =      raw_input("Your Name:  ")
className = raw_input("Class name:  ")
date =      raw_input("Date:  ")
pname =     raw_input("Program Description:  ")
title =     raw_input("Window Title:  ")

stop = False

if os.path.isfile('%s.java' % className):
    while True:
        s = raw_input("Warning: File exists.\nContinue?  (y/n)")
        if s.lower() == 'y':
            break
        elif s.lower() == 'n':
            stop = True
            break

if not stop:
    with open('template.txt', 'r') as f, open('%s.java' % className, 'w+') as w:
        w.write(f.read() % {'name' : name, 'class' : className, 'date' : date, 'pname' : pname, 'title' : title})
        
raw_input("Press enter to continue...")
