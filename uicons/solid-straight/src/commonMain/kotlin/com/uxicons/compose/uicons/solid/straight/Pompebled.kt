package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pompebled: ImageVector? = null

val Icons.Ss.Pompebled: ImageVector
    get() = _Pompebled ?: UXIcon(name = "Pompebled") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.55f, 11.45f)
                curveToRelative(0.87f, 0.87f, 2.08f, 0.6f, 3.15f, -0.03f)
                curveToRelative(1.22f, -0.72f, 2.9f, -1.65f, 3.94f, -1.6f)
                curveToRelative(1.06f, 0.05f, 2.03f, 0.51f, 2.97f, 1.45f)
                curveToRelative(1.86f, 1.86f, 1.86f, 4.87f, 0f, 6.72f)
                lineToRelative(-1.45f, 1.45f)
                curveToRelative(-4.59f, 4.59f, -13.94f, 6.51f, -18.52f, 1.93f)
                curveTo(-1.96f, 16.79f, -0.04f, 7.43f, 4.54f, 2.85f)
                lineToRelative(1.45f, -1.45f)
                curveToRelative(1.86f, -1.86f, 4.87f, -1.86f, 6.72f, 0f)
                curveToRelative(0.94f, 0.94f, 1.4f, 1.92f, 1.45f, 2.97f)
                curveToRelative(0.04f, 1.04f, -0.89f, 2.72f, -1.6f, 3.94f)
                curveToRelative(-0.63f, 1.06f, -0.89f, 2.27f, -0.02f, 3.15f)
                close()
            }
        }.also { _Pompebled = it}
