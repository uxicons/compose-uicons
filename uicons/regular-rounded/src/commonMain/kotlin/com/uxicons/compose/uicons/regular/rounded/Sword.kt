package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sword: ImageVector? = null

val Icons.Rr.Sword: ImageVector
    get() = _Sword ?: UXIcon(name = "Sword") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.41f, 0.59f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.94f, -0.51f)
                arcToRelative(16.46f, 16.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.48f, 3.98f)
                lineToRelative(-9.48f, 9.47f)
                arcToRelative(14.58f, 14.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.38f, -1.52f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.29f, 1.98f)
                arcToRelative(12.63f, 12.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.35f, 2.39f)
                lineToRelative(-3.71f, 3.71f)
                lineToRelative(-0.79f, -0.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, -1.41f)
                lineToRelative(-0.79f, -0.79f)
                lineToRelative(3.71f, -3.71f)
                arcToRelative(12.61f, 12.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.39f, 5.35f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.99f, 0.86f)
                arcToRelative(0.88f, 0.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.14f, -0.01f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.85f, -1.13f)
                arcToRelative(14.52f, 14.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.52f, -4.38f)
                lineToRelative(9.47f, -9.48f)
                arcToRelative(16.52f, 16.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.01f, -6.57f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, -1.85f)
                close()
                moveTo(18.53f, 7.59f)
                lineTo(9.36f, 16.76f)
                arcToRelative(11.15f, 11.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.99f, -1.13f)
                arcToRelative(11.36f, 11.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.13f, -0.99f)
                lineToRelative(9.17f, -9.17f)
                arcToRelative(14.38f, 14.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.58f, -3.46f)
                arcToRelative(14.45f, 14.45f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.46f, 5.58f)
                close()
            }
        }.also { _Sword = it}
