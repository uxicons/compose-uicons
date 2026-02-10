package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Infinity: ImageVector? = null

val Icons.Rr.Infinity: ImageVector
    get() = _Infinity ?: UXIcon(name = "Infinity") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 6f)
                curveToRelative(-2.97f, 0f, -4.94f, 2.23f, -6f, 3.88f)
                curveToRelative(-1.06f, -1.66f, -3.03f, -3.88f, -6f, -3.88f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                curveToRelative(2.97f, 0f, 4.94f, -2.23f, 6f, -3.88f)
                curveToRelative(1.06f, 1.66f, 3.03f, 3.88f, 6f, 3.88f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -12f)
                close()
                moveTo(6f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
                curveToRelative(2.69f, 0f, 4.38f, 2.94f, 4.9f, 4f)
                curveToRelative(-0.51f, 1.06f, -2.19f, 4f, -4.9f, 4f)
                close()
                moveTo(18f, 16f)
                curveToRelative(-2.69f, 0f, -4.38f, -2.94f, -4.9f, -4f)
                curveToRelative(0.52f, -1.06f, 2.19f, -4f, 4.9f, -4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8f)
                close()
            }
        }.also { _Infinity = it}
