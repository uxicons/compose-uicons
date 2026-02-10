package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimelineArrow: ImageVector? = null

val Icons.Ts.TimelineArrow: ImageVector
    get() = _TimelineArrow ?: UXIcon(name = "TimelineArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.44f, 10.65f)
                lineToRelative(-3.58f, -3.59f)
                lineToRelative(-0.71f, 0.71f)
                reflectiveCurveToRelative(3.65f, 3.68f, 3.68f, 3.73f)
                horizontalLineToRelative(-8.83f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(13.83f)
                curveToRelative(-0.03f, 0.05f, -3.68f, 3.73f, -3.68f, 3.73f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.58f, -3.59f)
                curveToRelative(0.75f, -0.75f, 0.75f, -1.96f, 0f, -2.71f)
                close()
                moveTo(11f, 1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(1f, 1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(11f, 23f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _TimelineArrow = it}
