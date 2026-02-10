package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lead: ImageVector? = null

val Icons.Tr.Lead: ImageVector
    get() = _Lead ?: UXIcon(name = "Lead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(3f, 2.69f, 3f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
                moveTo(9f, 11f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(6.24f, 1f, 9f, 1f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(9.0f, 14.46f)
                curveToRelative(0.02f, 0.27f, -0.18f, 0.52f, -0.46f, 0.54f)
                curveToRelative(-4.23f, 0.36f, -7.54f, 3.98f, -7.54f, 8.25f)
                verticalLineToRelative(0.25f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-0.25f)
                curveToRelative(0f, -4.78f, 3.71f, -8.85f, 8.46f, -9.25f)
                curveToRelative(0.28f, -0.02f, 0.52f, 0.18f, 0.54f, 0.46f)
                close()
                moveTo(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(18f, 22.98f)
                verticalLineToRelative(-1.48f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.48f)
                curveToRelative(-2.63f, -0.24f, -4.74f, -2.34f, -4.97f, -4.97f)
                horizontalLineToRelative(1.48f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.48f)
                curveToRelative(0.24f, -2.63f, 2.34f, -4.74f, 4.97f, -4.97f)
                verticalLineToRelative(1.48f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.48f)
                curveToRelative(2.63f, 0.24f, 4.74f, 2.34f, 4.97f, 4.97f)
                horizontalLineToRelative(-1.48f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.48f)
                curveToRelative(-0.24f, 2.63f, -2.34f, 4.74f, -4.97f, 4.97f)
                close()
            }
        }.also { _Lead = it}
