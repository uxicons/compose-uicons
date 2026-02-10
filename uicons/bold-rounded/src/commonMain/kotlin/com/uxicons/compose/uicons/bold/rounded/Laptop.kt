package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Laptop: ImageVector? = null

val Icons.Br.Laptop: ImageVector
    get() = _Laptop ?: UXIcon(name = "Laptop") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 15f)
            lineTo(22f, 8.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 3f)
            horizontalLineToRelative(-9f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 8.5f)
            lineTo(2f, 15f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
            verticalLineToRelative(1.15f)
            arcTo(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.85f, 20f)
            lineTo(22.15f, 20f)
            arcTo(1.85f, 1.85f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.15f)
            lineTo(24f, 17f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 15f)
            close()
            moveTo(14.77f, 16f)
            lineTo(9.23f, 16f)
            lineToRelative(-0.92f, -1f)
            lineTo(5f, 15f)
            lineTo(5f, 8.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 6f)
            horizontalLineToRelative(9f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 8.5f)
            lineTo(19f, 15f)
            lineTo(15.69f, 15f)
            close()
        }
    }.also { _Laptop = it }
