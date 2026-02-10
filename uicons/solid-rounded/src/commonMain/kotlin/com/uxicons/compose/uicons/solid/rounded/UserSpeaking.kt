package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSpeaking: ImageVector? = null

val Icons.Sr.UserSpeaking: ImageVector
    get() = _UserSpeaking ?: UXIcon(name = "UserSpeaking") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.72f, 24f)
                curveToRelative(-0.26f, 0f, -0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                curveToRelative(1.28f, -1.28f, 1.99f, -2.98f, 1.99f, -4.79f)
                reflectiveCurveToRelative(-0.7f, -3.51f, -1.99f, -4.79f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(1.66f, 1.66f, 2.57f, 3.86f, 2.57f, 6.21f)
                reflectiveCurveToRelative(-0.91f, 4.55f, -2.57f, 6.21f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                close()
                moveTo(18.59f, 20.91f)
                curveToRelative(1.88f, -1.88f, 1.88f, -4.94f, 0f, -6.81f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(1.1f, 1.1f, 1.1f, 2.89f, 0f, 3.99f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                close()
                moveTo(8f, 21f)
                horizontalLineToRelative(0.49f)
                curveToRelative(2.5f, 0f, 4.63f, -1.87f, 4.96f, -4.34f)
                lineToRelative(0.22f, -1.66f)
                horizontalLineToRelative(0.33f)
                curveToRelative(1.3f, 0f, 2f, -1.03f, 2f, -2f)
                curveToRelative(0f, -1.42f, -2.93f, -7.01f, -4.2f, -8.58f)
                curveTo(9.36f, 1.16f, 5.5f, -0.45f, 1.45f, 0.11f)
                curveToRelative(-0.22f, 0.03f, -0.43f, 0.07f, -0.65f, 0.11f)
                curveToRelative(-0.47f, 0.09f, -0.8f, 0.5f, -0.8f, 0.98f)
                lineTo(0f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(5f, 24f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _UserSpeaking = it}
