package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _2: ImageVector? = null

val Icons.Br.Two: ImageVector
    get() = _2 ?: UXIcon(name = "Two") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 24f)
            horizontalLineTo(6.89f)
            curveToRelative(-1.06f, 0f, -2.04f, -0.58f, -2.54f, -1.52f)
            curveToRelative(-0.51f, -0.94f, -0.46f, -2.08f, 0.13f, -2.98f)
            curveToRelative(1.2f, -1.82f, 3.41f, -3.02f, 5.75f, -4.3f)
            curveToRelative(4.33f, -2.35f, 7.15f, -4.18f, 6.73f, -7.96f)
            curveToRelative(-0.26f, -2.38f, -2.44f, -4.25f, -4.96f, -4.25f)
            curveToRelative(-2.76f, 0f, -5.0f, 2.24f, -5.0f, 5.0f)
            verticalLineToRelative(0.5f)
            curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.0f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -4.42f, 3.59f, -8.0f, 8f, -8.0f)
            curveToRelative(4.09f, 0f, 7.5f, 2.97f, 7.94f, 6.92f)
            curveToRelative(0.67f, 6.07f, -4.29f, 8.76f, -8.28f, 10.93f)
            curveToRelative(-1.92f, 1.04f, -3.73f, 2.02f, -4.57f, 3.16f)
            horizontalLineToRelative(11.41f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _2 = it }
