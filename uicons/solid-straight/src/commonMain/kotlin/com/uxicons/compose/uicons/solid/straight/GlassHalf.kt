package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassHalf: ImageVector? = null

val Icons.Ss.GlassHalf: ImageVector
    get() = _GlassHalf ?: UXIcon(name = "GlassHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.02f, 11f)
                lineTo(1.11f, 0f)
                horizontalLineToRelative(21.77f)
                lineToRelative(-0.97f, 11f)
                lineTo(2.02f, 11f)
                close()
                moveTo(2.18f, 13f)
                lineToRelative(0.68f, 8.25f)
                curveToRelative(0.13f, 1.54f, 1.44f, 2.75f, 2.99f, 2.75f)
                horizontalLineToRelative(12.18f)
                curveToRelative(1.57f, 0f, 2.85f, -1.18f, 2.99f, -2.74f)
                lineToRelative(0.73f, -8.26f)
                lineTo(2.18f, 13f)
                close()
            }
        }.also { _GlassHalf = it}
