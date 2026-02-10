package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FishBones: ImageVector? = null

val Icons.Ts.FishBones: ImageVector
    get() = _FishBones ?: UXIcon(name = "FishBones") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 7.36f)
                curveToRelative(0f, 1.0f, -0.6f, 1.64f, -1.53f, 1.64f)
                horizontalLineToRelative(-6.77f)
                lineToRelative(2.15f, 2.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.15f, -2.15f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(2.9f, 2.9f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-2.9f, -2.9f)
                lineToRelative(-1.93f, 1.93f)
                lineToRelative(3.65f, 3.65f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.65f, -3.65f)
                lineToRelative(-1.55f, 1.55f)
                curveToRelative(1.41f, 1.53f, 2.43f, 3.42f, 2.91f, 5.51f)
                lineToRelative(0.09f, 0.41f)
                lineToRelative(-0.38f, 0.16f)
                curveToRelative(-2.44f, 1.04f, -5.75f, 1.52f, -10.43f, 1.52f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -4.67f, 0.48f, -7.99f, 1.52f, -10.43f)
                lineToRelative(0.16f, -0.39f)
                lineToRelative(0.41f, 0.09f)
                curveToRelative(2.09f, 0.48f, 3.98f, 1.5f, 5.51f, 2.91f)
                lineToRelative(1.55f, -1.55f)
                lineToRelative(-3.65f, -3.65f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.65f, 3.65f)
                lineToRelative(1.93f, -1.93f)
                lineToRelative(-2.9f, -2.9f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.9f, 2.9f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(-2.15f, -2.15f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(2.15f, 2.15f)
                lineTo(15.0f, 1.53f)
                curveToRelative(0f, -0.93f, 0.65f, -1.53f, 1.64f, -1.53f)
                curveToRelative(1.49f, 0f, 3.65f, 1.1f, 3.9f, 3.45f)
                curveToRelative(2.35f, 0.26f, 3.45f, 2.42f, 3.45f, 3.9f)
                close()
                moveTo(10.14f, 21.72f)
                curveToRelative(-1.02f, -3.81f, -4.05f, -6.83f, -7.86f, -7.86f)
                curveToRelative(-0.84f, 2.19f, -1.25f, 5.12f, -1.28f, 9.14f)
                curveToRelative(4.02f, -0.03f, 6.95f, -0.44f, 9.14f, -1.28f)
                close()
                moveTo(23f, 7.36f)
                curveToRelative(0f, -0.92f, -0.74f, -2.93f, -2.93f, -2.93f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.19f, -2.01f, -2.93f, -2.93f, -2.93f)
                curveToRelative(-0.64f, 0f, -0.64f, 0.35f, -0.64f, 0.53f)
                verticalLineToRelative(6.47f)
                horizontalLineToRelative(6.47f)
                curveToRelative(0.17f, 0f, 0.53f, 0f, 0.53f, -0.64f)
                close()
            }
        }.also { _FishBones = it}
