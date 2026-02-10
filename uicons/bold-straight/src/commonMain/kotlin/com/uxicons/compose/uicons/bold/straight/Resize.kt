package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Resize: ImageVector? = null

val Icons.Bs.Resize: ImageVector
    get() = _Resize ?: UXIcon(name = "Resize") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineToRelative(-12f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(11f)
                close()
                moveTo(10f, 21f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                close()
                moveTo(21f, 16f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1.5f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.21f, -1.16f)
                lineToRelative(3.21f, -3.21f)
                verticalLineToRelative(1.88f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.88f)
                lineToRelative(-3.21f, 3.21f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.16f, -0.21f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(12f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
            }
        }.also { _Resize = it}
