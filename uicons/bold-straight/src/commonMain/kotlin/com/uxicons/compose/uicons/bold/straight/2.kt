package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _2: ImageVector? = null

val Icons.Bs.Two: ImageVector
    get() = _2 ?: UXIcon(name = "2") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 24f)
            horizontalLineTo(4f)
            verticalLineToRelative(-1.5f)
            curveToRelative(0f, -3.81f, 3.35f, -5.64f, 6.58f, -7.4f)
            curveToRelative(3.3f, -1.79f, 6.42f, -3.49f, 6.42f, -7.1f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
            horizontalLineToRelative(-3f)
            curveTo(4f, 3.59f, 7.59f, 0f, 12f, 0f)
            reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
            curveToRelative(0f, 5.39f, -4.43f, 7.8f, -7.98f, 9.74f)
            curveToRelative(-2.21f, 1.21f, -3.81f, 2.14f, -4.55f, 3.26f)
            horizontalLineToRelative(12.54f)
            verticalLineToRelative(3f)
            close()
        }
    }.also { _2 = it }
