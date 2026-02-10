package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eyes: ImageVector? = null

val Icons.Sr.Eyes: ImageVector
    get() = _Eyes ?: UXIcon(name = "Eyes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 0f)
                curveTo(2.46f, 0f, 0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(2.46f, 12f, 5.5f, 12f)
                reflectiveCurveToRelative(5.5f, -5.37f, 5.5f, -12f)
                reflectiveCurveTo(8.54f, 0f, 5.5f, 0f)
                close()
                moveTo(4.5f, 17f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(18.5f, 0f)
                curveToRelative(-3.04f, 0f, -5.5f, 5.37f, -5.5f, 12f)
                reflectiveCurveToRelative(2.46f, 12f, 5.5f, 12f)
                reflectiveCurveToRelative(5.5f, -5.37f, 5.5f, -12f)
                reflectiveCurveTo(21.54f, 0f, 18.5f, 0f)
                close()
                moveTo(17.5f, 17f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _Eyes = it}
