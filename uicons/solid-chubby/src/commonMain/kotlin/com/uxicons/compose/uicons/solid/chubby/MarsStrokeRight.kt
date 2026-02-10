package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeRight: ImageVector? = null

val Icons.Sc.MarsStrokeRight: ImageVector
    get() = _MarsStrokeRight ?: UXIcon(name = "MarsStrokeRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.69f, 11.1f)
                curveToRelative(-0.8f, -1.06f, -1.74f, -2.0f, -2.8f, -2.8f)
                curveToRelative(-0.66f, -0.5f, -1.6f, -0.36f, -2.1f, 0.3f)
                curveToRelative(-0.44f, 0.58f, -0.39f, 1.38f, 0.08f, 1.9f)
                horizontalLineToRelative(-1.87f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1.13f)
                curveToRelative(-0.45f, -2.68f, -2.21f, -4f, -5.37f, -4f)
                curveToRelative(-3.7f, 0f, -5.5f, 1.8f, -5.5f, 5.5f)
                reflectiveCurveToRelative(1.8f, 5.5f, 5.5f, 5.5f)
                curveToRelative(3.16f, 0f, 4.92f, -1.32f, 5.37f, -4f)
                horizontalLineToRelative(1.13f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(1.87f)
                curveToRelative(-0.47f, 0.52f, -0.52f, 1.32f, -0.08f, 1.9f)
                curveToRelative(0.5f, 0.67f, 1.44f, 0.79f, 2.1f, 0.3f)
                curveToRelative(1.06f, -0.8f, 2.0f, -1.74f, 2.8f, -2.8f)
                curveToRelative(0.4f, -0.53f, 0.4f, -1.27f, 0f, -1.8f)
                close()
            }
        }.also { _MarsStrokeRight = it}
