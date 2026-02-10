package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lambda: ImageVector? = null

val Icons.Tr.Lambda: ImageVector
    get() = _Lambda ?: UXIcon(name = "Lambda") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.48f)
                curveToRelative(-1.72f, 0f, -3.31f, -1.0f, -4.06f, -2.56f)
                lineToRelative(-6.53f, -13.65f)
                lineTo(2.94f, 23.73f)
                curveToRelative(-0.09f, 0.17f, -0.26f, 0.27f, -0.44f, 0.27f)
                curveToRelative(-0.08f, 0f, -0.16f, -0.02f, -0.23f, -0.06f)
                curveToRelative(-0.24f, -0.13f, -0.34f, -0.43f, -0.21f, -0.68f)
                lineTo(10.9f, 6.67f)
                lineToRelative(-1.76f, -3.68f)
                curveToRelative(-0.58f, -1.21f, -1.82f, -1.99f, -3.16f, -1.99f)
                horizontalLineToRelative(-1.48f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.48f)
                curveToRelative(1.72f, 0f, 3.31f, 1.0f, 4.06f, 2.56f)
                lineToRelative(8.82f, 18.45f)
                curveToRelative(0.58f, 1.21f, 1.82f, 1.99f, 3.16f, 1.99f)
                horizontalLineToRelative(1.48f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _Lambda = it}
