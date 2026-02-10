package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowMinimize: ImageVector? = null

val Icons.Rc.WindowMinimize: ImageVector
    get() = _WindowMinimize ?: UXIcon(name = "WindowMinimize") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.95f, 21.32f)
                curveToRelative(-0.17f, 0.53f, -0.76f, 0.81f, -1.26f, 0.63f)
                curveToRelative(-0.03f, -0.01f, -2.96f, -0.95f, -8.68f, -0.95f)
                reflectiveCurveToRelative(-8.66f, 0.94f, -8.69f, 0.95f)
                curveToRelative(-0.53f, 0.17f, -1.09f, -0.11f, -1.26f, -0.64f)
                curveToRelative(-0.17f, -0.52f, 0.11f, -1.09f, 0.63f, -1.26f)
                curveToRelative(0.13f, -0.04f, 3.22f, -1.05f, 9.32f, -1.05f)
                reflectiveCurveToRelative(9.19f, 1.01f, 9.32f, 1.05f)
                curveToRelative(0.52f, 0.17f, 0.81f, 0.74f, 0.63f, 1.26f)
                close()
            }
        }.also { _WindowMinimize = it}
