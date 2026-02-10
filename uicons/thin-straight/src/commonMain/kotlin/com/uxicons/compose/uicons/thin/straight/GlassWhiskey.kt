package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWhiskey: ImageVector? = null

val Icons.Ts.GlassWhiskey: ImageVector
    get() = _GlassWhiskey ?: UXIcon(name = "GlassWhiskey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.02f, 1f)
                lineToRelative(1.83f, 19.64f)
                curveToRelative(0.12f, 1.34f, 1.24f, 2.36f, 2.59f, 2.36f)
                horizontalLineToRelative(14.98f)
                curveToRelative(1.34f, 0f, 2.45f, -1.01f, 2.59f, -2.34f)
                lineToRelative(1.97f, -19.66f)
                lineTo(0.02f, 1f)
                close()
                moveTo(21.02f, 20.56f)
                curveToRelative(-0.08f, 0.82f, -0.77f, 1.44f, -1.59f, 1.44f)
                lineTo(4.44f, 22f)
                curveToRelative(-0.83f, 0f, -1.52f, -0.62f, -1.59f, -1.45f)
                lineToRelative(-0.52f, -5.55f)
                horizontalLineToRelative(19.24f)
                lineToRelative(-0.56f, 5.56f)
                close()
                moveTo(21.68f, 14.0f)
                lineTo(2.24f, 14.0f)
                lineTo(1.12f, 2f)
                horizontalLineToRelative(21.76f)
                lineToRelative(-1.2f, 12.0f)
                close()
            }
        }.also { _GlassWhiskey = it}
