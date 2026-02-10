package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FingerDroplet: ImageVector? = null

val Icons.Ss.FingerDroplet: ImageVector
    get() = _FingerDroplet ?: UXIcon(name = "FingerDroplet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 22f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.94f, 0f, -1.84f, -0.37f, -2.47f, -1.0f)
                curveToRelative(-0.66f, -0.66f, -1.02f, -1.54f, -1.02f, -2.47f)
                reflectiveCurveToRelative(0.36f, -1.81f, 1.02f, -2.47f)
                lineToRelative(2.48f, -2.43f)
                lineToRelative(2.47f, 2.41f)
                curveToRelative(0.67f, 0.67f, 1.03f, 1.55f, 1.03f, 2.48f)
                reflectiveCurveToRelative(-0.36f, 1.81f, -1.03f, 2.48f)
                curveToRelative(-0.64f, 0.64f, -1.54f, 1.0f, -2.48f, 1.0f)
                close()
                moveTo(21.5f, 7f)
                lineTo(7f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.39f)
                lineToRelative(-3.02f, -3.12f)
                curveToRelative(-0.7f, -0.7f, -1.71f, -1.01f, -2.68f, -0.83f)
                curveToRelative(-0.62f, 0.13f, -1.2f, 0.44f, -1.64f, 0.9f)
                lineTo(0f, 7f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(13.81f)
                lineToRelative(2.01f, -9f)
                horizontalLineToRelative(5.68f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _FingerDroplet = it}
