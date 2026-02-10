package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pedestal: ImageVector? = null

val Icons.Sc.Pedestal: ImageVector
    get() = _Pedestal ?: UXIcon(name = "Pedestal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.86f, 20.04f)
                curveToRelative(-0.06f, -0.01f, -0.59f, -0.14f, -1.5f, -0.3f)
                curveToRelative(0.27f, -1.63f, 0.64f, -4.46f, 0.64f, -7.74f)
                curveToRelative(0f, -5.05f, -0.88f, -9.05f, -0.91f, -9.22f)
                curveToRelative(-0.08f, -0.36f, -0.35f, -0.65f, -0.71f, -0.75f)
                curveToRelative(-0.15f, -0.04f, -3.73f, -1.04f, -7.38f, -1.04f)
                reflectiveCurveToRelative(-7.23f, 0.99f, -7.38f, 1.04f)
                curveToRelative(-0.35f, 0.1f, -0.63f, 0.39f, -0.71f, 0.75f)
                curveToRelative(-0.04f, 0.17f, -0.91f, 4.17f, -0.91f, 9.22f)
                curveToRelative(0f, 3.28f, 0.37f, 6.11f, 0.64f, 7.74f)
                curveToRelative(-0.91f, 0.16f, -1.44f, 0.29f, -1.5f, 0.3f)
                curveToRelative(-0.8f, 0.2f, -1.29f, 1.01f, -1.09f, 1.82f)
                reflectiveCurveToRelative(1.02f, 1.29f, 1.82f, 1.09f)
                curveToRelative(0.04f, -0.01f, 3.72f, -0.91f, 9.14f, -0.91f)
                reflectiveCurveToRelative(9.1f, 0.9f, 9.14f, 0.91f)
                curveToRelative(0.78f, 0.2f, 1.62f, -0.28f, 1.82f, -1.09f)
                curveToRelative(0.2f, -0.8f, -0.29f, -1.62f, -1.09f, -1.82f)
                close()
                moveTo(16.5f, 4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(7.5f, 4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _Pedestal = it}
