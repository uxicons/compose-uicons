package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hourglass: ImageVector? = null

val Icons.Sr.Hourglass: ImageVector
    get() = _Hourglass ?: UXIcon(name = "Hourglass") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 24f)
                horizontalLineToRelative(-9.99f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.04f, -1.4f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.92f, -3.16f)
                arcToRelative(12.52f, 12.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.4f, -7.44f)
                arcToRelative(12.52f, 12.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.4f, -7.44f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.92f, -3.16f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.04f, -1.4f)
                horizontalLineToRelative(9.99f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.04f, 1.4f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.92f, 3.15f)
                arcToRelative(12.56f, 12.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.41f, 7.45f)
                arcToRelative(12.56f, 12.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.41f, 7.45f)
                arcToRelative(3.94f, 3.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.92f, 3.16f)
                arcToRelative(4.02f, 4.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.04f, 1.4f)
                close()
            }
        }.also { _Hourglass = it}
