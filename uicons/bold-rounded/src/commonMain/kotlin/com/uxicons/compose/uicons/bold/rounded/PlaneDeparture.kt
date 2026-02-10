package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneDeparture: ImageVector? = null

val Icons.Br.PlaneDeparture: ImageVector
    get() = _PlaneDeparture ?: UXIcon(name = "PlaneDeparture") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.35f, 12.13f)
            lineToRelative(5.31f, 3.53f)
            curveToRelative(0.58f, 0.39f, 1.26f, 0.58f, 1.94f, 0.58f)
            curveToRelative(0.61f, 0f, 1.22f, -0.16f, 1.77f, -0.47f)
            lineToRelative(11.44f, -6.69f)
            curveToRelative(2f, -1.07f, 2.78f, -3.51f, 1.78f, -5.55f)
            curveToRelative(-0.5f, -1.02f, -1.38f, -1.78f, -2.46f, -2.14f)
            curveToRelative(-1.08f, -0.35f, -2.23f, -0.26f, -3.25f, 0.27f)
            curveToRelative(-0.02f, 0.01f, -0.04f, 0.02f, -0.05f, 0.03f)
            lineToRelative(-4.77f, 2.73f)
            lineTo(8.48f, 0.61f)
            curveTo(7.77f, 0.0f, 6.79f, -0.17f, 5.92f, 0.17f)
            lineToRelative(-1.04f, 0.56f)
            curveToRelative(-1.35f, 0.72f, -1.62f, 2.54f, -0.55f, 3.62f)
            lineToRelative(3.21f, 3.25f)
            lineToRelative(-0.75f, 0.43f)
            lineToRelative(-2.78f, -1.02f)
            curveToRelative(-0.73f, -0.27f, -1.51f, -0.23f, -2.22f, 0.09f)
            curveToRelative(-0.95f, 0.44f, -1.57f, 1.33f, -1.67f, 2.37f)
            curveToRelative(-0.1f, 1.04f, 0.36f, 2.03f, 1.25f, 2.66f)
            close()
            moveTo(6.4f, 11.09f)
            curveToRelative(0.42f, 0.15f, 0.88f, 0.11f, 1.26f, -0.11f)
            lineToRelative(11.63f, -6.67f)
            curveToRelative(0.28f, -0.14f, 0.6f, -0.16f, 0.9f, -0.06f)
            curveToRelative(0.31f, 0.1f, 0.56f, 0.32f, 0.7f, 0.61f)
            curveToRelative(0.28f, 0.58f, 0.06f, 1.27f, -0.56f, 1.61f)
            lineToRelative(-11.49f, 6.72f)
            curveToRelative(-0.17f, 0.1f, -0.37f, 0.09f, -0.53f, -0.02f)
            lineToRelative(-4.59f, -3.06f)
            lineToRelative(2.67f, 0.98f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 21f)
            horizontalLineTo(1.5f)
            curveTo(0.68f, 21f, 0.01f, 21.67f, 0.01f, 22.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineTo(22.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _PlaneDeparture = it }
