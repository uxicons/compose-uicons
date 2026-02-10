package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Infinity: ImageVector? = null

val Icons.Br.Infinity: ImageVector
    get() = _Infinity ?: UXIcon(name = "Infinity") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18f, 6f)
            curveToRelative(-2.69f, 0f, -4.76f, 1.85f, -6f, 3.37f)
            curveToRelative(-1.24f, -1.51f, -3.31f, -3.37f, -6f, -3.37f)
            arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
            curveToRelative(2.69f, 0f, 4.76f, -1.85f, 6f, -3.37f)
            curveToRelative(1.24f, 1.51f, 3.31f, 3.37f, 6f, 3.37f)
            arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -12f)
            close()
            moveTo(6f, 15f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -6f)
            curveToRelative(1.79f, 0f, 3.4f, 1.78f, 4.24f, 3f)
            curveToRelative(-0.84f, 1.22f, -2.45f, 3f, -4.24f, 3f)
            close()
            moveTo(18f, 15f)
            curveToRelative(-1.79f, 0f, -3.4f, -1.78f, -4.24f, -3f)
            curveToRelative(0.84f, -1.22f, 2.45f, -3f, 4.24f, -3f)
            arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
            close()
        }
    }.also { _Infinity = it }
