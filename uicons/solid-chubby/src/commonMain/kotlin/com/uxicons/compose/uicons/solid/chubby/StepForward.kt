package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepForward: ImageVector? = null

val Icons.Sc.StepForward: ImageVector
    get() = _StepForward ?: UXIcon(name = "StepForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.8f, 11.38f)
                curveToRelative(0.14f, 0.18f, 0.2f, 0.4f, 0.2f, 0.62f)
                reflectiveCurveToRelative(-0.07f, 0.44f, -0.2f, 0.62f)
                curveToRelative(-0.21f, 0.29f, -2.22f, 2.89f, -6.84f, 6.15f)
                curveToRelative(-4.83f, 3.41f, -7.75f, 4.17f, -7.88f, 4.2f)
                curveToRelative(-0.49f, 0.12f, -0.99f, -0.18f, -1.13f, -0.69f)
                curveToRelative(-0.04f, -0.14f, -0.95f, -3.55f, -0.95f, -10.28f)
                reflectiveCurveToRelative(0.91f, -10.14f, 0.95f, -10.28f)
                curveToRelative(0.14f, -0.51f, 0.63f, -0.82f, 1.13f, -0.69f)
                curveToRelative(0.12f, 0.03f, 3.05f, 0.79f, 7.88f, 4.2f)
                curveToRelative(4.62f, 3.26f, 6.63f, 5.87f, 6.84f, 6.15f)
                close()
                moveTo(20.97f, 2.06f)
                curveToRelative(-0.24f, -0.79f, -1.07f, -1.24f, -1.87f, -0.99f)
                curveToRelative(-0.79f, 0.24f, -1.24f, 1.08f, -1.0f, 1.87f)
                curveToRelative(0.01f, 0.03f, 0.9f, 3.09f, 0.9f, 9.07f)
                reflectiveCurveToRelative(-0.89f, 9.02f, -0.9f, 9.06f)
                curveToRelative(-0.24f, 0.79f, 0.21f, 1.63f, 1.0f, 1.87f)
                curveToRelative(0.77f, 0.24f, 1.63f, -0.2f, 1.87f, -1.0f)
                curveToRelative(0.04f, -0.14f, 1.03f, -3.46f, 1.03f, -9.94f)
                reflectiveCurveToRelative(-0.99f, -9.8f, -1.03f, -9.94f)
                close()
            }
        }.also { _StepForward = it}
