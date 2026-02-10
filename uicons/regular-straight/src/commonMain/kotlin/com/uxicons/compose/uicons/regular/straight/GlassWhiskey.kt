package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWhiskey: ImageVector? = null

val Icons.Rs.GlassWhiskey: ImageVector
    get() = _GlassWhiskey ?: UXIcon(name = "GlassWhiskey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.02f, 1f)
                lineToRelative(1.8f, 19.28f)
                curveToRelative(0.14f, 1.55f, 1.43f, 2.72f, 2.99f, 2.72f)
                horizontalLineToRelative(14.27f)
                curveToRelative(1.55f, 0f, 2.83f, -1.16f, 2.98f, -2.7f)
                lineToRelative(1.93f, -19.3f)
                lineTo(0.02f, 1f)
                close()
                moveTo(19.07f, 21f)
                lineTo(4.8f, 21f)
                curveToRelative(-0.52f, 0f, -0.95f, -0.39f, -0.99f, -0.91f)
                lineToRelative(-0.38f, -4.09f)
                horizontalLineToRelative(17.05f)
                lineToRelative(-0.41f, 4.1f)
                curveToRelative(-0.05f, 0.51f, -0.48f, 0.9f, -0.99f, 0.9f)
                close()
                moveTo(20.68f, 14f)
                lineTo(3.24f, 14f)
                lineTo(2.21f, 3f)
                horizontalLineToRelative(19.57f)
                lineToRelative(-1.1f, 11f)
                close()
            }
        }.also { _GlassWhiskey = it}
