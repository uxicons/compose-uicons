package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tags: ImageVector? = null

val Icons.Sr.Tags: ImageVector
    get() = _Tags ?: UXIcon(name = "Tags") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.53f, 8.28f)
                lineTo(13.94f, 0.88f)
                curveTo(13.28f, 0.22f, 12.33f, -0.1f, 11.41f, 0.03f)
                lineTo(4.52f, 0.97f)
                curveToRelative(-0.55f, 0.07f, -0.93f, 0.58f, -0.85f, 1.13f)
                curveToRelative(0.07f, 0.55f, 0.58f, 0.93f, 1.13f, 0.85f)
                lineToRelative(6.89f, -0.94f)
                curveToRelative(0.31f, -0.04f, 0.62f, 0.06f, 0.85f, 0.29f)
                lineToRelative(7.59f, 7.41f)
                curveToRelative(1.04f, 1.04f, 1.15f, 2.68f, 0.32f, 3.85f)
                curveToRelative(-0.23f, -0.47f, -0.52f, -0.91f, -0.91f, -1.3f)
                lineToRelative(-7.47f, -7.41f)
                curveToRelative(-0.66f, -0.66f, -1.6f, -0.97f, -2.53f, -0.85f)
                lineToRelative(-6.89f, 0.94f)
                curveToRelative(-0.45f, 0.06f, -0.81f, 0.42f, -0.86f, 0.88f)
                lineToRelative(-0.77f, 6.92f)
                curveToRelative(-0.1f, 0.91f, 0.21f, 1.8f, 0.86f, 2.45f)
                lineToRelative(7.42f, 7.35f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.53f, 1.46f)
                horizontalLineToRelative(0.02f)
                curveToRelative(1.34f, -0.0f, 2.6f, -0.53f, 3.54f, -1.49f)
                lineToRelative(3.17f, -3.21f)
                curveToRelative(0.93f, -0.94f, 1.39f, -2.16f, 1.42f, -3.39f)
                lineToRelative(0.58f, -0.58f)
                curveToRelative(1.93f, -1.95f, 1.91f, -5.11f, -0.03f, -7.06f)
                close()
                moveTo(6f, 10f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0.01f, -1.31f, 1.99f, -1.31f, 2f, 0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Tags = it}
