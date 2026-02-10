package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Highlighter: ImageVector? = null

val Icons.Br.Highlighter: ImageVector
    get() = _Highlighter ?: UXIcon(name = "Highlighter") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.59f, 1.78f)
            lineToRelative(-0.37f, -0.37f)
            curveToRelative(-1.78f, -1.78f, -4.67f, -1.88f, -6.58f, -0.23f)
            lineTo(4.09f, 11.31f)
            curveToRelative(-1.33f, 1.19f, -2.09f, 2.88f, -2.09f, 4.67f)
            verticalLineToRelative(3.9f)
            lineToRelative(-1.56f, 1.56f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(1.56f, -1.56f)
            horizontalLineToRelative(3.9f)
            curveToRelative(1.78f, 0f, 3.48f, -0.76f, 4.67f, -2.1f)
            lineToRelative(10.12f, -11.54f)
            curveToRelative(1.65f, -1.9f, 1.55f, -4.79f, -0.23f, -6.58f)
            close()
            moveTo(20.56f, 6.38f)
            lineToRelative(-10.11f, 11.53f)
            curveToRelative(-0.23f, 0.26f, -0.5f, 0.45f, -0.79f, 0.62f)
            lineToRelative(-4.2f, -4.2f)
            curveToRelative(0.17f, -0.29f, 0.36f, -0.56f, 0.62f, -0.78f)
            lineTo(17.61f, 3.45f)
            curveToRelative(0.72f, -0.62f, 1.81f, -0.59f, 2.49f, 0.09f)
            horizontalLineToRelative(0f)
            lineToRelative(0.37f, 0.37f)
            curveToRelative(0.67f, 0.68f, 0.71f, 1.77f, 0.09f, 2.48f)
            close()
        }
    }.also { _Highlighter = it }
