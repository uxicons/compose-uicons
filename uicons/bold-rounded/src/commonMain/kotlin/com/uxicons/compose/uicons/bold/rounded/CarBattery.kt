package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBattery: ImageVector? = null

val Icons.Br.CarBattery: ImageVector
    get() = _CarBattery ?: UXIcon(name = "CarBattery") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 12.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 14f)
            horizontalLineToRelative(-4f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -3f)
            horizontalLineToRelative(4f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 12.5f)
            close()
            moveTo(18.5f, 11f)
            lineTo(18f, 11f)
            verticalLineToRelative(-0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            lineTo(15f, 11f)
            horizontalLineToRelative(-0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
            lineTo(15f, 14f)
            verticalLineToRelative(0.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 0f)
            lineTo(18f, 14f)
            horizontalLineToRelative(0.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 11f)
            close()
            moveTo(24f, 9.5f)
            verticalLineToRelative(7f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 22f)
            lineTo(5.5f, 22f)
            curveTo(2.31f, 22f, 0f, 19.9f, 0f, 17f)
            lineTo(0f, 9.5f)
            arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 5.26f)
            lineTo(3f, 4.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 2f)
            horizontalLineToRelative(3f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 4.5f)
            lineTo(11f, 5f)
            horizontalLineToRelative(2f)
            lineTo(13f, 4.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 2f)
            horizontalLineToRelative(3f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 4.5f)
            verticalLineToRelative(0.76f)
            arcTo(4.51f, 4.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 9.5f)
            close()
            moveTo(21f, 9.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 6.5f)
            lineTo(18f, 5f)
            lineTo(16f, 5f)
            lineTo(16f, 6.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 8f)
            horizontalLineToRelative(-5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 6.5f)
            lineTo(8f, 5f)
            lineTo(6f, 5f)
            lineTo(6f, 6.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 8f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9.5f)
            lineTo(3f, 17f)
            curveToRelative(0f, 1.9f, 2.08f, 2f, 2.5f, 2f)
            horizontalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 16.5f)
            close()
        }
    }.also { _CarBattery = it }
