package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HammerBrush: ImageVector? = null

val Icons.Sr.HammerBrush: ImageVector
    get() = _HammerBrush ?: UXIcon(name = "HammerBrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 4f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.85f)
                lineToRelative(0.85f, 11.41f)
                curveToRelative(0.05f, 1.41f, -1.08f, 2.59f, -2.5f, 2.59f)
                reflectiveCurveToRelative(-2.55f, -1.17f, -2.5f, -2.59f)
                lineToRelative(0.85f, -11.41f)
                lineTo(1f, 5f)
                curveToRelative(-1f, 0f, -1f, -1f, -1f, -1f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(15.36f, 12.52f)
                lineToRelative(-2.17f, 1.05f)
                curveToRelative(-1.0f, 0.51f, -1.71f, 1.39f, -2.02f, 2.43f)
                horizontalLineToRelative(12.67f)
                curveToRelative(-0.31f, -1.04f, -1.02f, -1.92f, -2.02f, -2.42f)
                lineToRelative(-2.17f, -1.05f)
                curveToRelative(-0.4f, -0.19f, -0.62f, -0.62f, -0.55f, -1.06f)
                curveToRelative(0.43f, -2.63f, 0.91f, -5.65f, 0.91f, -5.96f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.31f, 0.48f, 3.33f, 0.91f, 5.96f)
                curveToRelative(0.07f, 0.44f, -0.15f, 0.87f, -0.55f, 1.06f)
                close()
                moveTo(11f, 18f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineToRelative(0.94f, -3.61f)
                curveToRelative(0.19f, -0.51f, 0.92f, -0.51f, 1.11f, 0f)
                lineToRelative(0.94f, 3.61f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-13f)
                close()
            }
        }.also { _HammerBrush = it}
