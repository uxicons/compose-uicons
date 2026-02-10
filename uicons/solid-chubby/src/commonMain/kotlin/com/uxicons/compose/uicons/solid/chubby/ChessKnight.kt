package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnight: ImageVector? = null

val Icons.Sc.ChessKnight: ImageVector
    get() = _ChessKnight ?: UXIcon(name = "ChessKnight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.94f, 20.01f)
                curveToRelative(1.05f, -3.55f, 2.2f, -11.03f, -4.17f, -16.56f)
                curveToRelative(-2.79f, -2.42f, -6.03f, -2.45f, -6.16f, -2.45f)
                curveToRelative(-0.5f, 0f, -0.92f, 0.36f, -0.99f, 0.85f)
                curveToRelative(-0.26f, 1.78f, -0.92f, 2.46f, -3.07f, 3.18f)
                lineToRelative(-2.22f, 0.74f)
                curveToRelative(-0.19f, 0.06f, -0.36f, 0.18f, -0.48f, 0.34f)
                curveToRelative(-1.02f, 1.33f, -1.02f, 4.38f, 0f, 5.71f)
                curveToRelative(0.19f, 0.25f, 0.48f, 0.39f, 0.8f, 0.39f)
                horizontalLineToRelative(4.09f)
                curveToRelative(-0.85f, 0.91f, -1.85f, 2.05f, -2.55f, 3.09f)
                curveToRelative(-1.09f, 1.62f, -1.91f, 3.54f, -2.36f, 4.69f)
                horizontalLineToRelative(-0.58f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(20.76f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.77f, -0.57f, -1.4f, -1.32f, -1.49f)
                close()
            }
        }.also { _ChessKnight = it}
