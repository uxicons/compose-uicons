package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepForward: ImageVector? = null

val Icons.Rr.StepForward: ImageVector
    get() = _StepForward ?: UXIcon(name = "StepForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(7.48f)
                lineTo(9.36f, 0.78f)
                curveToRelative(-1.24f, -0.91f, -2.8f, -1.04f, -4.17f, -0.34f)
                curveToRelative(-1.37f, 0.7f, -2.19f, 2.03f, -2.19f, 3.57f)
                verticalLineToRelative(15.99f)
                curveToRelative(0f, 1.54f, 0.82f, 2.87f, 2.19f, 3.57f)
                curveToRelative(0.58f, 0.29f, 1.19f, 0.44f, 1.82f, 0.44f)
                curveToRelative(0.84f, 0f, 1.66f, -0.27f, 2.39f, -0.81f)
                lineToRelative(9.6f, -7.68f)
                verticalLineToRelative(7.48f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(21f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(18.15f, 13.64f)
                lineToRelative(-9.97f, 7.98f)
                curveToRelative(-0.62f, 0.45f, -1.4f, 0.52f, -2.08f, 0.17f)
                curveToRelative(-0.69f, -0.35f, -1.09f, -1.0f, -1.09f, -1.78f)
                lineTo(5.0f, 4.01f)
                curveToRelative(0f, -0.78f, 0.4f, -1.43f, 1.09f, -1.78f)
                curveToRelative(0.3f, -0.15f, 0.62f, -0.23f, 0.93f, -0.23f)
                curveToRelative(0.4f, 0f, 0.79f, 0.13f, 1.13f, 0.37f)
                lineToRelative(10.04f, 8.02f)
                curveToRelative(0.52f, 0.38f, 0.82f, 0.97f, 0.82f, 1.61f)
                reflectiveCurveToRelative(-0.3f, 1.23f, -0.85f, 1.64f)
                close()
            }
        }.also { _StepForward = it}
