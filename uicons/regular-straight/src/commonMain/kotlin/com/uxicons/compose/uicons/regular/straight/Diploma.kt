package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Diploma: ImageVector? = null

val Icons.Rs.Diploma: ImageVector
    get() = _Diploma ?: UXIcon(name = "Diploma") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(17f, 8f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                close()
                moveTo(17f, 4f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                close()
                moveTo(20f, 19.44f)
                verticalLineToRelative(4.56f)
                lineToRelative(-2f, -2f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(-4.56f)
                arcToRelative(3.99f, 3.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -7.44f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0.14f)
                verticalLineToRelative(-9.14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-19f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(10.38f)
                arcToRelative(3.95f, 3.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 6.06f)
                close()
                moveTo(20f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, -2f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                close()
            }
        }.also { _Diploma = it}
