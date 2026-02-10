package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spade: ImageVector? = null

val Icons.Ss.Spade: ImageVector
    get() = _Spade ?: UXIcon(name = "Spade") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 13.5f)
                curveTo(23f, 8.36f, 16.02f, 2.37f, 13.88f, 0.66f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.76f, 0f)
                curveTo(7.98f, 2.37f, 1f, 8.35f, 1f, 13.5f)
                arcTo(6.27f, 6.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 20f)
                arcToRelative(5.82f, 5.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.93f, -1.66f)
                curveTo(10.75f, 20.8f, 10.12f, 22f, 8f, 22f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                curveToRelative(-2.12f, 0f, -2.75f, -1.2f, -2.93f, -3.66f)
                arcTo(5.82f, 5.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 20f)
                arcTo(6.27f, 6.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 13.5f)
                close()
            }
        }.also { _Spade = it}
