
# Start from a base image
FROM node:18

# Set the working directory
WORKDIR /Lawdingo_G4

# Copy the application code to the working directory
COPY . /Lawdingo_G4

# Update package lists
RUN npm install

# Specify the command to run the application
CMD ["npm", "start"]
