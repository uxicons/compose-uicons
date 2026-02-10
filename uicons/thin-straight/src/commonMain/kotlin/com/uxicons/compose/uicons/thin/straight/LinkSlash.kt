package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkSlash: ImageVector? = null

val Icons.Ts.LinkSlash: ImageVector
    get() = _LinkSlash ?: UXIcon(name = "LinkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.06f, 0.76f)
                lineTo(23.24f, 23.94f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-6.96f, -6.96f)
                lineToRelative(5.1f, -5.11f)
                curveToRelative(1.24f, -1.24f, 1.92f, -2.88f, 1.92f, -4.62f)
                reflectiveCurveToRelative(-0.68f, -3.39f, -1.92f, -4.62f)
                reflectiveCurveTo(19.21f, 0f, 17.46f, 0f)
                reflectiveCurveToRelative(-3.39f, 0.68f, -4.62f, 1.92f)
                lineTo(7.73f, 7.02f)
                lineTo(0.76f, 0.06f)
                lineTo(0.06f, 0.76f)
                close()
                moveTo(8.43f, 7.73f)
                lineTo(13.54f, 2.62f)
                curveToRelative(1.05f, -1.05f, 2.44f, -1.62f, 3.92f, -1.62f)
                reflectiveCurveToRelative(2.87f, 0.58f, 3.92f, 1.62f)
                curveToRelative(1.05f, 1.05f, 1.62f, 2.44f, 1.62f, 3.92f)
                curveToRelative(0f, 1.48f, -0.58f, 2.87f, -1.62f, 3.92f)
                lineToRelative(-5.1f, 5.11f)
                lineToRelative(-3.57f, -3.57f)
                lineToRelative(3.71f, -3.71f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-3.71f, 3.71f)
                lineToRelative(-3.57f, -3.57f)
                close()
                moveTo(1.92f, 12.82f)
                lineToRelative(3.7f, -3.7f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.7f, 3.7f)
                curveToRelative(-1.05f, 1.05f, -1.62f, 2.44f, -1.62f, 3.92f)
                curveToRelative(0f, 1.48f, 0.58f, 2.87f, 1.62f, 3.92f)
                curveToRelative(1.05f, 1.05f, 2.44f, 1.63f, 3.92f, 1.64f)
                curveToRelative(1.49f, 0.01f, 2.87f, -0.56f, 3.92f, -1.6f)
                lineToRelative(3.71f, -3.72f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.71f, 3.72f)
                curveToRelative(-1.23f, 1.23f, -2.89f, 1.9f, -4.63f, 1.9f)
                curveToRelative(-1.74f, -0.01f, -3.38f, -0.7f, -4.62f, -1.93f)
                curveTo(0.68f, 20.83f, 0f, 19.19f, 0f, 17.44f)
                reflectiveCurveToRelative(0.68f, -3.39f, 1.92f, -4.62f)
                close()
                moveTo(8.29f, 16.42f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(2.31f, -2.31f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-2.31f, 2.31f)
                close()
            }
        }.also { _LinkSlash = it}
