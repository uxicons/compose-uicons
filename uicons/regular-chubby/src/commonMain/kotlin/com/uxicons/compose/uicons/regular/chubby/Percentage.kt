package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Percentage: ImageVector? = null

val Icons.Rc.Percentage: ImageVector
    get() = _Percentage ?: UXIcon(name = "Percentage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.71f, 2.71f)
                lineToRelative(-20f, 20f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(20f, -20f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(23f, 19f)
                curveToRelative(0f, 2.69f, -1.31f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.31f, -4f, -4f)
                reflectiveCurveToRelative(1.31f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.31f, 4f, 4f)
                close()
                moveTo(21f, 19f)
                curveToRelative(0f, -1.59f, -0.41f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.41f, -2f, 2f)
                reflectiveCurveToRelative(0.41f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.41f, 2f, -2f)
                close()
                moveTo(1f, 5f)
                curveToRelative(0f, -2.69f, 1.31f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.31f, 4f, 4f)
                reflectiveCurveToRelative(-1.31f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.31f, -4f, -4f)
                close()
                moveTo(3f, 5f)
                curveToRelative(0f, 1.59f, 0.41f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.41f, 2f, -2f)
                reflectiveCurveToRelative(-0.41f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.41f, -2f, 2f)
                close()
            }
        }.also { _Percentage = it}
