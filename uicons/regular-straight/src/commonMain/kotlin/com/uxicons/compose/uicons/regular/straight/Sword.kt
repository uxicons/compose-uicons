package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sword: ImageVector? = null

val Icons.Rs.Sword: ImageVector
    get() = _Sword ?: UXIcon(name = "Sword") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.41f, 0.59f)
                arcToRelative(2.02f, 2.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.94f, -0.51f)
                lineToRelative(-3.71f, 1.22f)
                lineToRelative(-12.24f, 12.24f)
                arcToRelative(14.58f, 14.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.38f, -1.52f)
                lineToRelative(-0.29f, 1.98f)
                arcToRelative(12.64f, 12.64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.35f, 2.39f)
                lineToRelative(-3.71f, 3.71f)
                lineToRelative(-1.02f, -1.02f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(3.5f, 3.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(3.71f, -3.71f)
                arcToRelative(12.62f, 12.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.39f, 5.35f)
                lineToRelative(1.98f, -0.29f)
                arcToRelative(14.52f, 14.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.52f, -4.38f)
                lineToRelative(12.24f, -12.24f)
                lineToRelative(1.25f, -3.81f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.54f, -1.84f)
                close()
                moveTo(20.96f, 5.17f)
                lineTo(9.36f, 16.76f)
                arcToRelative(11.29f, 11.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.99f, -1.13f)
                arcToRelative(11.36f, 11.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.13f, -0.99f)
                lineToRelative(11.59f, -11.59f)
                lineToRelative(3.16f, -1.04f)
                close()
            }
        }.also { _Sword = it}
