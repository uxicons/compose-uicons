package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SoapAlt: ImageVector? = null

val Icons.Ss.SoapAlt: ImageVector
    get() = _SoapAlt ?: UXIcon(name = "SoapAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(22.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(17f, 3f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(24f, 15.56f)
                verticalLineToRelative(1.88f)
                curveToRelative(0f, 3.62f, -2.94f, 6.56f, -6.56f, 6.56f)
                lineTo(6.56f, 24.0f)
                curveToRelative(-3.62f, 0f, -6.56f, -2.94f, -6.56f, -6.56f)
                verticalLineToRelative(-1.88f)
                curveToRelative(0f, -3.62f, 2.94f, -6.56f, 6.56f, -6.56f)
                horizontalLineToRelative(4.79f)
                curveToRelative(0.82f, 2.33f, 3.04f, 4f, 5.65f, 4f)
                curveToRelative(1.95f, 0f, 3.67f, -0.93f, 4.76f, -2.36f)
                curveToRelative(1.37f, 1.2f, 2.24f, 2.96f, 2.24f, 4.93f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _SoapAlt = it}
