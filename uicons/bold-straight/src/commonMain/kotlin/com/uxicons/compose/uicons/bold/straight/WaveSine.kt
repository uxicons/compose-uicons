package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveSine: ImageVector? = null

val Icons.Bs.WaveSine: ImageVector
    get() = _WaveSine ?: UXIcon(name = "WaveSine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 21f)
                curveToRelative(-4.71f, 0f, -6.4f, -6.49f, -6.95f, -8.62f)
                curveToRelative(-0.76f, -2.91f, -2.07f, -6.38f, -4.05f, -6.38f)
                curveToRelative(-1.74f, 0f, -3.5f, 2.75f, -3.5f, 8f)
                horizontalLineTo(0f)
                curveTo(0f, 7.42f, 2.61f, 3f, 6.5f, 3f)
                curveToRelative(4.71f, 0f, 6.4f, 6.49f, 6.95f, 8.62f)
                curveToRelative(0.76f, 2.91f, 2.07f, 6.38f, 4.05f, 6.38f)
                curveToRelative(1.74f, 0f, 3.5f, -2.75f, 3.5f, -8f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 6.58f, -2.61f, 11f, -6.5f, 11f)
                close()
            }
        }.also { _WaveSine = it}
