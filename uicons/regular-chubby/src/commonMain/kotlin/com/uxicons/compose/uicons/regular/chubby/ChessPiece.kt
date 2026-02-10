package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPiece: ImageVector? = null

val Icons.Rc.ChessPiece: ImageVector
    get() = _ChessPiece ?: UXIcon(name = "ChessPiece") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.2f, 21.05f)
                curveToRelative(-0.16f, -1.15f, -0.6f, -2.11f, -0.71f, -2.35f)
                lineToRelative(-0.16f, -0.43f)
                curveToRelative(-0.74f, -1.96f, -1.23f, -4.01f, -1.48f, -6.1f)
                lineToRelative(-0.38f, -3.25f)
                curveToRelative(0.44f, -0.1f, 0.77f, -0.5f, 0.77f, -0.97f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(0.64f, -1.28f, 0.4f, -2.92f, -0.73f, -4.37f)
                curveToRelative(-0.17f, -0.22f, -0.36f, -0.45f, -0.55f, -0.68f)
                curveToRelative(-0.95f, -1.14f, -2.88f, -1.15f, -3.83f, -0.0f)
                curveToRelative(-0.19f, 0.23f, -0.38f, 0.46f, -0.55f, 0.68f)
                curveToRelative(-1.13f, 1.45f, -1.37f, 3.09f, -0.73f, 4.37f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.47f, 0.33f, 0.87f, 0.77f, 0.97f)
                lineToRelative(-0.38f, 3.25f)
                curveToRelative(-0.24f, 2.08f, -0.74f, 4.14f, -1.48f, 6.1f)
                lineToRelative(-0.16f, 0.43f)
                curveToRelative(-0.11f, 0.24f, -0.55f, 1.21f, -0.71f, 2.36f)
                curveToRelative(-0.41f, 0.13f, -0.7f, 0.51f, -0.7f, 0.96f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11.81f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.45f, -0.3f, -0.83f, -0.7f, -0.95f)
                close()
                moveTo(11.11f, 3.8f)
                curveToRelative(0.16f, -0.2f, 0.33f, -0.41f, 0.5f, -0.62f)
                curveToRelative(0f, 0f, 0f, 0f, 0.0f, -0.0f)
                curveToRelative(0.13f, -0.16f, 0.29f, -0.18f, 0.38f, -0.18f)
                reflectiveCurveToRelative(0.25f, 0.02f, 0.38f, 0.18f)
                curveToRelative(0.17f, 0.21f, 0.35f, 0.42f, 0.5f, 0.62f)
                curveToRelative(0.62f, 0.79f, 1.03f, 1.98f, 0.15f, 2.7f)
                curveToRelative(-0.58f, 0.48f, -1.49f, 0.48f, -2.08f, 0f)
                curveToRelative(-0.88f, -0.73f, -0.47f, -1.91f, 0.15f, -2.7f)
                close()
                moveTo(10.54f, 8.95f)
                horizontalLineToRelative(2.92f)
                lineToRelative(0.4f, 3.45f)
                curveToRelative(0.21f, 1.84f, 0.61f, 3.66f, 1.19f, 5.42f)
                curveToRelative(-2.18f, -0.3f, -3.92f, -0.3f, -6.1f, 0f)
                curveToRelative(0.57f, -1.76f, 0.97f, -3.58f, 1.19f, -5.42f)
                lineToRelative(0.4f, -3.45f)
                close()
                moveTo(8.14f, 19.97f)
                curveToRelative(2.92f, -0.51f, 4.8f, -0.51f, 7.72f, 0f)
                curveToRelative(0.1f, 0.26f, 0.22f, 0.63f, 0.3f, 1.03f)
                lineTo(7.84f, 21.0f)
                curveToRelative(0.08f, -0.4f, 0.2f, -0.77f, 0.3f, -1.03f)
                close()
            }
        }.also { _ChessPiece = it}
