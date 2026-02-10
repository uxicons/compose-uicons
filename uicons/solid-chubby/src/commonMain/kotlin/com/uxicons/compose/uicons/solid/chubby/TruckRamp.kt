package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckRamp: ImageVector? = null

val Icons.Sc.TruckRamp: ImageVector
    get() = _TruckRamp ?: UXIcon(name = "TruckRamp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.07f, 3.96f)
                lineToRelative(0.58f, -0.27f)
                curveToRelative(0.75f, -0.36f, 1.06f, -1.25f, 0.71f, -2.0f)
                curveToRelative(-0.35f, -0.75f, -1.25f, -1.06f, -2.0f, -0.71f)
                lineToRelative(-0.58f, 0.27f)
                curveToRelative(-1.63f, 0.78f, -2.69f, 2.38f, -2.78f, 4.19f)
                lineToRelative(-0.51f, 10.79f)
                curveToRelative(-0.06f, 0.02f, -0.13f, 0.04f, -0.19f, 0.07f)
                curveToRelative(-1.3f, 0.55f, -3.89f, 1.56f, -6.56f, 2.07f)
                curveToRelative(-3.76f, 0.73f, -8.66f, 0.62f, -8.71f, 0.62f)
                curveToRelative(-0.83f, -0.04f, -1.52f, 0.64f, -1.54f, 1.46f)
                reflectiveCurveToRelative(0.64f, 1.52f, 1.46f, 1.54f)
                curveToRelative(0.05f, 0f, 0.37f, 0.01f, 0.87f, 0.01f)
                curveToRelative(1.66f, 0f, 5.35f, -0.08f, 8.48f, -0.68f)
                curveToRelative(1.65f, -0.32f, 3.27f, -0.81f, 4.62f, -1.28f)
                curveToRelative(0.19f, 1.76f, 1.68f, 3.13f, 3.49f, 3.13f)
                curveToRelative(1.94f, 0f, 3.51f, -1.57f, 3.51f, -3.51f)
                curveToRelative(0f, -1.56f, -1.02f, -2.89f, -2.44f, -3.34f)
                lineToRelative(0.5f, -10.74f)
                curveToRelative(0.03f, -0.7f, 0.44f, -1.32f, 1.07f, -1.62f)
                close()
            }
        }.also { _TruckRamp = it}
