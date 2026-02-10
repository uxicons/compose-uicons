package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lipstick: ImageVector? = null

val Icons.Sr.Lipstick: ImageVector
    get() = _Lipstick ?: UXIcon(name = "Lipstick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 24f)
                horizontalLineToRelative(-4f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, -5f)
                verticalLineToRelative(-2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(2f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 5f)
                close()
                moveTo(17f, 12f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 7f)
                verticalLineToRelative(-5.59f)
                arcToRelative(1.41f, 1.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.04f, -1.26f)
                lineToRelative(-2.62f, 1.31f)
                arcToRelative(2.41f, 2.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.33f, 2.16f)
                verticalLineToRelative(3.38f)
                close()
            }
        }.also { _Lipstick = it}
