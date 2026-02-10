package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LessThan: ImageVector? = null

val Icons.Tc.LessThan: ImageVector
    get() = _LessThan ?: UXIcon(name = "LessThan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 23f)
                curveToRelative(-12.1f, -1.01f, -21.29f, -10.57f, -21.36f, -10.66f)
                curveToRelative(-0.18f, -0.19f, -0.18f, -0.49f, 0f, -0.69f)
                curveToRelative(0.09f, -0.1f, 9.2f, -9.6f, 21.32f, -10.65f)
                curveToRelative(0.27f, -0.04f, 0.52f, 0.18f, 0.54f, 0.46f)
                reflectiveCurveToRelative(-0.18f, 0.52f, -0.46f, 0.54f)
                curveToRelative(-10.44f, 0.91f, -18.6f, 8.31f, -20.34f, 10.0f)
                curveToRelative(1.74f, 1.69f, 9.9f, 9.1f, 20.34f, 10.0f)
                curveToRelative(0.28f, 0.02f, 0.48f, 0.27f, 0.46f, 0.54f)
                curveToRelative(-0.02f, 0.26f, -0.24f, 0.46f, -0.5f, 0.46f)
                close()
            }
        }.also { _LessThan = it}
