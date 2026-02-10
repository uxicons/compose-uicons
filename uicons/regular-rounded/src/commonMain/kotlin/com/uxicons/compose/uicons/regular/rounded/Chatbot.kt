package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chatbot: ImageVector? = null

val Icons.Rr.Chatbot: ImageVector
    get() = _Chatbot ?: UXIcon(name = "Chatbot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.5f, 16f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(11.5f, 19f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24f, 4.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-2.85f)
                lineToRelative(-2.44f, 1.7f)
                curveToRelative(-0.3f, 0.2f, -0.64f, 0.3f, -0.98f, 0.3f)
                curveToRelative(-0.28f, 0f, -0.56f, -0.07f, -0.81f, -0.2f)
                curveToRelative(-0.56f, -0.3f, -0.92f, -0.89f, -0.92f, -1.53f)
                lineTo(12f, 4.0f)
                curveTo(12f, 1.79f, 13.79f, -0.0f, 16f, -0.0f)
                horizontalLineToRelative(4f)
                curveTo(22.21f, -0.0f, 24f, 1.79f, 24f, 4.0f)
                close()
                moveTo(22f, 4.0f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5.76f)
                lineToRelative(2.26f, -1.57f)
                curveToRelative(0.17f, -0.12f, 0.37f, -0.18f, 0.57f, -0.18f)
                horizontalLineToRelative(3.17f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.5f, 15f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _Chatbot = it}
