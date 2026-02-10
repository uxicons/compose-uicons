package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Voicemail: ImageVector? = null

val Icons.Tr.Voicemail: ImageVector
    get() = _Voicemail ?: UXIcon(name = "Voicemail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 6f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                curveToRelative(0f, 1.86f, 0.93f, 3.5f, 2.34f, 4.5f)
                horizontalLineToRelative(-6.68f)
                curveToRelative(1.42f, -1.0f, 2.34f, -2.64f, 2.34f, -4.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveTo(0f, 8.47f, 0f, 11.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(1f, 11.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveTo(1f, 13.98f, 1f, 11.5f)
                close()
                moveTo(18.5f, 16f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveToRelative(2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
            }
        }.also { _Voicemail = it}
