package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Car: ImageVector? = null

val Icons.Rr.Car: ImageVector
    get() = _Car ?: UXIcon(name = "Car") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.9f, 4.29f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.2f, 1f)
                lineTo(7.8f, 1f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.1f, 4.29f)
                lineTo(0.4f, 11.72f)
                arcTo(6.66f, 6.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14f)
                verticalLineToRelative(1f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3.98f)
                curveToRelative(0f, 0.01f, 0f, 0.01f, 0f, 0.02f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                lineTo(8f, 20f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                lineTo(22f, 19f)
                curveToRelative(0f, -0.01f, 0f, -0.01f, 0f, -0.02f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 15f)
                lineTo(24f, 14f)
                arcToRelative(6.65f, 6.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.4f, -2.28f)
                close()
                moveTo(4.98f, 4.97f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.8f, 3f)
                horizontalLineToRelative(8.4f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.82f, 1.98f)
                lineTo(21.21f, 11f)
                lineTo(2.79f, 11f)
                close()
                moveTo(6f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(4f, 19.9f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20f)
                lineTo(6f, 20f)
                close()
                moveTo(20f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(18f, 20f)
                horizontalLineToRelative(1f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -0.1f)
                close()
                moveTo(22f, 15f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(5f, 18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(2f, 14f)
                arcToRelative(4.66f, 4.66f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.12f, -1f)
                lineTo(4f, 13f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(6f, 13f)
                lineTo(18f, 13f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(20f, 13f)
                horizontalLineToRelative(1.88f)
                arcTo(4.65f, 4.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 14f)
                close()
            }
        }.also { _Car = it}
