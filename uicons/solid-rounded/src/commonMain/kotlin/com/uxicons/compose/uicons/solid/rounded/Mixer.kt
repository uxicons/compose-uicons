package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mixer: ImageVector? = null

val Icons.Sr.Mixer: ImageVector
    get() = _Mixer ?: UXIcon(name = "Mixer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.44f, 11.04f)
                curveToRelative(1.14f, -1.25f, 1.69f, -2.93f, 1.53f, -4.62f)
                curveToRelative(-0.28f, -2.91f, -2.78f, -5.21f, -5.79f, -5.39f)
                curveToRelative(-0.06f, -0.0f, -1.18f, -0.02f, -1.18f, -0.02f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                horizontalLineToRelative(-6.46f)
                curveTo(5.15f, 1f, 2.09f, 2.87f, 0.54f, 5.88f)
                curveToRelative(-0.77f, 1.5f, -0.7f, 3.26f, 0.19f, 4.72f)
                curveToRelative(0.92f, 1.5f, 2.5f, 2.4f, 4.25f, 2.4f)
                horizontalLineToRelative(11.03f)
                verticalLineToRelative(2.13f)
                curveToRelative(-1.8f, 0.45f, -3f, 2.11f, -3f, 4.37f)
                curveToRelative(0f, 2.65f, 1.65f, 4.5f, 4f, 4.5f)
                reflectiveCurveToRelative(4f, -1.85f, 4f, -4.5f)
                curveToRelative(0f, -2.25f, -1.2f, -3.92f, -3f, -4.37f)
                verticalLineToRelative(-2.13f)
                curveToRelative(1.69f, 0f, 3.31f, -0.72f, 4.44f, -1.96f)
                close()
                moveTo(11.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(15f, 19.5f)
                curveToRelative(0f, -0.88f, 0.28f, -1.79f, 1f, -2.23f)
                verticalLineToRelative(4.46f)
                curveToRelative(-0.72f, -0.44f, -1f, -1.35f, -1f, -2.23f)
                close()
                moveTo(19f, 19.5f)
                curveToRelative(0f, 0.88f, -0.28f, 1.79f, -1f, 2.23f)
                verticalLineToRelative(-4.46f)
                curveToRelative(0.72f, 0.44f, 1f, 1.35f, 1f, 2.23f)
                close()
            }
        }.also { _Mixer = it}
