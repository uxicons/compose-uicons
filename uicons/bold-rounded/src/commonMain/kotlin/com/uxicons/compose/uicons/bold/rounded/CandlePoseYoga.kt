package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandlePoseYoga: ImageVector? = null

val Icons.Br.CandlePoseYoga: ImageVector
    get() = _CandlePoseYoga ?: UXIcon(name = "CandlePoseYoga") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14f, 1.5f)
            verticalLineToRelative(19f)
            curveToRelative(0f, 1.83f, -1f, 3.5f, -3f, 3.5f)
            horizontalLineToRelative(-5.36f)
            curveToRelative(-0.9f, 0f, -1.73f, -0.45f, -2.22f, -1.21f)
            curveToRelative(-0.49f, -0.76f, -0.56f, -1.7f, -0.18f, -2.52f)
            lineToRelative(1.77f, -3.89f)
            curveToRelative(0.34f, -0.75f, 1.23f, -1.09f, 1.99f, -0.74f)
            curveToRelative(0.75f, 0.34f, 1.09f, 1.23f, 0.74f, 1.99f)
            lineToRelative(-1.54f, 3.38f)
            horizontalLineToRelative(2.8f)
            verticalLineToRelative(-7.42f)
            curveToRelative(0f, -1.41f, 0.87f, -2.73f, 2f, -3.58f)
            lineTo(11.0f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(17.89f, 18f)
            curveToRelative(-1.66f, 0f, -2.89f, 1.34f, -2.89f, 3f)
            reflectiveCurveToRelative(1.24f, 3f, 2.89f, 3f)
            reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
            reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
            close()
        }
    }.also { _CandlePoseYoga = it }
