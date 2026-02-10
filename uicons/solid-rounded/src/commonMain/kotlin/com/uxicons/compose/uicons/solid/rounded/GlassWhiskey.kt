package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWhiskey: ImageVector? = null

val Icons.Sr.GlassWhiskey: ImageVector
    get() = _GlassWhiskey ?: UXIcon(name = "GlassWhiskey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.02f, 4.28f)
                curveToRelative(-0.08f, -0.84f, 0.2f, -1.68f, 0.77f, -2.3f)
                curveToRelative(0.57f, -0.62f, 1.38f, -0.98f, 2.22f, -0.98f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.85f, -0.0f, 1.66f, 0.36f, 2.22f, 0.98f)
                curveToRelative(0.57f, 0.63f, 0.85f, 1.47f, 0.76f, 2.31f)
                lineToRelative(-0.97f, 9.7f)
                lineTo(0.93f, 14.0f)
                reflectiveCurveTo(0.02f, 4.28f, 0.02f, 4.28f)
                close()
                moveTo(1.11f, 16.0f)
                lineToRelative(0.23f, 2.46f)
                curveToRelative(0.24f, 2.59f, 2.38f, 4.54f, 4.98f, 4.54f)
                horizontalLineToRelative(11.28f)
                curveToRelative(2.58f, -0.0f, 4.72f, -1.94f, 4.98f, -4.5f)
                lineToRelative(0.25f, -2.5f)
                lineTo(1.11f, 16.0f)
                close()
            }
        }.also { _GlassWhiskey = it}
