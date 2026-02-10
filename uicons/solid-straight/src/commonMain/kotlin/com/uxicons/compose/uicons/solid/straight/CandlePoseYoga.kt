package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandlePoseYoga: ImageVector? = null

val Icons.Ss.CandlePoseYoga: ImageVector
    get() = _CandlePoseYoga ?: UXIcon(name = "CandlePoseYoga") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(24f)
                lineTo(4.59f, 24f)
                lineToRelative(-1.06f, -1.06f)
                lineToRelative(2.56f, -5.84f)
                lineToRelative(1.83f, 0.8f)
                lineToRelative(-1.8f, 4.1f)
                horizontalLineToRelative(2.88f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -1.3f, 0.72f, -2.48f, 1.89f, -3.06f)
                lineToRelative(1.11f, -0.55f)
                lineTo(12f, 0f)
                close()
                moveTo(17.45f, 19f)
                curveToRelative(-1.41f, 0f, -2.46f, 1.12f, -2.46f, 2.5f)
                reflectiveCurveToRelative(1.05f, 2.5f, 2.46f, 2.5f)
                reflectiveCurveToRelative(2.54f, -1.12f, 2.54f, -2.5f)
                reflectiveCurveToRelative(-1.14f, -2.5f, -2.54f, -2.5f)
                close()
            }
        }.also { _CandlePoseYoga = it}
