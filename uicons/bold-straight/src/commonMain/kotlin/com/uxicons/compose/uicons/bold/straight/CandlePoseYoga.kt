package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandlePoseYoga: ImageVector? = null

val Icons.Bs.CandlePoseYoga: ImageVector
    get() = _CandlePoseYoga ?: UXIcon(name = "CandlePoseYoga") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 21f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-2.89f, -1.34f, -2.89f, -3f)
                reflectiveCurveToRelative(1.24f, -3f, 2.89f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(11f, 9.83f)
                lineToRelative(-0.2f, 0.15f)
                curveToRelative(-1.13f, 0.85f, -1.8f, 2.19f, -1.8f, 3.6f)
                verticalLineToRelative(7.42f)
                horizontalLineToRelative(-2.12f)
                lineToRelative(1.49f, -3.4f)
                lineToRelative(-2.75f, -1.21f)
                lineToRelative(-2.7f, 6.15f)
                lineToRelative(1.45f, 1.45f)
                horizontalLineToRelative(9.62f)
                lineTo(14f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(9.83f)
                close()
            }
        }.also { _CandlePoseYoga = it}
