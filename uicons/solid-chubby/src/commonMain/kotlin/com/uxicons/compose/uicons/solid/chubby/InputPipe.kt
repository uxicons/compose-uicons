package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputPipe: ImageVector? = null

val Icons.Sc.InputPipe: ImageVector
    get() = _InputPipe ?: UXIcon(name = "InputPipe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.2f, 5.63f)
                curveToRelative(-0.1f, -0.32f, -0.35f, -0.56f, -0.68f, -0.66f)
                curveToRelative(-0.14f, -0.04f, -3.46f, -0.97f, -9.53f, -0.97f)
                reflectiveCurveToRelative(-9.39f, 0.93f, -9.53f, 0.97f)
                curveToRelative(-0.32f, 0.09f, -0.57f, 0.34f, -0.68f, 0.66f)
                curveToRelative(-0.03f, 0.1f, -0.8f, 2.53f, -0.8f, 6.37f)
                reflectiveCurveToRelative(0.77f, 6.27f, 0.8f, 6.37f)
                curveToRelative(0.1f, 0.32f, 0.35f, 0.56f, 0.68f, 0.66f)
                curveToRelative(0.14f, 0.04f, 3.46f, 0.97f, 9.53f, 0.97f)
                reflectiveCurveToRelative(9.39f, -0.93f, 9.53f, -0.97f)
                curveToRelative(0.32f, -0.09f, 0.57f, -0.34f, 0.68f, -0.66f)
                curveToRelative(0.03f, -0.1f, 0.8f, -2.53f, 0.8f, -6.37f)
                reflectiveCurveToRelative(-0.77f, -6.27f, -0.8f, -6.37f)
                close()
                moveTo(7.59f, 15.24f)
                curveToRelative(-0.13f, 0.54f, -0.69f, 0.86f, -1.21f, 0.73f)
                curveToRelative(-0.54f, -0.13f, -0.86f, -0.68f, -0.73f, -1.21f)
                curveToRelative(0.0f, -0.01f, 0.34f, -1.41f, 0.34f, -2.76f)
                reflectiveCurveToRelative(-0.34f, -2.74f, -0.34f, -2.76f)
                curveToRelative(-0.13f, -0.54f, 0.19f, -1.08f, 0.73f, -1.21f)
                curveToRelative(0.53f, -0.14f, 1.08f, 0.19f, 1.21f, 0.73f)
                curveToRelative(0.02f, 0.07f, 0.41f, 1.64f, 0.41f, 3.24f)
                reflectiveCurveToRelative(-0.39f, 3.18f, -0.41f, 3.24f)
                close()
            }
        }.also { _InputPipe = it}
