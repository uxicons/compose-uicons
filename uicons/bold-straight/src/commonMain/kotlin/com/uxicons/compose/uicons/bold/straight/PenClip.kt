package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenClip: ImageVector? = null

val Icons.Bs.PenClip: ImageVector
    get() = _PenClip ?: UXIcon(name = "PenClip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.42f, 0.89f)
                curveToRelative(-1.62f, -1.33f, -4.1f, -1.16f, -5.65f, 0.39f)
                lineToRelative(-0.55f, 0.55f)
                lineToRelative(-0.74f, -0.74f)
                curveToRelative(-1.46f, -1.46f, -3.82f, -1.46f, -5.28f, 0f)
                lineTo(5.51f, 5.79f)
                lineToRelative(2.12f, 2.12f)
                lineTo(12.33f, 3.22f)
                curveToRelative(0.29f, -0.29f, 0.75f, -0.29f, 1.03f, 0f)
                lineToRelative(0.74f, 0.74f)
                lineTo(4.02f, 14.04f)
                curveToRelative(-1.14f, 1.14f, -1.58f, 3.93f, -1.74f, 5.51f)
                lineToRelative(-2.27f, 2.27f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.31f, -2.31f)
                curveToRelative(1.59f, -0.17f, 4.32f, -0.61f, 5.44f, -1.74f)
                lineTo(22.73f, 7.03f)
                curveToRelative(0.83f, -0.83f, 1.27f, -1.97f, 1.21f, -3.13f)
                curveToRelative(-0.06f, -1.17f, -0.61f, -2.26f, -1.52f, -3f)
                close()
                moveTo(7.76f, 17.76f)
                curveToRelative(-0.26f, 0.22f, -1.2f, 0.49f, -2.3f, 0.69f)
                curveToRelative(0.2f, -1.11f, 0.46f, -2.04f, 0.68f, -2.29f)
                lineTo(16.22f, 6.08f)
                lineToRelative(1.61f, 1.61f)
                lineTo(7.76f, 17.76f)
                close()
            }
        }.also { _PenClip = it}
