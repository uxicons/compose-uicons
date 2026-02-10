package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Starfighter: ImageVector? = null

val Icons.Br.Starfighter: ImageVector
    get() = _Starfighter ?: UXIcon(name = "Starfighter") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 6f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 7.5f)
            lineTo(21f, 13f)
            lineTo(16.86f, 13f)
            curveToRelative(-0.8f, -17.41f, -8.92f, -17.38f, -9.71f, 0f)
            lineTo(3f, 13f)
            lineTo(3f, 7.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 0f)
            verticalLineToRelative(12f)
            arcToRelative(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.73f, 0.85f)
            lineToRelative(2.9f, 2.9f)
            arcTo(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.94f, 22f)
            horizontalLineToRelative(4.12f)
            arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.31f, 1.25f)
            lineToRelative(2.9f, -2.9f)
            arcTo(1.51f, 1.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 19.5f)
            lineTo(24f, 7.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.5f, 6f)
            close()
            moveTo(10f, 17.25f)
            arcTo(53.31f, 53.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.24f, 5.58f)
            arcToRelative(3.79f, 3.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.52f, 0f)
            arcTo(53.31f, 53.31f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 17.25f)
            lineTo(14f, 19f)
            lineTo(10f, 19f)
            close()
            moveTo(3f, 16.38f)
            lineTo(3f, 16f)
            lineTo(7.02f, 16f)
            curveTo(7f, 16.59f, 7f, 17.03f, 7f, 17.25f)
            verticalLineToRelative(3.13f)
            close()
            moveTo(17f, 20.38f)
            lineTo(17f, 17.25f)
            curveToRelative(0f, -0.22f, 0f, -0.66f, -0.02f, -1.25f)
            lineTo(21f, 16f)
            verticalLineToRelative(0.38f)
            close()
        }
    }.also { _Starfighter = it }
