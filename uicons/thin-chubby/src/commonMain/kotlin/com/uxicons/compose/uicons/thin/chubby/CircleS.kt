package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleS: ImageVector? = null

val Icons.Tc.CircleS: ImageVector
    get() = _CircleS ?: UXIcon(name = "CircleS") {
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
                moveTo(16f, 14.75f)
                curveToRelative(0f, 2.07f, -1.68f, 3.75f, -3.75f, 3.75f)
                curveToRelative(-1.59f, 0f, -3.01f, -1.0f, -3.54f, -2.5f)
                curveToRelative(-0.09f, -0.26f, 0.04f, -0.55f, 0.3f, -0.64f)
                curveToRelative(0.26f, -0.09f, 0.55f, 0.04f, 0.64f, 0.3f)
                curveToRelative(0.39f, 1.1f, 1.43f, 1.83f, 2.59f, 1.83f)
                curveToRelative(1.52f, 0f, 2.75f, -1.23f, 2.75f, -2.75f)
                reflectiveCurveToRelative(-1.23f, -2.75f, -2.75f, -2.75f)
                curveToRelative(-1.79f, 0f, -3.25f, -1.46f, -3.25f, -3.25f)
                reflectiveCurveToRelative(1.46f, -3.25f, 3.25f, -3.25f)
                curveToRelative(1.29f, 0f, 2.46f, 0.77f, 2.98f, 1.95f)
                curveToRelative(0.11f, 0.25f, -0.01f, 0.55f, -0.26f, 0.66f)
                curveToRelative(-0.25f, 0.11f, -0.55f, -0.0f, -0.66f, -0.26f)
                curveToRelative(-0.36f, -0.82f, -1.17f, -1.35f, -2.06f, -1.35f)
                curveToRelative(-1.24f, 0f, -2.25f, 1.01f, -2.25f, 2.25f)
                reflectiveCurveToRelative(1.01f, 2.25f, 2.25f, 2.25f)
                curveToRelative(2.07f, 0f, 3.75f, 1.68f, 3.75f, 3.75f)
                close()
            }
        }.also { _CircleS = it}
