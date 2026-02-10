package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlobeSnow: ImageVector? = null

val Icons.Rs.GlobeSnow: ImageVector
    get() = _GlobeSnow ?: UXIcon(name = "GlobeSnow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 22f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.21f, -0.72f, -2.25f, -1.75f, -2.73f)
                curveToRelative(1.76f, -1.99f, 2.75f, -4.54f, 2.75f, -7.28f)
                curveTo(23f, 4.93f, 18.07f, 0f, 12f, 0f)
                reflectiveCurveTo(1f, 4.93f, 1f, 11f)
                curveToRelative(0f, 2.73f, 0.98f, 5.29f, 2.75f, 7.28f)
                curveToRelative(-1.03f, 0.48f, -1.75f, 1.52f, -1.75f, 2.73f)
                verticalLineToRelative(1f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(12f, 2f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                curveToRelative(0f, 2.75f, -1.22f, 5.28f, -3.35f, 7f)
                horizontalLineToRelative(-4.65f)
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
                horizontalLineToRelative(-4.65f)
                curveToRelative(-2.13f, -1.72f, -3.35f, -4.25f, -3.35f, -7f)
                curveTo(3f, 6.04f, 7.04f, 2f, 12f, 2f)
                close()
                moveTo(4f, 21f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(4f, 22f)
                verticalLineToRelative(-1f)
                close()
                moveTo(13f, 5.5f)
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
                moveTo(6.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _GlobeSnow = it}
