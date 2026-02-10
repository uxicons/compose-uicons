package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Starfighter: ImageVector? = null

val Icons.Sr.Starfighter: ImageVector
    get() = _Starfighter ?: UXIcon(name = "Starfighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                arcToRelative(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.22f, 0.77f)
                curveTo(10f, -1.91f, 14f, -1.9f, 15.22f, 5.77f)
                arcTo(6.93f, 6.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 5f)
                close()
                moveTo(12f, 7f)
                arcTo(5.13f, 5.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.39f, 8.5f)
                curveTo(8.01f, 11.85f, 8f, 14.93f, 8f, 15f)
                verticalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(10f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(16f, 15f)
                curveToRelative(0f, -0.07f, -0.01f, -3.15f, -0.39f, -6.5f)
                arcTo(5.13f, 5.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7f)
                close()
                moveTo(23f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(7f)
                lineTo(18f, 14f)
                verticalLineToRelative(9.41f)
                lineTo(22f, 18f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(24f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 6f)
                close()
                moveTo(2f, 7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                lineTo(0f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(2f, 18f)
                lineToRelative(4f, 5.41f)
                lineTo(6f, 14f)
                lineTo(2f, 14f)
                close()
            }
        }.also { _Starfighter = it}
