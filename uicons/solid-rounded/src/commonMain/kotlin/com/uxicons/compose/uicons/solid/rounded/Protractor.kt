package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Protractor: ImageVector? = null

val Icons.Sr.Protractor: ImageVector
    get() = _Protractor ?: UXIcon(name = "Protractor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.98f, 11.26f)
                curveToRelative(-0.36f, -5.54f, -5.5f, -10.22f, -11.25f, -10.26f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, -1f)
                horizontalLineToRelative(-2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 4f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.73f, -1f)
                horizontalLineToRelative(0.27f)
                arcToRelative(11.04f, 11.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.03f, -3.48f)
                arcToRelative(10.91f, 10.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.95f, -8.26f)
                close()
                moveTo(10.95f, 15.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.95f, -0.99f)
                verticalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.98f, 4.39f)
                arcToRelative(4.1f, 4.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.03f, 3.6f)
                close()
            }
        }.also { _Protractor = it}
