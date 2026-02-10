package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorPolygon: ImageVector? = null

val Icons.Sr.VectorPolygon: ImageVector
    get() = _VectorPolygon ?: UXIcon(name = "VectorPolygon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 6f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                lineTo(6f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.17f, 0f, -0.33f, 0.03f, -0.48f, 0.07f)
                lineToRelative(-3.67f, -4.29f)
                curveToRelative(0.1f, -0.24f, 0.16f, -0.5f, 0.16f, -0.78f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.28f, -0.06f, -0.54f, -0.16f, -0.78f)
                lineToRelative(3.67f, -4.29f)
                curveToRelative(0.16f, 0.04f, 0.32f, 0.07f, 0.48f, 0.07f)
                close()
                moveTo(6f, 20f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(4f, 6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                horizontalLineToRelative(12f)
                curveToRelative(0f, 0.19f, 0.03f, 0.36f, 0.08f, 0.54f)
                lineToRelative(-3.85f, 4.49f)
                curveToRelative(-0.08f, -0.01f, -0.15f, -0.02f, -0.23f, -0.02f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.08f, 0f, 0.16f, -0.01f, 0.23f, -0.02f)
                lineToRelative(3.85f, 4.49f)
                curveToRelative(-0.05f, 0.17f, -0.08f, 0.35f, -0.08f, 0.54f)
                lineTo(6f, 20f)
                close()
            }
        }.also { _VectorPolygon = it}
