package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentCircleWrong: ImageVector? = null

val Icons.Bs.DocumentCircleWrong: ImageVector
    get() = _DocumentCircleWrong ?: UXIcon(name = "DocumentCircleWrong") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(21.54f, 20.12f)
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
                moveTo(12.72f, 24.0f)
                lineToRelative(-12.72f, 0.0f)
                lineTo(0.0f, 3.0f)
                curveTo(0f, 1.34f, 1.35f, -0.0f, 3f, -0.0f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.67f)
                verticalLineToRelative(4.6f)
                curveToRelative(-0.64f, -0.17f, -1.31f, -0.26f, -2f, -0.26f)
                curveToRelative(-0.34f, 0f, -0.67f, 0.03f, -1f, 0.07f)
                verticalLineToRelative(-2.07f)
                horizontalLineToRelative(-5f)
                lineTo(12f, 3.0f)
                lineTo(3f, 3.0f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(7.59f)
                curveToRelative(0.47f, 1.16f, 1.21f, 2.18f, 2.13f, 3.0f)
                close()
            }
        }.also { _DocumentCircleWrong = it}
