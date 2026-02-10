package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveSine: ImageVector? = null

val Icons.Rr.WaveSine: ImageVector
    get() = _WaveSine ?: UXIcon(name = "WaveSine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 21f)
                curveToRelative(-4.08f, 0f, -5.63f, -5.68f, -6.46f, -8.74f)
                curveToRelative(-1.03f, -3.77f, -2.29f, -7.26f, -4.54f, -7.26f)
                curveToRelative(-1.74f, 0f, -4.03f, 3.89f, -4.5f, 9.09f)
                curveToRelative(-0.05f, 0.55f, -0.53f, 0.95f, -1.09f, 0.91f)
                curveToRelative(-0.55f, -0.05f, -0.95f, -0.54f, -0.91f, -1.09f)
                curveTo(0.49f, 8.55f, 3.06f, 3f, 6.5f, 3f)
                curveToRelative(4.08f, 0f, 5.63f, 5.68f, 6.46f, 8.74f)
                curveToRelative(1.03f, 3.77f, 2.29f, 7.26f, 4.54f, 7.26f)
                curveToRelative(1.74f, 0f, 4.03f, -3.89f, 4.5f, -9.09f)
                curveToRelative(0.05f, -0.55f, 0.52f, -0.95f, 1.09f, -0.91f)
                curveToRelative(0.55f, 0.05f, 0.95f, 0.54f, 0.91f, 1.09f)
                curveToRelative(-0.49f, 5.36f, -3.05f, 10.91f, -6.5f, 10.91f)
                close()
            }
        }.also { _WaveSine = it}
