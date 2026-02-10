package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleD: ImageVector? = null

val Icons.Tc.CircleD: ImageVector
    get() = _CircleD ?: UXIcon(name = "CircleD") {
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
                moveTo(12f, 6f)
                curveToRelative(-1.18f, 0f, -2.93f, 0.19f, -3.0f, 0.2f)
                curveToRelative(-0.2f, 0.02f, -0.37f, 0.17f, -0.43f, 0.36f)
                curveToRelative(-0.02f, 0.08f, -0.57f, 2.11f, -0.57f, 5.43f)
                reflectiveCurveToRelative(0.55f, 5.33f, 0.57f, 5.41f)
                curveToRelative(0.05f, 0.19f, 0.22f, 0.34f, 0.42f, 0.36f)
                curveToRelative(0.07f, 0.01f, 1.83f, 0.23f, 3.01f, 0.23f)
                curveToRelative(3.46f, 0f, 5f, -1.85f, 5f, -6f)
                reflectiveCurveToRelative(-1.54f, -6f, -5f, -6f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-0.82f, 0f, -1.98f, -0.12f, -2.54f, -0.18f)
                curveToRelative(-0.15f, -0.68f, -0.46f, -2.38f, -0.46f, -4.82f)
                reflectiveCurveToRelative(0.31f, -4.16f, 0.46f, -4.84f)
                curveToRelative(0.57f, -0.06f, 1.73f, -0.16f, 2.54f, -0.16f)
                curveToRelative(2.4f, 0f, 4f, 0.85f, 4f, 5f)
                reflectiveCurveToRelative(-1.6f, 5f, -4f, 5f)
                close()
            }
        }.also { _CircleD = it}
