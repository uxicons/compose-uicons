package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnightAlt: ImageVector? = null

val Icons.Sc.ChessKnightAlt: ImageVector
    get() = _ChessKnightAlt ?: UXIcon(name = "ChessKnightAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.37f, 10.97f)
                horizontalLineToRelative(4.27f)
                curveToRelative(-0.38f, 0.96f, -1.05f, 1.6f, -1.36f, 1.86f)
                curveToRelative(-0.73f, 0.09f, -1.45f, 0.21f, -2.14f, 0.36f)
                curveToRelative(-0.28f, 0.06f, -0.52f, 0.24f, -0.66f, 0.49f)
                curveToRelative(-0.02f, 0.04f, -0.35f, 0.63f, -0.57f, 1.54f)
                curveToRelative(1.44f, -0.3f, 4.11f, -0.77f, 7.08f, -0.77f)
                curveToRelative(3.69f, 0f, 6.92f, 0.71f, 7.89f, 0.95f)
                curveToRelative(0.54f, -3.41f, 0.31f, -8.38f, -4.09f, -12.26f)
                curveToRelative(-2.42f, -2.13f, -5.23f, -2.16f, -5.35f, -2.16f)
                curveToRelative(-0.5f, 0f, -0.92f, 0.36f, -0.99f, 0.86f)
                curveToRelative(-0.21f, 1.49f, -0.73f, 2.04f, -2.52f, 2.64f)
                lineToRelative(-1.89f, 0.64f)
                curveToRelative(-0.19f, 0.06f, -0.36f, 0.18f, -0.48f, 0.35f)
                curveToRelative(-0.89f, 1.19f, -0.89f, 3.9f, 0f, 5.09f)
                curveToRelative(0.19f, 0.25f, 0.48f, 0.4f, 0.8f, 0.4f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.13f, 21.87f)
                curveToRelative(-0.29f, -2.26f, -0.76f, -3.73f, -0.77f, -3.79f)
                curveToRelative(-0.1f, -0.32f, -0.36f, -0.57f, -0.69f, -0.66f)
                curveToRelative(-0.14f, -0.04f, -3.59f, -0.96f, -7.67f, -0.96f)
                reflectiveCurveToRelative(-7.52f, 0.92f, -7.67f, 0.96f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.34f, -0.69f, 0.67f)
                curveToRelative(-0.02f, 0.06f, -0.48f, 1.53f, -0.77f, 3.79f)
                curveToRelative(-0.04f, 0.28f, 0.05f, 0.57f, 0.24f, 0.79f)
                curveToRelative(0.19f, 0.22f, 0.46f, 0.34f, 0.75f, 0.34f)
                horizontalLineTo(20.14f)
                curveToRelative(0.29f, 0f, 0.56f, -0.12f, 0.75f, -0.34f)
                curveToRelative(0.19f, -0.22f, 0.28f, -0.5f, 0.24f, -0.79f)
                close()
            }
        }.also { _ChessKnightAlt = it}
