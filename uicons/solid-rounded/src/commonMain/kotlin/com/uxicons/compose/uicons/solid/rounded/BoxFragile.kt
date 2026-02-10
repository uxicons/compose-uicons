package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxFragile: ImageVector? = null

val Icons.Sr.BoxFragile: ImageVector
    get() = _BoxFragile ?: UXIcon(name = "BoxFragile") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(17f, 10f)
                curveToRelative(0f, 2.41f, -1.72f, 4.43f, -4f, 4.89f)
                verticalLineToRelative(3.1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.12f)
                curveToRelative(-2.33f, -0.49f, -4f, -2.66f, -4f, -5.1f)
                verticalLineToRelative(-3.78f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1.78f)
                reflectiveCurveToRelative(-1.69f, 2.84f, -1.71f, 2.92f)
                curveToRelative(-0.15f, 0.49f, -0.06f, 1.02f, 0.25f, 1.43f)
                reflectiveCurveToRelative(0.79f, 0.65f, 1.3f, 0.65f)
                horizontalLineToRelative(2.07f)
                lineToRelative(-1.53f, 2.47f)
                curveToRelative(-0.29f, 0.47f, -0.15f, 1.09f, 0.32f, 1.38f)
                curveToRelative(0.16f, 0.1f, 0.35f, 0.15f, 0.53f, 0.15f)
                curveToRelative(0.33f, 0f, 0.66f, -0.17f, 0.85f, -0.47f)
                lineToRelative(1.88f, -3.04f)
                curveToRelative(0.33f, -0.49f, 0.36f, -1.12f, 0.08f, -1.65f)
                reflectiveCurveToRelative(-0.82f, -0.85f, -1.41f, -0.85f)
                horizontalLineToRelative(-2.08f)
                lineToRelative(1.8f, -3f)
                horizontalLineToRelative(1.89f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _BoxFragile = it}
