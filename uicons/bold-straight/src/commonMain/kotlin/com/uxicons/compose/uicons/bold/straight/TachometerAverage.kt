package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAverage: ImageVector? = null

val Icons.Bs.TachometerAverage: ImageVector
    get() = _TachometerAverage ?: UXIcon(name = "TachometerAverage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                arcToRelative(12.02f, 12.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.11f, 9.82f)
                lineToRelative(-0.94f, 0.66f)
                lineToRelative(-3.41f, -2.82f)
                lineToRelative(1.91f, -2.31f)
                lineToRelative(1.59f, 1.31f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.95f, 19.65f)
                lineToRelative(1.55f, -1.3f)
                lineToRelative(1.93f, 2.3f)
                lineTo(6.06f, 23.48f)
                lineToRelative(-0.94f, -0.66f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 13f)
                close()
                moveTo(13.5f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.68f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, 0f)
                close()
            }
        }.also { _TachometerAverage = it}
