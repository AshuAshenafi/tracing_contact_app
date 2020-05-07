#Contact Tracing Program
Due to the COVID-19 pandemic of today, everyone is doing their best to stop the spread of the virus by staying home.  
Experts already stated that we need to wait until COVID-19 cases actually start to decline over several weeks before 
reopening businesses and going back to school and work. But once people start resuming their normal routines, 
it will be essential to trace contacts of a newly infected patient to contain emerging clusters of COVID-19 
infections. Contact tracing is a key strategy for preventing further spread of the virus according to the Centers 
for Disease Control and Prevention. This application is to write a Contact Tracing Program that produces a contact 
report of an infected patient.

This application has seven classes inclding the main application class
    1. Person Class
        1.1 Patient Class
        1.2 Contacted Person Class
    2. Location Class
    3. Symptom Class 
    4. Contact Report Application class ( holds the main() method)
    5. Address Class

##PSEUDOCODE
declare static arraylist for all patients to be visible out the main() method
Start
// INPUT
declare Arraylist to store contacted persons
declare Arraylist to store visited locations
declare Arraylist to store symptoms
assign reference variable for location class object which is to be assigned visited places latter
assign reference variable for address class object which is to be assigned contacted person's address latter

declare and assign Array to store known symptoms
declare variables to store names, phones, email, streetname, city, state, dates and house number

//Prompt user to enter
prompt patient name
scan and assing 
prompt patient phone number
scan and assing 
prompt patient email
scan and assing 
prompt patient city
scan and assing 
prompt patient state
scan and assing 
prompt patient house number
scan and assing 
prompt patient street name
scan and assing 

assign patient address in one Address class object
    FOR(index from zero to length of known symptom array)
        prompt user to answer (y/n) to each symptom
            IF(y)
                assign symptom to a string variable
                prompt number of days
                prompt description if any
                assign the three variables to syptom object attributes
                assign it to symptoms arraylist
            END IF
    END FOR LP
    WHILE LOOP 
        prompt user if patient run into anyone (y/n)
            IF(y)
                prompt & assign variable the name of person contacated
                prompt & assign variable for phone number
                prompt & assign variable for email
                prompt & assign variable for house number
                prompt & assign variable for street naem
                prompt & assign variable for city
                prompt & assign variable for state
                prompt & assign variable for teh date of contact                
                assign all contacted variables to Location of contacted place object
                assign contacted person attributes
                add contacted person into arraylist    
            ELSE
                while loop control assing false            
            END IF
            WHILE LOOP
                prompt and assign a vairable if patient visited a place in 14 days (y/n)
                    IF(y)
                        prompt and assign a var to name of visited place
                        prompt and assign a var to city of visited place
                        prompt and assign a var to state of visited place
                        prompt and assign a var to date when visited place
                        prompt and assign attributes to visted place
                        add to arraylist of visited places
                    ELSE
                        while loop control assign it false                        
                    END IF                
            END WHILE LP
            assign values to patient object
            add patient to all patients's list arraylsit
    END WHILE LOOP
// PROCESS & OUTPUT
            method call to print patient report
                the method has three parts
                    FOR( index from zero to the size of all patients array)
                        assign each result for simplicity adn print
                    END FOR LOOP
                    FOR()
                        print people who had contact with patient
                    END FOR LOOP
                    FOR()
                        print locations patient visited
                    END FOR LOOP
end







 

