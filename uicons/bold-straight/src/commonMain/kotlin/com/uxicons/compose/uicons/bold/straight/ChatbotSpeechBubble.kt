package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChatbotSpeechBubble: ImageVector? = null

val Icons.Bs.ChatbotSpeechBubble: ImageVector
    get() = _ChatbotSpeechBubble ?: UXIcon(name = "ChatbotSpeechBubble") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 11f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-2.09f, 0f, -3.82f, -0.83f, -3.83f, -0.84f)
                lineToRelative(-1.34f, 2.69f)
                curveToRelative(0.1f, 0.05f, 2.35f, 1.16f, 5.17f, 1.16f)
                reflectiveCurveToRelative(5.08f, -1.11f, 5.17f, -1.16f)
                lineToRelative(-1.34f, -2.69f)
                curveToRelative(-0.02f, 0.01f, -1.74f, 0.84f, -3.83f, 0.84f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.0f, 7.12f)
                curveToRelative(0f, 1.03f, -0.84f, 1.87f, -1.87f, 1.87f)
                curveToRelative(-0.51f, 0f, -0.81f, -0.19f, -0.81f, -0.19f)
                lineToRelative(-5.25f, -2.8f)
                lineTo(2f, 21.0f)
                verticalLineToRelative(-6f)
                lineTo(0f, 15.0f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(5f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                reflectiveCurveToRelative(2f, 0f, 2f, 0f)
                close()
                moveTo(19f, 6.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(5.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(9.81f)
                lineToRelative(4.18f, 2.23f)
                lineToRelative(0.01f, -13.73f)
                close()
            }
        }.also { _ChatbotSpeechBubble = it}
