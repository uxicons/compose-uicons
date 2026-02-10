package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSpeaking: ImageVector? = null

val Icons.Bs.UserSpeaking: ImageVector
    get() = _UserSpeaking ?: UXIcon(name = "UserSpeaking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12.68f)
                verticalLineToRelative(2.82f)
                horizontalLineToRelative(-2.3f)
                lineToRelative(-0.34f, 2.48f)
                curveToRelative(-0.24f, 1.72f, -1.73f, 3.02f, -3.47f, 3.02f)
                horizontalLineToRelative(-0.89f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                lineTo(5f, 21f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.89f)
                curveToRelative(0.25f, 0f, 0.46f, -0.19f, 0.49f, -0.43f)
                lineToRelative(0.7f, -5.07f)
                horizontalLineToRelative(1.56f)
                curveToRelative(-0.06f, -0.15f, -0.13f, -0.3f, -0.19f, -0.44f)
                curveToRelative(-0.99f, -2.28f, -2.02f, -4.64f, -2.93f, -5.78f)
                curveTo(6.67f, 3.81f, 3.67f, 2.62f, 0.67f, 3.11f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-0.23f, 0.04f, -0.45f, 0.09f, -0.67f, 0.15f)
                lineTo(0.0f, 0.2f)
                curveToRelative(0.06f, -0.01f, 0.12f, -0.03f, 0.18f, -0.04f)
                curveToRelative(0f, 0f, 0f, 0f, 0.0f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(4.11f, -0.67f, 8.21f, 0.96f, 10.7f, 4.28f)
                curveToRelative(1.14f, 1.41f, 2.2f, 3.85f, 3.32f, 6.42f)
                curveToRelative(0.22f, 0.51f, 0.8f, 1.82f, 0.8f, 1.82f)
                close()
                moveTo(21.22f, 10.78f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(2.53f, 2.53f, 2.53f, 6.66f, 0f, 9.19f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(3.7f, -3.7f, 3.7f, -9.73f, 0f, -13.44f)
                close()
                moveTo(15.56f, 16.44f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(0.85f, -0.85f, 1.32f, -1.98f, 1.32f, -3.18f)
                reflectiveCurveToRelative(-0.47f, -2.33f, -1.32f, -3.18f)
                lineToRelative(-2.12f, 2.12f)
                close()
            }
        }.also { _UserSpeaking = it}
