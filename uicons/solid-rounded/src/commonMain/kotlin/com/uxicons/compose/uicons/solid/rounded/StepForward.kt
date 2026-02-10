package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepForward: ImageVector? = null

val Icons.Sr.StepForward: ImageVector
    get() = _StepForward ?: UXIcon(name = "StepForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.77f, 0.36f)
                curveToRelative(1.12f, -0.57f, 2.4f, -0.46f, 3.41f, 0.28f)
                lineToRelative(10.15f, 8.72f)
                curveToRelative(0.25f, 0.18f, 0.46f, 0.39f, 0.65f, 0.62f)
                verticalLineTo(1.0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-8.98f)
                curveToRelative(-0.18f, 0.23f, -0.4f, 0.44f, -0.65f, 0.62f)
                lineToRelative(-10.15f, 8.72f)
                curveToRelative(-0.58f, 0.43f, -1.25f, 0.64f, -1.92f, 0.64f)
                curveToRelative(-0.5f, 0f, -1.01f, -0.12f, -1.49f, -0.36f)
                curveToRelative(-1.12f, -0.57f, -1.79f, -1.66f, -1.79f, -2.92f)
                verticalLineTo(3.28f)
                curveToRelative(0f, -1.26f, 0.67f, -2.35f, 1.79f, -2.92f)
                close()
            }
        }.also { _StepForward = it}
