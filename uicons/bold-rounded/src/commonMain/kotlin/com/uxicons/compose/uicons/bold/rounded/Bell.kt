package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bell: ImageVector? = null

val Icons.Br.Bell: ImageVector
    get() = _Bell ?: UXIcon(name = "Bell") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.55f, 13.21f)
            lineTo(20.8f, 6.92f)
            arcTo(9.44f, 9.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.49f, 7.4f)
            lineTo(1.13f, 13.49f)
            arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 20.18f)
            horizontalLineToRelative(0.4f)
            arcToRelative(5.29f, 5.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.15f, 0f)
            horizontalLineToRelative(0.19f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.3f, -6.97f)
            close()
            moveTo(19.24f, 16.19f)
            arcToRelative(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.99f, 0.99f)
            lineTo(6.5f, 17.18f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.44f, -3.04f)
            lineToRelative(1.35f, -6.1f)
            arcToRelative(6.44f, 6.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.5f, -0.33f)
            lineToRelative(1.75f, 6.29f)
            arcTo(2.48f, 2.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.24f, 16.19f)
            close()
        }
    }.also { _Bell = it }
