package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SoapAlt: ImageVector? = null

val Icons.Sr.SoapAlt: ImageVector
    get() = _SoapAlt ?: UXIcon(name = "SoapAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(8.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(21f, 7f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
                moveTo(24f, 16.5f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                lineTo(7.5f, 24f)
                curveTo(3.04f, 24f, -0.52f, 20.09f, 0.06f, 15.51f)
                curveToRelative(0.48f, -3.78f, 3.89f, -6.51f, 7.7f, -6.51f)
                horizontalLineToRelative(3.59f)
                curveToRelative(0.82f, 2.33f, 3.04f, 4f, 5.65f, 4f)
                curveToRelative(1.8f, 0f, 3.42f, -0.8f, 4.52f, -2.06f)
                curveToRelative(1.52f, 1.37f, 2.48f, 3.35f, 2.48f, 5.56f)
                close()
                moveTo(13f, 14f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 1.66f, 1.18f, 3.1f, 2.8f, 3.43f)
                curveToRelative(0.07f, 0.01f, 0.13f, 0.02f, 0.2f, 0.02f)
                curveToRelative(0.47f, 0f, 0.88f, -0.33f, 0.98f, -0.8f)
                curveToRelative(0.11f, -0.54f, -0.24f, -1.07f, -0.78f, -1.18f)
                curveToRelative(-0.69f, -0.14f, -1.2f, -0.76f, -1.2f, -1.47f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _SoapAlt = it}
