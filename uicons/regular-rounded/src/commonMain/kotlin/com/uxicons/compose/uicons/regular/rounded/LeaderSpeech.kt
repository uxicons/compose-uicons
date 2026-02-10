package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderSpeech: ImageVector? = null

val Icons.Rr.LeaderSpeech: ImageVector
    get() = _LeaderSpeech ?: UXIcon(name = "LeaderSpeech") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                lineTo(4f, 18f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0f, -0.8f, 0.31f, -1.55f, 0.88f, -2.12f)
                lineToRelative(0.69f, -0.69f)
                curveToRelative(-0.04f, -0.16f, -0.07f, -0.33f, -0.07f, -0.51f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                curveToRelative(-0.18f, 0f, -0.35f, -0.03f, -0.51f, -0.07f)
                lineToRelative(-0.69f, 0.69f)
                curveToRelative(-0.19f, 0.19f, -0.29f, 0.44f, -0.29f, 0.71f)
                verticalLineToRelative(2.67f)
                horizontalLineToRelative(6f)
                lineTo(10f, 7.36f)
                lineTo(5.23f, 1.64f)
                curveToRelative(-0.35f, -0.42f, -0.3f, -1.05f, 0.13f, -1.41f)
                curveToRelative(0.42f, -0.35f, 1.05f, -0.3f, 1.41f, 0.13f)
                lineToRelative(4.7f, 5.64f)
                horizontalLineToRelative(6.06f)
                lineTo(22.23f, 0.36f)
                curveToRelative(0.35f, -0.42f, 0.98f, -0.48f, 1.41f, -0.13f)
                curveToRelative(0.42f, 0.35f, 0.48f, 0.98f, 0.13f, 1.41f)
                lineToRelative(-4.77f, 5.72f)
                verticalLineToRelative(8.64f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(12f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _LeaderSpeech = it}
