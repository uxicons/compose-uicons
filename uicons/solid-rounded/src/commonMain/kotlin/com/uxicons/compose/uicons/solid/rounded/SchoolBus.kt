package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SchoolBus: ImageVector? = null

val Icons.Sr.SchoolBus: ImageVector
    get() = _SchoolBus ?: UXIcon(name = "SchoolBus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.14f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.86f, -3f)
                horizontalLineToRelative(11f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.86f, 3f)
                close()
                moveTo(8.94f, 20f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 0f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, -0.5f)
                close()
                moveTo(19.94f, 20f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, 0.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5f, 0f)
                arcToRelative(2.42f, 2.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.06f, -0.5f)
                close()
                moveTo(10f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(19f, 10f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                close()
                moveTo(8f, 10f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                close()
                moveTo(20f, 12f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                close()
                moveTo(3f, 10f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                close()
                moveTo(8f, 12f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _SchoolBus = it}
