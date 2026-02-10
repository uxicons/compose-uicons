package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Octagon: ImageVector? = null

val Icons.Tc.Octagon: ImageVector
    get() = _Octagon ?: UXIcon(name = "Octagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 23f)
                curveToRelative(-3.07f, 0f, -4.29f, -0.52f, -4.34f, -0.54f)
                curveToRelative(-0.12f, -0.06f, -1.98f, -1.08f, -4.01f, -3.1f)
                curveToRelative(-1.04f, -1.04f, -2.04f, -2.9f, -2.09f, -2.98f)
                curveToRelative(-0.06f, -0.16f, -0.56f, -1.83f, -0.56f, -4.38f)
                reflectiveCurveToRelative(0.5f, -4.22f, 0.52f, -4.29f)
                curveToRelative(0.08f, -0.17f, 1.08f, -2.03f, 2.12f, -3.07f)
                curveToRelative(2.03f, -2.03f, 3.9f, -3.04f, 3.98f, -3.09f)
                curveToRelative(0.09f, -0.04f, 1.31f, -0.56f, 4.38f, -0.56f)
                reflectiveCurveToRelative(4.29f, 0.52f, 4.34f, 0.54f)
                curveToRelative(0.12f, 0.06f, 1.98f, 1.08f, 4.01f, 3.1f)
                curveToRelative(1.04f, 1.04f, 2.04f, 2.9f, 2.09f, 2.98f)
                curveToRelative(0.06f, 0.16f, 0.56f, 1.83f, 0.56f, 4.38f)
                reflectiveCurveToRelative(-0.5f, 4.22f, -0.52f, 4.29f)
                curveToRelative(-0.08f, 0.17f, -1.08f, 2.03f, -2.12f, 3.07f)
                curveToRelative(-2.03f, 2.03f, -3.9f, 3.04f, -3.98f, 3.09f)
                curveToRelative(-0.09f, 0.04f, -1.31f, 0.56f, -4.38f, 0.56f)
                close()
                moveTo(8.1f, 21.56f)
                curveToRelative(0.01f, 0f, 1.13f, 0.44f, 3.9f, 0.44f)
                curveToRelative(2.81f, 0f, 3.93f, -0.45f, 3.94f, -0.46f)
                reflectiveCurveToRelative(1.79f, -0.98f, 3.7f, -2.89f)
                curveToRelative(0.92f, -0.92f, 1.87f, -2.66f, 1.91f, -2.74f)
                curveToRelative(-0.01f, 0f, 0.44f, -1.58f, 0.44f, -3.91f)
                curveToRelative(0f, -2.35f, -0.46f, -3.93f, -0.48f, -4.0f)
                curveToRelative(-0.01f, 0f, -0.96f, -1.74f, -1.88f, -2.65f)
                curveToRelative(-1.91f, -1.91f, -3.7f, -2.89f, -3.74f, -2.91f)
                curveToRelative(-0.01f, 0f, -1.13f, -0.44f, -3.9f, -0.44f)
                curveToRelative(-2.81f, 0f, -3.93f, 0.45f, -3.94f, 0.46f)
                reflectiveCurveToRelative(-1.79f, 0.98f, -3.7f, 2.89f)
                curveToRelative(-0.92f, 0.92f, -1.87f, 2.66f, -1.91f, 2.74f)
                curveToRelative(0.01f, 0f, -0.44f, 1.58f, -0.44f, 3.91f)
                curveToRelative(0f, 2.35f, 0.46f, 3.93f, 0.48f, 4.0f)
                curveToRelative(0.01f, 0f, 0.96f, 1.74f, 1.88f, 2.65f)
                curveToRelative(1.91f, 1.91f, 3.7f, 2.89f, 3.74f, 2.91f)
                close()
            }
        }.also { _Octagon = it}
