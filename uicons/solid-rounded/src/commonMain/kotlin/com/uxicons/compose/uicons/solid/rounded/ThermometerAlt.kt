package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerAlt: ImageVector? = null

val Icons.Sr.ThermometerAlt: ImageVector
    get() = _ThermometerAlt ?: UXIcon(name = "ThermometerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.41f, 1.41f)
                curveToRelative(-1.99f, -1.89f, -5.19f, -1.7f, -7.13f, 0.24f)
                lineToRelative(-1.08f, 1.08f)
                lineToRelative(2.61f, 2.61f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.61f, -2.61f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(2.61f, 2.61f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.61f, -2.61f)
                lineToRelative(-2.23f, 2.23f)
                lineToRelative(2.61f, 2.61f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                reflectiveCurveToRelative(-1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-2.61f, -2.61f)
                lineToRelative(-1.25f, 1.25f)
                curveToRelative(-1.6f, 1.6f, -1.28f, 5.22f, -1.07f, 6.72f)
                lineToRelative(-2.83f, 2.83f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                horizontalLineTo(0.29f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(2.84f, -2.83f)
                curveToRelative(0.57f, 0.08f, 1.45f, 0.18f, 2.41f, 0.18f)
                curveToRelative(1.56f, 0f, 3.33f, -0.26f, 4.32f, -1.25f)
                curveToRelative(0f, 0f, 8.44f, -8.44f, 11.09f, -11.09f)
                curveToRelative(0.85f, -0.85f, 1.46f, -1.95f, 1.59f, -3.15f)
                curveToRelative(0.16f, -1.58f, -0.4f, -3.09f, -1.53f, -4.17f)
                close()
            }
        }.also { _ThermometerAlt = it}
