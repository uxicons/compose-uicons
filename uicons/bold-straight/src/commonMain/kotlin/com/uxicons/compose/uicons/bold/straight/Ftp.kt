package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ftp: ImageVector? = null

val Icons.Bs.Ftp: ImageVector
    get() = _Ftp ?: UXIcon(name = "Ftp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 19f)
                horizontalLineToRelative(-8.85f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, -1.65f)
                verticalLineToRelative(-2.35f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-9.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineToRelative(-5.03f)
                lineToRelative(-2.91f, -2f)
                horizontalLineToRelative(-3.06f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(2.35f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.65f, 1.65f)
                horizontalLineToRelative(-8.85f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8.85f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.3f, 0f)
                horizontalLineToRelative(8.85f)
                close()
                moveTo(6f, 7f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-12f)
                close()
            }
        }.also { _Ftp = it}
