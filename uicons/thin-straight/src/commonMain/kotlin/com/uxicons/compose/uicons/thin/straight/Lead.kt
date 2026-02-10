package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lead: ImageVector? = null

val Icons.Ts.Lead: ImageVector
    get() = _Lead ?: UXIcon(name = "Lead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(18f, 22.98f)
                verticalLineToRelative(-1.98f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1.98f)
                curveToRelative(-2.63f, -0.24f, -4.74f, -2.34f, -4.97f, -4.97f)
                horizontalLineToRelative(1.98f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1.98f)
                curveToRelative(0.24f, -2.63f, 2.34f, -4.74f, 4.97f, -4.97f)
                verticalLineToRelative(1.98f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.98f)
                curveToRelative(2.63f, 0.24f, 4.74f, 2.34f, 4.97f, 4.97f)
                horizontalLineToRelative(-1.98f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.98f)
                curveToRelative(-0.24f, 2.63f, -2.34f, 4.74f, -4.97f, 4.97f)
                close()
                moveTo(8.97f, 12.03f)
                curveToRelative(3.32f, 0f, 6.03f, -2.7f, 6.03f, -6.03f)
                reflectiveCurveTo(12.3f, -0.03f, 8.97f, -0.03f)
                reflectiveCurveTo(2.95f, 2.68f, 2.95f, 6f)
                reflectiveCurveToRelative(2.7f, 6.03f, 6.03f, 6.03f)
                close()
                moveTo(8.97f, 0.97f)
                curveToRelative(2.77f, 0f, 5.03f, 2.25f, 5.03f, 5.03f)
                reflectiveCurveToRelative(-2.25f, 5.03f, -5.03f, 5.03f)
                reflectiveCurveToRelative(-5.03f, -2.25f, -5.03f, -5.03f)
                reflectiveCurveTo(6.2f, 0.97f, 8.97f, 0.97f)
                close()
                moveTo(9.76f, 14f)
                curveToRelative(-0.15f, 0.32f, -0.28f, 0.66f, -0.39f, 1f)
                horizontalLineToRelative(-4.88f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(5.26f)
                close()
            }
        }.also { _Lead = it}
