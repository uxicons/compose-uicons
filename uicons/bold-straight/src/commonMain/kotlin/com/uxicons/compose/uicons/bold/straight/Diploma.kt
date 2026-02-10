package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diploma: ImageVector? = null

val Icons.Bs.Diploma: ImageVector
    get() = _Diploma ?: UXIcon(name = "Diploma") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -3.74f)
                verticalLineToRelative(-8.26f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineToRelative(-13f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-15.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineToRelative(7.55f)
                arcToRelative(4.48f, 4.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 8.19f)
                verticalLineToRelative(4.76f)
                lineToRelative(2.5f, -2.5f)
                lineToRelative(2.5f, 2.5f)
                verticalLineToRelative(-4.76f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -3.74f)
                close()
                moveTo(19.5f, 14f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.5f, 1.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -1.5f)
                close()
                moveTo(17f, 8f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                close()
                moveTo(7f, 10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Diploma = it}
