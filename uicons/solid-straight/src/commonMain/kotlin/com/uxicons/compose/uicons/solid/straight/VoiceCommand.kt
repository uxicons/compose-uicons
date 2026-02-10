package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoiceCommand: ImageVector? = null

val Icons.Ss.VoiceCommand: ImageVector
    get() = _VoiceCommand ?: UXIcon(name = "VoiceCommand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.56f, 9.56f)
                curveToRelative(-0.58f, 0.58f, -1.54f, 0.58f, -2.12f, 0f)
                reflectiveCurveToRelative(-0.58f, -1.54f, 0f, -2.12f)
                reflectiveCurveToRelative(1.54f, -0.58f, 2.12f, 0f)
                reflectiveCurveToRelative(0.58f, 1.54f, 0f, 2.12f)
                close()
                moveTo(15f, 0f)
                verticalLineToRelative(2f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
                moveTo(15f, 3.5f)
                verticalLineToRelative(2f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(22f, 13.01f)
                curveToRelative(-0.01f, 4.97f, -4.03f, 8.99f, -9f, 9f)
                horizontalLineToRelative(-2f)
                curveToRelative(-4.97f, -0.01f, -8.99f, -4.03f, -9f, -9f)
                horizontalLineToRelative(-2f)
                curveToRelative(0.01f, 6.07f, 4.93f, 10.99f, 11f, 10.99f)
                horizontalLineToRelative(2f)
                curveToRelative(6.07f, -0.01f, 10.99f, -4.92f, 11f, -10.99f)
                close()
                moveTo(15.5f, 12f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -0.95f, 0.38f, -1.81f, 1f, -2.44f)
                verticalLineToRelative(-5.98f)
                curveToRelative(-0.65f, -0.09f, -1.31f, -0.1f, -1.99f, -0.0f)
                curveToRelative(-3.08f, 0.44f, -5.49f, 2.85f, -5.93f, 5.93f)
                horizontalLineToRelative(3.93f)
                verticalLineToRelative(2.01f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2.99f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2.01f)
                horizontalLineToRelative(-3.93f)
                curveToRelative(0.55f, 3.83f, 4.1f, 6.48f, 7.92f, 5.93f)
                curveToRelative(3.08f, -0.44f, 5.49f, -2.86f, 5.93f, -5.93f)
                lineToRelative(0.07f, -2f)
                verticalLineToRelative(-0.01f)
                horizontalLineToRelative(-1.06f)
                curveToRelative(-0.63f, 0.62f, -1.49f, 1f, -2.44f, 1f)
                close()
            }
        }.also { _VoiceCommand = it}
