package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lipstick: ImageVector? = null

val Icons.Rs.Lipstick: ImageVector
    get() = _Lipstick ?: UXIcon(name = "Lipstick") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 13f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.9f, -1.79f)
                lineToRelative(-3.45f, 1.72f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, 2.68f)
                verticalLineToRelative(4.38f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-11f)
                close()
                moveTo(10f, 4.62f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.55f, -0.89f)
                lineToRelative(3.45f, -1.73f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(9f, 11f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(17f, 22f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(10f)
                close()
            }
        }.also { _Lipstick = it}
