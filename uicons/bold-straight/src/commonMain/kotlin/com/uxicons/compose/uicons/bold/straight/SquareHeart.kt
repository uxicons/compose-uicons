package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareHeart: ImageVector? = null

val Icons.Bs.SquareHeart: ImageVector
    get() = _SquareHeart ?: UXIcon(name = "SquareHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10.7f)
                curveToRelative(0f, 2.83f, -5f, 6.3f, -5f, 6.3f)
                curveToRelative(0f, 0f, -5f, -3.47f, -5f, -6.3f)
                curveToRelative(0f, -1.49f, 1.12f, -2.7f, 2.5f, -2.7f)
                reflectiveCurveToRelative(2.5f, 0.96f, 2.5f, 2.45f)
                curveToRelative(0f, -1.49f, 1.12f, -2.45f, 2.5f, -2.45f)
                reflectiveCurveToRelative(2.5f, 1.21f, 2.5f, 2.7f)
                close()
                moveTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3.5f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                close()
            }
        }.also { _SquareHeart = it}
