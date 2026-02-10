package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsStaggered: ImageVector? = null

val Icons.Tc.BarsStaggered: ImageVector
    get() = _BarsStaggered ?: UXIcon(name = "BarsStaggered") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.0f, 4.13f)
                curveToRelative(-0.04f, -0.27f, 0.15f, -0.53f, 0.42f, -0.56f)
                curveToRelative(0.04f, -0.01f, 4.03f, -0.57f, 9.07f, -0.57f)
                reflectiveCurveToRelative(9.03f, 0.56f, 9.07f, 0.57f)
                curveToRelative(0.27f, 0.04f, 0.46f, 0.29f, 0.42f, 0.56f)
                curveToRelative(-0.04f, 0.28f, -0.3f, 0.46f, -0.56f, 0.42f)
                curveToRelative(-0.04f, -0.01f, -3.96f, -0.56f, -8.93f, -0.56f)
                reflectiveCurveToRelative(-8.89f, 0.55f, -8.93f, 0.56f)
                curveToRelative(-0.28f, 0.03f, -0.53f, -0.15f, -0.57f, -0.42f)
                close()
                moveTo(22.57f, 11.57f)
                curveToRelative(-0.04f, -0.01f, -4.03f, -0.57f, -9.07f, -0.57f)
                reflectiveCurveToRelative(-9.03f, 0.56f, -9.07f, 0.57f)
                curveToRelative(-0.27f, 0.04f, -0.46f, 0.29f, -0.42f, 0.56f)
                reflectiveCurveToRelative(0.29f, 0.45f, 0.57f, 0.42f)
                curveToRelative(0.04f, -0.01f, 3.96f, -0.56f, 8.93f, -0.56f)
                reflectiveCurveToRelative(8.89f, 0.55f, 8.93f, 0.56f)
                curveToRelative(0.27f, 0.04f, 0.53f, -0.15f, 0.56f, -0.42f)
                curveToRelative(0.04f, -0.27f, -0.15f, -0.53f, -0.42f, -0.56f)
                close()
                moveTo(19.57f, 19.57f)
                curveToRelative(-0.04f, -0.01f, -4.03f, -0.57f, -9.07f, -0.57f)
                reflectiveCurveToRelative(-9.03f, 0.56f, -9.07f, 0.57f)
                curveToRelative(-0.27f, 0.04f, -0.46f, 0.29f, -0.42f, 0.56f)
                reflectiveCurveToRelative(0.29f, 0.46f, 0.57f, 0.42f)
                curveToRelative(0.04f, -0.01f, 3.96f, -0.56f, 8.93f, -0.56f)
                reflectiveCurveToRelative(8.89f, 0.55f, 8.93f, 0.56f)
                curveToRelative(0.27f, 0.04f, 0.53f, -0.15f, 0.56f, -0.42f)
                curveToRelative(0.04f, -0.27f, -0.15f, -0.53f, -0.42f, -0.56f)
                close()
            }
        }.also { _BarsStaggered = it}
