package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Caravan: ImageVector? = null

val Icons.Br.Caravan: ImageVector
    get() = _Caravan ?: UXIcon(name = "Caravan") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 19.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22.5f, 21f)
            lineTo(16f, 21f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
            lineTo(13f, 8.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 7f)
            horizontalLineToRelative(2f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 8.5f)
            lineTo(18f, 18f)
            horizontalLineToRelative(2f)
            lineTo(20f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 3f)
            lineTo(5.5f, 3f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.5f)
            lineTo(3f, 16f)
            arcToRelative(1.77f, 1.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.53f, 1.34f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.07f, 2.18f)
            arcTo(4.72f, 4.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 16f)
            lineTo(0f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 0f)
            horizontalLineToRelative(12f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 5.5f)
            lineTo(23f, 18.09f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 19.5f)
            close()
            moveTo(8.5f, 17f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 17f)
            close()
            moveTo(9.5f, 12f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 10.5f)
            verticalLineToRelative(-2f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 7f)
            horizontalLineToRelative(-3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 8.5f)
            verticalLineToRelative(2f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 12f)
            close()
        }
    }.also { _Caravan = it }
