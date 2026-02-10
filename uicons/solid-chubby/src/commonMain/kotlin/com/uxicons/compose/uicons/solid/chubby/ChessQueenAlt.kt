package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessQueenAlt: ImageVector? = null

val Icons.Sc.ChessQueenAlt: ImageVector
    get() = _ChessQueenAlt ?: UXIcon(name = "ChessQueenAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.76f, 18.0f)
                curveToRelative(-0.15f, -0.23f, -0.38f, -0.38f, -0.65f, -0.43f)
                curveToRelative(-4.0f, -0.74f, -8.22f, -0.74f, -12.22f, 0f)
                curveToRelative(-0.27f, 0.05f, -0.5f, 0.21f, -0.65f, 0.43f)
                curveToRelative(-0.04f, 0.06f, -0.94f, 1.44f, -0.94f, 3.26f)
                curveToRelative(0f, 0.31f, 0.03f, 0.6f, 0.07f, 0.88f)
                curveToRelative(0.07f, 0.49f, 0.49f, 0.85f, 0.99f, 0.85f)
                horizontalLineToRelative(13.29f)
                curveToRelative(0.49f, 0f, 0.92f, -0.36f, 0.99f, -0.85f)
                curveToRelative(0.04f, -0.28f, 0.07f, -0.57f, 0.07f, -0.88f)
                curveToRelative(0f, -1.84f, -0.9f, -3.21f, -0.94f, -3.27f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.63f, 6.67f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(7.75f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.52f, -0.27f, -0.98f, -0.67f, -1.25f)
                curveToRelative(0.44f, -1.16f, 0.53f, -2.43f, 0.24f, -3.66f)
                curveToRelative(-0.07f, -0.28f, -0.26f, -0.52f, -0.52f, -0.66f)
                curveToRelative(-0.26f, -0.13f, -0.56f, -0.15f, -0.83f, -0.04f)
                lineToRelative(-2.08f, 0.84f)
                lineToRelative(-0.9f, -0.7f)
                curveToRelative(-0.36f, -0.28f, -0.87f, -0.28f, -1.23f, 0f)
                lineToRelative(-0.9f, 0.7f)
                lineToRelative(-2.08f, -0.84f)
                curveToRelative(-0.27f, -0.11f, -0.58f, -0.09f, -0.84f, 0.04f)
                curveToRelative(-0.26f, 0.14f, -0.45f, 0.38f, -0.51f, 0.67f)
                curveToRelative(-0.27f, 1.21f, -0.17f, 2.47f, 0.28f, 3.62f)
                curveToRelative(-0.42f, 0.27f, -0.7f, 0.73f, -0.7f, 1.27f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.45f, 15.44f)
                lineToRelative(-1.09f, -5.28f)
                horizontalLineTo(7.64f)
                lineToRelative(-1.09f, 5.28f)
                curveToRelative(1.79f, -0.28f, 3.62f, -0.41f, 5.45f, -0.41f)
                reflectiveCurveToRelative(3.67f, 0.14f, 5.45f, 0.41f)
                close()
            }
        }.also { _ChessQueenAlt = it}
