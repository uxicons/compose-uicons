package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeUp: ImageVector? = null

val Icons.Sc.MarsStrokeUp: ImageVector
    get() = _MarsStrokeUp ?: UXIcon(name = "MarsStrokeUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 12.13f)
                verticalLineToRelative(-1.13f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.88f)
                curveToRelative(0.28f, 0.25f, 0.64f, 0.39f, 1.0f, 0.39f)
                curveToRelative(1.19f, 0.04f, 1.96f, -1.46f, 1.2f, -2.4f)
                curveToRelative(-0.8f, -1.06f, -1.74f, -2.0f, -2.8f, -2.8f)
                curveToRelative(-0.53f, -0.4f, -1.27f, -0.4f, -1.8f, 0f)
                curveToRelative(-1.06f, 0.8f, -2.0f, 1.74f, -2.8f, 2.8f)
                curveToRelative(-0.5f, 0.66f, -0.36f, 1.6f, 0.3f, 2.1f)
                curveToRelative(0.58f, 0.44f, 1.38f, 0.39f, 1.9f, -0.08f)
                verticalLineToRelative(1.87f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1.13f)
                curveToRelative(-2.68f, 0.45f, -4f, 2.21f, -4f, 5.37f)
                curveToRelative(0f, 3.7f, 1.8f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -1.8f, 5.5f, -5.5f)
                curveToRelative(0f, -3.16f, -1.32f, -4.92f, -4f, -5.37f)
                close()
            }
        }.also { _MarsStrokeUp = it}
