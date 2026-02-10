package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassHalf: ImageVector? = null

val Icons.Bs.GlassHalf: ImageVector
    get() = _GlassHalf ?: UXIcon(name = "GlassHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.01f, 0f)
                lineToRelative(1.71f, 20.79f)
                curveToRelative(0.15f, 1.8f, 1.68f, 3.21f, 3.49f, 3.21f)
                horizontalLineToRelative(11.46f)
                curveToRelative(1.83f, 0f, 3.33f, -1.37f, 3.49f, -3.19f)
                lineTo(22.99f, 0f)
                lineTo(1.01f, 0f)
                close()
                moveTo(19.71f, 3f)
                lineToRelative(-0.61f, 7f)
                lineTo(4.85f, 10f)
                lineToRelative(-0.58f, -7f)
                horizontalLineToRelative(15.44f)
                close()
                moveTo(17.67f, 21f)
                lineTo(6.21f, 21f)
                curveToRelative(-0.26f, 0f, -0.48f, -0.2f, -0.5f, -0.46f)
                lineToRelative(-0.62f, -7.54f)
                horizontalLineToRelative(13.74f)
                lineToRelative(-0.66f, 7.54f)
                curveToRelative(-0.02f, 0.26f, -0.24f, 0.46f, -0.5f, 0.46f)
                close()
            }
        }.also { _GlassHalf = it}
