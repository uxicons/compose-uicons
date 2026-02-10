package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeSnow: ImageVector? = null

val Icons.Bs.GlobeSnow: ImageVector
    get() = _GlobeSnow ?: UXIcon(name = "GlobeSnow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 21f)
                curveToRelative(0f, -1.21f, -0.72f, -2.25f, -1.75f, -2.73f)
                curveToRelative(1.74f, -1.98f, 2.75f, -4.55f, 2.75f, -7.27f)
                curveTo(23f, 4.93f, 18.07f, 0f, 12f, 0f)
                reflectiveCurveTo(1f, 4.93f, 1f, 11f)
                curveToRelative(0f, 2.73f, 1.0f, 5.3f, 2.75f, 7.27f)
                curveToRelative(-1.03f, 0.47f, -1.75f, 1.52f, -1.75f, 2.73f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(12f, 3f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                curveToRelative(0f, 2.92f, -1.58f, 5.59f, -4.13f, 7f)
                horizontalLineToRelative(-2.87f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.75f)
                lineToRelative(-2.25f, -3f)
                horizontalLineToRelative(1.88f)
                lineToRelative(-3.38f, -4.5f)
                lineToRelative(-3.38f, 4.5f)
                horizontalLineToRelative(1.88f)
                lineToRelative(-2.25f, 3f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.87f)
                curveToRelative(-2.55f, -1.41f, -4.13f, -4.08f, -4.13f, -7f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                close()
                moveTo(13f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(16f, 10.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(6f, 8.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _GlobeSnow = it}
