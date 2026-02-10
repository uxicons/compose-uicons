package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandlePoseYoga: ImageVector? = null

val Icons.Rr.CandlePoseYoga: ImageVector
    get() = _CandlePoseYoga ?: UXIcon(name = "CandlePoseYoga") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8.88f)
                lineToRelative(-0.24f, 0.12f)
                curveToRelative(-1.71f, 0.85f, -2.76f, 2.57f, -2.76f, 4.47f)
                verticalLineToRelative(7.53f)
                horizontalLineToRelative(-2.94f)
                lineToRelative(1.83f, -3.54f)
                curveToRelative(0.25f, -0.49f, 0.06f, -1.09f, -0.43f, -1.35f)
                curveToRelative(-0.49f, -0.26f, -1.09f, -0.06f, -1.35f, 0.43f)
                lineToRelative(-1.91f, 3.7f)
                curveToRelative(-0.28f, 0.61f, -0.23f, 1.3f, 0.14f, 1.86f)
                curveToRelative(0.36f, 0.56f, 0.97f, 0.9f, 1.64f, 0.9f)
                horizontalLineToRelative(5.52f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -6.89f, -0.66f, -9.39f, -1f, -10.22f)
                lineTo(14.0f, 1f)
                close()
                moveTo(11.5f, 22f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-7.53f)
                curveToRelative(0f, -1.05f, 0.54f, -1.99f, 1.41f, -2.54f)
                curveToRelative(0.25f, 1.17f, 0.59f, 3.63f, 0.59f, 8.56f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21f, 21.5f)
                curveToRelative(0f, 1.38f, -1.14f, 2.5f, -2.54f, 2.5f)
                reflectiveCurveToRelative(-2.46f, -1.12f, -2.46f, -2.5f)
                reflectiveCurveToRelative(1.05f, -2.5f, 2.46f, -2.5f)
                reflectiveCurveToRelative(2.54f, 1.12f, 2.54f, 2.5f)
                close()
            }
        }.also { _CandlePoseYoga = it}
