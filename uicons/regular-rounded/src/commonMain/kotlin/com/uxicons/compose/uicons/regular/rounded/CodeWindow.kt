package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeWindow: ImageVector? = null

val Icons.Rr.CodeWindow: ImageVector
    get() = _CodeWindow ?: UXIcon(name = "CodeWindow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-14f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(2f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-14f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                close()
                moveTo(22f, 18f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
                moveTo(10.21f, 13.21f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(-1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-2.18f, 2.18f)
                curveToRelative(-0.87f, 0.87f, -0.87f, 2.29f, 0.02f, 3.18f)
                lineToRelative(2.18f, 2.07f)
                curveToRelative(0.4f, 0.38f, 1.03f, 0.36f, 1.41f, -0.04f)
                curveToRelative(0.38f, -0.4f, 0.36f, -1.03f, -0.04f, -1.41f)
                lineToRelative(-2.16f, -2.05f)
                curveToRelative(-0.09f, -0.09f, -0.09f, -0.24f, 0f, -0.33f)
                lineToRelative(2.18f, -2.18f)
                close()
                moveTo(15.21f, 11.79f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(2.18f, 2.18f)
                curveToRelative(0.09f, 0.09f, 0.09f, 0.24f, 0.01f, 0.32f)
                lineToRelative(-2.16f, 2.09f)
                curveToRelative(-0.4f, 0.38f, -0.41f, 1.02f, -0.02f, 1.41f)
                curveToRelative(0.39f, 0.4f, 1.02f, 0.41f, 1.41f, 0.02f)
                lineToRelative(2.17f, -2.1f)
                curveToRelative(0.87f, -0.87f, 0.87f, -2.29f, 0f, -3.16f)
                lineToRelative(-2.18f, -2.18f)
                close()
            }
        }.also { _CodeWindow = it}
