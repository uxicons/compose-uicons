package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPiece: ImageVector? = null

val Icons.Tc.ChessPiece: ImageVector
    get() = _ChessPiece ?: UXIcon(name = "ChessPiece") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.22f, 22f)
                horizontalLineToRelative(-0.19f)
                curveToRelative(-0.1f, -1.36f, -0.67f, -2.57f, -0.76f, -2.76f)
                lineToRelative(-0.18f, -0.47f)
                curveToRelative(-0.79f, -2.1f, -1.33f, -4.3f, -1.59f, -6.53f)
                lineToRelative(-0.47f, -3.99f)
                horizontalLineToRelative(0.37f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.13f)
                curveToRelative(1.22f, -1.2f, 1.19f, -3.13f, -0.12f, -4.8f)
                curveToRelative(-0.18f, -0.23f, -0.37f, -0.46f, -0.56f, -0.69f)
                curveToRelative(-0.79f, -0.95f, -2.4f, -0.95f, -3.19f, 0f)
                curveToRelative(-0.19f, 0.23f, -0.39f, 0.47f, -0.56f, 0.69f)
                curveToRelative(-1.31f, 1.68f, -1.34f, 3.61f, -0.12f, 4.8f)
                horizontalLineToRelative(-1.13f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.37f)
                lineToRelative(-0.47f, 3.99f)
                curveToRelative(-0.26f, 2.23f, -0.8f, 4.43f, -1.59f, 6.53f)
                lineToRelative(-0.18f, 0.47f)
                curveToRelative(-0.1f, 0.2f, -0.66f, 1.41f, -0.76f, 2.76f)
                horizontalLineToRelative(-0.19f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(12.45f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(10.63f, 3.06f)
                curveToRelative(0.17f, -0.22f, 0.36f, -0.45f, 0.54f, -0.67f)
                curveToRelative(0.41f, -0.49f, 1.25f, -0.49f, 1.66f, 0f)
                curveToRelative(0.19f, 0.22f, 0.37f, 0.45f, 0.54f, 0.67f)
                curveToRelative(0.87f, 1.11f, 1.23f, 2.65f, 0.08f, 3.6f)
                curveToRelative(-0.81f, 0.67f, -2.08f, 0.67f, -2.9f, 0f)
                curveToRelative(-1.15f, -0.95f, -0.79f, -2.49f, 0.07f, -3.6f)
                close()
                moveTo(9.49f, 12.35f)
                lineToRelative(0.48f, -4.11f)
                horizontalLineToRelative(4.07f)
                lineToRelative(0.48f, 4.11f)
                curveToRelative(0.26f, 2.19f, 0.77f, 4.36f, 1.52f, 6.44f)
                curveToRelative(-3.01f, -0.51f, -5.06f, -0.51f, -8.07f, 0f)
                curveToRelative(0.75f, -2.08f, 1.27f, -4.24f, 1.52f, -6.44f)
                close()
                moveTo(7.54f, 19.88f)
                curveToRelative(3.42f, -0.62f, 5.51f, -0.62f, 8.93f, 0f)
                curveToRelative(0.17f, 0.38f, 0.49f, 1.22f, 0.56f, 2.12f)
                lineTo(6.97f, 22f)
                curveToRelative(0.08f, -0.89f, 0.4f, -1.73f, 0.56f, -2.12f)
                close()
            }
        }.also { _ChessPiece = it}
