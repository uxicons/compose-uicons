package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subway: ImageVector? = null

val Icons.Br.Subway: ImageVector
    get() = _Subway ?: UXIcon(name = "Subway") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 0f)
            horizontalLineToRelative(-9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.5f)
            verticalLineToRelative(9f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.52f, 5.13f)
            lineTo(4.23f, 21.7f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.77f, 23.3f)
            lineTo(8.83f, 20f)
            horizontalLineToRelative(6.34f)
            lineToRelative(2.06f, 3.3f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.54f, -1.59f)
            lineToRelative(-1.29f, -2.07f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 14.5f)
            verticalLineToRelative(-9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 0f)
            close()
            moveTo(13.5f, 10f)
            lineTo(13.5f, 5f)
            horizontalLineToRelative(5.45f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.05f, 0.5f)
            lineTo(19f, 10f)
            close()
            moveTo(5f, 10f)
            lineTo(5f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.05f, 5f)
            lineTo(10.5f, 5f)
            verticalLineToRelative(5f)
            close()
            moveTo(16.5f, 17f)
            horizontalLineToRelative(-9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 14.5f)
            lineTo(5f, 13f)
            lineTo(7f, 13f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(10f, 13f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(17f, 13f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(1.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 17f)
            close()
        }
    }.also { _Subway = it }
