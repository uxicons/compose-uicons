package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mound: ImageVector? = null

val Icons.Sr.Mound: ImageVector
    get() = _Mound ?: UXIcon(name = "Mound") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.76f, 24.05f)
                horizontalLineTo(3.24f)
                curveToRelative(-1.14f, 0f, -2.18f, -0.59f, -2.77f, -1.57f)
                curveToRelative(-0.59f, -0.98f, -0.63f, -2.17f, -0.09f, -3.19f)
                lineToRelative(3.73f, -7.39f)
                curveToRelative(1.51f, -2.99f, 4.54f, -4.85f, 7.89f, -4.85f)
                reflectiveCurveToRelative(6.38f, 1.86f, 7.89f, 4.85f)
                lineToRelative(3.74f, 7.4f)
                curveToRelative(0.53f, 1f, 0.5f, 2.2f, -0.1f, 3.18f)
                curveToRelative(-0.59f, 0.98f, -1.63f, 1.57f, -2.77f, 1.57f)
                close()
            }
        }.also { _Mound = it}
