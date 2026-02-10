package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RampLoading: ImageVector? = null

val Icons.Rc.RampLoading: ImageVector
    get() = _RampLoading ?: UXIcon(name = "RampLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -3.59f, 0.61f, -6.81f, 0.88f, -8.06f)
                curveToRelative(1.09f, -0.3f, 3.79f, -0.94f, 7.12f, -0.94f)
                curveToRelative(3.3f, 0f, 6.02f, 0.64f, 7.12f, 0.94f)
                curveToRelative(0.27f, 1.25f, 0.88f, 4.47f, 0.88f, 8.06f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -4.82f, -1.02f, -8.92f, -1.07f, -9.1f)
                curveToRelative(-0.08f, -0.33f, -0.33f, -0.59f, -0.65f, -0.7f)
                curveToRelative(-0.15f, -0.05f, -3.63f, -1.2f, -8.28f, -1.2f)
                curveToRelative(-4.69f, 0.0f, -8.14f, 1.16f, -8.29f, 1.21f)
                curveToRelative(-0.32f, 0.11f, -0.56f, 0.37f, -0.65f, 0.7f)
                curveToRelative(-0.04f, 0.17f, -1.07f, 4.26f, -1.07f, 9.1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.91f, 11.59f)
                curveToRelative(-0.09f, -0.21f, -0.26f, -0.38f, -0.47f, -0.49f)
                curveToRelative(-0.09f, -0.04f, -2.25f, -1.1f, -5.45f, -1.1f)
                reflectiveCurveToRelative(-5.36f, 1.06f, -5.45f, 1.1f)
                curveToRelative(-0.21f, 0.1f, -0.37f, 0.28f, -0.47f, 0.49f)
                lineToRelative(-4.0f, 9f)
                curveToRelative(-0.12f, 0.28f, -0.11f, 0.6f, 0.03f, 0.86f)
                curveToRelative(0.14f, 0.27f, 0.39f, 0.46f, 0.69f, 0.52f)
                curveToRelative(0.21f, 0.04f, 5.11f, 1.02f, 9.2f, 1.02f)
                curveToRelative(4.12f, 0f, 8.99f, -0.98f, 9.2f, -1.02f)
                curveToRelative(0.3f, -0.06f, 0.55f, -0.25f, 0.69f, -0.52f)
                reflectiveCurveToRelative(0.15f, -0.59f, 0.03f, -0.86f)
                lineToRelative(-4f, -9f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-2.69f, 0f, -5.87f, -0.47f, -7.57f, -0.76f)
                lineToRelative(3.33f, -7.48f)
                curveToRelative(0.63f, -0.25f, 2.17f, -0.76f, 4.24f, -0.76f)
                curveToRelative(2.06f, 0f, 3.61f, 0.51f, 4.25f, 0.76f)
                lineToRelative(3.33f, 7.48f)
                curveToRelative(-1.7f, 0.29f, -4.85f, 0.76f, -7.57f, 0.76f)
                close()
            }
        }.also { _RampLoading = it}
