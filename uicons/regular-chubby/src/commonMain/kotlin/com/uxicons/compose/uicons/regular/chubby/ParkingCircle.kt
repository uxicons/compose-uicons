package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircle: ImageVector? = null

val Icons.Rc.ParkingCircle: ImageVector
    get() = _ParkingCircle ?: UXIcon(name = "ParkingCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.4f, 0f, -11f, 3.6f, -11f, 11f)
                curveToRelative(0f, 9.86f, 6.28f, 11f, 11f, 11f)
                curveToRelative(5.12f, 0f, 11f, -1.25f, 11f, -11f)
                reflectiveCurveToRelative(-5.88f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-5.4f, 0f, -9f, -1.53f, -9f, -9f)
                curveToRelative(0f, -6.31f, 2.69f, -9f, 9f, -9f)
                curveToRelative(5.4f, 0f, 9f, 1.53f, 9f, 9f)
                reflectiveCurveToRelative(-3.6f, 9f, -9f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.61f, 5.0f)
                reflectiveCurveToRelative(-1.39f, -0.0f, -1.95f, 0.08f)
                curveToRelative(-0.44f, 0.07f, -0.78f, 0.42f, -0.83f, 0.86f)
                curveToRelative(-0.01f, 0.11f, -0.33f, 2.67f, -0.33f, 6.09f)
                curveToRelative(0f, 3.49f, 0.55f, 6.07f, 0.57f, 6.18f)
                curveToRelative(0.1f, 0.47f, 0.52f, 0.79f, 0.98f, 0.79f)
                curveToRelative(0.07f, 0f, 0.14f, -0.01f, 0.21f, -0.02f)
                curveToRelative(0.54f, -0.12f, 0.88f, -0.65f, 0.77f, -1.19f)
                curveToRelative(-0.0f, -0.02f, -0.33f, -1.55f, -0.47f, -3.8f)
                curveToRelative(0.36f, 0.02f, 0.71f, 0.02f, 1.04f, 0.02f)
                curveToRelative(1.46f, 0f, 5.89f, 0f, 5.89f, -4.5f)
                reflectiveCurveToRelative(-4.44f, -4.5f, -5.89f, -4.5f)
                close()
                moveTo(10.61f, 12.01f)
                curveToRelative(-0.4f, 0f, -0.76f, -0.01f, -1.1f, -0.02f)
                curveToRelative(0.0f, -2.16f, 0.14f, -3.99f, 0.23f, -4.98f)
                curveToRelative(0.19f, -0.0f, 0.88f, -0.0f, 0.88f, -0.0f)
                curveToRelative(3.26f, 0f, 3.9f, 0.92f, 3.9f, 2.5f)
                reflectiveCurveToRelative(-0.64f, 2.5f, -3.9f, 2.5f)
                close()
            }
        }.also { _ParkingCircle = it}
