package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Subscript: ImageVector? = null

val Icons.Br.Subscript: ImageVector
    get() = _Subscript ?: UXIcon(name = "Subscript") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 14.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4.58f)
            curveToRelative(-0.52f, 0.18f, -1.11f, 0.07f, -1.54f, -0.33f)
            curveToRelative(-0.6f, -0.57f, -0.62f, -1.52f, -0.05f, -2.12f)
            lineToRelative(1.91f, -2f)
            curveToRelative(0.28f, -0.3f, 0.68f, -0.46f, 1.08f, -0.46f)
            curveToRelative(0.83f, 0f, 1.59f, 0.67f, 1.59f, 1.5f)
            close()
            moveTo(14.44f, 0.33f)
            curveToRelative(-0.65f, -0.52f, -1.59f, -0.41f, -2.11f, 0.23f)
            lineToRelative(-4.83f, 6.04f)
            lineTo(2.67f, 0.56f)
            curveTo(2.15f, -0.08f, 1.21f, -0.19f, 0.56f, 0.33f)
            curveTo(-0.08f, 0.85f, -0.19f, 1.79f, 0.33f, 2.44f)
            lineToRelative(5.25f, 6.56f)
            lineTo(0.33f, 15.56f)
            curveToRelative(-0.52f, 0.65f, -0.41f, 1.59f, 0.23f, 2.11f)
            curveToRelative(0.28f, 0.22f, 0.61f, 0.33f, 0.94f, 0.33f)
            curveToRelative(0.44f, 0f, 0.88f, -0.19f, 1.17f, -0.56f)
            lineToRelative(4.83f, -6.04f)
            lineToRelative(4.83f, 6.04f)
            curveToRelative(0.3f, 0.37f, 0.73f, 0.56f, 1.17f, 0.56f)
            curveToRelative(0.33f, 0f, 0.66f, -0.11f, 0.94f, -0.33f)
            curveToRelative(0.65f, -0.52f, 0.75f, -1.46f, 0.23f, -2.11f)
            lineToRelative(-5.25f, -6.56f)
            lineToRelative(5.25f, -6.56f)
            curveToRelative(0.52f, -0.65f, 0.41f, -1.59f, -0.23f, -2.11f)
            close()
        }
    }.also { _Subscript = it }
