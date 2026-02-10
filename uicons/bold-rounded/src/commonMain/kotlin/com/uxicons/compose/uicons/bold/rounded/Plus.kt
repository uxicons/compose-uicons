package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plus: ImageVector? = null

val Icons.Br.Plus: ImageVector
    get() = _Plus ?: UXIcon(name = "Plus", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(480f, 224f)
            horizontalLineTo(288f)
            verticalLineTo(32f)
            curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
            reflectiveCurveToRelative(-32f, 14.33f, -32f, 32f)
            verticalLineToRelative(192f)
            horizontalLineTo(32f)
            curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
            reflectiveCurveToRelative(14.33f, 32f, 32f, 32f)
            horizontalLineToRelative(192f)
            verticalLineToRelative(192f)
            curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
            reflectiveCurveToRelative(32f, -14.33f, 32f, -32f)
            verticalLineTo(288f)
            horizontalLineToRelative(192f)
            curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
            reflectiveCurveTo(497.67f, 224f, 480f, 224f)
            close()
        }
    }.also { _Plus = it }
