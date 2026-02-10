package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PriorityArrow: ImageVector? = null

val Icons.Bs.PriorityArrow: ImageVector
    get() = _PriorityArrow ?: UXIcon(name = "PriorityArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 9f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(18f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                lineTo(24f, 1f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(18f, 23f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                close()
                moveTo(15.71f, 5.21f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-3.71f, -3.79f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                curveTo(4.04f, 3f, 0f, 7.04f, 0f, 12f)
                reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                lineToRelative(3.71f, -3.79f)
                close()
            }
        }.also { _PriorityArrow = it}
