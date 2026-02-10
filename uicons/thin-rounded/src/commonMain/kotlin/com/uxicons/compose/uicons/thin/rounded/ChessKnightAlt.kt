package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnightAlt: ImageVector? = null

val Icons.Tr.ChessKnightAlt: ImageVector
    get() = _ChessKnightAlt ?: UXIcon(name = "ChessKnightAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 19.05f)
                lineTo(20f, 8.53f)
                curveToRelative(0f, -0.08f, -0.1f, -7.99f, -8.61f, -8.53f)
                curveToRelative(-0.73f, -0.04f, -1.41f, 0.4f, -1.62f, 1.08f)
                curveToRelative(-0.86f, 2.77f, -2.23f, 3.77f, -4.32f, 4.57f)
                curveToRelative(-0.87f, 0.34f, -1.45f, 1.18f, -1.45f, 2.1f)
                curveToRelative(0f, 1.24f, 1.01f, 2.25f, 2.25f, 2.25f)
                horizontalLineToRelative(4.64f)
                curveToRelative(-0.64f, 2.62f, -2.37f, 3.6f, -3.97f, 4.32f)
                curveToRelative(-1.77f, 0.8f, -2.92f, 2.52f, -2.92f, 4.39f)
                verticalLineToRelative(0.34f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(7.33f, 15.23f)
                curveToRelative(2.09f, -0.94f, 4.1f, -2.27f, 4.66f, -5.65f)
                curveToRelative(0.02f, -0.14f, -0.02f, -0.29f, -0.11f, -0.41f)
                curveToRelative(-0.1f, -0.11f, -0.23f, -0.18f, -0.38f, -0.18f)
                lineTo(6.25f, 9f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                curveToRelative(0f, -0.51f, 0.33f, -0.98f, 0.81f, -1.16f)
                curveToRelative(2.25f, -0.87f, 3.94f, -2.08f, 4.92f, -5.21f)
                curveToRelative(0.07f, -0.24f, 0.31f, -0.4f, 0.6f, -0.38f)
                curveToRelative(7.56f, 0.48f, 7.67f, 7.25f, 7.67f, 7.53f)
                verticalLineToRelative(10.47f)
                lineTo(5f, 19f)
                verticalLineToRelative(-0.29f)
                curveToRelative(0f, -1.48f, 0.92f, -2.84f, 2.33f, -3.48f)
                close()
                moveTo(19.5f, 23f)
                lineTo(4.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _ChessKnightAlt = it}
