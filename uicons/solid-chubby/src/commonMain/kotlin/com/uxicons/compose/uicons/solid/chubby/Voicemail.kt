package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Voicemail: ImageVector? = null

val Icons.Sc.Voicemail: ImageVector
    get() = _Voicemail ?: UXIcon(name = "Voicemail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 7f)
                curveToRelative(-3.32f, 0f, -5f, 1.68f, -5f, 5f)
                curveToRelative(0f, 0.76f, 0.1f, 1.42f, 0.27f, 2f)
                horizontalLineToRelative(-2.54f)
                curveToRelative(0.17f, -0.58f, 0.27f, -1.25f, 0.27f, -2f)
                curveToRelative(0f, -3.32f, -1.68f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5.0f, 1.68f, -5.0f, 5f)
                reflectiveCurveToRelative(1.68f, 5f, 5f, 5f)
                horizontalLineToRelative(12f)
                curveToRelative(3.32f, 0f, 5f, -1.68f, 5f, -5f)
                reflectiveCurveToRelative(-1.68f, -5f, -5f, -5f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, -1.66f, 0.34f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.34f, 2f, 2f)
                reflectiveCurveToRelative(-0.34f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.34f, -2f, -2f)
                close()
                moveTo(18f, 14f)
                curveToRelative(-1.66f, 0f, -2f, -0.34f, -2f, -2f)
                reflectiveCurveToRelative(0.34f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.34f, 2f, 2f)
                reflectiveCurveToRelative(-0.34f, 2f, -2f, 2f)
                close()
            }
        }.also { _Voicemail = it}
