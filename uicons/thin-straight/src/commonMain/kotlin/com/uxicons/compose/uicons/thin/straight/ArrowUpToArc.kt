package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpToArc: ImageVector? = null

val Icons.Ts.ArrowUpToArc: ImageVector
    get() = _ArrowUpToArc ?: UXIcon(name = "ArrowUpToArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.15f, 7.47f)
                lineToRelative(6.21f, 6.18f)
                lineToRelative(-0.7f, 0.71f)
                lineToRelative(-6.13f, -6.1f)
                verticalLineToRelative(15.75f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-15.75f)
                lineToRelative(-6.16f, 6.11f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(6.23f, -6.18f)
                curveToRelative(0.6f, -0.6f, 1.66f, -0.6f, 2.27f, 0.0f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                horizontalLineToRelative(1f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                horizontalLineToRelative(1f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _ArrowUpToArc = it}
