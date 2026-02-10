package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugAlt: ImageVector? = null

val Icons.Sr.MugAlt: ImageVector
    get() = _MugAlt ?: UXIcon(name = "MugAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                horizontalLineTo(18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 23f)
                close()
                moveTo(24f, 8f)
                curveToRelative(0f, 2.77f, -2.19f, 6f, -5f, 6f)
                horizontalLineTo(17.39f)
                lineToRelative(-0.3f, 1.82f)
                arcTo(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.15f, 20f)
                horizontalLineToRelative(-5.3f)
                arcToRelative(4.98f, 4.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.93f, -4.18f)
                lineTo(0.06f, 4.66f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
                horizontalLineTo(15f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.98f, 4f)
                horizontalLineTo(19f)
                curveTo(22.13f, 4f, 24f, 5.5f, 24f, 8f)
                close()
                moveTo(22f, 8f)
                curveToRelative(0f, -0.5f, 0f, -2f, -3f, -2f)
                horizontalLineToRelative(-0.28f)
                lineToRelative(-1f, 6f)
                horizontalLineTo(19f)
                curveTo(20.55f, 12f, 22f, 9.75f, 22f, 8f)
                close()
            }
        }.also { _MugAlt = it}
