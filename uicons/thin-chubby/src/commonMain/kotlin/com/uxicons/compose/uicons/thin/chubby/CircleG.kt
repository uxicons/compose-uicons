package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleG: ImageVector? = null

val Icons.Tc.CircleG: ImageVector
    get() = _CircleG ?: UXIcon(name = "CircleG") {
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
                moveTo(16.72f, 12.82f)
                lineTo(16.71f, 13.7f)
                curveToRelative(-0.37f, 3.02f, -1.86f, 4.34f, -4.81f, 4.34f)
                curveToRelative(-3.44f, 0f, -4.9f, -1.79f, -4.9f, -6f)
                reflectiveCurveToRelative(1.47f, -6f, 4.9f, -6f)
                curveToRelative(2.17f, 0f, 3.52f, 0.71f, 4.25f, 2.25f)
                curveToRelative(0.12f, 0.25f, 0.01f, 0.55f, -0.24f, 0.67f)
                curveToRelative(-0.25f, 0.12f, -0.55f, 0.01f, -0.67f, -0.24f)
                curveToRelative(-0.55f, -1.16f, -1.59f, -1.68f, -3.35f, -1.68f)
                curveToRelative(-2.84f, 0f, -3.9f, 1.35f, -3.9f, 5f)
                reflectiveCurveToRelative(1.06f, 5f, 3.9f, 5f)
                curveToRelative(2.44f, 0f, 3.51f, -0.96f, 3.81f, -3.41f)
                lineToRelative(0.0f, -0.39f)
                curveToRelative(-0.76f, -0.11f, -2.02f, -0.24f, -3.22f, -0.24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                curveToRelative(1.53f, 0f, 3.12f, 0.19f, 3.81f, 0.32f)
                curveToRelative(0.24f, 0.04f, 0.41f, 0.26f, 0.41f, 0.5f)
                close()
            }
        }.also { _CircleG = it}
