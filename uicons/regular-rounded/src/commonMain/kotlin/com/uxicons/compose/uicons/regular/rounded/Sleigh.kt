package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sleigh: ImageVector? = null

val Icons.Rr.Sleigh: ImageVector
    get() = _Sleigh ?: UXIcon(name = "Sleigh") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 17f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                lineTo(24f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                lineTo(13.25f, 9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.91f, -2.27f)
                lineTo(9.85f, 4.79f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 1f)
                lineTo(4f, 1f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5f)
                verticalLineToRelative(7f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(6f, 17f)
                verticalLineToRelative(4f)
                lineTo(1f, 21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(20f, 23f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineTo(18f, 21f)
                lineTo(18f, 17f)
                close()
                moveTo(2f, 12f)
                lineTo(2f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                lineTo(5f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.91f, 5.27f)
                lineTo(8.4f, 7.21f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.25f, 11f)
                lineTo(18f, 11f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 3f)
                lineTo(5f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                close()
                moveTo(16f, 21f)
                lineTo(8f, 21f)
                lineTo(8f, 17f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _Sleigh = it}
