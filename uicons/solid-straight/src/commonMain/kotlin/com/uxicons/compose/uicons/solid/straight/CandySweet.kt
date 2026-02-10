package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandySweet: ImageVector? = null

val Icons.Ss.CandySweet: ImageVector
    get() = _CandySweet ?: UXIcon(name = "CandySweet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.09f, 6.49f)
                lineToRelative(-12.61f, 12.61f)
                curveToRelative(-0.59f, -0.46f, -1.12f, -0.99f, -1.58f, -1.59f)
                lineToRelative(12.61f, -12.61f)
                curveToRelative(0.59f, 0.46f, 1.12f, 0.99f, 1.58f, 1.59f)
                close()
                moveTo(3.83f, 15.75f)
                lineTo(15.76f, 3.82f)
                curveToRelative(-1.14f, -0.53f, -2.42f, -0.83f, -3.76f, -0.83f)
                curveToRelative(-4.4f, 0f, -8.07f, 3.18f, -8.84f, 7.36f)
                lineTo(0.5f, 8.0f)
                reflectiveCurveToRelative(-0.5f, 1.5f, -0.5f, 4f)
                reflectiveCurveToRelative(0.5f, 4f, 0.5f, 4f)
                lineToRelative(2.66f, -2.36f)
                curveToRelative(0.14f, 0.74f, 0.37f, 1.45f, 0.68f, 2.12f)
                close()
                moveTo(23.5f, 8.0f)
                lineToRelative(-2.66f, 2.36f)
                curveToRelative(-0.14f, -0.74f, -0.37f, -1.45f, -0.68f, -2.12f)
                lineToRelative(-11.93f, 11.93f)
                curveToRelative(1.14f, 0.53f, 2.42f, 0.83f, 3.76f, 0.83f)
                curveToRelative(4.4f, 0f, 8.07f, -3.18f, 8.84f, -7.36f)
                lineToRelative(2.66f, 2.36f)
                reflectiveCurveToRelative(0.5f, -1.5f, 0.5f, -4f)
                reflectiveCurveToRelative(-0.5f, -4f, -0.5f, -4f)
                close()
            }
        }.also { _CandySweet = it}
