package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mushroom: ImageVector? = null

val Icons.Ts.Mushroom: ImageVector
    get() = _Mushroom ?: UXIcon(name = "Mushroom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.07f, 0f, 11.3f)
                curveToRelative(0f, 2.61f, 2.2f, 3.62f, 2.3f, 3.66f)
                lineToRelative(0.3f, 0.13f)
                lineToRelative(0.24f, -0.23f)
                curveToRelative(0.03f, -0.03f, 2.12f, -1.95f, 5.1f, -3.07f)
                curveToRelative(-0.57f, 2.8f, -0.94f, 6.06f, -0.94f, 7.21f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -1.15f, -0.37f, -4.41f, -0.94f, -7.21f)
                curveToRelative(2.98f, 1.12f, 5.07f, 3.05f, 5.1f, 3.07f)
                lineToRelative(0.24f, 0.23f)
                lineToRelative(0.3f, -0.13f)
                curveToRelative(0.09f, -0.04f, 2.3f, -1.05f, 2.3f, -3.66f)
                curveTo(24f, 5.07f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(16f, 19f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.05f, 0.39f, -4.64f, 1.04f, -7.57f)
                curveToRelative(0.93f, -0.26f, 1.93f, -0.43f, 2.96f, -0.43f)
                reflectiveCurveToRelative(2.03f, 0.17f, 2.96f, 0.43f)
                curveToRelative(0.65f, 2.93f, 1.04f, 6.52f, 1.04f, 7.57f)
                close()
                moveTo(21.57f, 13.89f)
                curveToRelative(-1.05f, -0.9f, -4.91f, -3.89f, -9.57f, -3.89f)
                reflectiveCurveTo(3.48f, 13.0f, 2.43f, 13.89f)
                curveToRelative(-0.48f, -0.31f, -1.43f, -1.11f, -1.43f, -2.59f)
                curveTo(1f, 5.62f, 5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.62f, 11f, 10.3f)
                curveToRelative(0f, 1.48f, -0.95f, 2.28f, -1.43f, 2.59f)
                close()
            }
        }.also { _Mushroom = it}
