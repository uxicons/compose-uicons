package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skateboard: ImageVector? = null

val Icons.Rr.Skateboard: ImageVector
    get() = _Skateboard ?: UXIcon(name = "Skateboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.84f, 2.17f)
                arcToRelative(7.39f, 7.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.45f, 0f)
                lineToRelative(-9.22f, 9.22f)
                arcToRelative(7.39f, 7.39f, 0f, isMoreThanHalf = true, isPositiveArc = false, 10.45f, 10.45f)
                lineToRelative(9.22f, -9.22f)
                arcToRelative(7.39f, 7.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -10.45f)
                close()
                moveTo(20.42f, 11.2f)
                lineTo(11.2f, 20.42f)
                arcToRelative(5.39f, 5.39f, 0f, isMoreThanHalf = true, isPositiveArc = true, -7.62f, -7.62f)
                lineToRelative(9.22f, -9.22f)
                arcToRelative(5.39f, 5.39f, 0f, isMoreThanHalf = true, isPositiveArc = true, 7.62f, 7.62f)
                close()
                moveTo(19.71f, 8.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.41f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(0.79f, -0.79f)
                lineToRelative(-2.59f, -2.58f)
                lineToRelative(-0.79f, 0.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.41f, 1.41f)
                lineToRelative(-0.79f, 0.79f)
                lineToRelative(2.59f, 2.59f)
                lineToRelative(0.79f, -0.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 0f)
                close()
                moveTo(12.71f, 15.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.41f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(0.79f, -0.79f)
                lineToRelative(-2.59f, -2.58f)
                lineToRelative(-0.79f, 0.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                lineToRelative(-0.79f, 0.79f)
                lineToRelative(2.59f, 2.59f)
                lineToRelative(0.79f, -0.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 0f)
                close()
            }
        }.also { _Skateboard = it}
