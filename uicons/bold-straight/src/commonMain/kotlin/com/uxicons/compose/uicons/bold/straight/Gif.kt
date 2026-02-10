package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Gif: ImageVector? = null

val Icons.Bs.Gif: ImageVector
    get() = _Gif ?: UXIcon(name = "Gif") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(17.47f, 24f)
                lineTo(24f, 17.47f)
                lineTo(24f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(12.75f, 2.92f)
                horizontalLineToRelative(3.26f)
                verticalLineToRelative(1.25f)
                lineTo(14f, 4.17f)
                lineTo(14f, 5.3f)
                horizontalLineToRelative(1.86f)
                verticalLineToRelative(1.25f)
                lineTo(14f, 6.55f)
                lineTo(14f, 8.94f)
                lineTo(12.75f, 8.94f)
                close()
                moveTo(9.75f, 2.92f)
                lineTo(11f, 2.92f)
                lineTo(11f, 8.98f)
                lineTo(9.75f, 8.98f)
                close()
                moveTo(4f, 4.9f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 2.92f)
                lineTo(6f, 2.92f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                lineTo(6.75f, 4.92f)
                arcTo(0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 4.17f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.75f)
                lineTo(5.25f, 6.98f)
                arcTo(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 7.74f)
                arcTo(0.76f, 0.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.75f, 7f)
                lineTo(6.75f, 6.92f)
                lineTo(6f, 6.92f)
                verticalLineToRelative(-1f)
                lineTo(8f, 5.92f)
                lineTo(8f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 8.98f)
                lineTo(6f, 8.98f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 7f)
                close()
                moveTo(21f, 15f)
                lineTo(15f, 15f)
                verticalLineToRelative(6f)
                lineTo(3f, 21f)
                lineTo(3f, 11f)
                lineTo(21f, 11f)
                close()
            }
        }.also { _Gif = it}
