<#--判断对象是否为空用??,下例为user为空时候的执行-->
<#if user??>
<span style="color: red">
${user.userName}
    </span>
<#--?sting() 进行格式化输出-->
<h1>${user.salary?string('0.00')}</h1>
<h1>${user.birthday?string('yyyy-MM-dd HH:mm:ss')}</h1>

<#--!指定默认值，以防属性未设置时候报错-->
<h1>${user.address!'未登记'}</h1>

<#--if判断写法-->
    <#if user.salary <= 1000>
    补贴
    <#--多条件判断时候，要用()包裹，以防大于号跟闭合标签混淆-->
    <#elseif (user.salary > 1000 && user.salary < 10000)>
    奋斗
    <#else>
    公益
    </#if>
<#else>
<h1>对象不存在</h1>
</#if>

<#if students??>
<ul>
    <#--list第一个参数是我们的集合，as后面是变量-->
    <#list students as student>
        <#--增加索引值_index-->
        <li>${student_index+1}-${student.userName}-${student.birthday?string('yyyy-MM-dd HH:mm:ss')}</li>
    </#list>
</ul>
</#if>