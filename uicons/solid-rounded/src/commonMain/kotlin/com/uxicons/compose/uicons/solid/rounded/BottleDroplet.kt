package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BottleDroplet: ImageVector? = null

val Icons.Sr.BottleDroplet: ImageVector
    get() = _BottleDroplet ?: UXIcon(name = "BottleDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.13f, 14.09f)
                curveToRelative(1.27f, 1.47f, 1.37f, 2.22f, 1.37f, 2.41f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                curveToRelative(0f, -0.19f, 0.1f, -0.94f, 1.37f, -2.41f)
                curveToRelative(0.04f, -0.05f, 0.09f, -0.06f, 0.13f, -0.06f)
                reflectiveCurveToRelative(0.09f, 0.01f, 0.13f, 0.06f)
                close()
                moveTo(20f, 12.71f)
                verticalLineToRelative(6.29f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6.29f)
                curveToRelative(0f, -2.06f, 1.23f, -3.88f, 3.14f, -4.64f)
                lineToRelative(1.86f, -0.74f)
                lineTo(9f, 2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                verticalLineToRelative(5.32f)
                lineToRelative(1.86f, 0.74f)
                curveToRelative(1.91f, 0.76f, 3.14f, 2.59f, 3.14f, 4.64f)
                close()
                moveTo(15.5f, 16.5f)
                curveToRelative(0f, -1.04f, -0.62f, -2.29f, -1.86f, -3.72f)
                curveToRelative(-0.83f, -0.95f, -2.46f, -0.96f, -3.29f, 0f)
                curveToRelative(-1.23f, 1.43f, -1.86f, 2.68f, -1.86f, 3.72f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _BottleDroplet = it}
