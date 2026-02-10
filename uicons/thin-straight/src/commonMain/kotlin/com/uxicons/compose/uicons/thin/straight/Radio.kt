package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Radio: ImageVector? = null

val Icons.Ts.Radio: ImageVector
    get() = _Radio ?: UXIcon(name = "Radio") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 6f)
                lineTo(5.53f, 6f)
                lineTo(21.15f, 0.98f)
                lineToRelative(-0.31f, -0.95f)
                lineTo(2.21f, 6.02f)
                curveToRelative(-1.24f, 0.14f, -2.21f, 1.2f, -2.21f, 2.48f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(14.5f)
                close()
                moveTo(3f, 13f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                lineTo(3f, 14f)
                verticalLineToRelative(-1f)
                close()
                moveTo(3f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                lineTo(3f, 17f)
                verticalLineToRelative(-1f)
                close()
                moveTo(3f, 19f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                lineTo(3f, 20f)
                verticalLineToRelative(-1f)
                close()
                moveTo(3f, 10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                lineTo(3f, 11f)
                verticalLineToRelative(-1f)
                close()
                moveTo(16f, 10f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(16f, 19f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(16f, 13f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(16f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Radio = it}
