package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromRight: ImageVector? = null

val Icons.Br.ArrowAltFromRight: ImageVector
    get() = _ArrowAltFromRight ?: UXIcon(name = "ArrowAltFromRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(6f)
            horizontalLineTo(7f)
            verticalLineToRelative(-3.59f)
            curveToRelative(0f, -0.81f, -0.99f, -1.22f, -1.57f, -0.64f)
            lineTo(0.27f, 11.36f)
            curveToRelative(-0.36f, 0.36f, -0.36f, 0.93f, 0f, 1.29f)
            lineToRelative(5.15f, 5.09f)
            curveToRelative(0.58f, 0.57f, 1.57f, 0.17f, 1.57f, -0.64f)
            verticalLineToRelative(-3.59f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _ArrowAltFromRight = it }
