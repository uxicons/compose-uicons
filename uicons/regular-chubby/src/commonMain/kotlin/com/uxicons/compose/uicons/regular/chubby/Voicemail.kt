package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Voicemail: ImageVector? = null

val Icons.Rc.Voicemail: ImageVector
    get() = _Voicemail ?: UXIcon(name = "Voicemail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 7f)
                curveToRelative(-3.41f, 0f, -5f, 1.59f, -5f, 5f)
                curveToRelative(0f, 1.24f, 0.22f, 2.23f, 0.65f, 3f)
                horizontalLineToRelative(-3.29f)
                curveToRelative(0.43f, -0.77f, 0.65f, -1.76f, 0.65f, -3f)
                curveToRelative(0f, -3.41f, -1.59f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5.0f, 1.59f, -5.0f, 5f)
                reflectiveCurveToRelative(1.59f, 5f, 5f, 5f)
                horizontalLineToRelative(12f)
                curveToRelative(3.41f, 0f, 5f, -1.59f, 5f, -5f)
                reflectiveCurveToRelative(-1.59f, -5f, -5f, -5f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -2.3f, 0.7f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.7f, 3f, 3f)
                reflectiveCurveToRelative(-0.7f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -0.7f, -3f, -3f)
                close()
                moveTo(18f, 15f)
                curveToRelative(-2.3f, 0f, -3f, -0.7f, -3f, -3f)
                reflectiveCurveToRelative(0.7f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.7f, 3f, 3f)
                reflectiveCurveToRelative(-0.7f, 3f, -3f, 3f)
                close()
            }
        }.also { _Voicemail = it}
