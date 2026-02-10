package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThan: ImageVector? = null

val Icons.Tc.GreaterThan: ImageVector
    get() = _GreaterThan ?: UXIcon(name = "GreaterThan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.5f, 23f)
                curveToRelative(-0.26f, 0f, -0.47f, -0.2f, -0.5f, -0.46f)
                curveToRelative(-0.02f, -0.28f, 0.18f, -0.52f, 0.46f, -0.54f)
                curveToRelative(10.44f, -0.91f, 18.6f, -8.31f, 20.34f, -10.0f)
                curveToRelative(-1.74f, -1.69f, -9.9f, -9.09f, -20.34f, -10.0f)
                curveToRelative(-0.28f, -0.02f, -0.48f, -0.27f, -0.46f, -0.54f)
                curveToRelative(0.02f, -0.28f, 0.27f, -0.48f, 0.54f, -0.46f)
                curveToRelative(12.12f, 1.05f, 21.23f, 10.56f, 21.32f, 10.65f)
                curveToRelative(0.18f, 0.19f, 0.18f, 0.49f, 0f, 0.69f)
                curveToRelative(-0.06f, 0.08f, -9.28f, 9.65f, -21.36f, 10.66f)
                close()
            }
        }.also { _GreaterThan = it}
