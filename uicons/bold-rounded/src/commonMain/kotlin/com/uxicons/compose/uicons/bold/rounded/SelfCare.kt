package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SelfCare: ImageVector? = null

val Icons.Br.SelfCare: ImageVector
    get() = _SelfCare ?: UXIcon(name = "SelfCare") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
            close()
            moveTo(12f, 9f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            close()
            moveTo(16f, 16.2f)
            curveToRelative(0f, 1.55f, -1.81f, 3.55f, -2.99f, 4.46f)
            curveToRelative(-0.6f, 0.46f, -1.42f, 0.46f, -2.02f, 0f)
            curveToRelative(-1.19f, -0.91f, -2.99f, -2.91f, -2.99f, -4.46f)
            curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
            reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
            curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
            reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
            close()
            moveTo(21f, 22f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.14f, -0.32f, -2.24f, -0.92f, -3.2f)
            curveToRelative(-0.44f, -0.7f, -0.23f, -1.63f, 0.47f, -2.07f)
            reflectiveCurveToRelative(1.63f, -0.23f, 2.07f, 0.47f)
            curveToRelative(0.91f, 1.44f, 1.39f, 3.1f, 1.39f, 4.8f)
            close()
            moveTo(6.92f, 18.8f)
            curveToRelative(-0.6f, 0.95f, -0.92f, 2.06f, -0.92f, 3.2f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -1.71f, 0.48f, -3.37f, 1.39f, -4.8f)
            curveToRelative(0.44f, -0.7f, 1.37f, -0.91f, 2.07f, -0.47f)
            curveToRelative(0.7f, 0.44f, 0.91f, 1.37f, 0.47f, 2.07f)
            close()
        }
    }.also { _SelfCare = it }
