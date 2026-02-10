package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hourglass: ImageVector? = null

val Icons.Rs.Hourglass: ImageVector
    get() = _Hourglass ?: UXIcon(name = "Hourglass") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 24f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-3f)
                arcToRelative(12.2f, 12.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.44f, -9f)
                arcToRelative(12.2f, 12.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.44f, -9f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                arcToRelative(12.22f, 12.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.42f, 9f)
                arcToRelative(12.22f, 12.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.42f, 9f)
                close()
                moveTo(5f, 22f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.77f, -2.5f, -6.55f, -4.59f, -8.22f)
                lineToRelative(-0.98f, -0.78f)
                lineToRelative(0.98f, -0.78f)
                curveToRelative(2.09f, -1.67f, 4.59f, -4.44f, 4.59f, -8.22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, 1f)
                curveToRelative(0f, 3.77f, 2.51f, 6.55f, 4.61f, 8.22f)
                lineToRelative(0.99f, 0.78f)
                lineToRelative(-0.99f, 0.78f)
                curveToRelative(-2.1f, 1.67f, -4.61f, 4.44f, -4.61f, 8.22f)
                close()
            }
        }.also { _Hourglass = it}
