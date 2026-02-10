package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBishop: ImageVector? = null

val Icons.Sc.ChessBishop: ImageVector
    get() = _ChessBishop ?: UXIcon(name = "ChessBishop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.34f, 20f)
                horizontalLineToRelative(-1.51f)
                curveToRelative(2.53f, -2.68f, 2.64f, -6.76f, 0.29f, -10.53f)
                curveToRelative(-0.84f, 2.0f, -2.25f, 3.72f, -4.06f, 4.96f)
                curveToRelative(-0.17f, 0.12f, -0.37f, 0.17f, -0.56f, 0.17f)
                curveToRelative(-0.32f, 0f, -0.63f, -0.15f, -0.83f, -0.44f)
                curveToRelative(-0.31f, -0.46f, -0.19f, -1.08f, 0.26f, -1.39f)
                curveToRelative(1.82f, -1.24f, 3.15f, -3.09f, 3.74f, -5.22f)
                curveToRelative(-0.9f, -0.99f, -1.87f, -1.78f, -2.66f, -2.34f)
                curveToRelative(0.48f, -0.63f, 0.48f, -1.41f, 0.48f, -1.69f)
                curveToRelative(-0.01f, -2.19f, -1.57f, -2.52f, -2.51f, -2.53f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.79f, 0f, -1.41f, 0.22f, -1.84f, 0.65f)
                curveToRelative(-0.65f, 0.65f, -0.65f, 1.57f, -0.64f, 1.88f)
                curveToRelative(0.0f, 0.77f, 0.2f, 1.31f, 0.49f, 1.69f)
                curveToRelative(-0.97f, 0.69f, -2.24f, 1.73f, -3.28f, 3.07f)
                curveToRelative(-3.17f, 4.07f, -3.34f, 8.75f, -0.54f, 11.72f)
                horizontalLineToRelative(-1.51f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(14.69f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ChessBishop = it}
