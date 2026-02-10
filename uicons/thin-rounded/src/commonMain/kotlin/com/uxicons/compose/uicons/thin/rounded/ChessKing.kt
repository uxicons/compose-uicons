package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKing: ImageVector? = null

val Icons.Tr.ChessKing: ImageVector
    get() = _ChessKing ?: UXIcon(name = "ChessKing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.37f, 10.1f)
                curveToRelative(-0.66f, -1.14f, -1.77f, -1.95f, -3.06f, -2.24f)
                curveToRelative(-1.79f, -0.39f, -4.74f, -0.81f, -7.81f, -0.85f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-3f)
                lineTo(12.5f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(11.5f, 3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.0f)
                curveToRelative(-3.07f, 0.04f, -6.02f, 0.46f, -7.81f, 0.85f)
                curveToRelative(-1.29f, 0.28f, -2.41f, 1.1f, -3.06f, 2.24f)
                curveTo(-0.03f, 11.23f, -0.17f, 12.6f, 0.22f, 13.85f)
                lineToRelative(3.08f, 9.15f)
                horizontalLineToRelative(-0.8f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(21.5f, 24f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-0.8f)
                lineToRelative(3.08f, -9.15f)
                curveToRelative(0.4f, -1.25f, 0.24f, -2.62f, -0.41f, -3.75f)
                close()
                moveTo(22.83f, 13.54f)
                lineToRelative(-3.19f, 9.46f)
                lineTo(4.36f, 23f)
                lineTo(1.17f, 13.54f)
                curveToRelative(-0.31f, -1.0f, -0.2f, -2.04f, 0.32f, -2.95f)
                curveToRelative(0.52f, -0.9f, 1.4f, -1.54f, 2.41f, -1.76f)
                curveToRelative(1.83f, -0.4f, 4.92f, -0.83f, 8.09f, -0.83f)
                reflectiveCurveToRelative(6.26f, 0.43f, 8.09f, 0.83f)
                curveToRelative(1.02f, 0.22f, 1.9f, 0.86f, 2.41f, 1.76f)
                curveToRelative(0.52f, 0.9f, 0.64f, 1.95f, 0.33f, 2.94f)
                close()
            }
        }.also { _ChessKing = it}
