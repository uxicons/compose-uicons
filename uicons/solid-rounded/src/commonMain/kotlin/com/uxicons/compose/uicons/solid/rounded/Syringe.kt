package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Syringe: ImageVector? = null

val Icons.Sr.Syringe: ImageVector
    get() = _Syringe ?: UXIcon(name = "Syringe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.71f, 5.29f)
                lineToRelative(-5f, -5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, 1.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(-2.48f, 2.48f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.49f, -0.27f)
                lineToRelative(2.58f, 2.58f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                lineToRelative(-2.71f, -2.71f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(2.71f, 2.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                lineToRelative(-2.71f, -2.71f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(2.71f, 2.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                lineToRelative(-2.48f, -2.49f)
                arcToRelative(6.96f, 6.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.81f, 3.27f)
                verticalLineToRelative(3.1f)
                lineToRelative(-2.71f, 2.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(2.71f, -2.71f)
                horizontalLineToRelative(3.1f)
                arcToRelative(6.95f, 6.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, -2.05f)
                lineToRelative(5.07f, -5.07f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.48f, -6.48f)
                lineToRelative(2.48f, -2.49f)
                lineToRelative(1.79f, 1.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, -1.41f)
                close()
            }
        }.also { _Syringe = it}
