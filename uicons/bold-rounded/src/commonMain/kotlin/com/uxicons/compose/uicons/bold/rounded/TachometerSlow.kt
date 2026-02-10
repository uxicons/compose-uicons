package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerSlow: ImageVector? = null

val Icons.Br.TachometerSlow: ImageVector
    get() = _TachometerSlow ?: UXIcon(name = "TachometerSlow") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.54f, 21.43f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.75f, 0.26f)
            lineToRelative(-1.24f, -1.03f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.91f, -2.31f)
            lineTo(17.7f, 19.37f)
            arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, -0.06f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -12.79f, 0.01f)
            arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, 0.06f)
            lineToRelative(1.28f, -1.04f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.89f, 2.33f)
            lineTo(8.2f, 21.72f)
            arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.72f, -0.27f)
            arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.9f, -20.37f)
            arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.15f, 20.35f)
            close()
            moveTo(12.13f, 11.04f)
            lineTo(9.56f, 8.48f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.44f, 10.6f)
            lineTo(10f, 13.16f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.12f, -2.12f)
            close()
        }
    }.also { _TachometerSlow = it }
