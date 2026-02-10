package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepBackward: ImageVector? = null

val Icons.Rr.StepBackward: ImageVector
    get() = _StepBackward ?: UXIcon(name = "StepBackward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.81f, 0.44f)
                curveToRelative(-1.37f, -0.69f, -2.93f, -0.57f, -4.2f, 0.37f)
                lineToRelative(-9.6f, 7.67f)
                lineTo(5.0f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(22f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7.48f)
                lineToRelative(9.64f, 7.71f)
                curveToRelative(0.7f, 0.51f, 1.51f, 0.78f, 2.35f, 0.78f)
                curveToRelative(0.63f, 0f, 1.24f, -0.15f, 1.82f, -0.44f)
                curveToRelative(1.37f, -0.7f, 2.19f, -2.03f, 2.19f, -3.57f)
                lineTo(21f, 4.01f)
                curveToRelative(0f, -1.54f, -0.82f, -2.87f, -2.19f, -3.57f)
                close()
                moveTo(19f, 20.0f)
                curveToRelative(0f, 0.78f, -0.4f, 1.43f, -1.09f, 1.78f)
                curveToRelative(-0.69f, 0.35f, -1.49f, 0.26f, -2.05f, -0.14f)
                lineTo(5.82f, 13.61f)
                curveToRelative(-0.52f, -0.38f, -0.82f, -0.97f, -0.82f, -1.61f)
                reflectiveCurveToRelative(0.3f, -1.23f, 0.82f, -1.61f)
                lineTo(15.82f, 2.4f)
                curveToRelative(0.36f, -0.26f, 0.76f, -0.4f, 1.17f, -0.4f)
                curveToRelative(0.31f, 0f, 0.62f, 0.07f, 0.92f, 0.23f)
                curveToRelative(0.69f, 0.35f, 1.09f, 1.0f, 1.09f, 1.78f)
                verticalLineToRelative(15.99f)
                close()
            }
        }.also { _StepBackward = it}
