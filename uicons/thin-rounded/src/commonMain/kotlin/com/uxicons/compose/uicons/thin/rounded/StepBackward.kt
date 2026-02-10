package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepBackward: ImageVector? = null

val Icons.Tr.StepBackward: ImageVector
    get() = _StepBackward ?: UXIcon(name = "StepBackward") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.08f, 0.39f)
                curveToRelative(-1.2f, -0.61f, -2.57f, -0.5f, -3.66f, 0.31f)
                lineTo(4.42f, 9.18f)
                curveToRelative(-0.15f, 0.11f, -0.29f, 0.23f, -0.42f, 0.37f)
                lineTo(4f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(23f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-9.05f)
                curveToRelative(0.13f, 0.13f, 0.27f, 0.25f, 0.42f, 0.36f)
                lineToRelative(11.01f, 8.5f)
                curveToRelative(0.61f, 0.45f, 1.32f, 0.69f, 2.06f, 0.69f)
                curveToRelative(0.55f, 0f, 1.08f, -0.13f, 1.59f, -0.39f)
                curveToRelative(1.2f, -0.61f, 1.92f, -1.77f, 1.92f, -3.12f)
                lineTo(21.0f, 3.51f)
                curveToRelative(0f, -1.35f, -0.72f, -2.51f, -1.92f, -3.12f)
                close()
                moveTo(20f, 20.49f)
                curveToRelative(0f, 0.96f, -0.51f, 1.79f, -1.37f, 2.23f)
                curveToRelative(-0.85f, 0.43f, -1.85f, 0.34f, -2.6f, -0.21f)
                lineTo(5.02f, 14.02f)
                curveToRelative(-0.65f, -0.47f, -1.02f, -1.21f, -1.02f, -2.02f)
                reflectiveCurveToRelative(0.37f, -1.54f, 1.02f, -2.02f)
                lineTo(16.02f, 1.49f)
                curveToRelative(0.44f, -0.33f, 0.95f, -0.49f, 1.47f, -0.49f)
                curveToRelative(0.38f, 0f, 0.77f, 0.09f, 1.14f, 0.28f)
                curveToRelative(0.86f, 0.43f, 1.37f, 1.27f, 1.37f, 2.23f)
                verticalLineToRelative(16.98f)
                close()
            }
        }.also { _StepBackward = it}
