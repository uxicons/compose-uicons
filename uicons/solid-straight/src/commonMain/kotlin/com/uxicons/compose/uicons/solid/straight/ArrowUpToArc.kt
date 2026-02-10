package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpToArc: ImageVector? = null

val Icons.Ss.ArrowUpToArc: ImageVector
    get() = _ArrowUpToArc ?: UXIcon(name = "ArrowUpToArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 7.62f)
                lineToRelative(5.71f, 5.67f)
                lineToRelative(-1.41f, 1.42f)
                lineToRelative(-4.79f, -4.75f)
                verticalLineToRelative(14.05f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-14.05f)
                lineToRelative(-4.8f, 4.76f)
                lineToRelative(-1.41f, -1.42f)
                lineToRelative(5.73f, -5.68f)
                curveToRelative(0.79f, -0.79f, 2.18f, -0.79f, 2.97f, 0.0f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                horizontalLineToRelative(2f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                horizontalLineToRelative(2f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _ArrowUpToArc = it}
