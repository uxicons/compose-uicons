package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedPulse: ImageVector? = null

val Icons.Ts.BedPulse: ImageVector
    get() = _BedPulse ?: UXIcon(name = "BedPulse") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 9f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.67f, 1f)
                horizontalLineToRelative(2.66f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                lineTo(9f, 16f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.4f)
                lineToRelative(-0.46f, -1f)
                horizontalLineToRelative(-4.94f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.28f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.78f, -2f, -0.78f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.77f, 0.3f, 1.47f, 0.78f, 2f)
                lineTo(1f, 16f)
                lineTo(1f, 4f)
                lineTo(0f, 4f)
                lineTo(0f, 24f)
                lineTo(1f, 24f)
                verticalLineToRelative(-3f)
                lineTo(23f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                lineTo(24f, 11.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(4f, 14f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(1f, 20f)
                verticalLineToRelative(-3f)
                lineTo(23f, 17f)
                verticalLineToRelative(3f)
                lineTo(1f, 20f)
                close()
                moveTo(24f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.23f)
                lineToRelative(-2.35f, 3.52f)
                lineToRelative(-2.97f, -6.43f)
                lineToRelative(-1.66f, 2.91f)
                horizontalLineToRelative(-4.79f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.21f)
                lineTo(14.55f, -0.09f)
                lineToRelative(3.03f, 6.57f)
                lineToRelative(1.65f, -2.48f)
                horizontalLineToRelative(4.77f)
                close()
            }
        }.also { _BedPulse = it}
