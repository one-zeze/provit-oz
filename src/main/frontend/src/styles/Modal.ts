import styled from "styled-components";

export const ModalDimmer = styled.div`
  position: fixed;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  background-color: rgba(0, 0, 0, 0.4);
  display: flex;
  justify-content: center;
  align-items: center;
`;
export const ModalBody = styled.div`
  display: flex;
  flex-direction: column;
  max-width: 800px;
  max-height: 600px;
  min-width: 300px;
  min-height: 100px;
  background-color: #ffffff;
  border: 1px solid #cbcbcb;
  border-radius: 10px;
`;
export const ModalTitle = styled.div`
  padding: 1rem;
  font-weight: bold;
  font-size: large;
  border-bottom: 1px solid #cbcbcb;
`;
export const ModalContents = styled.div`
  padding: 1rem;
  border-bottom: 1px solid #cbcbcb;
`;
export const ModalFooter = styled.div`
  display: flex;
  flex-direction: row;
`;
export const ModalButton = styled.button`
  float: right;
  background: none;
  border: none;
  width: 100%;
  height: 52px;
  font-weight: bold;
  :hover {
    opacity: 50%;
    transition: 0.5s;
  }
`;
export const ModalHeader = styled.div`
display: contents;
text-align: center;
height: 60px;
border: none;
`
export const CloseButton = styled.button`
text-align: center;
background: none;
border: none;
width: 52px;
height: 32px;
margin-left: 85%;
font-weight: bold;
`;

export const CenterDiv = styled.div`
text-align: center;
border: none;
padding: 5px 0px;
`
export const ModalButtonWithBorder = styled(ModalButton)`
  border-right: 1px solid #cbcbcb;
`;