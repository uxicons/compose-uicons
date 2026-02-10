package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveSine: ImageVector? = null

val Icons.Ts.WaveSine: ImageVector
    get() = _WaveSine ?: UXIcon(name = "WaveSine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 21f)
                curveToRelative(-3.69f, 0f, -5.47f, -5.06f, -6.48f, -8.87f)
                curveToRelative(-1.46f, -5.47f, -3.27f, -8.13f, -5.52f, -8.13f)
                curveToRelative(-2.9f, 0f, -5f, 4.21f, -5f, 10f)
                horizontalLineTo(0f)
                curveTo(0f, 7.52f, 2.47f, 3f, 6f, 3f)
                curveToRelative(3.69f, 0f, 5.47f, 5.06f, 6.48f, 8.87f)
                curveToRelative(1.46f, 5.47f, 3.27f, 8.13f, 5.52f, 8.13f)
                curveToRelative(2.9f, 0f, 5f, -4.21f, 5f, -10f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 6.48f, -2.47f, 11f, -6f, 11f)
                close()
            }
        }.also { _WaveSine = it}
