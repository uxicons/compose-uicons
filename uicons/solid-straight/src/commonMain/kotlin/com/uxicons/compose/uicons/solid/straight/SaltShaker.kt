package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SaltShaker: ImageVector? = null

val Icons.Ss.SaltShaker: ImageVector
    get() = _SaltShaker ?: UXIcon(name = "SaltShaker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 7f)
                verticalLineToRelative(-1f)
                curveTo(4f, 1.92f, 6.59f, 0.62f, 9f, 0.2f)
                verticalLineToRelative(2.8f)
                horizontalLineToRelative(2f)
                lineTo(11f, 0.01f)
                curveToRelative(0.37f, -0.01f, 0.71f, -0.01f, 1f, -0.01f)
                reflectiveCurveToRelative(0.63f, 0f, 1f, 0.01f)
                verticalLineToRelative(2.99f)
                horizontalLineToRelative(2f)
                lineTo(15f, 0.2f)
                curveToRelative(2.41f, 0.42f, 5f, 1.72f, 5f, 5.8f)
                verticalLineToRelative(1f)
                lineTo(4f, 7f)
                close()
                moveTo(21.96f, 19.41f)
                curveToRelative(0.17f, 1.18f, -0.17f, 2.34f, -0.93f, 3.21f)
                reflectiveCurveToRelative(-1.86f, 1.38f, -3.02f, 1.38f)
                lineTo(6f, 24f)
                curveToRelative(-1.16f, 0f, -2.26f, -0.5f, -3.02f, -1.38f)
                reflectiveCurveToRelative(-1.1f, -2.04f, -0.94f, -3.19f)
                lineToRelative(1.77f, -10.43f)
                horizontalLineToRelative(16.37f)
                lineToRelative(1.77f, 10.41f)
                close()
                moveTo(15f, 19.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(18f, 15.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _SaltShaker = it}
