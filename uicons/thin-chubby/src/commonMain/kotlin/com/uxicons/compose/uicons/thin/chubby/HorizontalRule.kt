package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorizontalRule: ImageVector? = null

val Icons.Tc.HorizontalRule: ImageVector
    get() = _HorizontalRule ?: UXIcon(name = "HorizontalRule") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.99f, 12.65f)
                curveToRelative(-0.05f, 0.27f, -0.32f, 0.45f, -0.59f, 0.39f)
                curveToRelative(-0.05f, -0.01f, -5.27f, -1.04f, -10.4f, -1.04f)
                reflectiveCurveToRelative(-10.35f, 1.03f, -10.4f, 1.04f)
                curveToRelative(-0.27f, 0.05f, -0.53f, -0.12f, -0.59f, -0.39f)
                curveToRelative(-0.05f, -0.27f, 0.12f, -0.53f, 0.39f, -0.59f)
                curveToRelative(0.05f, -0.01f, 5.36f, -1.06f, 10.6f, -1.06f)
                reflectiveCurveToRelative(10.54f, 1.05f, 10.6f, 1.06f)
                curveToRelative(0.27f, 0.05f, 0.45f, 0.32f, 0.39f, 0.59f)
                close()
            }
        }.also { _HorizontalRule = it}
