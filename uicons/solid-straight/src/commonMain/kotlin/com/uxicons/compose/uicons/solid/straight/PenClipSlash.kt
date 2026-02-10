package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenClipSlash: ImageVector? = null

val Icons.Ss.PenClipSlash: ImageVector
    get() = _PenClipSlash ?: UXIcon(name = "PenClipSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.7f, 6.54f)
                lineToRelative(-4.27f, -4.27f)
                lineToRelative(1.33f, -1.33f)
                curveToRelative(1.13f, -1.13f, 2.95f, -1.26f, 4.13f, -0.3f)
                curveToRelative(0.66f, 0.54f, 1.07f, 1.34f, 1.11f, 2.19f)
                curveToRelative(0.04f, 0.85f, -0.28f, 1.68f, -0.88f, 2.29f)
                lineToRelative(-1.42f, 1.42f)
                close()
                moveTo(14.82f, 13.41f)
                lineToRelative(9.14f, 9.14f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(6.11f, 6.11f)
                lineToRelative(3.34f, -3.34f)
                curveToRelative(1.17f, -1.17f, 3.07f, -1.17f, 4.24f, 0f)
                lineToRelative(5.14f, 5.14f)
                lineToRelative(-5.46f, 5.46f)
                close()
                moveTo(10.54f, 9.13f)
                lineToRelative(4.06f, -4.04f)
                lineToRelative(-0.87f, -0.87f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0f)
                lineToRelative(-3.34f, 3.34f)
                lineToRelative(1.56f, 1.56f)
                close()
                moveTo(3.16f, 16.48f)
                curveToRelative(-0.85f, 0.85f, -1.19f, 3.06f, -1.32f, 4.24f)
                lineTo(0.04f, 22.51f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.84f, -1.84f)
                curveToRelative(1.2f, -0.14f, 3.33f, -0.48f, 4.16f, -1.31f)
                lineToRelative(4.54f, -4.53f)
                lineToRelative(-4.28f, -4.28f)
                lineToRelative(-4.54f, 4.52f)
                close()
            }
        }.also { _PenClipSlash = it}
