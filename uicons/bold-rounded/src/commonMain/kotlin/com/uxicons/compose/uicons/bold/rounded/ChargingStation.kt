package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChargingStation: ImageVector? = null

val Icons.Br.ChargingStation: ImageVector
    get() = _ChargingStation ?: UXIcon(name = "ChargingStation") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.75f, 10.11f)
            arcToRelative(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.1f, 2.16f)
            lineTo(8.78f, 15.29f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.55f, -1.58f)
            lineTo(7.29f, 12f)
            horizontalLineToRelative(-0.17f)
            arcTo(2.12f, 2.12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.09f, 9.27f)
            curveToRelative(0.04f, -0.12f, 2.13f, -3.56f, 2.13f, -3.56f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 9.78f, 7.29f)
            lineTo(8.72f, 9f)
            lineTo(8.9f, 9f)
            arcTo(2.1f, 2.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.75f, 10.11f)
            close()
            moveTo(24f, 3.5f)
            lineTo(24f, 6f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2.83f)
            lineTo(22f, 16.5f)
            arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 21f)
            lineTo(15.4f, 21f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.9f, 3f)
            horizontalLineToRelative(-5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 18.5f)
            lineTo(0f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 0f)
            horizontalLineToRelative(5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 5.5f)
            lineTo(16f, 18f)
            horizontalLineToRelative(1.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 16.5f)
            lineTo(19f, 8.83f)
            arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 6f)
            lineTo(17f, 3.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
            lineTo(20f, 4f)
            horizontalLineToRelative(1f)
            lineTo(21f, 3.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 3.5f)
            close()
            moveTo(13f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 3f)
            horizontalLineToRelative(-5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 21f)
            horizontalLineToRelative(5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 18.5f)
            close()
        }
    }.also { _ChargingStation = it }
