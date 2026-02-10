package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SaltShaker: ImageVector? = null

val Icons.Sr.SaltShaker: ImageVector
    get() = _SaltShaker ?: UXIcon(name = "SaltShaker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 7f)
                curveToRelative(-1f, 0f, -1f, -1f, -1f, -1f)
                curveTo(4f, 1.92f, 6.59f, 0.62f, 9f, 0.2f)
                verticalLineToRelative(1.8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(11f, 0.01f)
                curveToRelative(0.37f, -0.01f, 0.71f, -0.01f, 1f, -0.01f)
                reflectiveCurveToRelative(0.63f, 0f, 1f, 0.01f)
                verticalLineToRelative(1.99f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(15f, 0.2f)
                curveToRelative(2.41f, 0.42f, 5f, 1.72f, 5f, 5.8f)
                curveToRelative(0f, 0f, 0f, 1f, -1f, 1f)
                lineTo(5f, 7f)
                close()
                moveTo(21.91f, 17.51f)
                lineToRelative(-1.53f, -7.7f)
                curveToRelative(-0.09f, -0.47f, -0.5f, -0.81f, -0.98f, -0.81f)
                lineTo(4.6f, 9f)
                curveToRelative(-0.48f, 0f, -0.89f, 0.34f, -0.98f, 0.81f)
                lineToRelative(-1.54f, 7.78f)
                curveToRelative(-0.27f, 1.6f, 0.18f, 3.23f, 1.23f, 4.46f)
                curveToRelative(1.05f, 1.24f, 2.58f, 1.95f, 4.2f, 1.95f)
                horizontalLineToRelative(9.0f)
                curveToRelative(1.63f, 0f, 3.17f, -0.72f, 4.22f, -1.97f)
                curveToRelative(1.05f, -1.25f, 1.48f, -2.9f, 1.19f, -4.52f)
                close()
                moveTo(13.5f, 21f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.5f, 17f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _SaltShaker = it}
