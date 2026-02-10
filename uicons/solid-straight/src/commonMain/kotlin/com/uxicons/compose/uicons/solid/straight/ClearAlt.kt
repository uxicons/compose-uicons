package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClearAlt: ImageVector? = null

val Icons.Ss.ClearAlt: ImageVector
    get() = _ClearAlt ?: UXIcon(name = "ClearAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(21.31f, 0f, 18f, 0f)
                close()
                moveTo(21.54f, 8.12f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(14.9f, 13.37f)
                lineToRelative(-0.9f, 1.01f)
                verticalLineToRelative(9.62f)
                lineToRelative(-6f, -4.5f)
                verticalLineToRelative(-5.12f)
                lineTo(0f, 5.38f)
                verticalLineToRelative(-2.38f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(9.73f)
                curveToRelative(-1.67f, 1.47f, -2.73f, 3.61f, -2.73f, 6f)
                curveToRelative(0f, 3.31f, 2.02f, 6.16f, 4.89f, 7.37f)
                close()
            }
        }.also { _ClearAlt = it}
