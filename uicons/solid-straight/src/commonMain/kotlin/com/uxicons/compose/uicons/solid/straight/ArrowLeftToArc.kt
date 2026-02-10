package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftToArc: ImageVector? = null

val Icons.Ss.ArrowLeftToArc: ImageVector
    get() = _ArrowLeftToArc ?: UXIcon(name = "ArrowLeftToArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                horizontalLineToRelative(-14.05f)
                lineToRelative(4.76f, 4.8f)
                lineToRelative(-1.42f, 1.41f)
                lineToRelative(-5.68f, -5.72f)
                curveToRelative(-0.82f, -0.82f, -0.82f, -2.15f, 0.0f, -2.97f)
                lineToRelative(5.67f, -5.72f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(-4.76f, 4.8f)
                horizontalLineToRelative(14.05f)
                verticalLineToRelative(2f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                lineTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                verticalLineToRelative(-2f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                close()
            }
        }.also { _ArrowLeftToArc = it}
