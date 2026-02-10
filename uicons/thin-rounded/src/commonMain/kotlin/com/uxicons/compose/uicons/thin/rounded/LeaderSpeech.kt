package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderSpeech: ImageVector? = null

val Icons.Tr.LeaderSpeech: ImageVector
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
                moveTo(23.5f, 16f)
                horizontalLineToRelative(-5.5f)
                lineTo(18f, 7.67f)
                lineTo(23.39f, 0.81f)
                curveToRelative(0.17f, -0.22f, 0.13f, -0.53f, -0.08f, -0.7f)
                curveToRelative(-0.22f, -0.17f, -0.53f, -0.13f, -0.7f, 0.08f)
                lineToRelative(-5.35f, 6.81f)
                horizontalLineToRelative(-6.51f)
                lineTo(5.39f, 0.19f)
                curveToRelative(-0.17f, -0.22f, -0.48f, -0.26f, -0.7f, -0.08f)
                curveToRelative(-0.22f, 0.17f, -0.26f, 0.48f, -0.08f, 0.7f)
                lineToRelative(5.39f, 6.86f)
                verticalLineToRelative(8.33f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0f, -0.4f, 0.16f, -0.78f, 0.44f, -1.06f)
                lineToRelative(0.55f, -0.55f)
                curveToRelative(0.3f, 0.18f, 0.64f, 0.28f, 1.01f, 0.28f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.37f, 0.11f, 0.71f, 0.28f, 1.01f)
                lineToRelative(-0.55f, 0.55f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                verticalLineToRelative(2.67f)
                lineTo(0.5f, 16f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(6.67f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.67f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(6f, 9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(17f, 16f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _LeaderSpeech = it}
