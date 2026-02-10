package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepBackward: ImageVector? = null

val Icons.Tc.StepBackward: ImageVector
    get() = _StepBackward ?: UXIcon(name = "StepBackward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.95f, 1.36f)
                curveToRelative(-0.07f, -0.26f, -0.34f, -0.41f, -0.59f, -0.35f)
                curveToRelative(-0.13f, 0.03f, -3.33f, 0.81f, -8.68f, 4.33f)
                curveToRelative(-3.45f, 2.27f, -5.57f, 4.22f, -6.67f, 5.34f)
                curveToRelative(0.11f, -5.96f, 0.97f, -9.02f, 0.98f, -9.05f)
                curveToRelative(0.08f, -0.27f, -0.08f, -0.54f, -0.34f, -0.62f)
                curveToRelative(-0.27f, -0.08f, -0.54f, 0.07f, -0.62f, 0.34f)
                curveToRelative(-0.04f, 0.15f, -1.04f, 3.65f, -1.04f, 10.64f)
                reflectiveCurveToRelative(0.99f, 10.49f, 1.04f, 10.64f)
                curveToRelative(0.08f, 0.27f, 0.36f, 0.42f, 0.62f, 0.34f)
                curveToRelative(0.27f, -0.08f, 0.42f, -0.35f, 0.34f, -0.62f)
                curveToRelative(-0.01f, -0.03f, -0.87f, -3.09f, -0.98f, -9.05f)
                curveToRelative(1.09f, 1.12f, 3.21f, 3.07f, 6.67f, 5.34f)
                curveToRelative(5.35f, 3.52f, 8.54f, 4.3f, 8.68f, 4.33f)
                curveToRelative(0.25f, 0.06f, 0.52f, -0.09f, 0.59f, -0.35f)
                curveToRelative(0.04f, -0.15f, 1.05f, -3.65f, 1.05f, -10.64f)
                reflectiveCurveToRelative(-1.0f, -10.49f, -1.05f, -10.64f)
                close()
                moveTo(19.11f, 21.87f)
                curveToRelative(-1.06f, -0.34f, -3.86f, -1.4f, -7.88f, -4.05f)
                curveToRelative(-4.15f, -2.73f, -6.35f, -5.01f, -7.07f, -5.82f)
                curveToRelative(0.72f, -0.81f, 2.92f, -3.09f, 7.07f, -5.82f)
                curveToRelative(4.02f, -2.65f, 6.82f, -3.71f, 7.88f, -4.05f)
                curveToRelative(0.27f, 1.18f, 0.89f, 4.49f, 0.89f, 9.87f)
                reflectiveCurveToRelative(-0.62f, 8.7f, -0.89f, 9.87f)
                close()
            }
        }.also { _StepBackward = it}
