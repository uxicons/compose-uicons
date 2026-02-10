package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugHotAlt: ImageVector? = null

val Icons.Sr.MugHotAlt: ImageVector
    get() = _MugHotAlt ?: UXIcon(name = "MugHotAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.03f, 3f)
                lineTo(13.03f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                lineTo(15.03f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.03f, 3f)
                close()
                moveTo(10.03f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(11.03f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(9.03f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.03f, 4f)
                close()
                moveTo(6.03f, 4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                lineTo(7.03f, 1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                lineTo(5.03f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.03f, 4f)
                close()
                moveTo(24f, 13.14f)
                arcTo(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 17f)
                lineTo(17.52f, 17f)
                arcToRelative(6.88f, 6.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.74f, 3f)
                lineTo(8.22f, 20f)
                arcToRelative(6.88f, 6.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.81f, -3.09f)
                curveTo(0.99f, 14.65f, -2.45f, 6.37f, 3f, 6f)
                lineTo(17f, 6f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.88f, 4f)
                curveTo(22.35f, 10f, 24f, 11.21f, 24f, 13.14f)
                close()
                moveTo(22f, 13.14f)
                curveToRelative(0.09f, -0.93f, -1.25f, -1.22f, -2.46f, -1.14f)
                arcToRelative(16.82f, 16.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.95f, 3f)
                lineTo(20f, 15f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 13.14f)
                close()
                moveTo(19f, 22f)
                lineTo(1f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2f)
                lineTo(19f, 24f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 22f)
                close()
            }
        }.also { _MugHotAlt = it}
