package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD4: ImageVector? = null

val Icons.Br.DiceD4: ImageVector
    get() = _DiceD4 ?: UXIcon(name = "DiceD4") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.22f, 12.61f)
            reflectiveCurveTo(15.42f, 1.66f, 15.4f, 1.63f)
            arcToRelative(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.86f, 0.07f)
            lineTo(0.77f, 12.63f)
            arcToRelative(4.34f, 4.34f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.02f, 6f)
            curveToRelative(0.03f, 0.02f, 7.42f, 4.58f, 7.42f, 4.58f)
            arcToRelative(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.59f, 0f)
            reflectiveCurveToRelative(7.38f, -4.56f, 7.41f, -4.58f)
            arcTo(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.22f, 12.61f)
            close()
            moveTo(3.52f, 16.17f)
            arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.3f, -1.82f)
            lineTo(10.5f, 4.12f)
            lineTo(10.5f, 20.48f)
            close()
            moveTo(20.47f, 16.17f)
            lineTo(13.5f, 20.48f)
            lineTo(13.5f, 4.13f)
            lineToRelative(7.26f, 10.2f)
            arcTo(1.36f, 1.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.48f, 16.17f)
            close()
        }
    }.also { _DiceD4 = it }
