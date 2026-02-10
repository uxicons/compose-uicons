package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Slash: ImageVector? = null

val Icons.Tc.Slash: ImageVector
    get() = _Slash ?: UXIcon(name = "Slash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 23f)
                curveToRelative(-0.06f, 0f, -0.12f, -0.01f, -0.19f, -0.04f)
                curveToRelative(-0.22f, -0.09f, -5.42f, -2.22f, -12.24f, -9.04f)
                reflectiveCurveToRelative(-8.95f, -12.02f, -9.04f, -12.24f)
                curveToRelative(-0.1f, -0.26f, 0.02f, -0.55f, 0.28f, -0.65f)
                reflectiveCurveToRelative(0.55f, 0.02f, 0.65f, 0.28f)
                curveToRelative(0.02f, 0.05f, 2.16f, 5.25f, 8.81f, 11.91f)
                curveToRelative(6.66f, 6.66f, 11.86f, 8.79f, 11.91f, 8.81f)
                curveToRelative(0.26f, 0.1f, 0.38f, 0.39f, 0.28f, 0.65f)
                curveToRelative(-0.08f, 0.2f, -0.27f, 0.31f, -0.46f, 0.31f)
                close()
            }
        }.also { _Slash = it}
