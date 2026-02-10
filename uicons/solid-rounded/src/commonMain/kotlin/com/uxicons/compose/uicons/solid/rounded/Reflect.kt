package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reflect: ImageVector? = null

val Icons.Sr.Reflect: ImageVector
    get() = _Reflect ?: UXIcon(name = "Reflect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 13f)
                horizontalLineToRelative(-22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
                moveTo(18.93f, 7.13f)
                arcToRelative(2.43f, 2.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.28f, -2.73f)
                lineToRelative(-7.98f, -3.97f)
                arcToRelative(3.3f, 3.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.27f, 0.01f)
                arcToRelative(2.81f, 2.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.4f, 2.48f)
                verticalLineToRelative(3.09f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(8.32f)
                arcToRelative(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.62f, -1.87f)
                close()
                moveTo(9.63f, 23.59f)
                lineTo(17.66f, 19.6f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.27f, -2.73f)
                arcToRelative(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.62f, -1.87f)
                horizontalLineToRelative(-8.32f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3.08f)
                arcToRelative(2.81f, 2.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.4f, 2.48f)
                arcToRelative(3.21f, 3.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.63f, 0.43f)
                arcToRelative(3.29f, 3.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.6f, -0.41f)
                close()
            }
        }.also { _Reflect = it}
