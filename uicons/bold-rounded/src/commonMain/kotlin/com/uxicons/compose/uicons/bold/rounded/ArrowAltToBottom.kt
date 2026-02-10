package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToBottom: ImageVector? = null

val Icons.Br.ArrowAltToBottom: ImageVector
    get() = _ArrowAltToBottom ?: UXIcon(name = "ArrowAltToBottom") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 21f)
            horizontalLineToRelative(-7.25f)
            curveToRelative(0.14f, -0.04f, 0.28f, -0.12f, 0.39f, -0.23f)
            lineToRelative(5.09f, -5.19f)
            curveToRelative(0.57f, -0.58f, 0.17f, -1.57f, -0.64f, -1.57f)
            horizontalLineToRelative(-3.59f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(-3.59f)
            curveToRelative(-0.81f, 0f, -1.22f, 0.99f, -0.64f, 1.57f)
            lineToRelative(5.09f, 5.19f)
            curveToRelative(0.11f, 0.11f, 0.25f, 0.19f, 0.39f, 0.23f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(15f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _ArrowAltToBottom = it }
