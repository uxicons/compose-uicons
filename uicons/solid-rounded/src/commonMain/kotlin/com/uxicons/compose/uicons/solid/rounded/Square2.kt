package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square2: ImageVector? = null

val Icons.Sr.Square2: ImageVector
    get() = _Square2 ?: UXIcon(name = "Square2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(-5.16f)
                curveToRelative(-0.72f, 0f, -1.36f, -0.41f, -1.67f, -1.06f)
                curveToRelative(-0.31f, -0.66f, -0.2f, -1.42f, 0.27f, -1.98f)
                curveToRelative(0.63f, -0.75f, 1.57f, -1.26f, 2.56f, -1.8f)
                curveToRelative(1.91f, -1.04f, 3.06f, -1.78f, 2.99f, -3.29f)
                curveToRelative(-0.04f, -1.03f, -0.94f, -1.87f, -2.0f, -1.87f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                curveToRelative(2.15f, 0f, 3.9f, 1.66f, 4.0f, 3.78f)
                curveToRelative(0.12f, 2.87f, -2.28f, 4.17f, -4.04f, 5.13f)
                curveToRelative(-0.67f, 0.37f, -1.31f, 0.72f, -1.74f, 1.09f)
                horizontalLineToRelative(4.78f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Square2 = it}
