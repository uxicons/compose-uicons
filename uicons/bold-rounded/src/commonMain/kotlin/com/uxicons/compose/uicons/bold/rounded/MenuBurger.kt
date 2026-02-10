package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenuBurger: ImageVector? = null

val Icons.Br.MenuBurger: ImageVector
    get() = _MenuBurger ?: UXIcon(name = "MenuBurger", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(480f, 224f)
            horizontalLineTo(32f)
            curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
            reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
            horizontalLineToRelative(448f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            reflectiveCurveTo(497.67f, 224f, 480f, 224f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(32f, 138.67f)
            horizontalLineToRelative(448f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            reflectiveCurveToRelative(-14.33f, -32f, -32f, -32f)
            horizontalLineTo(32f)
            curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
            reflectiveCurveTo(14.33f, 138.67f, 32f, 138.67f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(480f, 373.33f)
            horizontalLineTo(32f)
            curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
            reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
            horizontalLineToRelative(448f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            reflectiveCurveTo(497.67f, 373.33f, 480f, 373.33f)
            close()
        }
    }.also { _MenuBurger = it }
