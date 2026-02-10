package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepForward: ImageVector? = null

val Icons.Rc.StepForward: ImageVector
    get() = _StepForward ?: UXIcon(name = "StepForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.96f, 1.72f)
                curveToRelative(-0.15f, -0.53f, -0.71f, -0.84f, -1.24f, -0.68f)
                curveToRelative(-0.53f, 0.15f, -0.84f, 0.71f, -0.68f, 1.24f)
                curveToRelative(0.01f, 0.03f, 0.91f, 3.25f, 0.93f, 9.52f)
                curveToRelative(-0.03f, -0.15f, -0.08f, -0.29f, -0.18f, -0.42f)
                curveToRelative(-0.23f, -0.29f, -2.35f, -2.89f, -7.25f, -6.15f)
                curveToRelative(-5.11f, -3.41f, -8.21f, -4.17f, -8.34f, -4.2f)
                curveToRelative(-0.52f, -0.13f, -1.04f, 0.18f, -1.19f, 0.69f)
                curveToRelative(-0.04f, 0.14f, -1.01f, 3.55f, -1.01f, 10.28f)
                reflectiveCurveToRelative(0.97f, 10.14f, 1.01f, 10.28f)
                curveToRelative(0.15f, 0.52f, 0.69f, 0.82f, 1.19f, 0.69f)
                curveToRelative(0.13f, -0.03f, 3.23f, -0.79f, 8.34f, -4.2f)
                curveToRelative(4.89f, -3.26f, 7.02f, -5.87f, 7.25f, -6.15f)
                curveToRelative(0.1f, -0.12f, 0.15f, -0.27f, 0.18f, -0.42f)
                curveToRelative(-0.02f, 6.27f, -0.92f, 9.49f, -0.93f, 9.52f)
                curveToRelative(-0.15f, 0.53f, 0.15f, 1.08f, 0.68f, 1.24f)
                curveToRelative(0.52f, 0.15f, 1.08f, -0.15f, 1.24f, -0.68f)
                curveToRelative(0.04f, -0.14f, 1.01f, -3.55f, 1.01f, -10.28f)
                reflectiveCurveToRelative(-0.97f, -10.14f, -1.01f, -10.28f)
                close()
                moveTo(11.43f, 17.11f)
                curveToRelative(-3.16f, 2.11f, -5.5f, 3.14f, -6.73f, 3.6f)
                curveToRelative(-0.28f, -1.42f, -0.7f, -4.34f, -0.7f, -8.71f)
                reflectiveCurveToRelative(0.43f, -7.28f, 0.7f, -8.71f)
                curveToRelative(1.23f, 0.46f, 3.56f, 1.49f, 6.73f, 3.6f)
                curveToRelative(3.38f, 2.25f, 5.36f, 4.17f, 6.24f, 5.11f)
                curveToRelative(-0.88f, 0.94f, -2.86f, 2.86f, -6.24f, 5.11f)
                close()
            }
        }.also { _StepForward = it}
