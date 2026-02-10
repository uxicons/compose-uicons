package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeWindow: ImageVector? = null

val Icons.Br.CodeWindow: ImageVector
    get() = _CodeWindow ?: UXIcon(name = "CodeWindow") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 1f)
            horizontalLineToRelative(-13f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-11f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(9.5f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(4.5f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(21f, 17.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(18f)
            close()
            moveTo(6.82f, 16.01f)
            curveToRelative(-0.54f, -0.54f, -0.82f, -1.23f, -0.82f, -1.96f)
            reflectiveCurveToRelative(0.28f, -1.42f, 0.8f, -1.94f)
            lineToRelative(1.68f, -1.68f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            reflectiveCurveToRelative(0.59f, 1.53f, 0f, 2.12f)
            lineToRelative(-1.49f, 1.49f)
            lineToRelative(1.43f, 1.37f)
            curveToRelative(0.6f, 0.57f, 0.62f, 1.52f, 0.04f, 2.12f)
            curveToRelative(-0.57f, 0.6f, -1.52f, 0.62f, -2.12f, 0.04f)
            lineToRelative(-1.64f, -1.57f)
            close()
            moveTo(13.4f, 12.56f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(1.53f, -0.59f, 2.12f, 0f)
            lineToRelative(1.68f, 1.68f)
            curveToRelative(0.52f, 0.52f, 0.8f, 1.2f, 0.8f, 1.94f)
            reflectiveCurveToRelative(-0.28f, 1.42f, -0.8f, 1.94f)
            lineToRelative(-1.66f, 1.59f)
            curveToRelative(-0.59f, 0.57f, -1.55f, 0.56f, -2.12f, -0.04f)
            curveToRelative(-0.57f, -0.6f, -0.56f, -1.55f, 0.04f, -2.12f)
            lineToRelative(1.43f, -1.37f)
            lineToRelative(-1.49f, -1.49f)
            close()
        }
    }.also { _CodeWindow = it }
