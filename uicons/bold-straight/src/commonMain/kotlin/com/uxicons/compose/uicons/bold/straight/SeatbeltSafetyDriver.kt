package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SeatbeltSafetyDriver: ImageVector? = null

val Icons.Bs.SeatbeltSafetyDriver: ImageVector
    get() = _SeatbeltSafetyDriver ?: UXIcon(name = "SeatbeltSafetyDriver") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 20.12f)
                curveToRelative(0.6f, -0.29f, 1.65f, -0.7f, 3f, -0.94f)
                verticalLineToRelative(4.82f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.88f)
                close()
                moveTo(14f, 24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.97f)
                curveToRelative(-0.91f, -0.34f, -1.94f, -0.65f, -3f, -0.84f)
                verticalLineToRelative(4.8f)
                close()
                moveTo(12f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(21f, 4.39f)
                lineToRelative(-10.98f, 9.73f)
                curveToRelative(0.63f, -0.07f, 1.29f, -0.12f, 1.98f, -0.12f)
                curveToRelative(1.02f, 0f, 2.03f, 0.12f, 3f, 0.3f)
                verticalLineToRelative(-1.93f)
                lineToRelative(3f, -2.66f)
                verticalLineToRelative(5.37f)
                curveToRelative(1.17f, 0.39f, 2.2f, 0.83f, 3f, 1.21f)
                verticalLineToRelative(3.37f)
                curveToRelative(-0.99f, -0.55f, -5.06f, -2.66f, -9f, -2.66f)
                reflectiveCurveToRelative(-6.65f, 1.73f, -6.67f, 1.75f)
                lineToRelative(-2.32f, 1.52f)
                lineToRelative(-0.01f, -3.94f)
                lineToRelative(3f, -2.66f)
                verticalLineToRelative(-4.17f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(0f, 0f, 5.1f, 0.01f, 5.15f, 0.01f)
                lineTo(21f, 0.38f)
                verticalLineToRelative(4.01f)
                close()
                moveTo(11.27f, 9f)
                horizontalLineToRelative(-1.77f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.51f)
                lineToRelative(2.27f, -2.01f)
                close()
            }
        }.also { _SeatbeltSafetyDriver = it}
