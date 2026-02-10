package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimelineArrow: ImageVector? = null

val Icons.Ss.TimelineArrow: ImageVector
    get() = _TimelineArrow ?: UXIcon(name = "TimelineArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.35f, 10.42f)
                lineToRelative(-3.13f, -3.13f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.29f, 2.29f)
                horizontalLineToRelative(-6.6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(11.6f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.13f, -3.13f)
                curveToRelative(0.87f, -0.87f, 0.87f, -2.29f, 0f, -3.16f)
                close()
            }
        }.also { _TimelineArrow = it}
