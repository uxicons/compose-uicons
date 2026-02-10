package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorizontalRule: ImageVector? = null

val Icons.Rc.HorizontalRule: ImageVector
    get() = _HorizontalRule ?: UXIcon(name = "HorizontalRule") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.98f, 13.2f)
                curveToRelative(-0.1f, 0.54f, -0.65f, 0.89f, -1.18f, 0.78f)
                curveToRelative(-0.05f, -0.01f, -4.97f, -0.98f, -9.8f, -0.98f)
                reflectiveCurveToRelative(-9.76f, 0.97f, -9.8f, 0.98f)
                curveToRelative(-0.54f, 0.11f, -1.07f, -0.24f, -1.18f, -0.78f)
                reflectiveCurveToRelative(0.24f, -1.07f, 0.78f, -1.18f)
                curveToRelative(0.21f, -0.04f, 5.16f, -1.02f, 10.2f, -1.02f)
                reflectiveCurveToRelative(9.99f, 0.98f, 10.2f, 1.02f)
                curveToRelative(0.54f, 0.11f, 0.89f, 0.64f, 0.78f, 1.18f)
                close()
            }
        }.also { _HorizontalRule = it}
