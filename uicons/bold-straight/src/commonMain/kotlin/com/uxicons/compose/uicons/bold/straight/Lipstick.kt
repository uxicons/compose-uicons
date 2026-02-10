package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lipstick: ImageVector? = null

val Icons.Bs.Lipstick: ImageVector
    get() = _Lipstick ?: UXIcon(name = "Lipstick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.43f)
                arcToRelative(1.57f, 1.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.27f, -1.41f)
                lineToRelative(-2.46f, 1.23f)
                arcToRelative(2.27f, 2.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.26f, 2.04f)
                verticalLineToRelative(3.56f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-12f)
                close()
                moveTo(10f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(16f, 21f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _Lipstick = it}
