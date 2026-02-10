package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShareSquare: ImageVector? = null

val Icons.Br.ShareSquare: ImageVector
    get() = _ShareSquare ?: UXIcon(name = "ShareSquare") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 18.5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveTo(2.47f, 24f, 0f, 21.53f, 0f, 18.5f)
            verticalLineToRelative(-7f)
            curveTo(0f, 8.47f, 2.47f, 6f, 5.5f, 6f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(23f, 5.05f)
            lineTo(18.58f, 0.46f)
            curveToRelative(-0.58f, -0.6f, -1.52f, -0.62f, -2.12f, -0.04f)
            curveToRelative(-0.6f, 0.58f, -0.62f, 1.52f, -0.04f, 2.12f)
            lineToRelative(3.33f, 3.46f)
            horizontalLineToRelative(-6.25f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(6.25f)
            lineToRelative(-3.33f, 3.46f)
            curveToRelative(-0.57f, 0.6f, -0.56f, 1.55f, 0.04f, 2.12f)
            curveToRelative(0.29f, 0.28f, 0.67f, 0.42f, 1.04f, 0.42f)
            curveToRelative(0.39f, 0f, 0.79f, -0.15f, 1.08f, -0.46f)
            lineToRelative(4.39f, -4.56f)
            curveToRelative(1.37f, -1.36f, 1.37f, -3.59f, 0.02f, -4.93f)
            close()
        }
    }.also { _ShareSquare = it }
