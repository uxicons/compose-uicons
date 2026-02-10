package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveSine: ImageVector? = null

val Icons.Rs.WaveSine: ImageVector
    get() = _WaveSine ?: UXIcon(name = "WaveSine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.76f, 21f)
                curveToRelative(-4.5f, 0f, -6.18f, -6.59f, -6.73f, -8.75f)
                curveToRelative(-1.23f, -4.81f, -2.84f, -7.25f, -4.79f, -7.25f)
                curveToRelative(-2.5f, 0f, -4.24f, 3.7f, -4.24f, 9f)
                horizontalLineTo(0f)
                curveTo(0f, 7.32f, 2.45f, 3f, 6.24f, 3f)
                curveToRelative(4.5f, 0f, 6.18f, 6.59f, 6.73f, 8.75f)
                curveToRelative(1.23f, 4.81f, 2.84f, 7.25f, 4.79f, 7.25f)
                curveToRelative(2.5f, 0f, 4.24f, -3.7f, 4.24f, -9f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 6.68f, -2.45f, 11f, -6.24f, 11f)
                close()
            }
        }.also { _WaveSine = it}
