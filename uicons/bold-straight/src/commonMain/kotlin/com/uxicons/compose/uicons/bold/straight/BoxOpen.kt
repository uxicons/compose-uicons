package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxOpen: ImageVector? = null

val Icons.Bs.BoxOpen: ImageVector
    get() = _BoxOpen ?: UXIcon(name = "BoxOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 6.86f)
                lineToRelative(-1.72f, -2.85f)
                lineTo(12.01f, 0f)
                lineToRelative(-0.01f, 0.0f)
                lineToRelative(-0.01f, -0.0f)
                lineTo(2.0f, 4.01f)
                lineTo(0.28f, 6.86f)
                curveToRelative(-0.66f, 1.09f, -0.13f, 2.52f, 1.08f, 2.92f)
                lineToRelative(6.97f, 3.12f)
                curveToRelative(0.89f, 0.3f, 1.86f, -0.07f, 2.35f, -0.87f)
                lineToRelative(1.31f, -2.45f)
                lineToRelative(1.33f, 2.45f)
                curveToRelative(0.48f, 0.8f, 1.46f, 1.17f, 2.35f, 0.87f)
                lineToRelative(6.97f, -3.12f)
                curveToRelative(1.21f, -0.4f, 1.74f, -1.82f, 1.08f, -2.92f)
                close()
                moveTo(12f, 7.7f)
                lineToRelative(-5.75f, -2.13f)
                lineToRelative(5.75f, -2.34f)
                lineToRelative(5.75f, 2.34f)
                lineToRelative(-5.75f, 2.13f)
                close()
                moveTo(18.99f, 13.6f)
                lineToRelative(3.0f, -1.34f)
                lineToRelative(-0.01f, 8.39f)
                lineToRelative(-9.99f, 3.33f)
                lineToRelative(-9.99f, -3.33f)
                lineToRelative(-0.01f, -8.39f)
                lineToRelative(3.0f, 1.34f)
                lineToRelative(0.0f, 4.89f)
                lineToRelative(5.5f, 1.83f)
                lineToRelative(-0.0f, -5.62f)
                curveToRelative(0.54f, -0.23f, 1.04f, -0.56f, 1.44f, -1.01f)
                lineToRelative(0.06f, -0.06f)
                lineToRelative(0.06f, 0.06f)
                curveToRelative(0.4f, 0.45f, 0.9f, 0.79f, 1.44f, 1.01f)
                lineToRelative(-0.0f, 5.62f)
                lineToRelative(5.5f, -1.83f)
                lineToRelative(0.0f, -4.89f)
                close()
            }
        }.also { _BoxOpen = it}
