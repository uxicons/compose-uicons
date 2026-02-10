package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rs6: ImageVector? = null

val Icons.Rs.Rs6: ImageVector
    get() = _Rs6 ?: UXIcon(name = "Rs6") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                lineTo(4f, 8f)
                curveTo(4f, 3.59f, 7.59f, 0f, 12f, 0f)
                horizontalLineToRelative(6f)
                lineTo(18f, 2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                verticalLineToRelative(2.71f)
                curveToRelative(1.47f, -1.66f, 3.61f, -2.71f, 6f, -2.71f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
                moveTo(6f, 16f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                close()
            }
        }.also { _Rs6 = it}
