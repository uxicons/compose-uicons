package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BottleDroplet: ImageVector? = null

val Icons.Rr.BottleDroplet: ImageVector
    get() = _BottleDroplet ?: UXIcon(name = "BottleDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.86f, 8.06f)
                lineToRelative(-1.86f, -0.74f)
                lineTo(15f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(5.32f)
                lineToRelative(-1.86f, 0.74f)
                curveToRelative(-1.91f, 0.76f, -3.14f, 2.59f, -3.14f, 4.64f)
                verticalLineToRelative(6.29f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6.29f)
                curveToRelative(0f, -2.06f, -1.23f, -3.88f, -3.14f, -4.64f)
                close()
                moveTo(18f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6.29f)
                curveToRelative(0f, -1.23f, 0.74f, -2.33f, 1.89f, -2.79f)
                lineToRelative(2.48f, -0.99f)
                curveToRelative(0.38f, -0.15f, 0.63f, -0.52f, 0.63f, -0.93f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.41f, 0.25f, 0.78f, 0.63f, 0.93f)
                lineToRelative(2.48f, 0.99f)
                curveToRelative(1.15f, 0.46f, 1.89f, 1.55f, 1.89f, 2.79f)
                verticalLineToRelative(6.29f)
                close()
                moveTo(10.36f, 12.78f)
                curveToRelative(-1.23f, 1.43f, -1.86f, 2.68f, -1.86f, 3.72f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.04f, -0.62f, -2.29f, -1.86f, -3.72f)
                curveToRelative(-0.83f, -0.95f, -2.46f, -0.96f, -3.29f, 0f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.19f, 0.1f, -0.94f, 1.37f, -2.41f)
                curveToRelative(0.04f, -0.05f, 0.09f, -0.06f, 0.13f, -0.06f)
                reflectiveCurveToRelative(0.09f, 0.01f, 0.13f, 0.06f)
                curveToRelative(1.27f, 1.47f, 1.37f, 2.22f, 1.37f, 2.41f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _BottleDroplet = it}
