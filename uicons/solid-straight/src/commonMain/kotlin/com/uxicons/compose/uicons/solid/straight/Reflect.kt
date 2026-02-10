package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Reflect: ImageVector? = null

val Icons.Ss.Reflect: ImageVector
    get() = _Reflect ?: UXIcon(name = "Reflect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(24f)
                close()
                moveTo(8.89f, 0.43f)
                lineTo(8.79f, 0.36f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.79f, 2.14f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(14.92f)
                close()
                moveTo(8.79f, 23.64f)
                lineTo(19.92f, 15f)
                horizontalLineToRelative(-14.92f)
                verticalLineToRelative(6.5f)
                arcToRelative(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.79f, 2.14f)
                close()
            }
        }.also { _Reflect = it}
