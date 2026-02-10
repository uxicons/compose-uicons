package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedBunk: ImageVector? = null

val Icons.Ts.BedBunk: ImageVector
    get() = _BedBunk ?: UXIcon(name = "BedBunk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                horizontalLineToRelative(-11f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.28f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.78f, -2f, -0.78f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.77f, 0.3f, 1.47f, 0.78f, 2f)
                lineTo(1f, 7f)
                lineTo(1f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(9f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-14f)
                lineTo(9f, 2.5f)
                close()
                moveTo(4f, 5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(1f, 8f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-12.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.28f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.78f, -2f, -0.78f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.77f, 0.3f, 1.47f, 0.78f, 2f)
                lineTo(1f, 20f)
                verticalLineToRelative(-12f)
                close()
                moveTo(4f, 18f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(9f, 20f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(12.5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-14f)
                close()
            }
        }.also { _BedBunk = it}
