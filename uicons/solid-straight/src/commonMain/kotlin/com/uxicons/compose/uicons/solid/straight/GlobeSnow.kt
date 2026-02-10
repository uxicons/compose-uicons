package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeSnow: ImageVector? = null

val Icons.Ss.GlobeSnow: ImageVector
    get() = _GlobeSnow ?: UXIcon(name = "GlobeSnow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 22f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(4f, 19f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(11f, 17f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.75f)
                lineToRelative(2.25f, -3f)
                horizontalLineToRelative(-1.88f)
                lineToRelative(3.38f, -4.5f)
                lineToRelative(3.38f, 4.5f)
                horizontalLineToRelative(-1.88f)
                lineToRelative(2.25f, 3f)
                horizontalLineToRelative(-2.75f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8.23f)
                curveToRelative(1.15f, -1.76f, 1.77f, -3.82f, 1.77f, -6f)
                curveTo(23f, 4.93f, 18.07f, 0f, 12f, 0f)
                reflectiveCurveTo(1f, 4.93f, 1f, 11f)
                curveToRelative(0f, 2.18f, 0.62f, 4.24f, 1.77f, 6f)
                horizontalLineToRelative(8.23f)
                close()
                moveTo(18.5f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(14.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(6.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
            }
        }.also { _GlobeSnow = it}
