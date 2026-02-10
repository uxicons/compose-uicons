package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowMinimize: ImageVector? = null

val Icons.Tc.WindowMinimize: ImageVector
    get() = _WindowMinimize ?: UXIcon(name = "WindowMinimize") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.97f, 21.71f)
                curveToRelative(-0.09f, 0.26f, -0.37f, 0.41f, -0.63f, 0.32f)
                curveToRelative(-0.03f, -0.01f, -3.19f, -1.03f, -9.34f, -1.03f)
                reflectiveCurveToRelative(-9.31f, 1.02f, -9.34f, 1.03f)
                curveToRelative(-0.26f, 0.09f, -0.55f, -0.05f, -0.63f, -0.32f)
                curveToRelative(-0.09f, -0.26f, 0.05f, -0.55f, 0.32f, -0.63f)
                curveToRelative(0.13f, -0.04f, 3.32f, -1.08f, 9.66f, -1.08f)
                reflectiveCurveToRelative(9.53f, 1.04f, 9.66f, 1.08f)
                curveToRelative(0.26f, 0.09f, 0.4f, 0.37f, 0.32f, 0.63f)
                close()
            }
        }.also { _WindowMinimize = it}
