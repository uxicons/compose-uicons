package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SeatbeltSafetyDriver: ImageVector? = null

val Icons.Ss.SeatbeltSafetyDriver: ImageVector
    get() = _SeatbeltSafetyDriver ?: UXIcon(name = "SeatbeltSafetyDriver") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(6.3f, 16.07f)
                curveToRelative(1.05f, -0.41f, 2.48f, -0.82f, 4.15f, -0.99f)
                lineToRelative(6.55f, -5.77f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.71f, 0.22f, 1.39f, 0.45f, 2f, 0.7f)
                lineToRelative(2f, 1.0f)
                verticalLineToRelative(2.14f)
                curveToRelative(-0.99f, -0.55f, -5.06f, -2.66f, -9f, -2.66f)
                reflectiveCurveToRelative(-6.65f, 1.73f, -6.67f, 1.75f)
                lineToRelative(-2.32f, 1.52f)
                lineToRelative(-0.01f, -3.94f)
                lineToRelative(4f, -3.54f)
                verticalLineToRelative(-3.78f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(0.19f, 0f, 0.38f, 0.04f, 0.57f, 0.07f)
                lineTo(21f, 0.38f)
                verticalLineToRelative(2.75f)
                lineToRelative(-14.7f, 12.94f)
                close()
                moveTo(8f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.82f)
                curveToRelative(-0.77f, 0.14f, -1.45f, 0.33f, -2f, 0.52f)
                verticalLineToRelative(4.29f)
                close()
                moveTo(14f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.31f)
                curveToRelative(-0.64f, -0.2f, -1.31f, -0.38f, -2f, -0.5f)
                verticalLineToRelative(4.81f)
                close()
            }
        }.also { _SeatbeltSafetyDriver = it}
