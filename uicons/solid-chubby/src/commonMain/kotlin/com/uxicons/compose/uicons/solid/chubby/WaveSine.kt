package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveSine: ImageVector? = null

val Icons.Sc.WaveSine: ImageVector
    get() = _WaveSine ?: UXIcon(name = "WaveSine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.75f, 21f)
                curveToRelative(-5.26f, 0f, -6.11f, -5.1f, -6.29f, -8.93f)
                curveToRelative(-0.28f, -6.07f, -2.04f, -6.07f, -3.21f, -6.07f)
                curveToRelative(-1.19f, 0f, -3.19f, 0f, -3.25f, 7.51f)
                curveToRelative(-0.01f, 0.82f, -0.68f, 1.49f, -1.5f, 1.49f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.83f, -0.01f, -1.5f, -0.68f, -1.49f, -1.51f)
                curveToRelative(0.02f, -3.14f, 0.08f, -10.49f, 6.25f, -10.49f)
                curveToRelative(5.79f, 0f, 6.09f, 6.49f, 6.21f, 8.93f)
                curveToRelative(0.28f, 6.07f, 2.17f, 6.07f, 3.29f, 6.07f)
                curveToRelative(1.27f, 0f, 3.19f, 0f, 3.25f, -7.51f)
                curveToRelative(0.01f, -0.82f, 0.68f, -1.49f, 1.5f, -1.49f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.83f, 0.01f, 1.5f, 0.68f, 1.49f, 1.51f)
                curveToRelative(-0.02f, 3.14f, -0.08f, 10.49f, -6.25f, 10.49f)
                close()
            }
        }.also { _WaveSine = it}
