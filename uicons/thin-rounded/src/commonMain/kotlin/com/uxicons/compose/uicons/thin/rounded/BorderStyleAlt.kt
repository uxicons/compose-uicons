package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BorderStyleAlt: ImageVector? = null

val Icons.Tr.BorderStyleAlt: ImageVector
    get() = _BorderStyleAlt ?: UXIcon(name = "BorderStyleAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(17f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(0f, 1f)
                curveTo(0f, 1.55f, 0.45f, 2f, 1f, 2f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveTo(1.55f, 0f, 1f, 0f)
                reflectiveCurveTo(0f, 0.45f, 0f, 1f)
                close()
                moveTo(0f, 6f)
                curveTo(0f, 6.55f, 0.45f, 7f, 1f, 7f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(0f, 5.45f, 0f, 6f)
                close()
                moveTo(0f, 12f)
                curveTo(0f, 12.55f, 0.45f, 13f, 1f, 13f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(0f, 11.45f, 0f, 12f)
                close()
                moveTo(0f, 18f)
                curveTo(0f, 18.55f, 0.45f, 19f, 1f, 19f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(0f, 17.45f, 0f, 18f)
                close()
                moveTo(11f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(24f, 19.5f)
                lineTo(24f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(0.5f, 23f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(19.5f, 24f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                close()
            }
        }.also { _BorderStyleAlt = it}
