package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CurveAlt: ImageVector? = null

val Icons.Br.CurveAlt: ImageVector
    get() = _CurveAlt ?: UXIcon(name = "CurveAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(1.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(4.57f, 0f, 8.44f, -3.94f, 9.01f, -9.16f)
            curveTo(11.24f, 5.09f, 16.4f, 0f, 22.5f, 0f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-4.57f, 0f, -8.44f, 3.94f, -9.01f, 9.16f)
            curveToRelative(-0.74f, 6.75f, -5.89f, 11.84f, -11.99f, 11.84f)
            close()
        }
    }.also { _CurveAlt = it }
