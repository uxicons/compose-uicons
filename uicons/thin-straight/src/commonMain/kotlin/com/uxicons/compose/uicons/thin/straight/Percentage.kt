package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Percentage: ImageVector? = null

val Icons.Ts.Percentage: ImageVector
    get() = _Percentage ?: UXIcon(name = "Percentage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.7f, 24.0f)
                lineTo(-0.0f, 23.3f)
                lineTo(23.3f, -0.0f)
                lineToRelative(0.71f, 0.71f)
                lineTo(0.7f, 24.0f)
                close()
                moveTo(9f, 5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(1f, 2.79f, 1f, 5f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(8f, 5f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(23f, 19f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _Percentage = it}
