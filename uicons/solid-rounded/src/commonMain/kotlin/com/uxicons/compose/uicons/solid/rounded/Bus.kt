package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bus: ImageVector? = null

val Icons.Sr.Bus: ImageVector
    get() = _Bus ?: UXIcon(name = "Bus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                lineTo(0f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 9f)
                lineTo(2f, 6f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(8f)
                close()
                moveTo(18.35f, 0.83f)
                arcToRelative(24.74f, 24.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.7f, 0f)
                arcTo(5.06f, 5.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.29f, 4f)
                lineTo(21.71f, 4f)
                arcTo(5.06f, 5.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.35f, 0.83f)
                close()
                moveTo(18f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(16f, 16f)
                lineTo(8f, 16f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(6f, 16f)
                lineTo(2f, 16f)
                verticalLineToRelative(1f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 3.98f)
                lineTo(4f, 21.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0.5f)
                horizontalLineToRelative(6.1f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 21.5f)
                verticalLineToRelative(-0.53f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 17f)
                lineTo(22f, 16f)
                lineTo(18f, 16f)
                close()
                moveTo(22f, 9f)
                lineTo(22f, 6f)
                lineTo(13f, 6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                lineTo(24f, 11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 9f)
                close()
            }
        }.also { _Bus = it}
