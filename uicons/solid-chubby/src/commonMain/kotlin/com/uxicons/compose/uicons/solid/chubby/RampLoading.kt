package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RampLoading: ImageVector? = null

val Icons.Sc.RampLoading: ImageVector
    get() = _RampLoading ?: UXIcon(name = "RampLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 13f)
                horizontalLineToRelative(0.27f)
                lineToRelative(0.99f, -2.22f)
                curveToRelative(0.28f, -0.63f, 0.78f, -1.15f, 1.4f, -1.46f)
                curveToRelative(0.28f, -0.14f, 2.75f, -1.32f, 6.34f, -1.32f)
                reflectiveCurveToRelative(6.07f, 1.18f, 6.34f, 1.31f)
                curveToRelative(0.63f, 0.31f, 1.12f, 0.83f, 1.41f, 1.47f)
                lineToRelative(0.98f, 2.21f)
                horizontalLineToRelative(0.27f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
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
            }
        }.also { _RampLoading = it}
