package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAmountUp: ImageVector? = null

val Icons.Br.SortAmountUp: ImageVector
    get() = _SortAmountUp ?: UXIcon(name = "SortAmountUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 20f)
            horizontalLineTo(11.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 15.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 11f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.75f, 3.88f)
            lineTo(6.17f, 0.29f)
            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
            lineTo(1.17f, 3.88f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
            curveToRelative(0.19f, 0.19f, 0.44f, 0.29f, 0.71f, 0.29f)
            horizontalLineToRelative(2.13f)
            verticalLineTo(24.73f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineTo(5.59f)
            horizontalLineToRelative(2.04f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            curveToRelative(0f, -0.27f, -0.1f, -0.52f, -0.29f, -0.71f)
            close()
        }
    }.also { _SortAmountUp = it }
