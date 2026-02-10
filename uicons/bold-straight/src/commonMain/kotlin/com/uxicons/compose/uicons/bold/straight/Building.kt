package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Building: ImageVector? = null

val Icons.Bs.Building: ImageVector
    get() = _Building ?: UXIcon(name = "Building") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(9f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(4f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(9f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(4f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(9f, 8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(24f, 8.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-20.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, -3.5f)
                horizontalLineToRelative(9f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 3.5f)
                close()
                moveTo(13f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                horizontalLineToRelative(-9f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(10f)
                close()
                moveTo(21f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.5f, -0.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(5f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _Building = it}
