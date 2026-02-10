package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eject: ImageVector? = null

val Icons.Tc.Eject: ImageVector
    get() = _Eject ?: UXIcon(name = "Eject") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.36f, 17.95f)
                curveToRelative(0.15f, 0.04f, 3.65f, 1.05f, 10.64f, 1.05f)
                reflectiveCurveToRelative(10.49f, -1.0f, 10.64f, -1.05f)
                curveToRelative(0.26f, -0.07f, 0.41f, -0.34f, 0.35f, -0.59f)
                curveToRelative(-0.03f, -0.13f, -0.81f, -3.33f, -4.33f, -8.68f)
                curveToRelative(-3.38f, -5.14f, -6.05f, -7.34f, -6.35f, -7.57f)
                curveToRelative(-0.18f, -0.15f, -0.44f, -0.15f, -0.62f, 0f)
                curveToRelative(-0.29f, 0.23f, -2.96f, 2.43f, -6.34f, 7.57f)
                curveToRelative(-3.52f, 5.35f, -4.3f, 8.54f, -4.33f, 8.68f)
                curveToRelative(-0.06f, 0.26f, 0.09f, 0.52f, 0.35f, 0.59f)
                close()
                moveTo(6.18f, 9.23f)
                curveToRelative(2.73f, -4.15f, 5.01f, -6.35f, 5.82f, -7.07f)
                curveToRelative(0.81f, 0.72f, 3.09f, 2.92f, 5.82f, 7.07f)
                curveToRelative(2.65f, 4.02f, 3.71f, 6.82f, 4.05f, 7.88f)
                curveToRelative(-1.18f, 0.27f, -4.49f, 0.89f, -9.87f, 0.89f)
                reflectiveCurveToRelative(-8.7f, -0.62f, -9.87f, -0.89f)
                curveToRelative(0.34f, -1.06f, 1.4f, -3.86f, 4.05f, -7.88f)
                close()
                moveTo(22.64f, 21.96f)
                curveToRelative(-0.15f, 0.04f, -3.65f, 1.04f, -10.64f, 1.04f)
                reflectiveCurveToRelative(-10.49f, -0.99f, -10.64f, -1.04f)
                curveToRelative(-0.27f, -0.08f, -0.42f, -0.35f, -0.34f, -0.62f)
                reflectiveCurveToRelative(0.35f, -0.42f, 0.62f, -0.34f)
                curveToRelative(0.03f, 0.01f, 3.53f, 1.0f, 10.36f, 1.0f)
                reflectiveCurveToRelative(10.33f, -0.99f, 10.36f, -1.0f)
                curveToRelative(0.26f, -0.07f, 0.54f, 0.08f, 0.62f, 0.34f)
                curveToRelative(0.08f, 0.27f, -0.08f, 0.54f, -0.34f, 0.62f)
                close()
            }
        }.also { _Eject = it}
