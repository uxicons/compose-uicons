package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassEmpty: ImageVector? = null

val Icons.Bs.GlassEmpty: ImageVector
    get() = _GlassEmpty ?: UXIcon(name = "GlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.01f, 0f)
                lineToRelative(1.71f, 20.79f)
                curveToRelative(0.15f, 1.8f, 1.68f, 3.21f, 3.49f, 3.21f)
                horizontalLineToRelative(11.46f)
                curveToRelative(1.83f, 0f, 3.33f, -1.37f, 3.49f, -3.19f)
                lineTo(22.98f, 0f)
                lineTo(1.01f, 0f)
                close()
                moveTo(18.17f, 20.54f)
                curveToRelative(-0.02f, 0.26f, -0.24f, 0.46f, -0.5f, 0.46f)
                lineTo(6.21f, 21f)
                curveToRelative(-0.26f, 0f, -0.48f, -0.2f, -0.5f, -0.46f)
                lineTo(4.27f, 3f)
                horizontalLineToRelative(15.44f)
                lineToRelative(-1.54f, 17.54f)
                close()
            }
        }.also { _GlassEmpty = it}
