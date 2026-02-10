package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWhiskey: ImageVector? = null

val Icons.Ss.GlassWhiskey: ImageVector
    get() = _GlassWhiskey ?: UXIcon(name = "GlassWhiskey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.49f, 16f)
                lineToRelative(-0.43f, 4.3f)
                curveToRelative(-0.15f, 1.54f, -1.44f, 2.7f, -2.98f, 2.7f)
                lineTo(4.8f, 23f)
                curveToRelative(-1.56f, 0f, -2.84f, -1.17f, -2.99f, -2.72f)
                lineToRelative(-0.4f, -4.28f)
                horizontalLineToRelative(21.07f)
                close()
                moveTo(22.69f, 14f)
                lineToRelative(1.3f, -13f)
                lineTo(0.02f, 1f)
                lineToRelative(1.21f, 13f)
                horizontalLineToRelative(21.46f)
                close()
            }
        }.also { _GlassWhiskey = it}
