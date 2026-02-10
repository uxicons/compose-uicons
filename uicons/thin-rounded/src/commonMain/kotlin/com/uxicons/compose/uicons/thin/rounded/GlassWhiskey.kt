package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWhiskey: ImageVector? = null

val Icons.Tr.GlassWhiskey: ImageVector
    get() = _GlassWhiskey ?: UXIcon(name = "GlassWhiskey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.33f, 1.85f)
                curveToRelative(-0.49f, -0.54f, -1.19f, -0.85f, -1.92f, -0.85f)
                lineTo(2.6f, 1f)
                curveToRelative(-0.73f, 0.0f, -1.42f, 0.31f, -1.91f, 0.85f)
                curveTo(0.2f, 2.39f, -0.05f, 3.11f, 0.02f, 3.84f)
                lineToRelative(1.38f, 14.89f)
                curveToRelative(0.23f, 2.43f, 2.23f, 4.26f, 4.66f, 4.26f)
                horizontalLineToRelative(11.79f)
                curveToRelative(2.42f, -0.0f, 4.42f, -1.82f, 4.66f, -4.23f)
                lineToRelative(1.48f, -14.91f)
                curveToRelative(0.07f, -0.73f, -0.17f, -1.46f, -0.66f, -2.01f)
                close()
                moveTo(17.85f, 22.0f)
                lineTo(6.06f, 22.0f)
                curveToRelative(-1.91f, 0.0f, -3.49f, -1.44f, -3.67f, -3.35f)
                lineToRelative(-0.34f, -3.64f)
                horizontalLineToRelative(19.82f)
                lineToRelative(-0.36f, 3.67f)
                curveToRelative(-0.19f, 1.9f, -1.76f, 3.33f, -3.66f, 3.33f)
                close()
                moveTo(23f, 3.76f)
                lineToRelative(-1.02f, 10.24f)
                lineTo(2.01f, 14.0f)
                curveToRelative(-0.01f, 0f, -0.03f, 0f, -0.04f, 0.0f)
                lineTo(1.02f, 3.75f)
                curveToRelative(-0.04f, -0.46f, 0.1f, -0.89f, 0.41f, -1.23f)
                curveToRelative(0.3f, -0.33f, 0.72f, -0.52f, 1.17f, -0.52f)
                horizontalLineToRelative(18.82f)
                curveToRelative(0.45f, -0.0f, 0.87f, 0.18f, 1.18f, 0.52f)
                curveToRelative(0.3f, 0.34f, 0.45f, 0.79f, 0.41f, 1.24f)
                close()
            }
        }.also { _GlassWhiskey = it}
