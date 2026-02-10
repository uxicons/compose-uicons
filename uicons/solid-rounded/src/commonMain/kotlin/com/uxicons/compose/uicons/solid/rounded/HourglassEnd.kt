package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HourglassEnd: ImageVector? = null

val Icons.Sr.HourglassEnd: ImageVector
    get() = _HourglassEnd ?: UXIcon(name = "HourglassEnd") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.55f, 12f)
                arcToRelative(12.56f, 12.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.41f, -7.45f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.92f, -3.15f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.04f, -1.4f)
                horizontalLineToRelative(-9.99f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.04f, 1.4f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.92f, 3.16f)
                arcToRelative(12.52f, 12.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.4f, 7.44f)
                arcToRelative(12.52f, 12.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.4f, 7.44f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.92f, 3.16f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.04f, 1.4f)
                horizontalLineToRelative(9.99f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.04f, -1.4f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.92f, -3.16f)
                arcToRelative(12.56f, 12.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.41f, -7.44f)
                close()
                moveTo(17.83f, 20.56f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.83f, 0.44f)
                horizontalLineToRelative(-10f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.93f, -1.37f)
                arcToRelative(14.86f, 14.86f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.6f, -5.66f)
                lineToRelative(0.7f, -0.56f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.25f, 0f)
                lineToRelative(0.69f, 0.55f)
                arcToRelative(15.01f, 15.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.61f, 5.66f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.09f, 0.94f)
                close()
                moveTo(15.35f, 19f)
                horizontalLineToRelative(-6.7f)
                arcToRelative(14.96f, 14.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.27f, -3.46f)
                lineToRelative(0.08f, -0.07f)
                lineToRelative(0.07f, 0.06f)
                arcToRelative(15.3f, 15.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.28f, 3.47f)
                close()
            }
        }.also { _HourglassEnd = it}
