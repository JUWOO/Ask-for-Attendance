package attendance.attendancecheck.repository;

import attendance.attendancecheck.domain.AttendanceMember;

import java.util.List;

public interface AttendanceMemberRepository {

    List<AttendanceMember> findAll();
}