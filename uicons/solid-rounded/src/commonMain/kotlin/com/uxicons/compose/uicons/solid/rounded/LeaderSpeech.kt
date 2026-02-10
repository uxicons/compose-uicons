package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderSpeech: ImageVector? = null

val Icons.Sr.LeaderSpeech: ImageVector
    get() = _LeaderSpeech ?: UXIcon(name = "LeaderSpeech") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(11f, 14f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-6.02f)
                lineToRelative(5.34f, -6.33f)
                curveToRelative(0.37f, -0.43f, 0.3f, -1.08f, -0.15f, -1.43f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.42f, -0.33f, -1.03f, -0.27f, -1.38f, 0.14f)
                lineToRelative(-4.8f, 5.65f)
                horizontalLineToRelative(-5.03f)
                lineTo(7.31f, 0.36f)
                curveToRelative(-0.35f, -0.42f, -0.96f, -0.48f, -1.39f, -0.15f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.44f, 0.35f, -0.51f, 0.99f, -0.15f, 1.42f)
                lineToRelative(5.23f, 6.34f)
                verticalLineToRelative(6.02f)
                close()
                moveTo(23f, 18f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                lineTo(1f, 18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0f, -0.8f, 0.32f, -1.56f, 0.88f, -2.12f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(-0.14f, -0.51f, -0.15f, -1.07f, 0.51f, -1.79f)
                curveToRelative(0.41f, -0.45f, 0.98f, -0.77f, 1.59f, -0.72f)
                curveToRelative(0.97f, 0.08f, 1.74f, 0.85f, 1.82f, 1.82f)
                curveToRelative(0.05f, 0.61f, -0.26f, 1.18f, -0.72f, 1.59f)
                curveToRelative(-0.72f, 0.65f, -1.28f, 0.64f, -1.79f, 0.51f)
                lineToRelative(-0.99f, 0.99f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(19f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _LeaderSpeech = it}
