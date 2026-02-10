package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MotorcycleHelmet: ImageVector? = null

val Icons.Ss.MotorcycleHelmet: ImageVector
    get() = _MotorcycleHelmet ?: UXIcon(name = "MotorcycleHelmet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.77f, 19.5f)
                lineToRelative(-2.99f, 4.41f)
                curveToRelative(-7.23f, -2.23f, -13.51f, -3.59f, -19.57f, -4.13f)
                curveToRelative(-0.15f, -0.98f, -1.12f, -6.41f, -1.18f, -9.2f)
                curveToRelative(0f, -5.77f, 4.7f, -10.47f, 10.47f, -10.47f)
                curveToRelative(4.65f, 0f, 8.74f, 2.62f, 10.17f, 6.52f)
                curveToRelative(0.02f, 0.05f, 0.06f, 0.16f, 0.13f, 0.37f)
                horizontalLineToRelative(-10.79f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.73f, 1.1f, 3.19f, 2.64f, 3.75f)
                lineToRelative(15.13f, 4.76f)
                close()
                moveTo(8f, 11f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(21.45f, 9f)
                horizontalLineToRelative(-8.01f)
                curveToRelative(0.34f, 0.59f, 0.56f, 1.27f, 0.56f, 2f)
                curveToRelative(0f, 1.16f, -0.51f, 2.2f, -1.3f, 2.93f)
                lineToRelative(10.97f, 3.44f)
                curveToRelative(-0.66f, -3.21f, -1.57f, -6.33f, -2.22f, -8.38f)
                close()
            }
        }.also { _MotorcycleHelmet = it}
