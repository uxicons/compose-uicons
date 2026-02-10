package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessBishop: ImageVector? = null

val Icons.Tr.ChessBishop: ImageVector
    get() = _ChessBishop ?: UXIcon(name = "ChessBishop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 23f)
                horizontalLineToRelative(-3.38f)
                curveToRelative(2.9f, -1.5f, 4.88f, -4.52f, 4.88f, -8f)
                curveToRelative(0f, -4.58f, -5.79f, -9.61f, -7.93f, -11.31f)
                curveToRelative(0.56f, -0.35f, 0.93f, -0.98f, 0.93f, -1.69f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.68f, 0.34f, 1.28f, 0.86f, 1.65f)
                curveToRelative(-2.23f, 1.53f, -7.87f, 5.96f, -7.87f, 11.36f)
                curveToRelative(0f, 3.48f, 1.98f, 6.5f, 4.88f, 8f)
                horizontalLineToRelative(-3.38f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(12f, 1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(4f, 15f)
                curveToRelative(0f, -5.38f, 6.53f, -9.94f, 7.98f, -10.89f)
                curveToRelative(0.69f, 0.53f, 2.6f, 2.05f, 4.38f, 3.99f)
                lineToRelative(-4.24f, 5.08f)
                curveToRelative(-0.18f, 0.21f, -0.15f, 0.53f, 0.06f, 0.7f)
                curveToRelative(0.09f, 0.08f, 0.21f, 0.12f, 0.32f, 0.12f)
                curveToRelative(0.14f, 0f, 0.29f, -0.06f, 0.39f, -0.18f)
                lineToRelative(4.14f, -4.96f)
                curveToRelative(1.62f, 1.91f, 2.98f, 4.11f, 2.98f, 6.14f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                close()
            }
        }.also { _ChessBishop = it}
