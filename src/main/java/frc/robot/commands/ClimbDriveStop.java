
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ClimbDriveStop extends Command {
  public ClimbDriveStop() {
    requires(Robot.climber);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.climber.ClimbDrive(0);
  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
    Robot.climber.ClimbDrive(0);
  }

  @Override
  protected void interrupted() {
  }
}
