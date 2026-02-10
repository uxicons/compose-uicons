package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ParkingCircleSlash: ImageVector? = null

val Icons.Rc.ParkingCircleSlash: ImageVector
    get() = _ParkingCircleSlash ?: UXIcon(name = "ParkingCircleSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.4f, 0f, -11f, 3.6f, -11f, 11f)
                curveToRelative(0f, 9.86f, 6.28f, 11f, 11f, 11f)
                curveToRelative(5.12f, 0f, 11f, -1.25f, 11f, -11f)
                reflectiveCurveToRelative(-5.88f, -11f, -11f, -11f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 2.81f, -0.51f, 4.79f, -1.44f, 6.15f)
                lineToRelative(-4.96f, -4.96f)
                curveToRelative(1.25f, -0.74f, 1.9f, -1.99f, 1.9f, -3.68f)
                curveToRelative(0f, -4.5f, -4.44f, -4.5f, -5.89f, -4.5f)
                curveToRelative(0f, 0f, -1.39f, -0.0f, -1.95f, 0.08f)
                curveToRelative(-0.44f, 0.07f, -0.78f, 0.42f, -0.83f, 0.86f)
                curveToRelative(-0.0f, 0.01f, -0.02f, 0.16f, -0.05f, 0.41f)
                lineToRelative(-1.88f, -1.88f)
                curveToRelative(1.44f, -1.01f, 3.45f, -1.49f, 6.1f, -1.49f)
                curveToRelative(5.4f, 0f, 9f, 1.53f, 9f, 9f)
                close()
                moveTo(13.11f, 11.69f)
                lineTo(9.63f, 8.22f)
                curveToRelative(0.03f, -0.48f, 0.07f, -0.89f, 0.1f, -1.21f)
                curveToRelative(0.19f, -0.0f, 0.88f, -0.0f, 0.88f, -0.0f)
                curveToRelative(3.26f, 0f, 3.9f, 0.92f, 3.9f, 2.5f)
                curveToRelative(0f, 1.2f, -0.4f, 1.84f, -1.39f, 2.19f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -2.65f, 0.47f, -4.66f, 1.49f, -6.1f)
                lineToRelative(13.68f, 13.68f)
                curveToRelative(-1.55f, 1.09f, -3.66f, 1.42f, -6.17f, 1.42f)
                curveToRelative(-5.4f, 0f, -9f, -1.53f, -9f, -9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.52f, 13.0f)
                curveToRelative(-0.02f, -0.55f, -0.49f, -1.0f, -1.03f, -0.97f)
                curveToRelative(-0.55f, 0.02f, -0.99f, 0.48f, -0.97f, 1.03f)
                curveToRelative(0.09f, 2.97f, 0.54f, 5.07f, 0.56f, 5.16f)
                curveToRelative(0.1f, 0.47f, 0.52f, 0.79f, 0.98f, 0.79f)
                curveToRelative(0.07f, 0f, 0.14f, -0.01f, 0.21f, -0.02f)
                curveToRelative(0.54f, -0.12f, 0.88f, -0.65f, 0.77f, -1.19f)
                curveToRelative(-0.0f, -0.02f, -0.43f, -2.02f, -0.51f, -4.79f)
                close()
            }
        }.also { _ParkingCircleSlash = it}
