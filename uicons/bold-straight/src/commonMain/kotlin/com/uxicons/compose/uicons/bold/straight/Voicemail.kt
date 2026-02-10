package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Voicemail: ImageVector? = null

val Icons.Bs.Voicemail: ImageVector
    get() = _Voicemail ?: UXIcon(name = "Voicemail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 6f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                curveToRelative(0f, 0.9f, 0.22f, 1.75f, 0.6f, 2.5f)
                horizontalLineToRelative(-3.2f)
                curveToRelative(0.39f, -0.75f, 0.6f, -1.6f, 0.6f, -2.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveTo(0f, 8.47f, 0f, 11.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(13f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(3f, 11.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(18.5f, 14f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _Voicemail = it}
