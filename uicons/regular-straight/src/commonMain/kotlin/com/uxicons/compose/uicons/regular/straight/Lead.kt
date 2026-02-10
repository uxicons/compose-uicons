package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lead: ImageVector? = null

val Icons.Rs.Lead: ImageVector
    get() = _Lead ?: UXIcon(name = "Lead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                reflectiveCurveTo(2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(8f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(5f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19f, 21.86f)
                verticalLineToRelative(-1.86f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.86f)
                curveToRelative(-1.4f, -0.36f, -2.49f, -1.46f, -2.86f, -2.86f)
                horizontalLineToRelative(1.86f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.86f)
                curveToRelative(0.36f, -1.4f, 1.46f, -2.49f, 2.86f, -2.86f)
                verticalLineToRelative(1.86f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.86f)
                curveToRelative(1.4f, 0.36f, 2.49f, 1.46f, 2.86f, 2.86f)
                horizontalLineToRelative(-1.86f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.86f)
                curveToRelative(-0.36f, 1.4f, -1.46f, 2.49f, -2.86f, 2.86f)
                close()
            }
        }.also { _Lead = it}
