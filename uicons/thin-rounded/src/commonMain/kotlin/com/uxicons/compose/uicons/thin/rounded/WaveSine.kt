package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveSine: ImageVector? = null

val Icons.Tr.WaveSine: ImageVector
    get() = _WaveSine ?: UXIcon(name = "WaveSine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.75f, 21f)
                curveToRelative(-3.85f, 0f, -5.4f, -5.77f, -6.23f, -8.87f)
                curveToRelative(-1.13f, -4.22f, -2.55f, -8.13f, -5.27f, -8.13f)
                curveToRelative(-2.12f, 0f, -4.72f, 3.65f, -5.25f, 9.54f)
                curveToRelative(-0.03f, 0.28f, -0.28f, 0.47f, -0.54f, 0.45f)
                curveToRelative(-0.27f, -0.02f, -0.48f, -0.27f, -0.45f, -0.54f)
                curveTo(0.54f, 7.5f, 3.22f, 3f, 6.25f, 3f)
                curveToRelative(3.85f, 0f, 5.4f, 5.77f, 6.23f, 8.87f)
                curveToRelative(1.13f, 4.22f, 2.55f, 8.13f, 5.27f, 8.13f)
                curveToRelative(2.12f, 0f, 4.72f, -3.65f, 5.25f, -9.54f)
                curveToRelative(0.02f, -0.28f, 0.27f, -0.49f, 0.54f, -0.45f)
                curveToRelative(0.27f, 0.02f, 0.48f, 0.27f, 0.45f, 0.54f)
                curveToRelative(-0.53f, 5.96f, -3.22f, 10.46f, -6.25f, 10.46f)
                close()
            }
        }.also { _WaveSine = it}
