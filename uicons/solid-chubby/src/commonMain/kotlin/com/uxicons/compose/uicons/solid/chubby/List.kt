package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _List: ImageVector? = null

val Icons.Sc.List: ImageVector
    get() = _List ?: UXIcon(name = "List") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.58f, 6.79f)
                horizontalLineToRelative(12.92f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(8.58f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 10.5f)
                horizontalLineTo(8.58f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(12.92f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.14f, 3.14f)
                curveToRelative(-1.36f, 0f, -2.14f, 0.78f, -2.14f, 2.15f)
                reflectiveCurveToRelative(0.78f, 2.15f, 2.14f, 2.15f)
                reflectiveCurveToRelative(2.14f, -0.78f, 2.14f, -2.15f)
                reflectiveCurveToRelative(-0.78f, -2.15f, -2.14f, -2.15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 12f)
                arcToRelative(2.14f, 2.15f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.27f, 0f)
                arcToRelative(2.14f, 2.15f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.27f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.14f, 16.56f)
                curveToRelative(-1.36f, 0f, -2.14f, 0.78f, -2.14f, 2.15f)
                reflectiveCurveToRelative(0.78f, 2.15f, 2.14f, 2.15f)
                reflectiveCurveToRelative(2.14f, -0.78f, 2.14f, -2.15f)
                reflectiveCurveToRelative(-0.78f, -2.15f, -2.14f, -2.15f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 17.21f)
                horizontalLineTo(8.58f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(12.92f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _List = it}
