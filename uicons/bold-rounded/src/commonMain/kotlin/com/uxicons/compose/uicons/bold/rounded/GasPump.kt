package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPump: ImageVector? = null

val Icons.Br.GasPump: ImageVector
    get() = _GasPump ?: UXIcon(name = "GasPump") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.53f, 2.47f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 0f)
            lineTo(18.44f, 5.44f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 6.5f)
            verticalLineToRelative(11f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.5f, 0.5f)
            lineTo(16f, 18f)
            lineTo(16f, 5.5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 0f)
            horizontalLineToRelative(-5f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.5f)
            verticalLineToRelative(13f)
            arcTo(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 24f)
            horizontalLineToRelative(5f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.9f, -3.01f)
            curveToRelative(0.03f, 0f, 0.07f, 0.01f, 0.1f, 0.01f)
            horizontalLineToRelative(2f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 17.5f)
            lineTo(21f, 7.12f)
            lineToRelative(2.53f, -2.53f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.53f, 2.47f)
            close()
            moveTo(5.5f, 3f)
            horizontalLineToRelative(5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 5.5f)
            lineTo(13f, 9f)
            lineTo(10.82f, 9f)
            arcToRelative(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.52f, -0.91f)
            lineToRelative(0.49f, -0.82f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.21f, 5.73f)
            lineToRelative(-0.8f, 1.33f)
            arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.18f, 9f)
            lineTo(3f, 9f)
            lineTo(3f, 5.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 3f)
            close()
            moveTo(10.5f, 21f)
            horizontalLineToRelative(-5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 18.5f)
            lineTo(3f, 12f)
            lineTo(13f, 12f)
            verticalLineToRelative(6.5f)
            arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 21f)
            close()
        }
    }.also { _GasPump = it }
