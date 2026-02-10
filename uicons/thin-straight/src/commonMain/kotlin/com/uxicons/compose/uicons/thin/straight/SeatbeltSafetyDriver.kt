package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SeatbeltSafetyDriver: ImageVector? = null

val Icons.Ts.SeatbeltSafetyDriver: ImageVector
    get() = _SeatbeltSafetyDriver ?: UXIcon(name = "SeatbeltSafetyDriver") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(21f, 1.14f)
                lineToRelative(-5.62f, 5.04f)
                curveToRelative(-0.28f, -0.11f, -0.57f, -0.18f, -0.88f, -0.18f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(5.19f)
                lineToRelative(-4f, 3.59f)
                verticalLineToRelative(2.22f)
                curveToRelative(1.5f, -1f, 5f, -3.5f, 9f, -3.5f)
                reflectiveCurveToRelative(8.32f, 2.41f, 9f, 2.79f)
                verticalLineToRelative(-1.14f)
                curveToRelative(-0.83f, -0.44f, -2.29f, -1.15f, -4f, -1.72f)
                verticalLineToRelative(-7.17f)
                lineToRelative(-1f, 0.9f)
                verticalLineToRelative(5.96f)
                curveToRelative(-1.28f, -0.36f, -2.65f, -0.61f, -4f, -0.61f)
                curveToRelative(-3.06f, 0f, -5.86f, 1.31f, -7.45f, 2.23f)
                lineTo(21f, 2.49f)
                verticalLineToRelative(-1.34f)
                close()
                moveTo(8f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.97f)
                lineToRelative(-6.47f, 5.79f)
                verticalLineToRelative(-4.29f)
                close()
                moveTo(9f, 18.55f)
                curveToRelative(0.33f, -0.11f, 0.66f, -0.21f, 1f, -0.29f)
                verticalLineToRelative(5.74f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.45f)
                close()
                moveTo(14f, 18.21f)
                curveToRelative(0.34f, 0.07f, 0.67f, 0.14f, 1f, 0.23f)
                verticalLineToRelative(5.55f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.79f)
                close()
            }
        }.also { _SeatbeltSafetyDriver = it}
