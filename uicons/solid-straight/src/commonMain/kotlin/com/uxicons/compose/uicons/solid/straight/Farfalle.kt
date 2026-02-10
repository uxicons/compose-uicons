package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Farfalle: ImageVector? = null

val Icons.Ss.Farfalle: ImageVector
    get() = _Farfalle ?: UXIcon(name = "Farfalle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.83f, 14.23f)
                lineToRelative(2.06f, -2.23f)
                lineToRelative(-2.06f, -2.23f)
                lineToRelative(2.06f, -2.23f)
                lineToRelative(-2.16f, -2.33f)
                lineToRelative(2.12f, -3.21f)
                horizontalLineToRelative(-1.86f)
                curveToRelative(-3.33f, 0f, -5.33f, 1.43f, -6.93f, 2.57f)
                curveToRelative(-1.12f, 0.8f, -2.0f, 1.43f, -3.07f, 1.43f)
                reflectiveCurveToRelative(-1.95f, -0.63f, -3.07f, -1.43f)
                curveToRelative(-1.6f, -1.15f, -3.6f, -2.57f, -6.93f, -2.57f)
                lineTo(0.14f, 2f)
                lineToRelative(2.12f, 3.21f)
                lineTo(0.1f, 7.54f)
                lineToRelative(2.06f, 2.23f)
                lineTo(0.1f, 12f)
                lineToRelative(2.06f, 2.23f)
                lineTo(0.1f, 16.45f)
                lineToRelative(2.16f, 2.33f)
                lineTo(0.14f, 22f)
                horizontalLineToRelative(1.86f)
                curveToRelative(3.33f, 0f, 5.33f, -1.43f, 6.93f, -2.57f)
                curveToRelative(1.12f, -0.8f, 2.0f, -1.43f, 3.07f, -1.43f)
                reflectiveCurveToRelative(1.95f, 0.63f, 3.07f, 1.43f)
                curveToRelative(1.6f, 1.15f, 3.6f, 2.57f, 6.93f, 2.57f)
                horizontalLineToRelative(1.86f)
                lineToRelative(-2.12f, -3.21f)
                lineToRelative(2.16f, -2.33f)
                lineToRelative(-2.06f, -2.23f)
                close()
                moveTo(16f, 13f)
                lineTo(8f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Farfalle = it}
