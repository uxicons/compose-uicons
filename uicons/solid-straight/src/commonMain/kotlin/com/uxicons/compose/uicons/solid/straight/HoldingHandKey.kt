package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoldingHandKey: ImageVector? = null

val Icons.Ss.HoldingHandKey: ImageVector
    get() = _HoldingHandKey ?: UXIcon(name = "HoldingHandKey") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.15f, 8.68f)
                curveToRelative(-0.52f, -0.47f, -1.19f, -0.71f, -1.88f, -0.68f)
                curveToRelative(-0.7f, 0.03f, -1.34f, 0.33f, -1.79f, 0.83f)
                lineToRelative(-3.54f, 3.74f)
                curveToRelative(0.03f, 0.21f, 0.07f, 0.42f, 0.07f, 0.64f)
                curveToRelative(0f, 2.08f, -1.55f, 3.88f, -3.62f, 4.17f)
                lineToRelative(-4.24f, 0.61f)
                lineToRelative(-0.28f, -1.98f)
                lineToRelative(4.24f, -0.61f)
                curveToRelative(1.08f, -0.15f, 1.9f, -1.1f, 1.9f, -2.19f)
                curveToRelative(0f, -1.22f, -0.99f, -2.21f, -2.21f, -2.21f)
                lineTo(3.0f, 11f)
                curveTo(1.35f, 11f, 0.0f, 12.35f, 0.0f, 14f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(12.67f, 24f)
                lineToRelative(10.67f, -11.65f)
                curveToRelative(0.95f, -1.06f, 0.86f, -2.71f, -0.19f, -3.67f)
                close()
                moveTo(12.5f, 0f)
                curveToRelative(-1.76f, 0f, -3.27f, 1.02f, -4.01f, 2.5f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(-1.47f, 1.4f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.4f, -1.4f)
                lineTo(0f, 4.5f)
                lineToRelative(2f, 2.0f)
                horizontalLineToRelative(6.49f)
                curveToRelative(0.74f, 1.48f, 2.25f, 2.5f, 4.01f, 2.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveTo(14.98f, 0f, 12.5f, 0f)
                close()
                moveTo(13.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _HoldingHandKey = it}
