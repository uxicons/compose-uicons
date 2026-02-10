package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateEating: ImageVector? = null

val Icons.Ts.PlateEating: ImageVector
    get() = _PlateEating ?: UXIcon(name = "PlateEating") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23f)
                curveToRelative(1.04f, 0f, 2.04f, -0.15f, 3f, -0.43f)
                verticalLineToRelative(1.03f)
                curveToRelative(-0.96f, 0.25f, -1.96f, 0.4f, -3f, 0.4f)
                curveToRelative(-0.34f, 0f, -0.67f, -0.02f, -1f, -0.05f)
                verticalLineToRelative(-1f)
                curveToRelative(0.33f, 0.03f, 0.66f, 0.05f, 1f, 0.05f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 4.43f, 2.42f, 8.3f, 6f, 10.38f)
                verticalLineToRelative(-1.17f)
                curveToRelative(-3.01f, -1.97f, -5f, -5.36f, -5f, -9.21f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 2.91f, -1.15f, 5.56f, -3f, 7.53f)
                verticalLineToRelative(1.39f)
                curveToRelative(2.45f, -2.2f, 4f, -5.38f, 4f, -8.92f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(18f, 7.62f)
                lineTo(18f, 24f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.16f)
                curveToRelative(-2.04f, -1.93f, -3.05f, -4.12f, -3.0f, -6.51f)
                curveToRelative(0.12f, -2.87f, 1.48f, -5.08f, 2.61f, -6.11f)
                curveToRelative(0.48f, -0.42f, 1.24f, -0.23f, 1.39f, 0.39f)
                close()
                moveTo(17f, 8.25f)
                curveToRelative(-0.8f, 0.88f, -1.9f, 2.68f, -2.0f, 5.11f)
                curveToRelative(-0.04f, 1.81f, 0.63f, 3.5f, 2.0f, 5.05f)
                lineTo(17f, 8.25f)
                close()
                moveTo(12f, 13f)
                lineTo(12f, 7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                lineTo(9f, 7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(6f, 7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(1f)
                lineTo(9f, 15f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _PlateEating = it}
