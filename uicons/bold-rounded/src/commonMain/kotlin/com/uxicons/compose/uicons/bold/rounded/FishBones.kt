package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FishBones: ImageVector? = null

val Icons.Br.FishBones: ImageVector
    get() = _FishBones ?: UXIcon(name = "FishBones") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.14f, 3.86f)
            curveToRelative(0f, -2.86f, -2.57f, -3.86f, -3.86f, -3.86f)
            curveToRelative(-0.77f, 0f, -1.29f, 0.38f, -1.29f, 1.16f)
            verticalLineToRelative(5.72f)
            lineToRelative(-1.5f, 1.5f)
            lineToRelative(-1.94f, -1.94f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            reflectiveCurveToRelative(-0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(1.94f, 1.94f)
            lineToRelative(-1.38f, 1.38f)
            lineToRelative(-2.44f, -2.44f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            reflectiveCurveToRelative(-0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(2.44f, 2.44f)
            lineToRelative(-1.38f, 1.38f)
            lineToRelative(-1.66f, -1.66f)
            curveToRelative(-1.26f, -1.26f, -3.47f, -0.76f, -3.96f, 0.96f)
            curveTo(0.36f, 16.45f, 0.07f, 18.62f, 0.0f, 21.18f)
            curveToRelative(-0.04f, 1.6f, 1.23f, 2.87f, 2.82f, 2.82f)
            curveToRelative(2.57f, -0.07f, 4.73f, -0.35f, 6.51f, -0.88f)
            curveToRelative(1.71f, -0.5f, 2.22f, -2.69f, 0.96f, -3.95f)
            lineToRelative(-1.67f, -1.67f)
            lineToRelative(1.38f, -1.38f)
            lineToRelative(2.44f, 2.44f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(-2.44f, -2.44f)
            lineToRelative(1.38f, -1.38f)
            lineToRelative(1.94f, 1.94f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(-1.94f, -1.94f)
            lineToRelative(1.5f, -1.5f)
            horizontalLineToRelative(5.72f)
            curveToRelative(0.77f, 0f, 1.16f, -0.52f, 1.16f, -1.29f)
            curveToRelative(0f, -1.29f, -1.0f, -3.86f, -3.86f, -3.86f)
            close()
            moveTo(3f, 21f)
            curveToRelative(0.05f, -1.73f, 0.19f, -3.18f, 0.46f, -4.42f)
            lineToRelative(3.97f, 3.97f)
            curveToRelative(-1.25f, 0.26f, -2.7f, 0.41f, -4.42f, 0.46f)
            close()
        }
    }.also { _FishBones = it }
