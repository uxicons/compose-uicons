package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lipstick: ImageVector? = null

val Icons.Ss.Lipstick: ImageVector
    get() = _Lipstick ?: UXIcon(name = "Lipstick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 7f)
                verticalLineToRelative(-3.38f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.11f, -1.79f)
                lineToRelative(3.45f, -1.72f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.45f, 0.89f)
                verticalLineToRelative(6f)
                close()
                moveTo(19f, 14f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(14f)
                close()
                moveTo(17f, 9f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                close()
            }
        }.also { _Lipstick = it}
