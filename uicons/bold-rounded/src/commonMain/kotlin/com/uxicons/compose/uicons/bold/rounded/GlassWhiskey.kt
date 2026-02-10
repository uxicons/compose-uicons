package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWhiskey: ImageVector? = null

val Icons.Br.GlassWhiskey: ImageVector
    get() = _GlassWhiskey ?: UXIcon(name = "GlassWhiskey") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.83f, 2.48f)
            curveToRelative(-0.85f, -0.94f, -2.07f, -1.48f, -3.33f, -1.48f)
            lineTo(4.5f, 1f)
            curveToRelative(-1.27f, 0f, -2.48f, 0.54f, -3.33f, 1.48f)
            curveTo(0.32f, 3.41f, -0.1f, 4.67f, 0.02f, 5.93f)
            lineToRelative(1.09f, 11.19f)
            curveToRelative(0.33f, 3.35f, 3.11f, 5.87f, 6.47f, 5.87f)
            horizontalLineToRelative(8.84f)
            curveToRelative(3.36f, 0f, 6.14f, -2.52f, 6.47f, -5.87f)
            lineToRelative(1.09f, -11.19f)
            curveToRelative(0.12f, -1.26f, -0.29f, -2.52f, -1.15f, -3.46f)
            close()
            moveTo(3.39f, 4.49f)
            curveToRelative(0.29f, -0.32f, 0.68f, -0.49f, 1.11f, -0.49f)
            horizontalLineToRelative(15f)
            curveToRelative(0.43f, 0f, 0.82f, 0.17f, 1.11f, 0.49f)
            curveToRelative(0.29f, 0.32f, 0.42f, 0.73f, 0.38f, 1.15f)
            lineToRelative(-0.71f, 7.36f)
            lineTo(3.72f, 13f)
            lineToRelative(-0.71f, -7.36f)
            curveToRelative(-0.04f, -0.43f, 0.09f, -0.83f, 0.38f, -1.15f)
            close()
            moveTo(16.42f, 20f)
            lineTo(7.58f, 20f)
            curveToRelative(-1.81f, 0f, -3.31f, -1.36f, -3.48f, -3.16f)
            lineToRelative(-0.08f, -0.84f)
            horizontalLineToRelative(15.97f)
            lineToRelative(-0.08f, 0.84f)
            curveToRelative(-0.17f, 1.8f, -1.67f, 3.16f, -3.48f, 3.16f)
            close()
        }
    }.also { _GlassWhiskey = it }
