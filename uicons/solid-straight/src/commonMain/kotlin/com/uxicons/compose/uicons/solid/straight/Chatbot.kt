package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chatbot: ImageVector? = null

val Icons.Ss.Chatbot: ImageVector
    get() = _Chatbot ?: UXIcon(name = "Chatbot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-6.85f)
                lineToRelative(-2.44f, 1.7f)
                curveToRelative(-0.3f, 0.2f, -0.64f, 0.3f, -0.98f, 0.3f)
                curveToRelative(-0.28f, 0f, -0.56f, -0.07f, -0.81f, -0.2f)
                curveToRelative(-0.56f, -0.3f, -0.92f, -0.89f, -0.92f, -1.53f)
                lineTo(12f, 2.5f)
                curveTo(12f, 1.12f, 13.12f, -0.0f, 14.5f, -0.0f)
                horizontalLineToRelative(7f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(16f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                lineTo(2f, 24f)
                verticalLineToRelative(-4f)
                lineTo(0f, 20f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0.22f, 1.08f, 0.98f, 2.02f, 1.97f, 2.56f)
                curveToRelative(0.54f, 0.29f, 1.15f, 0.44f, 1.75f, 0.44f)
                curveToRelative(0.75f, 0f, 1.52f, -0.26f, 2.18f, -0.7f)
                curveToRelative(0.05f, 0.23f, 0.09f, 0.46f, 0.09f, 0.7f)
                verticalLineToRelative(1f)
                close()
                moveTo(8f, 17.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(13f, 17.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Chatbot = it}
