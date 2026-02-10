package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEating: ImageVector? = null

val Icons.Bs.PlateEating: ImageVector
    get() = _PlateEating ?: UXIcon(name = "PlateEating") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 3.54f, -1.55f, 6.72f, -4f, 8.92f)
                verticalLineToRelative(-4.82f)
                curveToRelative(0.64f, -1.23f, 1f, -2.62f, 1f, -4.1f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                curveToRelative(0f, 2.66f, 1.16f, 5.04f, 3f, 6.69f)
                verticalLineToRelative(3.69f)
                curveTo(2.42f, 20.3f, 0f, 16.43f, 0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
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
                moveTo(12f, 24f)
                curveToRelative(0.68f, 0f, 1.35f, -0.07f, 2f, -0.18f)
                verticalLineToRelative(-3.05f)
                curveToRelative(-0.64f, 0.15f, -1.31f, 0.23f, -2f, 0.23f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _PlateEating = it}
