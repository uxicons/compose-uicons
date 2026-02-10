package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowMinimize: ImageVector? = null

val Icons.Sc.WindowMinimize: ImageVector
    get() = _WindowMinimize ?: UXIcon(name = "WindowMinimize") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 22f)
                curveToRelative(-1.0f, -0.09f, -2.49f, -0.96f, -8.5f, -1f)
                curveToRelative(-5.28f, 0f, -7.98f, 0.91f, -8.01f, 0.92f)
                curveToRelative(-0.78f, 0.27f, -1.64f, -0.14f, -1.91f, -0.93f)
                curveToRelative(-0.27f, -0.78f, 0.14f, -1.63f, 0.92f, -1.91f)
                curveToRelative(0.12f, -0.04f, 3.14f, -1.09f, 9.0f, -1.09f)
                reflectiveCurveToRelative(8.87f, 1.04f, 9.0f, 1.09f)
                curveToRelative(0.78f, 0.28f, 1.19f, 1.13f, 0.92f, 1.91f)
                curveToRelative(-0.22f, 0.62f, -0.8f, 1.0f, -1.42f, 1.0f)
                close()
            }
        }.also { _WindowMinimize = it}
