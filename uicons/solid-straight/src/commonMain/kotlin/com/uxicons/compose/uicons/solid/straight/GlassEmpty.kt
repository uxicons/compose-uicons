package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassEmpty: ImageVector? = null

val Icons.Ss.GlassEmpty: ImageVector
    get() = _GlassEmpty ?: UXIcon(name = "GlassEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.03f, 24f)
                horizontalLineTo(5.85f)
                curveToRelative(-1.55f, 0f, -2.86f, -1.21f, -2.99f, -2.75f)
                lineTo(1.11f, 0f)
                horizontalLineToRelative(21.77f)
                lineToRelative(-1.87f, 21.26f)
                curveToRelative(-0.14f, 1.56f, -1.42f, 2.74f, -2.99f, 2.74f)
                close()
            }
        }.also { _GlassEmpty = it}
