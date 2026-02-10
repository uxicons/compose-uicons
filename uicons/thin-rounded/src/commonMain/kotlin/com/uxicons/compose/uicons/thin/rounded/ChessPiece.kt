package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPiece: ImageVector? = null

val Icons.Tr.ChessPiece: ImageVector
    get() = _ChessPiece ?: UXIcon(name = "ChessPiece") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 23f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-2.17f)
                curveToRelative(0f, -0.92f, -0.37f, -1.81f, -1.02f, -2.46f)
                curveToRelative(-1.97f, -1.96f, -2.89f, -4.57f, -2.97f, -8.37f)
                horizontalLineToRelative(1.49f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.84f)
                curveToRelative(0.82f, -0.71f, 1.34f, -1.72f, 1.34f, -2.86f)
                curveToRelative(0f, -1.34f, -1.23f, -3.81f, -2.11f, -5.14f)
                curveToRelative(-0.41f, -0.63f, -1.12f, -1f, -1.89f, -1f)
                reflectiveCurveToRelative(-1.48f, 0.37f, -1.89f, 1f)
                curveToRelative(-0.88f, 1.33f, -2.11f, 3.8f, -2.11f, 5.14f)
                curveToRelative(0f, 1.14f, 0.52f, 2.16f, 1.34f, 2.86f)
                horizontalLineToRelative(-1.84f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.49f)
                curveToRelative(-0.07f, 3.8f, -0.99f, 6.4f, -2.97f, 8.37f)
                curveToRelative(-0.65f, 0.65f, -1.02f, 1.54f, -1.02f, 2.46f)
                verticalLineToRelative(2.17f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(9f, 6.14f)
                curveToRelative(0f, -0.97f, 1.02f, -3.19f, 1.95f, -4.58f)
                curveToRelative(0.23f, -0.34f, 0.62f, -0.55f, 1.05f, -0.55f)
                reflectiveCurveToRelative(0.83f, 0.21f, 1.05f, 0.55f)
                curveToRelative(0.92f, 1.39f, 1.95f, 3.62f, 1.95f, 4.58f)
                curveToRelative(0f, 1.58f, -1.35f, 2.86f, -3f, 2.86f)
                reflectiveCurveToRelative(-3f, -1.28f, -3f, -2.86f)
                close()
                moveTo(14.02f, 10f)
                curveToRelative(0.08f, 4.04f, 1.07f, 6.84f, 3.19f, 9f)
                lineTo(6.79f, 19f)
                curveToRelative(2.12f, -2.15f, 3.11f, -4.96f, 3.19f, -9f)
                horizontalLineToRelative(4.03f)
                close()
                moveTo(6f, 23f)
                verticalLineToRelative(-2.17f)
                curveToRelative(0f, -0.28f, 0.06f, -0.56f, 0.15f, -0.83f)
                horizontalLineToRelative(11.69f)
                curveToRelative(0.09f, 0.27f, 0.15f, 0.54f, 0.15f, 0.83f)
                verticalLineToRelative(2.17f)
                lineTo(6f, 23f)
                close()
            }
        }.also { _ChessPiece = it}
