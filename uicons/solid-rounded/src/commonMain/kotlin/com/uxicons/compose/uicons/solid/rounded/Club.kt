package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Club: ImageVector? = null

val Icons.Sr.Club: ImageVector
    get() = _Club ?: UXIcon(name = "Club") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.37f, 8.02f)
                arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 5.55f)
                arcTo(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                arcTo(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5.55f)
                arcToRelative(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.63f, 2.47f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.53f, 11.91f)
                arcToRelative(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.82f, -1.45f)
                curveTo(10.73f, 20.85f, 10.08f, 22f, 8f, 22f)
                horizontalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                horizontalLineTo(18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(16f)
                curveToRelative(-2.08f, 0f, -2.73f, -1.15f, -2.92f, -3.52f)
                arcToRelative(5.94f, 5.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.82f, 1.45f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.53f, -11.91f)
                close()
                moveTo(11.97f, 22f)
                curveToRelative(0.01f, -0.02f, 0.02f, -0.03f, 0.03f, -0.05f)
                curveToRelative(0.01f, 0.02f, 0.02f, 0.03f, 0.03f, 0.05f)
                close()
            }
        }.also { _Club = it}
