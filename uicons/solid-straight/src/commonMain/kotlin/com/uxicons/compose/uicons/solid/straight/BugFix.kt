package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BugFix: ImageVector? = null

val Icons.Ss.BugFix: ImageVector
    get() = _BugFix ?: UXIcon(name = "BugFix") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 13f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(-1.5f, 0.7f, -2.5f, 2.2f, -2.5f, 4f)
                reflectiveCurveToRelative(1.3f, 3.6f, 3f, 4.2f)
                verticalLineToRelative(2.8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.8f)
                curveToRelative(1.7f, -0.6f, 3f, -2.3f, 3f, -4.2f)
                reflectiveCurveToRelative(-1f, -3.3f, -2.5f, -4f)
                close()
                moveTo(15.6f, 22.2f)
                curveToRelative(-1.1f, 0.5f, -2.3f, 0.8f, -3.6f, 0.8f)
                curveToRelative(-3.1f, 0f, -5.7f, -1.6f, -7.1f, -4f)
                horizontalLineToRelative(-2.9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                curveToRelative(-0.2f, -0.7f, -0.3f, -1.4f, -0.3f, -2.2f)
                curveToRelative(0f, -0.4f, 0f, -0.8f, 0.1f, -1.2f)
                lineToRelative(0.2f, -0.6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.5f)
                lineToRelative(1f, -4f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4.1f)
                curveToRelative(1f, -2.4f, 3.3f, -4f, 5.9f, -4f)
                curveToRelative(2.6f, 0f, 4.9f, 1.6f, 5.9f, 4f)
                horizontalLineToRelative(4.1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-3.5f)
                lineToRelative(0.9f, 3.5f)
                curveToRelative(-3.5f, 0f, -6.4f, 3f, -6.4f, 6.5f)
                reflectiveCurveToRelative(1f, 4f, 2.6f, 5.2f)
                close()
            }
        }.also { _BugFix = it}
