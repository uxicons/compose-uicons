package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudMoon: ImageVector? = null

val Icons.Sc.CloudMoon: ImageVector
    get() = _CloudMoon ?: UXIcon(name = "CloudMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.52f, 17.86f)
                curveToRelative(0f, -1.94f, 0.98f, -3.72f, 2.53f, -4.77f)
                curveToRelative(0.19f, -1.48f, 0.84f, -2.82f, 1.78f, -3.88f)
                curveToRelative(0.06f, -0.36f, 0.14f, -0.75f, 0.26f, -1.15f)
                curveToRelative(0.53f, -1.94f, 1.31f, -3.13f, 2.39f, -3.64f)
                curveToRelative(0.39f, -0.19f, 0.62f, -0.61f, 0.56f, -1.04f)
                curveToRelative(-0.06f, -0.43f, -0.39f, -0.78f, -0.82f, -0.85f)
                curveTo(7.33f, 1.67f, 2.65f, 4.64f, 1.34f, 9.43f)
                curveToRelative(-1.0f, 3.65f, 0.25f, 7.55f, 3.18f, 9.95f)
                curveToRelative(0.18f, 0.15f, 0.4f, 0.23f, 0.63f, 0.23f)
                curveToRelative(0.07f, 0f, 0.15f, -0.01f, 0.22f, -0.02f)
                curveToRelative(0.13f, -0.03f, 0.25f, -0.08f, 0.36f, -0.16f)
                curveToRelative(-0.14f, -0.49f, -0.21f, -1.01f, -0.21f, -1.55f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.87f, 21.62f)
                horizontalLineToRelative(-7.59f)
                curveToRelative(-2.07f, 0f, -3.75f, -1.68f, -3.75f, -3.75f)
                curveToRelative(0f, -1.62f, 1.03f, -3.01f, 2.48f, -3.53f)
                curveToRelative(-0.01f, -0.1f, -0.01f, -0.19f, -0.01f, -0.29f)
                curveToRelative(0f, -2.9f, 2.36f, -5.25f, 5.26f, -5.25f)
                curveToRelative(2.78f, 0f, 5.06f, 2.17f, 5.24f, 4.91f)
                curveToRelative(1.49f, 0.64f, 2.5f, 2.12f, 2.5f, 3.79f)
                curveToRelative(0f, 2.28f, -1.85f, 4.13f, -4.13f, 4.13f)
                close()
            }
        }.also { _CloudMoon = it}
