package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ItAlt: ImageVector? = null

val Icons.Bs.ItAlt: ImageVector
    get() = _ItAlt ?: UXIcon(name = "ItAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 19.27f)
                verticalLineToRelative(4.73f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.73f)
                curveToRelative(-2.03f, -0.64f, -3.5f, -2.53f, -3.5f, -4.77f)
                curveToRelative(0f, -2.05f, 1.24f, -3.81f, 3f, -4.58f)
                verticalLineToRelative(3.08f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3.08f)
                curveToRelative(1.76f, 0.77f, 3f, 2.53f, 3f, 4.58f)
                curveToRelative(0f, 2.24f, -1.47f, 4.13f, -3.5f, 4.77f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1.66f)
                curveToRelative(0.59f, -0.37f, 1.12f, -0.82f, 1.58f, -1.34f)
                horizontalLineToRelative(3.42f)
                lineTo(21f, 7f)
                lineTo(3f, 7f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.46f, 0.52f, 0.99f, 0.96f, 1.58f, 1.34f)
                verticalLineToRelative(1.66f)
                lineTo(0f, 22f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(6f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(11f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _ItAlt = it}
