package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveSine: ImageVector? = null

val Icons.Tc.WaveSine: ImageVector
    get() = _WaveSine ?: UXIcon(name = "WaveSine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 21f)
                curveToRelative(-3.85f, 0f, -5.77f, -2.85f, -6.04f, -8.98f)
                curveToRelative(-0.32f, -7.11f, -2.82f, -8.02f, -4.96f, -8.02f)
                curveToRelative(-2.78f, 0f, -4.41f, 1.56f, -4.5f, 9.51f)
                curveToRelative(-0.0f, 0.27f, -0.23f, 0.49f, -0.5f, 0.49f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.28f, -0.0f, -0.5f, -0.23f, -0.49f, -0.51f)
                curveToRelative(0.07f, -6.48f, 1.02f, -10.49f, 5.5f, -10.49f)
                curveToRelative(3.78f, 0f, 5.68f, 2.85f, 5.96f, 8.98f)
                curveToRelative(0.32f, 7.11f, 2.87f, 8.02f, 5.04f, 8.02f)
                curveToRelative(2.78f, 0f, 4.41f, -1.56f, 4.5f, -9.51f)
                curveToRelative(0.0f, -0.27f, 0.23f, -0.49f, 0.5f, -0.49f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.23f, 0.49f, 0.51f)
                curveToRelative(-0.07f, 6.48f, -1.02f, 10.49f, -5.5f, 10.49f)
                close()
            }
        }.also { _WaveSine = it}
