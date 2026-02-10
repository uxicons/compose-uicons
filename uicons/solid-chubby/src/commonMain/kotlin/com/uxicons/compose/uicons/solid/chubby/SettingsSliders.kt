package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SettingsSliders: ImageVector? = null

val Icons.Sc.SettingsSliders: ImageVector
    get() = _SettingsSliders ?: UXIcon(name = "SettingsSliders") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 6.94f)
                horizontalLineToRelative(1.9f)
                curveToRelative(0.43f, 1.25f, 1.47f, 1.89f, 3.13f, 1.89f)
                reflectiveCurveToRelative(2.71f, -0.64f, 3.13f, -1.89f)
                horizontalLineToRelative(10.84f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(10.66f)
                curveToRelative(-0.43f, -1.25f, -1.47f, -1.89f, -3.13f, -1.89f)
                reflectiveCurveToRelative(-2.71f, 0.64f, -3.13f, 1.89f)
                horizontalLineToRelative(-1.9f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 10.5f)
                horizontalLineToRelative(-1.9f)
                curveToRelative(-0.43f, -1.25f, -1.47f, -1.89f, -3.13f, -1.89f)
                reflectiveCurveToRelative(-2.7f, 0.64f, -3.13f, 1.89f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(13.34f)
                curveToRelative(0.43f, 1.25f, 1.47f, 1.89f, 3.13f, 1.89f)
                reflectiveCurveToRelative(2.71f, -0.63f, 3.13f, -1.89f)
                horizontalLineToRelative(1.9f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 17.06f)
                horizontalLineTo(10.66f)
                curveToRelative(-0.43f, -1.25f, -1.47f, -1.89f, -3.13f, -1.89f)
                reflectiveCurveToRelative(-2.71f, 0.63f, -3.13f, 1.89f)
                horizontalLineToRelative(-1.9f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.9f)
                curveToRelative(0.43f, 1.26f, 1.47f, 1.89f, 3.13f, 1.89f)
                reflectiveCurveToRelative(2.71f, -0.64f, 3.13f, -1.89f)
                horizontalLineToRelative(10.84f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _SettingsSliders = it}
