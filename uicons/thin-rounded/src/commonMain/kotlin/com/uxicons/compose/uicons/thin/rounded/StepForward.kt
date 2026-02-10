package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepForward: ImageVector? = null

val Icons.Tr.StepForward: ImageVector
    get() = _StepForward ?: UXIcon(name = "StepForward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(9.05f)
                curveToRelative(-0.13f, -0.13f, -0.27f, -0.25f, -0.42f, -0.36f)
                lineTo(8.57f, 0.69f)
                curveTo(7.48f, -0.11f, 6.12f, -0.22f, 4.92f, 0.39f)
                curveToRelative(-1.2f, 0.61f, -1.92f, 1.77f, -1.92f, 3.12f)
                verticalLineToRelative(16.98f)
                curveToRelative(0f, 1.35f, 0.72f, 2.51f, 1.92f, 3.12f)
                curveToRelative(0.51f, 0.26f, 1.04f, 0.39f, 1.59f, 0.39f)
                curveToRelative(0.73f, 0f, 1.45f, -0.24f, 2.07f, -0.69f)
                lineToRelative(10.99f, -8.48f)
                curveToRelative(0.15f, -0.11f, 0.3f, -0.24f, 0.43f, -0.37f)
                verticalLineToRelative(9.05f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(21f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(18.97f, 14.02f)
                lineToRelative(-10.99f, 8.49f)
                curveToRelative(-0.77f, 0.56f, -1.75f, 0.65f, -2.61f, 0.21f)
                curveToRelative(-0.86f, -0.43f, -1.37f, -1.27f, -1.37f, -2.23f)
                lineTo(4.0f, 3.51f)
                curveToRelative(0f, -0.96f, 0.51f, -1.79f, 1.37f, -2.23f)
                curveToRelative(0.37f, -0.19f, 0.76f, -0.28f, 1.14f, -0.28f)
                curveToRelative(0.51f, 0f, 1.02f, 0.16f, 1.46f, 0.48f)
                lineToRelative(11.01f, 8.5f)
                curveToRelative(0.65f, 0.47f, 1.02f, 1.21f, 1.02f, 2.02f)
                reflectiveCurveToRelative(-0.37f, 1.54f, -1.03f, 2.02f)
                close()
            }
        }.also { _StepForward = it}
