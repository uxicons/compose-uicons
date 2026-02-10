package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fox: ImageVector? = null

val Icons.Sr.Fox: ImageVector
    get() = _Fox ?: UXIcon(name = "Fox") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 8.01f)
                verticalLineToRelative(-6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.76f, 0.43f)
                arcToRelative(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.7f, -0.38f)
                arcTo(6.13f, 6.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.6f, 3.78f)
                arcTo(21.88f, 21.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                arcToRelative(21.88f, 21.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.4f, 0.78f)
                arcTo(6.13f, 6.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.54f, 0.05f)
                arcTo(2.0f, 2.0f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 2.01f)
                verticalLineToRelative(6f)
                arcToRelative(12.22f, 12.22f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.77f, 1.1f)
                arcTo(10.26f, 10.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcTo(10.26f, 10.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.77f, 9.1f)
                arcTo(12.23f, 12.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.01f)
                close()
                moveTo(20f, 11f)
                arcToRelative(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.64f, 2.99f)
                arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, 0f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.36f, -5.01f)
                arcTo(3.78f, 3.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 11f)
                arcToRelative(10.15f, 10.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -0.99f)
                arcToRelative(10.93f, 10.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.22f, 7.63f)
                lineToRelative(4.66f, 4.66f)
                arcToRelative(5.86f, 5.86f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.24f, 0f)
                lineToRelative(4.66f, -4.66f)
                arcTo(10.93f, 10.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 10.01f)
                arcTo(10.15f, 10.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 11f)
                close()
            }
        }.also { _Fox = it}
