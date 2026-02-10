package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Thumbtack: ImageVector? = null

val Icons.Rs.Thumbtack: ImageVector
    get() = _Thumbtack ?: UXIcon(name = "Thumbtack") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.07f, 16.35f)
                lineToRelative(4.9f, 4.9f)
                lineToRelative(0.71f, -0.71f)
                arcToRelative(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.08f, -7.62f)
                lineToRelative(-0.25f, -1f)
                lineToRelative(2.09f, -2.09f)
                lineToRelative(0.22f, 0.22f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.94f, 0.4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.38f, -4.57f)
                lineTo(18.2f, 0.95f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.94f, -0.4f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.38f, 4.57f)
                lineToRelative(0.29f, 0.29f)
                lineTo(12.09f, 7.5f)
                lineTo(11.1f, 7.26f)
                arcTo(7.99f, 7.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.46f, 9.33f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(4.9f, 4.89f)
                lineTo(0.29f, 22.29f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(10.61f, 9.2f)
                lineToRelative(2.1f, 0.51f)
                lineToRelative(4.3f, -4.3f)
                lineTo(15.29f, 3.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.13f, -1.53f)
                arcToRelative(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.36f, 0.19f)
                lineToRelative(4.92f, 4.92f)
                horizontalLineToRelative(0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.13f, 1.53f)
                arcToRelative(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.36f, -0.19f)
                lineTo(18.59f, 7f)
                lineToRelative(-4.3f, 4.3f)
                lineToRelative(0.52f, 2.11f)
                arcToRelative(5.98f, 5.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.9f, 4.95f)
                lineTo(5.65f, 10.1f)
                arcTo(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.61f, 9.2f)
                close()
            }
        }.also { _Thumbtack = it}
