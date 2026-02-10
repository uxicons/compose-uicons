package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HourglassEnd: ImageVector? = null

val Icons.Ss.HourglassEnd: ImageVector
    get() = _HourglassEnd ?: UXIcon(name = "HourglassEnd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.62f, 19f)
                horizontalLineToRelative(-7.24f)
                arcToRelative(10.22f, 10.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.63f, -4.27f)
                arcToRelative(10.06f, 10.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.61f, 4.27f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(3f)
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
                moveTo(17.91f, 19.84f)
                curveToRelative(-0.56f, -3.57f, -3.59f, -6.02f, -5.35f, -7.17f)
                lineToRelative(-0.55f, -0.36f)
                lineToRelative(-0.55f, 0.36f)
                curveToRelative(-1.76f, 1.16f, -4.81f, 3.62f, -5.37f, 7.17f)
                lineToRelative(-0.18f, 1.16f)
                horizontalLineToRelative(12.19f)
                close()
            }
        }.also { _HourglassEnd = it}
