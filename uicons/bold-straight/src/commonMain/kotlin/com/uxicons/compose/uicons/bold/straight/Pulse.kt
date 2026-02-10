package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pulse: ImageVector? = null

val Icons.Bs.Pulse: ImageVector
    get() = _Pulse ?: UXIcon(name = "Pulse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                verticalLineToRelative(-15.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineToRelative(-17f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(3f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(-18f)
                close()
                moveTo(14.7f, 8f)
                horizontalLineToRelative(4.3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.7f)
                lineToRelative(-2.99f, 4.48f)
                lineToRelative(-3f, -6f)
                lineToRelative(-1.01f, 1.52f)
                horizontalLineToRelative(-4.3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.7f)
                lineToRelative(2.99f, -4.48f)
                lineToRelative(3f, 6f)
                close()
            }
        }.also { _Pulse = it}
