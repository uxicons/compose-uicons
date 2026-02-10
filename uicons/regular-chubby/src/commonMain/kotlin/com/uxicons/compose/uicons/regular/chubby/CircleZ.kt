package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleZ: ImageVector? = null

val Icons.Rc.CircleZ: ImageVector
    get() = _CircleZ ?: UXIcon(name = "CircleZ") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                reflectiveCurveToRelative(-2.44f, 9f, -9f, 9f)
                close()
                moveTo(16.29f, 8.11f)
                lineTo(10.27f, 15.85f)
                curveToRelative(0.53f, 0.08f, 1.13f, 0.15f, 1.73f, 0.15f)
                curveToRelative(1.56f, 0f, 3.21f, -0.46f, 3.23f, -0.46f)
                curveToRelative(0.53f, -0.15f, 1.08f, 0.16f, 1.23f, 0.69f)
                curveToRelative(0.15f, 0.53f, -0.16f, 1.08f, -0.69f, 1.23f)
                curveToRelative(-0.08f, 0.02f, -1.93f, 0.54f, -3.77f, 0.54f)
                reflectiveCurveToRelative(-3.69f, -0.52f, -3.77f, -0.54f)
                curveToRelative(-0.32f, -0.09f, -0.57f, -0.33f, -0.68f, -0.65f)
                curveToRelative(-0.1f, -0.32f, -0.04f, -0.66f, 0.16f, -0.93f)
                lineToRelative(6.02f, -7.74f)
                curveToRelative(-0.53f, -0.08f, -1.13f, -0.15f, -1.73f, -0.15f)
                curveToRelative(-1.56f, 0f, -3.21f, 0.46f, -3.23f, 0.46f)
                curveToRelative(-0.53f, 0.15f, -1.08f, -0.16f, -1.23f, -0.69f)
                curveToRelative(-0.15f, -0.53f, 0.16f, -1.08f, 0.69f, -1.23f)
                curveToRelative(0.08f, -0.02f, 1.93f, -0.54f, 3.77f, -0.54f)
                reflectiveCurveToRelative(3.69f, 0.52f, 3.77f, 0.54f)
                curveToRelative(0.32f, 0.09f, 0.57f, 0.33f, 0.68f, 0.65f)
                curveToRelative(0.1f, 0.32f, 0.04f, 0.66f, -0.16f, 0.93f)
                close()
            }
        }.also { _CircleZ = it}
