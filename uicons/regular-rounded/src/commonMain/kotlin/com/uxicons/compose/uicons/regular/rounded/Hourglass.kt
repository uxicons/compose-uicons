package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hourglass: ImageVector? = null

val Icons.Rr.Hourglass: ImageVector
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
                moveTo(17f, 2f)
                horizontalLineToRelative(-9.99f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.53f, 0.7f)
                arcToRelative(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.46f, 1.56f)
                curveToRelative(0.38f, 2.5f, 1.92f, 4.84f, 4.6f, 6.96f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.57f)
                curveToRelative(-2.68f, 2.12f, -4.22f, 4.46f, -4.6f, 6.96f)
                arcToRelative(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.46f, 1.56f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.53f, 0.7f)
                horizontalLineToRelative(9.99f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.53f, -0.7f)
                arcToRelative(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.46f, -1.55f)
                curveToRelative(-0.37f, -2.49f, -1.92f, -4.83f, -4.6f, -6.96f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.56f)
                curveToRelative(2.68f, -2.13f, 4.23f, -4.47f, 4.6f, -6.96f)
                arcToRelative(1.92f, 1.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.46f, -1.56f)
                arcToRelative(2.01f, 2.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.52f, -0.7f)
                close()
            }
        }.also { _Hourglass = it}
