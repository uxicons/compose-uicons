package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleZ: ImageVector? = null

val Icons.Tc.CircleZ: ImageVector
    get() = _CircleZ ?: UXIcon(name = "CircleZ") {
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
                moveTo(16.48f, 16.82f)
                curveToRelative(0.07f, 0.27f, -0.09f, 0.54f, -0.35f, 0.61f)
                curveToRelative(-0.09f, 0.02f, -2.11f, 0.57f, -4.13f, 0.57f)
                reflectiveCurveToRelative(-4.05f, -0.54f, -4.13f, -0.57f)
                curveToRelative(-0.16f, -0.04f, -0.29f, -0.17f, -0.34f, -0.33f)
                curveToRelative(-0.05f, -0.16f, -0.02f, -0.34f, 0.09f, -0.47f)
                lineToRelative(7.5f, -9.28f)
                curveToRelative(-0.75f, -0.15f, -1.95f, -0.36f, -3.11f, -0.36f)
                curveToRelative(-1.88f, 0f, -3.85f, 0.53f, -3.87f, 0.53f)
                curveToRelative(-0.27f, 0.07f, -0.54f, -0.09f, -0.61f, -0.35f)
                curveToRelative(-0.07f, -0.27f, 0.09f, -0.54f, 0.35f, -0.61f)
                curveToRelative(0.09f, -0.02f, 2.11f, -0.57f, 4.13f, -0.57f)
                reflectiveCurveToRelative(4.05f, 0.54f, 4.13f, 0.57f)
                curveToRelative(0.16f, 0.04f, 0.29f, 0.17f, 0.34f, 0.33f)
                curveToRelative(0.05f, 0.16f, 0.02f, 0.34f, -0.09f, 0.47f)
                lineToRelative(-7.5f, 9.28f)
                curveToRelative(0.75f, 0.15f, 1.95f, 0.36f, 3.11f, 0.36f)
                curveToRelative(1.88f, 0f, 3.85f, -0.53f, 3.87f, -0.53f)
                curveToRelative(0.27f, -0.07f, 0.54f, 0.09f, 0.61f, 0.35f)
                close()
            }
        }.also { _CircleZ = it}
