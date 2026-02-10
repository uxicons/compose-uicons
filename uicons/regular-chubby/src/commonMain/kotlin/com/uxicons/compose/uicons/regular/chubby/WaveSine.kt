package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WaveSine: ImageVector? = null

val Icons.Rc.WaveSine: ImageVector
    get() = _WaveSine ?: UXIcon(name = "WaveSine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 21f)
                curveToRelative(-4.99f, 0f, -5.85f, -4.79f, -6.04f, -8.95f)
                curveToRelative(-0.3f, -6.5f, -2.2f, -7.05f, -3.96f, -7.05f)
                curveToRelative(-1.94f, 0f, -4f, 0.69f, -4f, 9f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -5.44f, 0.71f, -11f, 6f, -11f)
                curveToRelative(4.91f, 0f, 5.76f, 4.79f, 5.96f, 8.95f)
                curveToRelative(0.28f, 6.19f, 2.11f, 7.05f, 4.04f, 7.05f)
                reflectiveCurveToRelative(4f, -0.69f, 4f, -9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 5.44f, -0.71f, 11f, -6f, 11f)
                close()
            }
        }.also { _WaveSine = it}
