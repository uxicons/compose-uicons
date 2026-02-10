package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderSpeech: ImageVector? = null

val Icons.Rs.LeaderSpeech: ImageVector
    get() = _LeaderSpeech ?: UXIcon(name = "LeaderSpeech") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 2.5f)
                moveToRelative(-2.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                horizontalLineToRelative(-5f)
                lineTo(19f, 7.36f)
                lineToRelative(4.77f, -5.72f)
                lineToRelative(-1.54f, -1.28f)
                lineToRelative(-4.7f, 5.64f)
                horizontalLineToRelative(-6.06f)
                lineTo(6.77f, 0.36f)
                lineToRelative(-1.54f, 1.28f)
                lineToRelative(4.77f, 5.72f)
                verticalLineToRelative(8.64f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3.09f)
                lineToRelative(0.99f, -0.99f)
                curveToRelative(0.16f, 0.04f, 0.33f, 0.07f, 0.51f, 0.07f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.18f, 0.03f, 0.35f, 0.07f, 0.51f)
                lineToRelative(-1.57f, 1.57f)
                verticalLineToRelative(3.91f)
                lineTo(0f, 16.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(12f, 8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-8f)
                close()
            }
        }.also { _LeaderSpeech = it}
