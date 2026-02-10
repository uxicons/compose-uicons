package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hastag: ImageVector? = null

val Icons.Br.Hastag: ImageVector
    get() = _Hastag ?: UXIcon(name = "Hastag") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(18.87f, 6f)
            lineToRelative(0.61f, -4.29f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.97f, -0.42f)
            lineTo(15.84f, 6f)
            lineTo(9.87f, 6f)
            lineToRelative(0.61f, -4.29f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2.97f, -0.42f)
            lineTo(6.84f, 6f)
            lineTo(2.5f, 6f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(6.41f, 9f)
            lineToRelative(-0.86f, 6f)
            lineTo(1.5f, 15f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(5.13f, 18f)
            lineToRelative(-0.61f, 4.29f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.97f, 0.42f)
            lineTo(8.16f, 18f)
            horizontalLineToRelative(5.97f)
            lineToRelative(-0.61f, 4.29f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.97f, 0.42f)
            lineTo(17.16f, 18f)
            lineTo(21.5f, 18f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            lineTo(17.59f, 15f)
            lineToRelative(0.86f, -6f)
            close()
            moveTo(14.56f, 15f)
            lineTo(8.59f, 15f)
            lineToRelative(0.86f, -6f)
            horizontalLineToRelative(5.97f)
            close()
        }
    }.also { _Hastag = it }
