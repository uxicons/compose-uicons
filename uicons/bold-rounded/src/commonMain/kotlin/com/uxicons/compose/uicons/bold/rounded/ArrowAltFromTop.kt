package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromTop: ImageVector? = null

val Icons.Br.ArrowAltFromTop: ImageVector
    get() = _ArrowAltFromTop ?: UXIcon(name = "ArrowAltFromTop") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 0f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(14f)
            horizontalLineToRelative(-3.59f)
            curveToRelative(-0.81f, 0f, -1.22f, 0.99f, -0.64f, 1.57f)
            lineToRelative(5.09f, 5.15f)
            curveToRelative(0.36f, 0.36f, 0.93f, 0.36f, 1.29f, 0f)
            lineToRelative(5.09f, -5.15f)
            curveToRelative(0.57f, -0.58f, 0.17f, -1.57f, -0.64f, -1.57f)
            horizontalLineToRelative(-3.59f)
            verticalLineTo(3f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _ArrowAltFromTop = it }
