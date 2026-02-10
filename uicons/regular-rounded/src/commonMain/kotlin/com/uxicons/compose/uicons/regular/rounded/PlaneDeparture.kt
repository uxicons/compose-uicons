package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneDeparture: ImageVector? = null

val Icons.Rr.PlaneDeparture: ImageVector
    get() = _PlaneDeparture ?: UXIcon(name = "PlaneDeparture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.07f, 15.41f)
                lineToRelative(2.08f, 1.48f)
                curveToRelative(1.06f, 0.76f, 2.32f, 1.14f, 3.57f, 1.14f)
                curveToRelative(0.89f, 0f, 1.79f, -0.2f, 2.61f, -0.59f)
                lineToRelative(12.95f, -5.7f)
                curveToRelative(1.49f, -0.71f, 2.13f, -2.5f, 1.44f, -4f)
                curveToRelative(-0.69f, -1.5f, -2.48f, -2.15f, -3.98f, -1.47f)
                lineToRelative(-3.14f, 1.4f)
                lineTo(9.98f, 3.59f)
                curveToRelative(-0.88f, -0.66f, -2.05f, -0.77f, -3.05f, -0.31f)
                lineToRelative(-0.78f, 0.37f)
                curveToRelative(-0.61f, 0.29f, -1.03f, 0.86f, -1.13f, 1.52f)
                curveToRelative(-0.1f, 0.67f, 0.15f, 1.33f, 0.65f, 1.78f)
                lineToRelative(4.2f, 3.72f)
                lineToRelative(-3.59f, 1.6f)
                lineToRelative(-3.06f, -1.12f)
                curveToRelative(-0.98f, -0.36f, -2.08f, -0.04f, -2.73f, 0.79f)
                curveToRelative(-0.39f, 0.5f, -0.56f, 1.13f, -0.46f, 1.78f)
                curveToRelative(0.1f, 0.68f, 0.47f, 1.29f, 1.03f, 1.69f)
                close()
                moveTo(7f, 5.46f)
                lineToRelative(0.78f, -0.36f)
                curveToRelative(0.33f, -0.15f, 0.72f, -0.11f, 1.08f, 0.15f)
                lineToRelative(5.53f, 3.42f)
                lineToRelative(-2.51f, 1.12f)
                lineTo(7f, 5.46f)
                close()
                moveTo(2.07f, 13.18f)
                curveToRelative(0.1f, -0.12f, 0.22f, -0.17f, 0.33f, -0.17f)
                curveToRelative(0.05f, 0f, 3.57f, 1.28f, 3.57f, 1.28f)
                curveToRelative(0.24f, 0.09f, 0.52f, 0.08f, 0.75f, -0.03f)
                lineToRelative(13.83f, -6.17f)
                lineToRelative(0.01f, -0.01f)
                curveToRelative(0.5f, -0.23f, 1.1f, -0.01f, 1.33f, 0.49f)
                curveToRelative(0.23f, 0.51f, 0.02f, 1.11f, -0.46f, 1.34f)
                lineToRelative(-12.95f, 5.7f)
                curveToRelative(-1.36f, 0.65f, -2.96f, 0.51f, -4.19f, -0.36f)
                lineToRelative(-2.08f, -1.48f)
                curveToRelative(-0.11f, -0.08f, -0.19f, -0.21f, -0.21f, -0.35f)
                curveToRelative(-0.01f, -0.1f, 0.01f, -0.19f, 0.06f, -0.26f)
                close()
                moveTo(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(23f, 22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _PlaneDeparture = it}
