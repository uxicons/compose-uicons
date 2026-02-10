package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThan: ImageVector? = null

val Icons.Rc.LessThan: ImageVector
    get() = _LessThan ?: UXIcon(name = "LessThan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 22.09f)
                curveToRelative(-0.04f, 0.55f, -0.54f, 0.96f, -1.08f, 0.91f)
                curveToRelative(-11.74f, -1.02f, -20.28f, -9.93f, -20.64f, -10.31f)
                curveToRelative(-0.36f, -0.39f, -0.36f, -0.99f, 0f, -1.37f)
                curveToRelative(0.36f, -0.38f, 8.9f, -9.29f, 20.64f, -10.31f)
                curveToRelative(0.54f, -0.06f, 1.03f, 0.36f, 1.08f, 0.91f)
                curveToRelative(0.05f, 0.55f, -0.36f, 1.03f, -0.91f, 1.08f)
                curveToRelative(-9.15f, 0.8f, -16.43f, 6.92f, -18.65f, 9.0f)
                curveToRelative(2.23f, 2.08f, 9.52f, 8.21f, 18.65f, 9.01f)
                curveToRelative(0.55f, 0.05f, 0.96f, 0.53f, 0.91f, 1.08f)
                close()
            }
        }.also { _LessThan = it}
