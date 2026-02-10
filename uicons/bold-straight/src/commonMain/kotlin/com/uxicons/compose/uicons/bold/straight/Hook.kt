package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hook: ImageVector? = null

val Icons.Bs.Hook: ImageVector
    get() = _Hook ?: UXIcon(name = "Hook") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 16f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                curveToRelative(-4.39f, 0f, -7.96f, -3.55f, -8.0f, -7.93f)
                curveToRelative(-0.0f, -0.04f, -0.0f, -0.07f, -0.0f, -0.07f)
                verticalLineToRelative(-4f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -1.82f, -0.99f, -3.5f, -2.59f, -4.38f)
                curveToRelative(-2.45f, -1.35f, -3.91f, -3.69f, -3.91f, -6.26f)
                verticalLineToRelative(-0.87f)
                curveToRelative(-0.6f, -0.46f, -1f, -1.17f, -1f, -1.99f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.81f, -0.4f, 1.53f, -1f, 1.99f)
                verticalLineToRelative(0.87f)
                curveToRelative(0f, 1.46f, 0.88f, 2.82f, 2.36f, 3.63f)
                curveToRelative(2.56f, 1.41f, 4.14f, 4.09f, 4.14f, 7.01f)
                close()
            }
        }.also { _Hook = it}
