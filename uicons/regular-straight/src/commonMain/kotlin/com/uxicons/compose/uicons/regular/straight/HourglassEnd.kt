package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HourglassEnd: ImageVector? = null

val Icons.Rs.HourglassEnd: ImageVector
    get() = _HourglassEnd ?: UXIcon(name = "HourglassEnd") {
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
                moveTo(12.02f, 15.98f)
                arcToRelative(10.06f, 10.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.94f, 2.02f)
                horizontalLineToRelative(-3.89f)
                moveToRelative(1.95f, -4.49f)
                curveToRelative(-1.64f, 1.07f, -4.43f, 3.33f, -4.93f, 6.49f)
                horizontalLineToRelative(9.84f)
                curveToRelative(-0.5f, -3.18f, -3.29f, -5.43f, -4.91f, -6.49f)
                close()
            }
        }.also { _HourglassEnd = it}
