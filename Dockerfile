
# Start from a base image
FROM ubuntu:latest

# Update package lists
RUN apt-get update

# Install necessary packages
RUN apt-get install -y python3 python3-pip

# Set the working directory
WORKDIR /Lawdingo_G4

# Copy the requirements file to the working directory
COPY requirements.txt .

# Install the python dependencies
RUN pip3 install -r requirements.txt

# Copy the application code to the working directory
COPY . .

# Expose the container port
# The application will listen on this port
# Commented out the original EXPOSE command since there was a that warning this command is deprecated
# Made a typo in the original command, "EXPOSE relates only SCSI devices to the container. It does not make any ports accessible." -> "EXPOSE relates ports to the container."
# Since the application should listen on port 8000, I have changed the port number in this command
EXPOSE 8080

# Specify the command to run the application
CMD ["python3", "app.py"]
