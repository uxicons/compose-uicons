package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerFast: ImageVector? = null

val Icons.Br.TachometerFast: ImageVector
    get() = _TachometerFast ?: UXIcon(name = "TachometerFast") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 12.96f)
            arcTo(11.9f, 11.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.52f, 21.4f)
            arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.72f, 0.28f)
            lineToRelative(-1.28f, -1.04f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.89f, -2.33f)
            lineToRelative(1.28f, 1.04f)
            arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, -0.06f)
            arcTo(9.04f, 9.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 6.25f)
            arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.6f, 19.28f)
            arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.7f, 0.06f)
            lineToRelative(1.24f, -1.03f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.91f, 2.31f)
            lineTo(8.21f, 21.64f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.75f, -0.26f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12.96f)
            close()
            moveTo(16.56f, 10.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineTo(11.88f, 11f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 14f, 13.12f)
            close()
        }
    }.also { _TachometerFast = it }
