package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeWindow: ImageVector? = null

val Icons.Sr.CodeWindow: ImageVector
    get() = _CodeWindow ?: UXIcon(name = "CodeWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineToRelative(-14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(2f)
                close()
                moveTo(8.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-8f)
                close()
                moveTo(8.03f, 16.72f)
                lineTo(10.19f, 18.78f)
                curveToRelative(0.4f, 0.38f, 0.42f, 1.01f, 0.04f, 1.41f)
                curveToRelative(-0.38f, 0.4f, -1.01f, 0.42f, -1.41f, 0.04f)
                lineToRelative(-2.18f, -2.07f)
                curveToRelative(-0.89f, -0.89f, -0.89f, -2.31f, -0.02f, -3.18f)
                lineToRelative(2.18f, -2.18f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-2.18f, 2.18f)
                curveToRelative(-0.09f, 0.09f, -0.09f, 0.24f, 0f, 0.33f)
                close()
                moveTo(17.39f, 18.14f)
                lineTo(15.22f, 20.24f)
                curveToRelative(-0.4f, 0.38f, -1.03f, 0.38f, -1.41f, -0.02f)
                reflectiveCurveToRelative(-0.38f, -1.03f, 0.02f, -1.41f)
                lineToRelative(2.16f, -2.09f)
                curveToRelative(0.08f, -0.08f, 0.08f, -0.23f, -0.01f, -0.32f)
                lineToRelative(-2.18f, -2.18f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(2.18f, 2.18f)
                curveToRelative(0.87f, 0.87f, 0.87f, 2.29f, 0f, 3.16f)
                close()
            }
        }.also { _CodeWindow = it}
