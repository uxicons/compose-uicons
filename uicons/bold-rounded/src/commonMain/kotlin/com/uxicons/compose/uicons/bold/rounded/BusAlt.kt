package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusAlt: ImageVector? = null

val Icons.Br.BusAlt: ImageVector
    get() = _BusAlt ?: UXIcon(name = "BusAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 10f)
            lineTo(22f, 5.94f)
            arcTo(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.09f, 0.79f)
            arcToRelative(23.81f, 23.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.17f, 0f)
            arcTo(5.38f, 5.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 5.94f)
            lineTo(2f, 10f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
            verticalLineToRelative(1f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
            verticalLineToRelative(1.5f)
            arcToRelative(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4.24f)
            lineTo(4f, 22f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
            horizontalLineToRelative(8f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
            lineTo(20f, 20.74f)
            arcTo(5.49f, 5.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16.5f)
            lineTo(22f, 15f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
            lineTo(24f, 12f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 10f)
            close()
            moveTo(5f, 12f)
            lineTo(5f, 6f)
            lineTo(8.5f, 6f)
            arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 4f)
            horizontalLineToRelative(3f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5.5f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 0.5f)
            lineTo(19f, 6f)
            verticalLineToRelative(6f)
            close()
            moveTo(7.5f, 19f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 16.5f)
            lineTo(5f, 15f)
            lineTo(7f, 15f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(10f, 15f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(17f, 15f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(1.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 19f)
            close()
        }
    }.also { _BusAlt = it }
