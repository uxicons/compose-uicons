package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAverage: ImageVector? = null

val Icons.Br.TachometerAverage: ImageVector
    get() = _TachometerAverage ?: UXIcon(name = "TachometerAverage") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 13f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3.5f, -1.32f)
            lineTo(10.5f, 7.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            verticalLineToRelative(4.18f)
            arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
            close()
            moveTo(20f, 4.06f)
            arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.46f, 21.43f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.75f, 0.26f)
            lineTo(9.46f, 20.66f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.91f, -2.31f)
            lineTo(6.3f, 19.38f)
            arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, -0.06f)
            arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12.79f, 0.01f)
            arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.7f, 0.06f)
            lineToRelative(-1.28f, -1.04f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.89f, 2.33f)
            lineToRelative(1.28f, 1.04f)
            arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.72f, -0.28f)
            arcTo(12.06f, 12.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 4.06f)
            close()
        }
    }.also { _TachometerAverage = it }
