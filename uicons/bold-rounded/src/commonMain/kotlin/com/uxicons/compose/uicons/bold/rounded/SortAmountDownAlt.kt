package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAmountDownAlt: ImageVector? = null

val Icons.Br.SortAmountDownAlt: ImageVector
    get() = _SortAmountDownAlt ?: UXIcon(name = "SortAmountDownAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 1f)
            horizontalLineTo(11.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 7f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 13f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.17f, 18.41f)
            horizontalLineToRelative(-2.17f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineTo(18.41f)
            horizontalLineTo(2f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            curveToRelative(0f, 0.27f, 0.1f, 0.52f, 0.29f, 0.71f)
            lineToRelative(3.59f, 3.59f)
            curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
            lineToRelative(3.59f, -3.59f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
            curveToRelative(-0.19f, -0.19f, -0.44f, -0.29f, -0.71f, -0.29f)
            close()
        }
    }.also { _SortAmountDownAlt = it }
