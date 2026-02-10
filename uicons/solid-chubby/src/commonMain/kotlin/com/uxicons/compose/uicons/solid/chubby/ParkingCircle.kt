package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircle: ImageVector? = null

val Icons.Sc.ParkingCircle: ImageVector
    get() = _ParkingCircle ?: UXIcon(name = "ParkingCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.61f, 7.0f)
                reflectiveCurveToRelative(-0.68f, -0.0f, -0.88f, 0.0f)
                curveToRelative(-0.09f, 0.99f, -0.23f, 2.82f, -0.23f, 4.98f)
                curveToRelative(0.34f, 0.02f, 0.71f, 0.02f, 1.1f, 0.02f)
                curveToRelative(3.26f, 0f, 3.9f, -0.92f, 3.9f, -2.5f)
                reflectiveCurveToRelative(-0.64f, -2.5f, -3.9f, -2.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.4f, 0f, -11f, 3.6f, -11f, 11f)
                curveToRelative(0f, 9.86f, 6.28f, 11f, 11f, 11f)
                curveToRelative(5.12f, 0f, 11f, -1.25f, 11f, -11f)
                reflectiveCurveToRelative(-5.88f, -11f, -11f, -11f)
                close()
                moveTo(10.61f, 14.01f)
                curveToRelative(-0.34f, 0f, -0.69f, -0.0f, -1.04f, -0.02f)
                curveToRelative(0.14f, 2.25f, 0.46f, 3.78f, 0.47f, 3.8f)
                curveToRelative(0.12f, 0.54f, -0.23f, 1.07f, -0.77f, 1.19f)
                curveToRelative(-0.07f, 0.01f, -0.14f, 0.02f, -0.21f, 0.02f)
                curveToRelative(-0.46f, 0f, -0.88f, -0.32f, -0.98f, -0.79f)
                curveToRelative(-0.02f, -0.11f, -0.57f, -2.68f, -0.57f, -6.18f)
                curveToRelative(0f, -3.42f, 0.31f, -5.98f, 0.33f, -6.09f)
                curveToRelative(0.06f, -0.44f, 0.39f, -0.79f, 0.83f, -0.86f)
                curveToRelative(0.55f, -0.09f, 1.95f, -0.08f, 1.95f, -0.08f)
                curveToRelative(1.46f, 0f, 5.89f, 0f, 5.89f, 4.5f)
                reflectiveCurveToRelative(-4.44f, 4.5f, -5.89f, 4.5f)
                close()
            }
        }.also { _ParkingCircle = it}
