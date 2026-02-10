package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drumstick: ImageVector? = null

val Icons.Ss.Drumstick: ImageVector
    get() = _Drumstick ?: UXIcon(name = "Drumstick") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.51f, 2.49f)
                arcToRelative(8.51f, 8.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12.02f, 0f)
                curveTo(6.32f, 5.66f, 6.01f, 13.63f, 6f, 13.97f)
                lineToRelative(-0.01f, 0.43f)
                lineToRelative(1.1f, 1.1f)
                lineTo(2.81f, 19.78f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.65f, 2.06f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.06f, -0.65f)
                lineTo(8.5f, 16.91f)
                lineToRelative(1.1f, 1.1f)
                lineTo(10.03f, 18f)
                curveToRelative(0.34f, -0.01f, 8.3f, -0.32f, 11.48f, -3.49f)
                arcTo(8.51f, 8.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.51f, 2.49f)
                close()
            }
        }.also { _Drumstick = it}
