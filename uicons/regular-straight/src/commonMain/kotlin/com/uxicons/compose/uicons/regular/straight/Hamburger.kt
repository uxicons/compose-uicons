package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hamburger: ImageVector? = null

val Icons.Rs.Hamburger: ImageVector
    get() = _Hamburger ?: UXIcon(name = "Hamburger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14.01f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -2.22f)
                lineTo(23f, 9f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9f, -9f)
                lineTo(10f, 0f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 9f)
                verticalLineToRelative(2.79f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 2.22f)
                verticalLineToRelative(0.17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 2.25f)
                lineTo(1f, 20f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                lineTo(19f, 24f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, -4f)
                lineTo(23f, 16.23f)
                arcTo(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 14.01f)
                close()
                moveTo(3f, 9f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, -7f)
                horizontalLineToRelative(4f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 7f)
                verticalLineToRelative(2.01f)
                lineTo(3f, 11.01f)
                close()
                moveTo(21f, 15.01f)
                lineTo(17f, 15.01f)
                arcToRelative(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.21f, 2.7f)
                arcToRelative(1.19f, 1.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.57f, 0f)
                arcTo(11f, 11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.77f, 15.15f)
                arcTo(0.97f, 0.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 14.18f)
                verticalLineToRelative(-0.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                lineTo(21f, 13.01f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 15.01f)
                close()
                moveTo(21f, 20f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 2f)
                lineTo(5f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, -2f)
                lineTo(3f, 17.25f)
                arcTo(8.99f, 8.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.9f, 19.21f)
                arcToRelative(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.2f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.9f, -2.2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(11f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 5f)
                close()
                moveTo(8f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                close()
            }
        }.also { _Hamburger = it}
