package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnight: ImageVector? = null

val Icons.Rc.ChessKnight: ImageVector
    get() = _ChessKnight ?: UXIcon(name = "ChessKnight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.02f, 21f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(1.1f, -3.37f, 2.77f, -11.54f, -4.12f, -17.49f)
                curveToRelative(-2.87f, -2.48f, -6.19f, -2.51f, -6.33f, -2.51f)
                curveToRelative(-0.5f, 0f, -0.92f, 0.36f, -0.99f, 0.85f)
                curveToRelative(-0.27f, 1.84f, -0.95f, 2.54f, -3.18f, 3.28f)
                lineToRelative(-2.29f, 0.76f)
                curveToRelative(-0.19f, 0.06f, -0.36f, 0.18f, -0.48f, 0.34f)
                curveToRelative(-1.04f, 1.36f, -1.04f, 4.47f, 0f, 5.83f)
                curveToRelative(0.19f, 0.25f, 0.48f, 0.39f, 0.79f, 0.39f)
                horizontalLineToRelative(4.27f)
                curveToRelative(-0.89f, 0.94f, -1.93f, 2.13f, -2.66f, 3.21f)
                curveToRelative(-1.31f, 1.95f, -2.25f, 4.31f, -2.62f, 5.33f)
                horizontalLineToRelative(-0.43f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(21.02f, 23f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(7.69f, 16.79f)
                curveToRelative(1.36f, -2.02f, 4.07f, -4.58f, 4.09f, -4.6f)
                curveToRelative(0.3f, -0.28f, 0.39f, -0.72f, 0.24f, -1.1f)
                curveToRelative(-0.15f, -0.38f, -0.52f, -0.63f, -0.93f, -0.63f)
                lineTo(5.03f, 10.46f)
                curveToRelative(-0.25f, -0.77f, -0.23f, -2.11f, 0.06f, -2.78f)
                lineToRelative(1.94f, -0.64f)
                curveToRelative(2.19f, -0.73f, 3.72f, -1.68f, 4.34f, -3.96f)
                curveToRelative(0.97f, 0.15f, 2.68f, 0.61f, 4.22f, 1.94f)
                curveToRelative(6.47f, 5.59f, 4.23f, 13.53f, 3.32f, 15.98f)
                lineTo(5.55f, 21f)
                curveToRelative(0.44f, -1.1f, 1.19f, -2.81f, 2.14f, -4.21f)
                close()
            }
        }.also { _ChessKnight = it}
