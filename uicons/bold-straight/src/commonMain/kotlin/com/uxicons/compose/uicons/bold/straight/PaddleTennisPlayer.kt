package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaddleTennisPlayer: ImageVector? = null

val Icons.Bs.PaddleTennisPlayer: ImageVector
    get() = _PaddleTennisPlayer ?: UXIcon(name = "PaddleTennisPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 10f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                close()
                moveTo(3f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(6f, 6f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
                moveTo(22.44f, 10.56f)
                curveToRelative(-0.15f, -0.15f, -0.3f, -0.28f, -0.46f, -0.41f)
                curveToRelative(-0.04f, 1.15f, -0.57f, 2.16f, -1.38f, 2.87f)
                curveToRelative(1.05f, 1.46f, -0.25f, 3.04f, -0.9f, 3.69f)
                curveToRelative(-0.81f, 0.81f, -1.67f, 1.15f, -2.51f, 1.29f)
                curveToRelative(-0.5f, -0.0f, -1.02f, -0.18f, -1.51f, -0.68f)
                curveToRelative(-0.46f, -0.46f, -0.64f, -0.93f, -0.67f, -1.4f)
                curveToRelative(0.11f, -0.82f, 0.42f, -1.64f, 1.11f, -2.41f)
                curveToRelative(-0.92f, -0.49f, -1.62f, -1.33f, -1.93f, -2.35f)
                curveToRelative(-1.41f, 1.41f, -2.15f, 3.02f, -2.18f, 4.56f)
                curveToRelative(-0.15f, 1.21f, 0.0f, 2.2f, -0.06f, 3.22f)
                lineToRelative(-3.01f, 3.01f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(3.0f, -3.0f)
                curveToRelative(1.07f, -0.04f, 2.28f, 0.12f, 3.43f, -0.07f)
                curveToRelative(1.2f, -0.07f, 2.43f, -0.57f, 3.57f, -1.49f)
                curveToRelative(0.0f, -0.0f, 0.01f, -0.01f, 0.01f, -0.01f)
                curveToRelative(0.25f, -0.2f, 0.5f, -0.42f, 0.74f, -0.66f)
                curveToRelative(2.65f, -2.66f, 2.9f, -5.98f, 0.61f, -8.27f)
                close()
                moveTo(10.3f, 14f)
                horizontalLineToRelative(-4.8f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                lineToRelative(2f, 3f)
                lineToRelative(2.45f, -3.68f)
                curveToRelative(0.04f, -0.78f, 0.14f, -1.52f, 0.35f, -2.32f)
                close()
            }
        }.also { _PaddleTennisPlayer = it}
