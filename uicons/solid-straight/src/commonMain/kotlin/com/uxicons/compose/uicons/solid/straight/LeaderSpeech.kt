package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderSpeech: ImageVector? = null

val Icons.Ss.LeaderSpeech: ImageVector
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
                lineToRelative(5.67f, -6.72f)
                lineTo(22.1f, 0.03f)
                lineToRelative(-5.09f, 5.97f)
                horizontalLineToRelative(-5.03f)
                lineTo(7f, 0f)
                lineToRelative(-1.57f, 1.24f)
                lineToRelative(5.57f, 6.75f)
                verticalLineToRelative(6.02f)
                close()
                moveTo(24f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                lineTo(2f, 24f)
                verticalLineToRelative(-6f)
                lineTo(0f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.91f)
                lineToRelative(1.57f, -1.57f)
                curveToRelative(-0.04f, -0.16f, -0.07f, -0.33f, -0.07f, -0.51f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                curveToRelative(-0.18f, 0f, -0.35f, -0.03f, -0.51f, -0.07f)
                lineToRelative(-0.99f, 0.99f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _LeaderSpeech = it}
