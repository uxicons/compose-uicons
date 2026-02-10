package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tachometer: ImageVector? = null

val Icons.Rc.Tachometer: ImageVector
    get() = _Tachometer ?: UXIcon(name = "Tachometer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.8f)
                curveTo(6.88f, 1.8f, 1f, 3.05f, 1f, 12.8f)
                curveToRelative(0f, 3.87f, 0.9f, 6.63f, 2.75f, 8.44f)
                curveToRelative(0.12f, 0.12f, 0.28f, 0.21f, 0.44f, 0.25f)
                curveToRelative(0.11f, 0.03f, 2.76f, 0.71f, 7.81f, 0.71f)
                reflectiveCurveToRelative(7.68f, -0.69f, 7.79f, -0.71f)
                curveToRelative(0.17f, -0.04f, 0.32f, -0.13f, 0.44f, -0.25f)
                curveToRelative(1.86f, -1.81f, 2.77f, -4.57f, 2.77f, -8.44f)
                curveTo(23f, 3.05f, 17.12f, 1.8f, 12f, 1.8f)
                close()
                moveTo(19.03f, 19.61f)
                curveToRelative(-0.75f, 0.16f, -3.13f, 0.59f, -7.03f, 0.59f)
                reflectiveCurveToRelative(-6.29f, -0.43f, -7.04f, -0.59f)
                curveToRelative(-1.32f, -1.42f, -1.96f, -3.65f, -1.96f, -6.81f)
                curveTo(3f, 5.33f, 6.6f, 3.8f, 12f, 3.8f)
                reflectiveCurveToRelative(9f, 1.53f, 9f, 9f)
                curveToRelative(0f, 3.16f, -0.65f, 5.39f, -1.97f, 6.81f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.3f, 8.16f)
                lineToRelative(-2.6f, 2.54f)
                curveToRelative(-0.22f, -0.07f, -0.45f, -0.11f, -0.7f, -0.11f)
                curveToRelative(-1.22f, 0f, -2.21f, 0.99f, -2.21f, 2.21f)
                reflectiveCurveToRelative(0.99f, 2.21f, 2.21f, 2.21f)
                reflectiveCurveToRelative(2.21f, -0.99f, 2.21f, -2.21f)
                curveToRelative(0f, -0.24f, -0.04f, -0.47f, -0.11f, -0.68f)
                lineToRelative(2.59f, -2.52f)
                curveToRelative(0.4f, -0.39f, 0.4f, -1.02f, 0.02f, -1.41f)
                curveToRelative(-0.39f, -0.4f, -1.02f, -0.4f, -1.41f, -0.02f)
                close()
            }
        }.also { _Tachometer = it}
