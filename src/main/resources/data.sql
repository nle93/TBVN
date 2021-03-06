SET foreign_key_checks = 0;
INSERT INTO `employee` (`employee_name`, `position`) VALUES ('Director', 'Director');
INSERT INTO `employee` (`employee_name`, `position`) VALUES ('Manager 1', 'Manager');
INSERT INTO `employee` (`employee_name`, `position`) VALUES ('Manager 2', 'Manager');
INSERT INTO `department` (`department_name`, `manager_id`) VALUES ('Department 1', 2);
INSERT INTO `department` (`department_name`, `manager_id`) VALUES ('Department 2', 3);
INSERT INTO `project` (`project_name`, `department_id`) VALUES ('Project 1', 1);
INSERT INTO `project` (`project_name`, `department_id`) VALUES ('Project 2', 1);
INSERT INTO `project` (`project_name`, `department_id`) VALUES ('Project 3', 2);
INSERT INTO `project` (`project_name`, `department_id`) VALUES ('Project 4', 2);
INSERT INTO `employee` (`employee_name`, `position`, `department_id`) VALUES ('Employee 1', 'Developer', 1);
INSERT INTO `employee` (`employee_name`, `position`, `department_id`) VALUES ('Employee 2', 'Tester', 1);
INSERT INTO `employee` (`employee_name`, `position`, `department_id`) VALUES ('Employee 3', 'Developer', 1);
INSERT INTO `employee` (`employee_name`, `position`, `department_id`) VALUES ('Employee 4', 'Developer', 2);
INSERT INTO `employee` (`employee_name`, `position`, `department_id`) VALUES ('Employee 5', 'Developer', 2);
INSERT INTO `employee_projects` (`employees_id`, `projects_id`) VALUES (4, 1);
INSERT INTO `employee_projects` (`employees_id`, `projects_id`) VALUES (5, 1);
INSERT INTO `employee_projects` (`employees_id`, `projects_id`) VALUES (5, 2);
INSERT INTO `employee_projects` (`employees_id`, `projects_id`) VALUES (6, 2);
INSERT INTO `employee_projects` (`employees_id`, `projects_id`) VALUES (7, 3);
INSERT INTO `employee_projects` (`employees_id`, `projects_id`) VALUES (8, 4);
SET foreign_key_checks = 1;