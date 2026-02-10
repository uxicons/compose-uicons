package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drumstick: ImageVector? = null

val Icons.Bs.Drumstick: ImageVector
    get() = _Drumstick ?: UXIcon(name = "Drumstick") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2.5f)
                arcToRelative(8.54f, 8.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.06f, 0f)
                curveTo(6.36f, 5.57f, 6.03f, 12.82f, 6f, 13.64f)
                lineToRelative(-0.02f, 0.65f)
                lineToRelative(0.81f, 0.81f)
                lineTo(3.35f, 18.53f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.47f, -1.35f)
                lineToRelative(3.44f, -3.44f)
                lineToRelative(0.81f, 0.81f)
                lineTo(10.36f, 18f)
                curveToRelative(0.82f, -0.03f, 8.06f, -0.36f, 11.14f, -3.44f)
                arcTo(8.57f, 8.57f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 2.5f)
                close()
                moveTo(19.38f, 12.44f)
                curveToRelative(-1.72f, 1.72f, -6.23f, 2.37f, -8.48f, 2.52f)
                lineTo(9.04f, 13.1f)
                curveToRelative(0.16f, -2.19f, 0.81f, -6.77f, 2.52f, -8.48f)
                curveTo(16.9f, -0.39f, 24.39f, 7.12f, 19.38f, 12.44f)
                close()
            }
        }.also { _Drumstick = it}
