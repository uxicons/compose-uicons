package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleWaveformLines: ImageVector? = null

val Icons.Rc.CircleWaveformLines: ImageVector
    get() = _CircleWaveformLines ?: UXIcon(name = "CircleWaveformLines") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                reflectiveCurveToRelative(-2.44f, 9f, -9f, 9f)
                close()
                moveTo(13.57f, 6.18f)
                curveToRelative(-0.26f, 1.45f, -0.57f, 3.64f, -0.57f, 5.82f)
                reflectiveCurveToRelative(0.31f, 4.37f, 0.57f, 5.82f)
                curveToRelative(0.1f, 0.54f, -0.26f, 1.06f, -0.81f, 1.16f)
                curveToRelative(-0.53f, 0.1f, -1.06f, -0.26f, -1.16f, -0.81f)
                curveToRelative(-0.27f, -1.53f, -0.6f, -3.85f, -0.6f, -6.18f)
                reflectiveCurveToRelative(0.33f, -4.64f, 0.6f, -6.18f)
                curveToRelative(0.1f, -0.54f, 0.62f, -0.91f, 1.16f, -0.81f)
                curveToRelative(0.54f, 0.1f, 0.91f, 0.62f, 0.81f, 1.16f)
                close()
                moveTo(9.16f, 9.1f)
                curveToRelative(-0.1f, 1.03f, -0.16f, 2.0f, -0.16f, 2.9f)
                reflectiveCurveToRelative(0.05f, 1.87f, 0.16f, 2.9f)
                curveToRelative(0.06f, 0.55f, -0.34f, 1.04f, -0.89f, 1.1f)
                curveToRelative(-0.54f, 0.06f, -1.04f, -0.34f, -1.1f, -0.89f)
                curveToRelative(-0.11f, -1.09f, -0.17f, -2.14f, -0.17f, -3.1f)
                reflectiveCurveToRelative(0.06f, -2.01f, 0.17f, -3.1f)
                curveToRelative(0.06f, -0.55f, 0.55f, -0.94f, 1.1f, -0.89f)
                curveToRelative(0.55f, 0.06f, 0.95f, 0.55f, 0.89f, 1.1f)
                close()
                moveTo(17.27f, 8.13f)
                curveToRelative(-0.18f, 1.39f, -0.27f, 2.69f, -0.27f, 3.87f)
                reflectiveCurveToRelative(0.09f, 2.48f, 0.27f, 3.87f)
                curveToRelative(0.07f, 0.55f, -0.32f, 1.05f, -0.86f, 1.12f)
                curveToRelative(-0.54f, 0.07f, -1.05f, -0.31f, -1.12f, -0.86f)
                curveToRelative(-0.19f, -1.48f, -0.29f, -2.86f, -0.29f, -4.13f)
                reflectiveCurveToRelative(0.1f, -2.65f, 0.29f, -4.13f)
                curveToRelative(0.07f, -0.55f, 0.58f, -0.93f, 1.12f, -0.86f)
                curveToRelative(0.55f, 0.07f, 0.94f, 0.57f, 0.86f, 1.12f)
                close()
            }
        }.also { _CircleWaveformLines = it}
