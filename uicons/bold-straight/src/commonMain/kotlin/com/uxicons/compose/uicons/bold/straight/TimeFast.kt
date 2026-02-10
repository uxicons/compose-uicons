package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeFast: ImageVector? = null

val Icons.Bs.TimeFast: ImageVector
    get() = _TimeFast ?: UXIcon(name = "TimeFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 24f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                close()
                moveTo(8f, 16f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                close()
                moveTo(11f, 6f)
                verticalLineToRelative(6.62f)
                lineToRelative(3.44f, 3.44f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.56f, -2.56f)
                verticalLineToRelative(-5.38f)
                close()
                moveTo(12f, 0f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.6f, 9f)
                horizontalLineToRelative(3.13f)
                arcToRelative(8.99f, 8.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8.47f, 12f)
                verticalLineToRelative(3f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -24f)
                close()
            }
        }.also { _TimeFast = it}
