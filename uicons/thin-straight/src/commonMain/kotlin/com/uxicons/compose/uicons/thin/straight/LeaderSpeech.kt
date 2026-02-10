package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderSpeech: ImageVector? = null

val Icons.Ts.LeaderSpeech: ImageVector
    get() = _LeaderSpeech ?: UXIcon(name = "LeaderSpeech") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                close()
                moveTo(14f, 1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(24f, 16f)
                horizontalLineToRelative(-6f)
                lineTo(18f, 7.67f)
                lineTo(23.39f, 0.81f)
                lineToRelative(-0.79f, -0.62f)
                lineToRelative(-5.35f, 6.81f)
                horizontalLineToRelative(-6.51f)
                lineTo(5.39f, 0.19f)
                lineToRelative(-0.79f, 0.62f)
                lineToRelative(5.39f, 6.86f)
                verticalLineToRelative(8.33f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3.29f)
                lineToRelative(0.99f, -0.99f)
                curveToRelative(0.3f, 0.18f, 0.64f, 0.28f, 1.01f, 0.28f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.37f, 0.11f, 0.71f, 0.28f, 1.01f)
                lineToRelative(-1.28f, 1.28f)
                verticalLineToRelative(3.71f)
                lineTo(0f, 16f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(7.17f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(11f, 8f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-8f)
                close()
            }
        }.also { _LeaderSpeech = it}
