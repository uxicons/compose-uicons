package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleB: ImageVector? = null

val Icons.Sr.CircleB: ImageVector
    get() = _CircleB ?: UXIcon(name = "CircleB") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.43f, 10.98f)
                horizontalLineToRelative(-3.43f)
                verticalLineToRelative(-2.23f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.27f)
                curveToRelative(0.46f, 0f, 0.88f, 0.18f, 1.21f, 0.5f)
                curveToRelative(0.32f, 0.33f, 0.49f, 0.76f, 0.49f, 1.21f)
                curveToRelative(-0.01f, 0.83f, -0.7f, 1.51f, -1.54f, 1.51f)
                close()
                moveTo(14.46f, 12.98f)
                horizontalLineToRelative(-5.46f)
                verticalLineToRelative(2.27f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4.23f)
                curveToRelative(0.47f, 0f, 0.9f, -0.18f, 1.23f, -0.52f)
                curveToRelative(0.33f, -0.33f, 0.51f, -0.77f, 0.5f, -1.24f)
                curveToRelative(0f, -0.84f, -0.67f, -1.51f, -1.5f, -1.51f)
                close()
                moveTo(23.96f, 11.98f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(-0.04f, 18.6f, -0.04f, 11.98f)
                reflectiveCurveTo(5.34f, -0.02f, 11.96f, -0.02f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(17.96f, 14.48f)
                curveToRelative(0f, -1.56f, -1.03f, -2.89f, -2.44f, -3.34f)
                curveToRelative(0.27f, -0.49f, 0.43f, -1.05f, 0.44f, -1.65f)
                curveToRelative(0.01f, -1.0f, -0.36f, -1.94f, -1.06f, -2.65f)
                curveToRelative(-0.7f, -0.71f, -1.63f, -1.1f, -2.63f, -1.1f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4.23f)
                curveToRelative(1.01f, 0f, 1.95f, -0.4f, 2.66f, -1.11f)
                reflectiveCurveToRelative(1.09f, -1.67f, 1.07f, -2.66f)
                close()
            }
        }.also { _CircleB = it}
