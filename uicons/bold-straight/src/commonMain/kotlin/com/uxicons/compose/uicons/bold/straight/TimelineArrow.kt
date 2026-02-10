package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimelineArrow: ImageVector? = null

val Icons.Bs.TimelineArrow: ImageVector
    get() = _TimelineArrow ?: UXIcon(name = "TimelineArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 12.71f)
                lineToRelative(-3.71f, 3.79f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                lineToRelative(3.71f, 3.79f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _TimelineArrow = it}
