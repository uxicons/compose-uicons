package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnight: ImageVector? = null

val Icons.Tc.ChessKnight: ImageVector
    get() = _ChessKnight ?: UXIcon(name = "ChessKnight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 22f)
                horizontalLineToRelative(-0.78f)
                curveToRelative(1.05f, -2.82f, 3.64f, -11.98f, -3.93f, -18.5f)
                curveToRelative(-2.86f, -2.47f, -6.16f, -2.5f, -6.3f, -2.5f)
                curveToRelative(-0.25f, 0f, -0.46f, 0.18f, -0.49f, 0.43f)
                curveToRelative(-0.32f, 2.14f, -1.19f, 3.05f, -3.72f, 3.89f)
                lineToRelative(-2.41f, 0.8f)
                curveToRelative(-0.1f, 0.03f, -0.18f, 0.09f, -0.24f, 0.17f)
                curveToRelative(-0.94f, 1.22f, -0.94f, 4.23f, 0f, 5.45f)
                curveToRelative(0.1f, 0.12f, 0.24f, 0.2f, 0.4f, 0.2f)
                horizontalLineToRelative(5.8f)
                curveToRelative(-1.0f, 1.01f, -2.62f, 2.72f, -3.65f, 4.23f)
                curveToRelative(-1.55f, 2.28f, -2.59f, 5.14f, -2.83f, 5.84f)
                horizontalLineToRelative(-0.84f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(21.5f, 23.0f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(7.01f, 16.72f)
                curveToRelative(1.47f, -2.17f, 4.36f, -4.9f, 4.39f, -4.93f)
                curveToRelative(0.15f, -0.14f, 0.2f, -0.36f, 0.12f, -0.55f)
                curveToRelative(-0.08f, -0.19f, -0.26f, -0.32f, -0.47f, -0.32f)
                lineTo(4.3f, 10.93f)
                curveToRelative(-0.52f, -0.96f, -0.5f, -3.03f, 0.04f, -3.92f)
                lineToRelative(2.25f, -0.74f)
                curveToRelative(2.73f, -0.9f, 3.88f, -2.0f, 4.32f, -4.24f)
                curveToRelative(0.92f, 0.09f, 3.22f, 0.49f, 5.23f, 2.23f)
                curveToRelative(7.43f, 6.41f, 4.37f, 15.6f, 3.51f, 17.75f)
                lineTo(4.41f, 22.0f)
                curveToRelative(0.37f, -1.0f, 1.31f, -3.38f, 2.6f, -5.28f)
                close()
            }
        }.also { _ChessKnight = it}
