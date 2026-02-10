package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Infinity: ImageVector? = null

val Icons.Bs.Infinity: ImageVector
    get() = _Infinity ?: UXIcon(name = "Infinity") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.95f, 5.95f)
                curveToRelative(-2.69f, 0f, -4.73f, 1.84f, -5.95f, 3.36f)
                curveToRelative(-1.23f, -1.53f, -3.26f, -3.36f, -5.95f, -3.36f)
                arcToRelative(6.05f, 6.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12.09f)
                curveToRelative(2.69f, 0f, 4.73f, -1.84f, 5.95f, -3.36f)
                curveToRelative(1.23f, 1.53f, 3.26f, 3.36f, 5.95f, 3.36f)
                arcToRelative(6.05f, 6.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -12.09f)
                close()
                moveTo(6.05f, 15.05f)
                arcToRelative(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6.09f)
                curveToRelative(1.82f, 0f, 3.41f, 1.82f, 4.21f, 3.05f)
                curveToRelative(-0.81f, 1.23f, -2.4f, 3.05f, -4.21f, 3.05f)
                close()
                moveTo(17.95f, 15.05f)
                curveToRelative(-1.82f, 0f, -3.41f, -1.82f, -4.21f, -3.05f)
                curveToRelative(0.81f, -1.23f, 2.4f, -3.05f, 4.21f, -3.05f)
                arcToRelative(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6.09f)
                close()
            }
        }.also { _Infinity = it}
