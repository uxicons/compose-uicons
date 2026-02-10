package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JulyCalendar: ImageVector? = null

val Icons.Bs.JulyCalendar: ImageVector
    get() = _JulyCalendar ?: UXIcon(name = "JulyCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3.4f)
                verticalLineToRelative(0.7f)
                curveToRelative(0f, 0.85f, 0.26f, 1.63f, 0.68f, 2.3f)
                horizontalLineToRelative(-7.08f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(21.6f, 16f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-2.4f)
                close()
                moveTo(11.4f, 21.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-0.7f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(0.7f)
                curveToRelative(0f, 1.27f, 1.03f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-5.7f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(17.2f, 21.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-5.7f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(5.7f)
                curveToRelative(0f, 1.27f, 1.03f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-5.7f)
                horizontalLineToRelative(-1.6f)
                close()
            }
        }.also { _JulyCalendar = it}
