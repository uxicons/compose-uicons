package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FishBones: ImageVector? = null

val Icons.Rs.FishBones: ImageVector
    get() = _FishBones ?: UXIcon(name = "FishBones") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 19f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 7f)
                curveToRelative(0f, 1.18f, -0.78f, 2f, -1.9f, 2f)
                horizontalLineToRelative(-4.98f)
                lineToRelative(1.44f, 1.44f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.27f, 1.27f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.54f, -2.54f)
                lineToRelative(-1.4f, 1.4f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(-1.06f, 1.06f)
                curveToRelative(1.16f, 1.38f, 2.0f, 3.02f, 2.41f, 4.83f)
                lineToRelative(0.19f, 0.81f)
                lineToRelative(-0.77f, 0.33f)
                curveToRelative(-2.27f, 0.97f, -5.33f, 1.42f, -9.62f, 1.42f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -4.29f, 0.45f, -7.35f, 1.42f, -9.62f)
                lineToRelative(0.33f, -0.77f)
                lineToRelative(0.81f, 0.19f)
                curveToRelative(1.8f, 0.41f, 3.45f, 1.25f, 4.83f, 2.41f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(-2.54f, -2.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(1.27f, -1.27f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(1.44f, 1.44f)
                lineTo(15.0f, 1.9f)
                curveToRelative(0f, -1.12f, 0.82f, -1.9f, 2f, -1.9f)
                curveToRelative(1.42f, 0f, 3.45f, 0.99f, 3.9f, 3.1f)
                curveToRelative(2.1f, 0.46f, 3.1f, 2.48f, 3.1f, 3.9f)
                close()
                moveTo(9.02f, 21.05f)
                curveToRelative(-0.94f, -2.86f, -3.21f, -5.14f, -6.08f, -6.08f)
                curveToRelative(-0.58f, 1.75f, -0.89f, 4.02f, -0.94f, 7.02f)
                curveToRelative(3.0f, -0.06f, 5.27f, -0.36f, 7.02f, -0.94f)
                close()
                moveTo(22f, 7f)
                curveToRelative(0f, -0.02f, -0.12f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.86f, -1.93f, -2.0f, -2.0f, -2f)
                lineToRelative(-0.0f, 5f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _FishBones = it}
