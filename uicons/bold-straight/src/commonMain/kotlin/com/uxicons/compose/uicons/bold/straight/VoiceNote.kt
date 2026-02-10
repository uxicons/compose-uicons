package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoiceNote: ImageVector? = null

val Icons.Bs.VoiceNote: ImageVector
    get() = _VoiceNote ?: UXIcon(name = "VoiceNote") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(6.41f)
                lineToRelative(3.93f, 3.37f)
                curveToRelative(0.47f, 0.42f, 1.07f, 0.63f, 1.66f, 0.63f)
                reflectiveCurveToRelative(1.19f, -0.21f, 1.66f, -0.63f)
                lineToRelative(3.81f, -3.37f)
                horizontalLineToRelative(6.53f)
                verticalLineToRelative(-16.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 17f)
                horizontalLineToRelative(-4.67f)
                lineToRelative(-4.33f, 3.84f)
                lineToRelative(-4.48f, -3.84f)
                horizontalLineToRelative(-4.51f)
                verticalLineToRelative(-13.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                close()
                moveTo(14f, 10f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(9.17f, 7.17f)
                curveToRelative(-0.76f, 0.76f, -1.17f, 1.76f, -1.17f, 2.83f)
                reflectiveCurveToRelative(0.42f, 2.07f, 1.17f, 2.83f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-1.32f, -1.32f, -2.05f, -3.08f, -2.05f, -4.95f)
                reflectiveCurveToRelative(0.73f, -3.63f, 2.05f, -4.95f)
                close()
                moveTo(16.95f, 5.05f)
                curveToRelative(1.32f, 1.32f, 2.05f, 3.08f, 2.05f, 4.95f)
                reflectiveCurveToRelative(-0.73f, 3.63f, -2.05f, 4.95f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(0.76f, -0.76f, 1.17f, -1.76f, 1.17f, -2.83f)
                reflectiveCurveToRelative(-0.42f, -2.07f, -1.17f, -2.83f)
                close()
            }
        }.also { _VoiceNote = it}
