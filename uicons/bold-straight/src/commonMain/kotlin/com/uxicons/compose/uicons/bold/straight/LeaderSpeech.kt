package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LeaderSpeech: ImageVector? = null

val Icons.Bs.LeaderSpeech: ImageVector
    get() = _LeaderSpeech ?: UXIcon(name = "LeaderSpeech") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 2.5f)
                curveTo(12f, 1.12f, 13.12f, 0f, 14.5f, 0f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                lineTo(5f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                lineTo(0f, 18f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.12f)
                lineToRelative(2.01f, -2.01f)
                curveToRelative(0.07f, -1.04f, 0.93f, -1.86f, 1.99f, -1.86f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 1.06f, -0.82f, 1.92f, -1.86f, 1.99f)
                lineToRelative(-1.14f, 1.14f)
                verticalLineToRelative(1.88f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6.33f)
                lineTo(5.79f, 2.88f)
                lineToRelative(2.43f, -1.76f)
                lineToRelative(3.55f, 4.88f)
                horizontalLineToRelative(5.47f)
                lineToRelative(3.55f, -4.88f)
                lineToRelative(2.43f, 1.76f)
                lineToRelative(-4.21f, 5.79f)
                verticalLineToRelative(6.33f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                close()
                moveTo(13f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _LeaderSpeech = it}
