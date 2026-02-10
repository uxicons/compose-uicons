package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWhiskey: ImageVector? = null

val Icons.Bs.GlassWhiskey: ImageVector
    get() = _GlassWhiskey ?: UXIcon(name = "GlassWhiskey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(-0.0f, 1f)
                lineToRelative(1.71f, 18.82f)
                curveToRelative(0.17f, 1.81f, 1.66f, 3.18f, 3.49f, 3.18f)
                horizontalLineToRelative(13.49f)
                curveToRelative(1.81f, 0f, 3.31f, -1.36f, 3.48f, -3.16f)
                lineToRelative(1.83f, -18.84f)
                lineTo(-0.0f, 1f)
                close()
                moveTo(20.69f, 4f)
                lineToRelative(-0.87f, 9f)
                lineTo(4.1f, 13f)
                lineToRelative(-0.82f, -9f)
                horizontalLineToRelative(17.41f)
                close()
                moveTo(18.68f, 20f)
                lineTo(5.19f, 20f)
                curveToRelative(-0.26f, 0f, -0.47f, -0.2f, -0.5f, -0.46f)
                lineToRelative(-0.32f, -3.54f)
                horizontalLineToRelative(15.15f)
                lineToRelative(-0.34f, 3.55f)
                curveToRelative(-0.02f, 0.26f, -0.24f, 0.45f, -0.5f, 0.45f)
                close()
            }
        }.also { _GlassWhiskey = it}
