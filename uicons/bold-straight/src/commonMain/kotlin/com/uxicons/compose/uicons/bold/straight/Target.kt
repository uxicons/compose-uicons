package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Target: ImageVector? = null

val Icons.Bs.Target: ImageVector
    get() = _Target ?: UXIcon(name = "Target") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
                moveTo(13.5f, 20.86f)
                verticalLineToRelative(-2.87f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2.87f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.37f, -7.37f)
                horizontalLineToRelative(2.87f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.87f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.37f, -7.37f)
                verticalLineToRelative(2.87f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.87f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.37f, 7.37f)
                horizontalLineToRelative(-2.87f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.87f)
                arcToRelative(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.37f, 7.37f)
                close()
                moveTo(13.5f, 10.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(3f)
                close()
            }
        }.also { _Target = it}
