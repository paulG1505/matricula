package unibe.edu.ec.matricula.dtos;

import unibe.edu.ec.matricula.entities.Prerequirement;

public class PrerequirientDto {
    private int id;
    private SubjectDto subjectDto,prerequirementDto;
    public PrerequirientDto(){}

    public PrerequirientDto(int id, SubjectDto subjectDto, SubjectDto prerequirementDto) {
        this.id = id;
        this.subjectDto = subjectDto;
        this.prerequirementDto = prerequirementDto;
    }

    public PrerequirientDto(Prerequirement prerequirement){
        this.id=prerequirement.getId();
        this.subjectDto=new SubjectDto(prerequirement.getSubject());
        this.prerequirementDto=new SubjectDto(prerequirement.getPrerequirement());

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SubjectDto getSubjectDto() {
        return subjectDto;
    }

    public void setSubjectDto(SubjectDto subjectDto) {
        this.subjectDto = subjectDto;
    }

    public SubjectDto getPrerequirementDto() {
        return prerequirementDto;
    }

    public void setPrerequirementDto(SubjectDto prerequirementDto) {
        this.prerequirementDto = prerequirementDto;
    }

    @Override
    public String toString() {
        return "PrerequirientDto{" +
                "id=" + id +
                ", subjectDto=" + subjectDto +
                ", prerequirementDto=" + prerequirementDto +
                '}';
    }
}
