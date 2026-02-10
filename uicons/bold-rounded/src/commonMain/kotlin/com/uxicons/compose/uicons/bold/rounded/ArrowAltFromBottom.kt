package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromBottom: ImageVector? = null

val Icons.Br.ArrowAltFromBottom: ImageVector
    get() = _ArrowAltFromBottom ?: UXIcon(name = "ArrowAltFromBottom") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 21f)
            horizontalLineToRelative(-6f)
            verticalLineTo(7f)
            horizontalLineToRelative(3.59f)
            curveToRelative(0.81f, 0f, 1.22f, -0.99f, 0.64f, -1.57f)
            lineTo(12.64f, 0.27f)
            curveToRelative(-0.36f, -0.36f, -0.93f, -0.36f, -1.29f, 0f)
            lineTo(6.27f, 5.42f)
            curveToRelative(-0.57f, 0.58f, -0.17f, 1.57f, 0.64f, 1.57f)
            horizontalLineToRelative(3.59f)
            verticalLineToRelative(14f)
            horizontalLineTo(4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(15f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _ArrowAltFromBottom = it }
