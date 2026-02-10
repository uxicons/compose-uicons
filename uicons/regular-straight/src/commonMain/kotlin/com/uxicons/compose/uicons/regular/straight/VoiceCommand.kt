package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoiceCommand: ImageVector? = null

val Icons.Rs.VoiceCommand: ImageVector
    get() = _VoiceCommand ?: UXIcon(name = "VoiceCommand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 13f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 6.04f, -4.91f, 11f, -10.95f, 11f)
                horizontalLineToRelative(-2.1f)
                curveToRelative(-6.04f, 0f, -10.95f, -4.96f, -10.95f, -11f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 4.94f, 4.02f, 9f, 8.95f, 9f)
                horizontalLineToRelative(2.1f)
                curveToRelative(4.94f, 0f, 8.95f, -4.06f, 8.95f, -9f)
                close()
                moveTo(16.56f, 9.56f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                reflectiveCurveToRelative(-1.54f, -0.58f, -2.12f, 0f)
                curveToRelative(-0.58f, 0.59f, -0.58f, 1.54f, 0f, 2.12f)
                reflectiveCurveToRelative(1.54f, 0.59f, 2.12f, 0f)
                close()
                moveTo(22f, 9f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                verticalLineToRelative(2f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                close()
                moveTo(18.5f, 9f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                verticalLineToRelative(2f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(12f, 20f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                curveToRelative(-2.97f, 0f, -5.43f, -2.17f, -5.91f, -5f)
                horizontalLineToRelative(3.91f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.91f)
                curveToRelative(0.48f, -2.83f, 2.94f, -5f, 5.91f, -5f)
                curveToRelative(0.34f, 0f, 0.67f, 0.04f, 1f, 0.09f)
                verticalLineToRelative(-2.02f)
                curveToRelative(-0.33f, -0.04f, -0.66f, -0.07f, -1f, -0.07f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                close()
            }
        }.also { _VoiceCommand = it}
