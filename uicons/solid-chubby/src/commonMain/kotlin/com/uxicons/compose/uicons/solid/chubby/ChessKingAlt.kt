package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKingAlt: ImageVector? = null

val Icons.Sc.ChessKingAlt: ImageVector
    get() = _ChessKingAlt ?: UXIcon(name = "ChessKingAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.38f, 17.75f)
                curveToRelative(-0.15f, -0.24f, -0.38f, -0.4f, -0.66f, -0.46f)
                curveToRelative(-3.75f, -0.75f, -7.71f, -0.75f, -11.45f, 0f)
                curveToRelative(-0.27f, 0.06f, -0.51f, 0.22f, -0.66f, 0.46f)
                curveToRelative(-0.04f, 0.06f, -0.86f, 1.44f, -0.86f, 3.26f)
                curveToRelative(0f, 0.31f, 0.02f, 0.6f, 0.06f, 0.87f)
                curveToRelative(0.07f, 0.49f, 0.49f, 0.86f, 0.99f, 0.86f)
                horizontalLineToRelative(12.39f)
                curveToRelative(0.5f, 0f, 0.92f, -0.37f, 0.99f, -0.86f)
                curveToRelative(0.04f, -0.28f, 0.06f, -0.57f, 0.06f, -0.88f)
                curveToRelative(0f, -1.84f, -0.83f, -3.21f, -0.87f, -3.27f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.0f, 8.84f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.69f, -0.46f, -1.27f, -1.1f, -1.45f)
                curveToRelative(0.4f, -1.89f, 0.4f, -1.97f, 0.39f, -2.09f)
                curveToRelative(-0.02f, -0.47f, -0.36f, -0.87f, -0.83f, -0.95f)
                curveToRelative(-0.48f, -0.08f, -1.43f, -0.2f, -2.46f, -0.26f)
                verticalLineToRelative(-0.34f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.34f)
                curveToRelative(-1.03f, 0.07f, -1.97f, 0.18f, -2.45f, 0.26f)
                curveToRelative(-0.46f, 0.08f, -0.81f, 0.47f, -0.83f, 0.94f)
                curveToRelative(-0.01f, 0.12f, -0.01f, 0.2f, 0.39f, 2.09f)
                curveToRelative(-0.64f, 0.17f, -1.1f, 0.76f, -1.1f, 1.45f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.75f, 10.73f)
                lineToRelative(-0.93f, 4.43f)
                curveToRelative(1.7f, -0.28f, 3.44f, -0.43f, 5.18f, -0.43f)
                reflectiveCurveToRelative(3.49f, 0.14f, 5.19f, 0.43f)
                lineToRelative(-0.93f, -4.43f)
                horizontalLineTo(7.75f)
                close()
            }
        }.also { _ChessKingAlt = it}
