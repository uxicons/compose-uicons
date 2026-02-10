package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClearAlt: ImageVector? = null

val Icons.Bs.ClearAlt: ImageVector
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
                moveTo(13.0f, 12.23f)
                curveToRelative(0.79f, 0.64f, 1.71f, 1.13f, 2.71f, 1.43f)
                lineToRelative(-0.71f, 0.86f)
                verticalLineToRelative(9.49f)
                lineToRelative(-8f, -4.8f)
                verticalLineToRelative(-4.69f)
                lineTo(0f, 6.03f)
                verticalLineToRelative(-2.54f)
                curveTo(0f, 1.56f, 1.57f, -0.01f, 3.5f, -0.01f)
                horizontalLineToRelative(9.24f)
                curveToRelative(-0.93f, 0.81f, -1.67f, 1.84f, -2.15f, 3f)
                lineTo(3.5f, 2.99f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.46f)
                lineToRelative(7f, 8.5f)
                verticalLineToRelative(4.06f)
                lineToRelative(2f, 1.2f)
                verticalLineToRelative(-5.26f)
                lineToRelative(1f, -1.21f)
                close()
            }
        }.also { _ClearAlt = it}
