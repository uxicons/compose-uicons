package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandySweet: ImageVector? = null

val Icons.Sr.CandySweet: ImageVector
    get() = _CandySweet ?: UXIcon(name = "CandySweet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.09f, 6.49f)
                lineToRelative(-12.61f, 12.61f)
                curveToRelative(-0.59f, -0.46f, -1.12f, -0.99f, -1.58f, -1.59f)
                lineToRelative(12.61f, -12.61f)
                curveToRelative(0.59f, 0.46f, 1.12f, 0.99f, 1.58f, 1.59f)
                close()
                moveTo(3.83f, 15.75f)
                lineTo(15.76f, 3.83f)
                curveToRelative(-1.14f, -0.53f, -2.42f, -0.83f, -3.76f, -0.83f)
                curveToRelative(-4.4f, 0f, -8.07f, 3.18f, -8.84f, 7.36f)
                lineToRelative(-1.39f, -1.23f)
                curveToRelative(-0.59f, -0.52f, -1.52f, -0.18f, -1.62f, 0.59f)
                curveToRelative(-0.08f, 0.61f, -0.15f, 1.38f, -0.15f, 2.28f)
                reflectiveCurveToRelative(0.06f, 1.66f, 0.15f, 2.28f)
                curveToRelative(0.1f, 0.78f, 1.04f, 1.11f, 1.62f, 0.59f)
                lineToRelative(1.39f, -1.23f)
                curveToRelative(0.14f, 0.74f, 0.37f, 1.45f, 0.68f, 2.12f)
                close()
                moveTo(22.23f, 9.13f)
                lineToRelative(-1.39f, 1.23f)
                curveToRelative(-0.14f, -0.74f, -0.37f, -1.45f, -0.68f, -2.12f)
                lineToRelative(-11.93f, 11.93f)
                curveToRelative(1.14f, 0.53f, 2.42f, 0.83f, 3.76f, 0.83f)
                curveToRelative(4.4f, 0f, 8.07f, -3.18f, 8.84f, -7.36f)
                lineToRelative(1.39f, 1.23f)
                curveToRelative(0.59f, 0.52f, 1.52f, 0.18f, 1.62f, -0.59f)
                curveToRelative(0.08f, -0.62f, 0.15f, -1.38f, 0.15f, -2.28f)
                reflectiveCurveToRelative(-0.06f, -1.66f, -0.15f, -2.28f)
                curveToRelative(-0.1f, -0.78f, -1.04f, -1.11f, -1.62f, -0.59f)
                close()
            }
        }.also { _CandySweet = it}
