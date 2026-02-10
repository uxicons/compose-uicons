package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Voicemail: ImageVector? = null

val Icons.Tc.Voicemail: ImageVector
    get() = _Voicemail ?: UXIcon(name = "Voicemail") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, -3.5f, -1.5f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 1.5f, -5f, 5f)
                curveToRelative(0f, 1.91f, 0.46f, 3.2f, 1.43f, 4f)
                horizontalLineToRelative(-4.86f)
                curveToRelative(0.97f, -0.8f, 1.43f, -2.09f, 1.43f, -4f)
                curveToRelative(0f, -3.5f, -1.5f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 1.5f, -5f, 5f)
                reflectiveCurveToRelative(1.5f, 5f, 5f, 5f)
                horizontalLineToRelative(12f)
                curveToRelative(3.19f, 0.01f, 5.09f, -1.43f, 5f, -5f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.95f, 1.05f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.05f, 4f, 4f)
                reflectiveCurveToRelative(-1.05f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.05f, -4f, -4f)
                close()
                moveTo(18f, 16f)
                curveToRelative(-2.95f, 0f, -4f, -1.05f, -4f, -4f)
                reflectiveCurveToRelative(1.05f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.05f, 4f, 4f)
                reflectiveCurveToRelative(-1.05f, 4f, -4f, 4f)
                close()
            }
        }.also { _Voicemail = it}
