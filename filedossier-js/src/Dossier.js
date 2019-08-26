import React, { Suspense, useState, useEffect, useRef } from 'react';
import { Table, Button, Message, Loader, Icon, Dropdown } from 'semantic-ui-react';
import { DefaultApi as DossierApi} from '@ilb/filedossier-api/dist';
import DossierResource from './DossierResource';
import {useResource} from './ReactHelper';

const xhtml = `<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 plus MathML 2.0 plus SVG 1.1 plus calc//EN" "http://www.w3.org/2002/04/xhtml-math-svg/xhtml-math-svg-flat.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" type="text/css" href="/oooxhtml/oooxhtml.css"/>
    <title></title>
    <meta name="generator" content="oooxhtml/1.2"/>
    <meta name="AppVersion" content="12.0000"/>
    <meta name="Company" content="БыстроБанк"/>
    <meta name="DocSecurity" content="0"/>
    <meta name="HeadURL" content="$HeadURL: https://svn.ilb.ru/repos/treasurydocs/trunk/doc/repo/data/issuancevolume.xhtml $"/>
    <meta name="HyperlinksChanged" content="false"/>
    <meta name="LinksUpToDate" content="false"/>
    <meta name="ScaleCrop" content="false"/>
    <meta name="ShareDoc" content="false"/>
  </head>
  <body>
    <div class="container spreadsheet">
      <table summary="Лист1" id="list1">
        <colgroup>
          <col style="min-width:30.23mm;"/>
          <col style="min-width:32.76mm;"/>
        </colgroup>
        <tr style="height:4.99mm;">
          <td>
            <p>Наименование</p>
          </td>
          <td style="font-size:11pt;">
            <p>Объем выпуска</p>
          </td>
        </tr>
        <tr style="height:4.99mm;">
          <td>
            <p>КОБР-18</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>500000000</p>
          </td>
        </tr>
        <tr style="height:5.29mm;">
          <td>
            <p>КОБР-17</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>500000000</p>
          </td>
        </tr>
        <tr style="height:5.29mm;">
          <td>
            <p>КОБР-20</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>500000000</p>
          </td>
        </tr>
        <tr style="height:5.29mm;">
          <td>
            <p>КОБР-19</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>500000000</p>
          </td>
        </tr>
        <tr style="height:4.99mm;">
          <td>
            <p>КОБР-21</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>600000000</p>
          </td>
        </tr>
        <tr style="height:5.29mm;">
          <td>
            <p>РСХБ БО-5Р</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>25000000</p>
          </td>
        </tr>
        <tr style="height:5.29mm;">
          <td>
            <p>РН БАНК1Р3</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>5000000</p>
          </td>
        </tr>
        <tr style="height:4.99mm;">
          <td>
            <p>ОФЗ 26223</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>350000000</p>
          </td>
        </tr>
        <tr style="height:4.99mm;">
          <td>
            <p>ГТЛК 1P-13</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>10000000</p>
          </td>
        </tr>
        <tr style="height:4.99mm;">
          <td>
            <p>ВЭБ 1P-16</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>20000000</p>
          </td>
        </tr>
        <tr style="height:5.29mm;">
          <td>
            <p>ФолксвБ1P3</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>10000000</p>
          </td>
        </tr>
        <tr style="height:5.29mm;">
          <td>
            <p>ТойотаБ1P2</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>3000000</p>
          </td>
        </tr>
        <tr style="height:5.29mm;">
          <td>
            <p>ДОМ 1P-5R</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>10000000</p>
          </td>
        </tr>
        <tr style="height:4.99mm;">
          <td>
            <p>ВЭБ.РФ 21</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>15000000</p>
          </td>
        </tr>
        <tr style="height:4.99mm;">
          <td>
            <p>ВЭБ ПБО1Р2</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>15000000</p>
          </td>
        </tr>
        <tr style="height:4.99mm;">
          <td>
            <p>ГПБ001P09P</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>15000000</p>
          </td>
        </tr>
        <tr style="height:4.99mm;">
          <td>
            <p>РН БАНК1Р5</p>
          </td>
          <td class="float" style="font-size:11pt;">
            <p>8000000</p>
          </td>
        </tr>
      </table>
    </div>
    <script type="text/javascript" src="/privilegedAPI/web/scripts/privilegedAPI.js"></script>
    <script type="text/javascript" src="/oooxhtml/oooxhtml.js"></script>
  </body>
</html>
`;

const options = [];
const parser = new DOMParser();
const list = parser.parseFromString(xhtml, "application/xhtml+xml").getElementById("list1");
console.log('list', list);
const rows = list.querySelectorAll('tr');
console.log('rows', rows);
for (let i = 1; i < rows.length; i++) {
  const cells = rows[i].querySelectorAll('td');
  options.push({ key: cells[0].textContent.trim(), text: cells[0].textContent.trim(), value: cells[0].textContent.trim() });
}
console.log('options', options);


function Dossier( { dossierKey, dossierPackage, dossierCode}) {
    const dossierApi = new DossierApi();
    const dossierResource = new DossierResource(dossierApi, {dossierKey, dossierPackage, dossierCode});

    const [dossier, getDossier] = useResource(() => dossierResource.getDossier());

    useEffect(() => {
        getDossier();

    }, [dossierKey, dossierPackage, dossierCode]);
    console.log('dossier.value', dossier.value);
    return (
            <div className="fileDosser">
                {dossier.loading && <Loader active /> }
                {dossier.error && <Message error visible content={dossier.error}/> }
                {dossier.value && <div>
                    Name: {dossier.value.name}
                    <Message negative>
                        <p>Валидность: {dossier.value.valid}</p>
                        </Message>
                    {dossier.value.dossierFile &&
                                    <Table celled>
                                        <Table.Header>
                                            <Table.Row>
                                                <Table.HeaderCell>Файл</Table.HeaderCell>
                                                <Table.HeaderCell>Действие</Table.HeaderCell>
                                            </Table.Row>
                                        </Table.Header>

                                        <Table.Body>
                                            {dossier.value.dossierFile.map(file => (
                                                                        <DossierFile
                                                                            key={file.code}
                                                                            file={file}
                                                                            onChange={getDossier}
                                                                            resource={dossierResource.getDossierFileResource(file.code)}
                                                                            />
                                                            ))}
                                        </Table.Body>
                                    </Table>
                    }
                                <Dropdown selection options={options}/>
                </div>}
            </div>
            );
}

var booleanValue = 1;

function someFunction(){
    if(booleanValue === 1){
        return 2;
    }
}

function DossierFile({ file, onChange, resource }) {
    console.log('file', file);
    const { code, name, exists, readonly } = file;
    const inputFileEl = useRef(null);

    const remove = () => {
        console.log('code', code);
        onChange();
    };

    const upload = () => {
        //console.log('upload', code, inputFileEl.current.files);
        const files = inputFileEl.current.files;

//        const formData = new FormData();
//
//        for (var i = 0; i < files.length; i++) {
//            formData.append(i, files.item(i));
//        }

        resource.uploadContents(inputFileEl.current.files[0]);
        onChange();
    };


    return (
            <Table.Row>
                <Table.Cell>
                {exists && <a href={resource.getDownloadLink()}>{name}</a>}
                {!exists && name }              
                </Table.Cell>
                <Table.Cell>
		<Button onClick={remove}>
		
		    <Icon name='trash'/>
		Удалить
		
		    </Button>
                    {!readonly && <input ref={inputFileEl} type="file" name="file" onChange={upload}/>}

                </Table.Cell>
            </Table.Row>
            );
}

export default Dossier;