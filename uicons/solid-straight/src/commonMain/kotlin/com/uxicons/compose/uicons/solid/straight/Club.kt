package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Club: ImageVector? = null

val Icons.Ss.Club: ImageVector
    get() = _Club ?: UXIcon(name = "Club") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 14f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.63f, -5.98f)
                arcTo(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 5.55f)
                arcTo(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                arcTo(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 5.55f)
                arcToRelative(5.23f, 5.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.63f, 2.47f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20f)
                arcToRelative(6.08f, 6.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.92f, -1.52f)
                curveTo(10.73f, 20.85f, 10.08f, 22f, 8f, 22f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                curveToRelative(-2.08f, 0f, -2.73f, -1.15f, -2.92f, -3.52f)
                arcTo(6.08f, 6.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 20f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 14f)
                close()
                moveTo(11.97f, 22f)
                curveToRelative(0.01f, -0.02f, 0.02f, -0.03f, 0.03f, -0.05f)
                curveToRelative(0.01f, 0.02f, 0.02f, 0.03f, 0.03f, 0.05f)
                close()
            }
        }.also { _Club = it}
