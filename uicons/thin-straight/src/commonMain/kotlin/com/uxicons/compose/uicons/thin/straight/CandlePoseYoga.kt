package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandlePoseYoga: ImageVector? = null

val Icons.Ts.CandlePoseYoga: ImageVector
    get() = _CandlePoseYoga ?: UXIcon(name = "CandlePoseYoga") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(10.19f)
                lineToRelative(-1.39f, 0.69f)
                curveToRelative(-1.0f, 0.5f, -1.61f, 1.5f, -1.61f, 2.61f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-3.92f)
                lineToRelative(2.85f, -4.74f)
                lineToRelative(-0.86f, -0.52f)
                lineToRelative(-3.07f, 5.12f)
                verticalLineToRelative(1.14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -7.52f, -0.79f, -10.05f, -1f, -10.6f)
                lineTo(13.0f, 0f)
                close()
                moveTo(13f, 23f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.5f)
                curveToRelative(0f, -0.73f, 0.41f, -1.39f, 1.06f, -1.72f)
                lineToRelative(1.15f, -0.57f)
                curveToRelative(0.27f, 1.0f, 0.79f, 3.71f, 0.79f, 9.79f)
                verticalLineToRelative(2f)
                close()
                moveTo(17.46f, 19f)
                curveToRelative(-1.38f, 0f, -2.46f, 1.1f, -2.46f, 2.5f)
                reflectiveCurveToRelative(1.08f, 2.5f, 2.46f, 2.5f)
                curveToRelative(1.4f, 0f, 2.54f, -1.12f, 2.54f, -2.5f)
                reflectiveCurveToRelative(-1.14f, -2.5f, -2.54f, -2.5f)
                close()
                moveTo(17.46f, 23f)
                curveToRelative(-0.83f, 0f, -1.46f, -0.65f, -1.46f, -1.5f)
                reflectiveCurveToRelative(0.63f, -1.5f, 1.46f, -1.5f)
                curveToRelative(0.85f, 0f, 1.54f, 0.67f, 1.54f, 1.5f)
                reflectiveCurveToRelative(-0.69f, 1.5f, -1.54f, 1.5f)
                close()
            }
        }.also { _CandlePoseYoga = it}
