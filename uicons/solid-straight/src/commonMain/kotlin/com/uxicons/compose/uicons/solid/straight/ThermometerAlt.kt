package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerAlt: ImageVector? = null

val Icons.Ss.ThermometerAlt: ImageVector
    get() = _ThermometerAlt ?: UXIcon(name = "ThermometerAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.54f, 1.47f)
                curveToRelative(-1.95f, -1.95f, -5.12f, -1.95f, -7.07f, 0f)
                lineToRelative(-1.23f, 1.23f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(-2.23f, 2.23f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(-1.25f, 1.25f)
                curveToRelative(-1.6f, 1.6f, -1.28f, 5.22f, -1.07f, 6.72f)
                lineTo(0.03f, 22.55f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.13f, -3.13f)
                curveToRelative(0.57f, 0.08f, 1.45f, 0.18f, 2.41f, 0.18f)
                curveToRelative(1.56f, 0f, 3.33f, -0.26f, 4.32f, -1.25f)
                lineToRelative(11.24f, -11.24f)
                curveToRelative(0.94f, -0.94f, 1.46f, -2.2f, 1.46f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.46f, -3.54f)
                close()
            }
        }.also { _ThermometerAlt = it}
