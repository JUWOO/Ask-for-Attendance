package attendance.attendancecheck.service;

import attendance.attendancecheck.domain.AttendanceMember;
import attendance.attendancecheck.repository.AttendanceMemberRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class AttendanceMemberService {

    private final AttendanceMemberRepository attendanceMemberRepository;

    public AttendanceMemberService(AttendanceMemberRepository attendanceMemberRepository){
        this.attendanceMemberRepository = attendanceMemberRepository;
    }

    public List<AttendanceMember> findMembers(){
        return attendanceMemberRepository.findAll();
    }
}