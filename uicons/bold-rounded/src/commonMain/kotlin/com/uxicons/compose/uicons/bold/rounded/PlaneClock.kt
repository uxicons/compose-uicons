package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneClock: ImageVector? = null

val Icons.Br.PlaneClock: ImageVector
    get() = _PlaneClock ?: UXIcon(name = "PlaneClock") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 13f)
            curveToRelative(-3.04f, 0f, -5.5f, 2.46f, -5.5f, 5.5f)
            reflectiveCurveToRelative(2.46f, 5.5f, 5.5f, 5.5f)
            reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f)
            reflectiveCurveToRelative(-2.46f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(14.5f, 21f)
            curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
            lineToRelative(-1.79f, -1.79f)
            curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(2.09f)
            lineToRelative(1.5f, 1.5f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
            close()
            moveTo(24f, 12f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-3.07f)
            curveToRelative(-0.54f, 0f, -1.04f, -0.29f, -1.3f, -0.76f)
            lineToRelative(-3.94f, -6.96f)
            curveToRelative(-0.17f, -0.32f, -0.44f, -0.28f, -0.44f, -0.28f)
            horizontalLineToRelative(-0.19f)
            curveToRelative(-0.19f, 0f, -0.12f, 0.17f, -0.12f, 0.17f)
            lineToRelative(1.95f, 5.86f)
            curveToRelative(0.15f, 0.46f, 0.07f, 0.96f, -0.21f, 1.35f)
            reflectiveCurveToRelative(-0.73f, 0.62f, -1.22f, 0.62f)
            horizontalLineToRelative(-3.33f)
            curveToRelative(-1.47f, 0f, -2.85f, -0.57f, -3.89f, -1.61f)
            lineToRelative(-1.03f, -1.03f)
            lineToRelative(1.46f, 3.45f)
            curveToRelative(0.18f, 0.29f, 0.42f, 0.54f, 0.7f, 0.74f)
            curveToRelative(0.68f, 0.47f, 0.85f, 1.41f, 0.37f, 2.09f)
            curveToRelative(-0.47f, 0.68f, -1.41f, 0.85f, -2.09f, 0.37f)
            curveToRelative(-0.68f, -0.47f, -1.22f, -1.07f, -1.63f, -1.78f)
            curveToRelative(-0.11f, -0.18f, -1.57f, -3.73f, -1.67f, -3.92f)
            curveToRelative(-0.36f, -0.69f, -0.45f, -1.51f, -0.22f, -2.26f)
            curveToRelative(0.23f, -0.76f, 0.73f, -1.37f, 1.42f, -1.72f)
            curveToRelative(1.13f, -0.58f, 2.5f, -0.37f, 3.4f, 0.52f)
            lineToRelative(1.42f, 1.42f)
            curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
            horizontalLineToRelative(1.25f)
            lineToRelative(-1.31f, -3.94f)
            curveToRelative(-0.29f, -1.01f, -0.11f, -2.01f, 0.49f, -2.81f)
            curveToRelative(0.58f, -0.77f, 1.45f, -1.22f, 2.41f, -1.25f)
            curveToRelative(0.89f, -0.08f, 2.49f, 0.22f, 3.35f, 1.83f)
            lineToRelative(3.49f, 6.16f)
            horizontalLineToRelative(2.19f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            close()
        }
    }.also { _PlaneClock = it }
