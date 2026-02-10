package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessPawn: ImageVector? = null

val Icons.Tc.ChessPawn: ImageVector
    get() = _ChessPawn ?: UXIcon(name = "ChessPawn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.0f, 22f)
                horizontalLineToRelative(-0.82f)
                curveToRelative(-1.61f, -0.65f, -3.22f, -2.68f, -4.23f, -5.32f)
                curveToRelative(-0.71f, -1.86f, -0.99f, -3.57f, -0.83f, -4.97f)
                horizontalLineToRelative(0.82f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.15f)
                curveToRelative(0.15f, -0.11f, 0.29f, -0.23f, 0.42f, -0.36f)
                curveToRelative(0.87f, -0.87f, 1.27f, -2.14f, 1.26f, -4.0f)
                curveToRelative(-0.01f, -3.69f, -1.71f, -5.34f, -5.49f, -5.35f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-1.91f, 0f, -3.27f, 0.43f, -4.15f, 1.32f)
                curveToRelative(-0.87f, 0.87f, -1.27f, 2.14f, -1.26f, 4.0f)
                curveToRelative(0.01f, 2.1f, 0.56f, 3.54f, 1.74f, 4.39f)
                horizontalLineToRelative(-1.2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(0.82f)
                curveToRelative(0.16f, 1.4f, -0.12f, 3.11f, -0.83f, 4.97f)
                curveToRelative(-1.01f, 2.64f, -2.62f, 4.67f, -4.23f, 5.32f)
                horizontalLineToRelative(-0.82f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                lineTo(22.0f, 23f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(7.52f, 6.32f)
                curveToRelative(-0.01f, -1.58f, 0.3f, -2.62f, 0.97f, -3.29f)
                curveToRelative(0.69f, -0.69f, 1.82f, -1.03f, 3.45f, -1.03f)
                horizontalLineToRelative(0.04f)
                curveToRelative(3.72f, 0.01f, 4.49f, 1.75f, 4.5f, 4.36f)
                curveToRelative(0.01f, 1.58f, -0.3f, 2.62f, -0.97f, 3.29f)
                curveToRelative(-0.7f, 0.7f, -1.84f, 1.07f, -3.49f, 1.03f)
                curveToRelative(-3.72f, -0.01f, -4.49f, -1.75f, -4.5f, -4.36f)
                close()
                moveTo(7.98f, 17.04f)
                curveToRelative(0.76f, -1.99f, 1.06f, -3.78f, 0.9f, -5.33f)
                horizontalLineToRelative(6.24f)
                curveToRelative(-0.16f, 1.54f, 0.14f, 3.33f, 0.9f, 5.33f)
                curveToRelative(0.81f, 2.14f, 1.98f, 3.88f, 3.28f, 4.96f)
                lineTo(4.7f, 22f)
                curveToRelative(1.3f, -1.08f, 2.47f, -2.83f, 3.28f, -4.96f)
                close()
            }
        }.also { _ChessPawn = it}
