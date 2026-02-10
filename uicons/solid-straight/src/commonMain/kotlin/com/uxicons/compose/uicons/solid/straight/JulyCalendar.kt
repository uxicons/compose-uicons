package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JulyCalendar: ImageVector? = null

val Icons.Ss.JulyCalendar: ImageVector
    get() = _JulyCalendar ?: UXIcon(name = "JulyCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.6f, 22.4f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1.6f)
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
                moveTo(21f, 2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(7.16f)
                curveToRelative(-0.37f, -0.59f, -0.6f, -1.27f, -0.66f, -2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(14.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-24f)
                close()
            }
        }.also { _JulyCalendar = it}
