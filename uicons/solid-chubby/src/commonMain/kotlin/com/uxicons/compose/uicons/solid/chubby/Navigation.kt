package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Navigation: ImageVector? = null

val Icons.Sc.Navigation: ImageVector
    get() = _Navigation ?: UXIcon(name = "Navigation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(13.33f, 18.38f)
                curveToRelative(-0.37f, 0.37f, -0.9f, 0.59f, -1.42f, 0.4f)
                curveToRelative(-0.94f, -0.33f, -1.08f, -1.46f, -1.27f, -3.03f)
                curveToRelative(-0.08f, -0.62f, -0.2f, -1.63f, -0.36f, -1.96f)
                curveToRelative(-0.33f, -0.15f, -1.33f, -0.27f, -1.95f, -0.35f)
                curveToRelative(-1.58f, -0.19f, -2.73f, -0.32f, -3.05f, -1.27f)
                curveToRelative(-0.08f, -0.23f, -0.2f, -0.83f, 0.41f, -1.44f)
                curveToRelative(4.97f, -4.97f, 10.67f, -4.14f, 10.91f, -4.1f)
                curveToRelative(0.43f, 0.07f, 0.77f, 0.4f, 0.83f, 0.83f)
                curveToRelative(0.04f, 0.24f, 0.86f, 5.94f, -4.1f, 10.91f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.94f, 11.38f)
                curveToRelative(0.22f, 0.03f, 0.44f, 0.06f, 0.62f, 0.08f)
                curveToRelative(1.57f, 0.18f, 2.56f, 0.34f, 3.13f, 0.91f)
                curveToRelative(0.57f, 0.57f, 0.73f, 1.57f, 0.93f, 3.15f)
                curveToRelative(0.02f, 0.18f, 0.05f, 0.39f, 0.08f, 0.6f)
                curveToRelative(2.52f, -3.0f, 2.82f, -6.13f, 2.8f, -7.55f)
                curveToRelative(-1.43f, -0.0f, -4.54f, 0.27f, -7.56f, 2.82f)
                close()
            }
        }.also { _Navigation = it}
