package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoiceCommand: ImageVector? = null

val Icons.Bs.VoiceCommand: ImageVector
    get() = _VoiceCommand ?: UXIcon(name = "VoiceCommand") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 12f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                curveToRelative(0.34f, 0f, 0.67f, 0.03f, 1f, 0.08f)
                verticalLineToRelative(3.06f)
                curveToRelative(-0.32f, -0.08f, -0.65f, -0.14f, -1f, -0.14f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                close()
                moveTo(21f, 13.5f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 5.79f, 4.71f, 10.5f, 10.5f, 10.5f)
                horizontalLineToRelative(3f)
                curveToRelative(5.79f, 0f, 10.5f, -4.71f, 10.5f, -10.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(15f, 0f)
                verticalLineToRelative(3f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
                moveTo(15f, 5f)
                verticalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
            }
        }.also { _VoiceCommand = it}
