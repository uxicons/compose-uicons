package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalStream: ImageVector? = null

val Icons.Rc.SignalStream: ImageVector
    get() = _SignalStream ?: UXIcon(name = "SignalStream") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 12f)
                curveToRelative(0f, -2.64f, 1.17f, -5.23f, 3.3f, -7.28f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.03f, -1.41f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.41f, -1.41f, -0.03f)
                curveToRelative(-2.52f, 2.43f, -3.92f, 5.53f, -3.92f, 8.72f)
                reflectiveCurveToRelative(1.39f, 6.29f, 3.92f, 8.72f)
                curveToRelative(0.19f, 0.19f, 0.81f, 0.54f, 1.41f, -0.03f)
                curveToRelative(0.4f, -0.38f, 0.37f, -1.03f, -0.03f, -1.41f)
                curveToRelative(-2.13f, -2.05f, -3.3f, -4.64f, -3.3f, -7.28f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.0f, 12f)
                curveToRelative(0f, -2.64f, -1.17f, -5.23f, -3.3f, -7.28f)
                curveToRelative(-0.4f, -0.38f, -0.41f, -1.02f, -0.03f, -1.41f)
                curveToRelative(0.38f, -0.4f, 1.01f, -0.41f, 1.41f, -0.03f)
                curveToRelative(2.52f, 2.43f, 3.92f, 5.53f, 3.92f, 8.72f)
                reflectiveCurveToRelative(-1.39f, 6.29f, -3.92f, 8.72f)
                curveToRelative(-0.19f, 0.19f, -0.81f, 0.54f, -1.41f, -0.03f)
                curveToRelative(-0.4f, -0.38f, -0.37f, -1.03f, 0.03f, -1.41f)
                curveToRelative(2.13f, -2.05f, 3.3f, -4.64f, 3.3f, -7.28f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.14f, 6.51f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.03f)
                curveToRelative(-1.66f, 1.6f, -2.54f, 3.51f, -2.54f, 5.52f)
                reflectiveCurveToRelative(0.88f, 3.92f, 2.54f, 5.52f)
                curveToRelative(0.19f, 0.19f, 0.81f, 0.55f, 1.41f, -0.03f)
                curveToRelative(0.4f, -0.38f, 0.37f, -1.03f, -0.03f, -1.41f)
                curveToRelative(-1.26f, -1.22f, -1.93f, -2.63f, -1.93f, -4.08f)
                reflectiveCurveToRelative(0.67f, -2.86f, 1.93f, -4.08f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.03f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.86f, 6.51f)
                curveToRelative(0.38f, -0.4f, 1.02f, -0.41f, 1.41f, -0.03f)
                curveToRelative(1.66f, 1.6f, 2.54f, 3.51f, 2.54f, 5.52f)
                reflectiveCurveToRelative(-0.88f, 3.92f, -2.54f, 5.52f)
                curveToRelative(-0.19f, 0.19f, -0.81f, 0.55f, -1.41f, -0.03f)
                curveToRelative(-0.4f, -0.38f, -0.37f, -1.03f, 0.03f, -1.41f)
                curveToRelative(1.26f, -1.22f, 1.93f, -2.63f, 1.93f, -4.08f)
                reflectiveCurveToRelative(-0.67f, -2.86f, -1.93f, -4.08f)
                curveToRelative(-0.4f, -0.38f, -0.41f, -1.02f, -0.03f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                moveToRelative(-2.21f, 0f)
                arcToRelative(2.21f, 2.21f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.43f, 0f)
                arcToRelative(2.21f, 2.21f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4.43f, 0f)
            }
        }.also { _SignalStream = it}
