package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eraser: ImageVector? = null

val Icons.Rr.Eraser: ImageVector
    get() = _Eraser ?: UXIcon(name = "Eraser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 21f)
                horizontalLineToRelative(-8.63f)
                lineToRelative(8.17f, -8.21f)
                curveToRelative(1.94f, -1.95f, 1.94f, -5.11f, 0f, -7.06f)
                lineToRelative(-3.25f, -3.27f)
                curveToRelative(-0.94f, -0.95f, -2.2f, -1.47f, -3.54f, -1.47f)
                reflectiveCurveToRelative(-2.6f, 0.52f, -3.54f, 1.47f)
                lineTo(1.46f, 13.18f)
                curveToRelative(-1.94f, 1.95f, -1.94f, 5.11f, 0f, 7.06f)
                lineToRelative(1.58f, 1.59f)
                curveToRelative(0.74f, 0.75f, 1.78f, 1.18f, 2.83f, 1.18f)
                horizontalLineToRelative(17.12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(13.62f, 3.88f)
                curveToRelative(0.57f, -0.57f, 1.32f, -0.88f, 2.13f, -0.88f)
                reflectiveCurveToRelative(1.56f, 0.31f, 2.12f, 0.88f)
                lineToRelative(3.25f, 3.27f)
                curveToRelative(1.16f, 1.17f, 1.16f, 3.07f, 0f, 4.24f)
                lineToRelative(-4.97f, 4.99f)
                lineToRelative(-7.51f, -7.53f)
                lineToRelative(4.97f, -4.96f)
                close()
                moveTo(5.88f, 21f)
                curveToRelative(-0.54f, 0f, -1.04f, -0.21f, -1.42f, -0.59f)
                lineToRelative(-1.58f, -1.59f)
                curveToRelative(-1.16f, -1.17f, -1.16f, -3.07f, -0.0f, -4.23f)
                lineToRelative(4.36f, -4.34f)
                lineToRelative(7.51f, 7.54f)
                lineToRelative(-3.2f, 3.21f)
                horizontalLineToRelative(-5.67f)
                close()
            }
        }.also { _Eraser = it}
