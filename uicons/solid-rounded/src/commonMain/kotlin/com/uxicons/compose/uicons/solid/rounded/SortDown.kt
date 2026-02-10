package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortDown: ImageVector? = null

val Icons.Sr.SortDown: ImageVector
    get() = _SortDown ?: UXIcon(name = "SortDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.74f, 18f)
                curveToRelative(-0.76f, 0f, -1.48f, -0.32f, -1.99f, -0.89f)
                lineTo(3.33f, 10.59f)
                curveToRelative(-0.6f, -0.66f, -0.75f, -1.53f, -0.4f, -2.32f)
                curveToRelative(0.34f, -0.78f, 1.09f, -1.27f, 1.95f, -1.27f)
                horizontalLineToRelative(13.74f)
                curveToRelative(0.85f, 0f, 1.6f, 0.49f, 1.94f, 1.27f)
                reflectiveCurveToRelative(0.2f, 1.66f, -0.38f, 2.29f)
                lineToRelative(-6.49f, 6.59f)
                curveToRelative(-0.47f, 0.53f, -1.2f, 0.85f, -1.95f, 0.85f)
                close()
            }
        }.also { _SortDown = it}
