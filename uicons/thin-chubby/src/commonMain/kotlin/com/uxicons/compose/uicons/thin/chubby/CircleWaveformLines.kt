package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleWaveformLines: ImageVector? = null

val Icons.Tc.CircleWaveformLines: ImageVector
    get() = _CircleWaveformLines ?: UXIcon(name = "CircleWaveformLines") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.81f, 0f, -11f, 3.19f, -11f, 11f)
                reflectiveCurveToRelative(3.19f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.19f, 11f, -11f)
                reflectiveCurveToRelative(-3.19f, -11f, -11f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.2f, 0f, -10f, -2.8f, -10f, -10f)
                reflectiveCurveToRelative(2.8f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.8f, 10f, 10f)
                reflectiveCurveToRelative(-2.8f, 10f, -10f, 10f)
                close()
                moveTo(12.99f, 5.57f)
                curveToRelative(-0.23f, 1.6f, -0.49f, 4.02f, -0.49f, 6.43f)
                reflectiveCurveToRelative(0.27f, 4.83f, 0.49f, 6.43f)
                curveToRelative(0.04f, 0.27f, -0.15f, 0.53f, -0.42f, 0.56f)
                curveToRelative(-0.27f, 0.04f, -0.53f, -0.15f, -0.56f, -0.42f)
                curveToRelative(-0.23f, -1.63f, -0.51f, -4.1f, -0.51f, -6.57f)
                reflectiveCurveToRelative(0.27f, -4.94f, 0.51f, -6.57f)
                curveToRelative(0.04f, -0.27f, 0.28f, -0.46f, 0.56f, -0.42f)
                curveToRelative(0.27f, 0.04f, 0.46f, 0.29f, 0.42f, 0.56f)
                close()
                moveTo(8.19f, 8.55f)
                curveToRelative(-0.12f, 1.22f, -0.19f, 2.38f, -0.19f, 3.45f)
                reflectiveCurveToRelative(0.06f, 2.23f, 0.19f, 3.45f)
                curveToRelative(0.03f, 0.28f, -0.17f, 0.52f, -0.45f, 0.55f)
                curveToRelative(-0.27f, 0.03f, -0.52f, -0.17f, -0.55f, -0.45f)
                curveToRelative(-0.13f, -1.25f, -0.19f, -2.45f, -0.19f, -3.55f)
                reflectiveCurveToRelative(0.06f, -2.3f, 0.19f, -3.55f)
                curveToRelative(0.03f, -0.27f, 0.27f, -0.47f, 0.55f, -0.45f)
                curveToRelative(0.27f, 0.03f, 0.47f, 0.27f, 0.45f, 0.55f)
                close()
                moveTo(17.31f, 7.56f)
                curveToRelative(-0.2f, 1.59f, -0.31f, 3.08f, -0.31f, 4.44f)
                reflectiveCurveToRelative(0.1f, 2.85f, 0.31f, 4.44f)
                curveToRelative(0.04f, 0.27f, -0.16f, 0.53f, -0.43f, 0.56f)
                curveToRelative(-0.27f, 0.04f, -0.53f, -0.16f, -0.56f, -0.43f)
                curveToRelative(-0.21f, -1.63f, -0.32f, -3.17f, -0.32f, -4.56f)
                reflectiveCurveToRelative(0.11f, -2.93f, 0.32f, -4.56f)
                curveToRelative(0.04f, -0.27f, 0.29f, -0.47f, 0.56f, -0.43f)
                curveToRelative(0.27f, 0.04f, 0.47f, 0.29f, 0.43f, 0.56f)
                close()
            }
        }.also { _CircleWaveformLines = it}
