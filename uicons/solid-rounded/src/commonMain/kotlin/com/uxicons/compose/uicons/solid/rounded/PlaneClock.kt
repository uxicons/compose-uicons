package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlaneClock: ImageVector? = null

val Icons.Sr.PlaneClock: ImageVector
    get() = _PlaneClock ?: UXIcon(name = "PlaneClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 13f)
                curveToRelative(-3.04f, 0f, -5.5f, 2.46f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.46f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.46f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(13.09f, 21f)
                lineTo(11.29f, 19.21f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.09f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                close()
                moveTo(24f, 11.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3.51f)
                curveToRelative(-1.37f, -1.82f, -3.54f, -3f, -5.99f, -3f)
                reflectiveCurveToRelative(-4.62f, 1.18f, -5.99f, 3f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-1.44f, 0f, -2.76f, -0.77f, -3.47f, -2.02f)
                lineToRelative(-2.33f, -3.83f)
                curveToRelative(-0.4f, -0.7f, -0.19f, -1.63f, 0.53f, -2.0f)
                curveToRelative(0.58f, -0.3f, 1.23f, -0.17f, 1.65f, 0.25f)
                lineToRelative(1.42f, 1.42f)
                curveToRelative(0.75f, 0.75f, 1.77f, 1.17f, 2.83f, 1.17f)
                horizontalLineToRelative(3.66f)
                lineToRelative(-2.12f, -5.45f)
                curveToRelative(-0.3f, -0.81f, -0.19f, -1.71f, 0.3f, -2.42f)
                curveToRelative(0.49f, -0.71f, 1.3f, -1.13f, 2.16f, -1.13f)
                curveToRelative(1.1f, 0f, 2.11f, 0.6f, 2.6f, 1.51f)
                lineToRelative(4.5f, 7.49f)
                horizontalLineToRelative(3.77f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _PlaneClock = it}
