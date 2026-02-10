package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gif: ImageVector? = null

val Icons.Rs.Gif: ImageVector
    get() = _Gif ?: UXIcon(name = "Gif") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(18.41f, 24f)
                lineTo(24f, 18.41f)
                lineTo(24f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(18f, 21.59f)
                lineTo(18f, 18f)
                horizontalLineToRelative(3.59f)
                close()
                moveTo(22f, 16f)
                lineTo(16f, 16f)
                verticalLineToRelative(6f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                lineTo(21f, 2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                close()
                moveTo(12.75f, 5f)
                horizontalLineToRelative(3.26f)
                lineTo(16.01f, 6.25f)
                lineTo(14f, 6.25f)
                lineTo(14f, 7.39f)
                horizontalLineToRelative(1.86f)
                verticalLineToRelative(1.25f)
                lineTo(14f, 8.64f)
                verticalLineToRelative(2.39f)
                lineTo(12.75f, 11.03f)
                close()
                moveTo(5.25f, 7f)
                lineTo(5.25f, 9.07f)
                arcTo(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9.82f)
                arcToRelative(0.76f, 0.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.75f, -0.73f)
                lineTo(6.75f, 9f)
                lineTo(6f, 9f)
                lineTo(6f, 8f)
                lineTo(8f, 8f)
                lineTo(8f, 9.08f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 1.98f)
                lineTo(6f, 11.07f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 9.08f)
                verticalLineToRelative(-2.1f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 5f)
                lineTo(6f, 5f)
                arcTo(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 7f)
                lineTo(6.75f, 7f)
                arcTo(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6.25f)
                arcTo(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.25f, 7f)
                close()
                moveTo(9.75f, 5f)
                lineTo(11f, 5f)
                verticalLineToRelative(6.07f)
                lineTo(9.75f, 11.07f)
                close()
            }
        }.also { _Gif = it}
