package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleU: ImageVector? = null

val Icons.Tc.CircleU: ImageVector
    get() = _CircleU ?: UXIcon(name = "CircleU") {
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
                moveTo(16.57f, 6.42f)
                curveToRelative(0.02f, 0.11f, 0.43f, 2.82f, 0.43f, 5.58f)
                curveToRelative(0f, 4.21f, -1.5f, 6f, -5f, 6f)
                reflectiveCurveToRelative(-5f, -1.79f, -5f, -6f)
                curveToRelative(0f, -2.76f, 0.41f, -5.46f, 0.43f, -5.58f)
                curveToRelative(0.04f, -0.27f, 0.3f, -0.46f, 0.57f, -0.42f)
                curveToRelative(0.27f, 0.04f, 0.46f, 0.3f, 0.42f, 0.57f)
                curveToRelative(-0.0f, 0.03f, -0.42f, 2.75f, -0.42f, 5.42f)
                curveToRelative(0f, 3.65f, 1.08f, 5f, 4f, 5f)
                reflectiveCurveToRelative(4f, -1.35f, 4f, -5f)
                curveToRelative(0f, -2.68f, -0.41f, -5.4f, -0.42f, -5.42f)
                curveToRelative(-0.04f, -0.27f, 0.15f, -0.53f, 0.42f, -0.57f)
                curveToRelative(0.27f, -0.05f, 0.53f, 0.15f, 0.57f, 0.42f)
                close()
            }
        }.also { _CircleU = it}
