package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEating: ImageVector? = null

val Icons.Rs.PlateEating: ImageVector
    get() = _PlateEating ?: UXIcon(name = "PlateEating") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22f)
                curveToRelative(0.69f, 0f, 1.35f, -0.07f, 2f, -0.2f)
                verticalLineToRelative(2.02f)
                curveToRelative(-0.65f, 0.11f, -1.32f, 0.18f, -2f, 0.18f)
                verticalLineToRelative(-2f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 4.43f, 2.42f, 8.3f, 6f, 10.38f)
                verticalLineToRelative(-2.4f)
                curveToRelative(-2.42f, -1.83f, -4f, -4.72f, -4f, -7.98f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.24f, -0.75f, 4.3f, -2f, 5.97f)
                verticalLineToRelative(2.94f)
                curveToRelative(2.45f, -2.2f, 4f, -5.38f, 4f, -8.92f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(16.61f, 8.23f)
                curveToRelative(-0.94f, 0.85f, -2.49f, 3.03f, -2.61f, 6.1f)
                curveToRelative(-0.04f, 1.71f, 0.47f, 3.6f, 2.0f, 5.46f)
                verticalLineToRelative(4.21f)
                horizontalLineToRelative(2f)
                lineTo(18f, 8.74f)
                curveToRelative(-0.0f, -0.63f, -0.86f, -1.0f, -1.39f, -0.51f)
                close()
                moveTo(13f, 13.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(0.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }.also { _PlateEating = it}
