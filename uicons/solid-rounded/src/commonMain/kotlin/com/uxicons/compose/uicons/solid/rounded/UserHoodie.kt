package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserHoodie: ImageVector? = null

val Icons.Sr.UserHoodie: ImageVector
    get() = _UserHoodie ?: UXIcon(name = "UserHoodie") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.01f, 7f)
                horizontalLineToRelative(-0.01f)
                curveTo(5f, 3.14f, 8.14f, 0f, 12f, 0f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 0.22f, -0.02f, 0.45f, -0.04f, 0.68f)
                curveToRelative(-0.2f, -0.41f, -0.44f, -0.8f, -0.73f, -1.15f)
                curveToRelative(-0.93f, -1.15f, -2.77f, -2.52f, -6.22f, -2.52f)
                reflectiveCurveToRelative(-5.28f, 1.37f, -6.21f, 2.52f)
                curveToRelative(-0.29f, 0.36f, -0.54f, 0.76f, -0.74f, 1.18f)
                curveToRelative(-0.03f, -0.23f, -0.05f, -0.47f, -0.05f, -0.7f)
                close()
                moveTo(5.79f, 14.51f)
                curveToRelative(-1.75f, 1.68f, -2.79f, 4.02f, -2.79f, 6.49f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3.36f)
                curveToRelative(-1.33f, -1.29f, -3.19f, -3.14f, -5.21f, -6.13f)
                close()
                moveTo(18.23f, 14.52f)
                curveToRelative(-2.04f, 3.02f, -3.88f, 4.83f, -5.23f, 6.15f)
                verticalLineToRelative(3.33f)
                horizontalLineToRelative(5f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -2.47f, -1.03f, -4.8f, -2.77f, -6.48f)
                close()
                moveTo(16.78f, 13.09f)
                curveToRelative(-1.68f, 2.63f, -3.85f, 4.86f, -4.77f, 5.75f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.92f, -0.89f, -3.09f, -3.13f, -4.77f, -5.75f)
                curveToRelative(-0.55f, -0.86f, -0.88f, -1.88f, -0.8f, -2.9f)
                curveToRelative(0.07f, -0.93f, 0.38f, -1.75f, 0.91f, -2.4f)
                curveToRelative(0.95f, -1.17f, 2.56f, -1.78f, 4.67f, -1.78f)
                horizontalLineToRelative(0.01f)
                curveToRelative(2.11f, 0f, 3.72f, 0.62f, 4.67f, 1.78f)
                curveToRelative(0.53f, 0.65f, 0.84f, 1.48f, 0.91f, 2.4f)
                curveToRelative(0.08f, 1.02f, -0.25f, 2.04f, -0.8f, 2.9f)
                close()
                moveTo(14.41f, 13f)
                horizontalLineToRelative(-4.81f)
                curveToRelative(0.52f, 0.72f, 1.05f, 1.4f, 1.56f, 2f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.51f, -0.6f, 1.04f, -1.28f, 1.55f, -2f)
                close()
            }
        }.also { _UserHoodie = it}
