package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Protractor: ImageVector? = null

val Icons.Rs.Protractor: ImageVector
    get() = _Protractor ?: UXIcon(name = "Protractor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 11.27f)
                arcToRelative(11.19f, 11.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, -10.98f, -10.27f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(18f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                arcToRelative(11.04f, 11.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.03f, -3.48f)
                arcToRelative(10.91f, 10.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.95f, -8.25f)
                close()
                moveTo(17.57f, 18.15f)
                arcToRelative(8.91f, 8.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.57f, 2.85f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.66f)
                arcToRelative(9.2f, 9.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.32f, 8.4f)
                arcToRelative(8.93f, 8.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.41f, 6.75f)
                close()
                moveTo(11f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -10f)
                close()
                moveTo(11f, 15f)
                verticalLineToRelative(-6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                close()
            }
        }.also { _Protractor = it}
