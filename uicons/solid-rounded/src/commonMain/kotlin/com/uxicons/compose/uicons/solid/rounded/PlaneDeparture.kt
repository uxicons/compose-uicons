package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneDeparture: ImageVector? = null

val Icons.Sr.PlaneDeparture: ImageVector
    get() = _PlaneDeparture ?: UXIcon(name = "PlaneDeparture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.2f, 18f)
                curveToRelative(-1.15f, 0f, -2.3f, -0.35f, -3.28f, -1.05f)
                lineToRelative(-2.08f, -1.48f)
                curveToRelative(-0.45f, -0.32f, -0.75f, -0.81f, -0.83f, -1.35f)
                curveToRelative(-0.07f, -0.51f, 0.05f, -1.0f, 0.36f, -1.4f)
                curveToRelative(0.52f, -0.66f, 1.39f, -0.92f, 2.17f, -0.63f)
                lineToRelative(3.25f, 1.19f)
                lineToRelative(14.65f, -7.06f)
                curveToRelative(1.25f, -0.58f, 2.74f, -0.03f, 3.31f, 1.22f)
                curveToRelative(0.58f, 1.25f, 0.04f, 2.75f, -1.2f, 3.34f)
                lineToRelative(-13.95f, 6.67f)
                curveToRelative(-0.77f, 0.36f, -1.59f, 0.55f, -2.42f, 0.55f)
                close()
                moveTo(24f, 23f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(1f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(23f, 24f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
                moveTo(8.61f, 9.71f)
                lineToRelative(5.42f, -2.61f)
                lineToRelative(-5.85f, -3.61f)
                curveToRelative(-0.73f, -0.55f, -1.71f, -0.65f, -2.54f, -0.26f)
                lineToRelative(-0.78f, 0.37f)
                curveToRelative(-0.46f, 0.21f, -0.77f, 0.64f, -0.85f, 1.14f)
                curveToRelative(-0.07f, 0.5f, 0.11f, 1.0f, 0.49f, 1.34f)
                lineToRelative(4.11f, 3.64f)
                close()
            }
        }.also { _PlaneDeparture = it}
