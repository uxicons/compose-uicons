package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorizontalRule: ImageVector? = null

val Icons.Sc.HorizontalRule: ImageVector
    get() = _HorizontalRule ?: UXIcon(name = "HorizontalRule") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 14f)
                curveToRelative(-0.38f, 0.0f, -4.67f, -1.0f, -9.5f, -1f)
                curveToRelative(-4.53f, 0f, -9.15f, 0.96f, -9.19f, 0.97f)
                curveToRelative(-0.81f, 0.17f, -1.61f, -0.35f, -1.78f, -1.16f)
                reflectiveCurveToRelative(0.35f, -1.61f, 1.16f, -1.78f)
                curveToRelative(0.2f, -0.04f, 4.96f, -1.03f, 9.81f, -1.03f)
                reflectiveCurveToRelative(9.61f, 0.99f, 9.81f, 1.03f)
                curveToRelative(0.81f, 0.17f, 1.33f, 0.97f, 1.16f, 1.78f)
                curveToRelative(-0.15f, 0.71f, -0.77f, 1.19f, -1.47f, 1.19f)
                close()
            }
        }.also { _HorizontalRule = it}
