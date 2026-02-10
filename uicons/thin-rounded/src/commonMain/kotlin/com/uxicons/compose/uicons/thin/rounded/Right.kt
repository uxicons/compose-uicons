package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Right: ImageVector? = null

val Icons.Tr.Right: ImageVector
    get() = _Right ?: UXIcon(name = "Right") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.68f, 22f)
                curveToRelative(-0.34f, 0f, -0.69f, -0.07f, -1.03f, -0.21f)
                curveToRelative(-1.01f, -0.42f, -1.65f, -1.36f, -1.65f, -2.45f)
                verticalLineToRelative(-2.34f)
                horizontalLineTo(3.47f)
                curveToRelative(-1.92f, 0f, -3.47f, -1.57f, -3.47f, -3.51f)
                verticalLineToRelative(-2.99f)
                curveToRelative(0f, -1.93f, 1.56f, -3.51f, 3.47f, -3.51f)
                horizontalLineToRelative(7.53f)
                reflectiveCurveToRelative(0f, -2.33f, 0f, -2.33f)
                curveToRelative(0f, -1.1f, 0.64f, -2.04f, 1.65f, -2.45f)
                curveToRelative(1.01f, -0.42f, 2.12f, -0.19f, 2.9f, 0.58f)
                lineToRelative(7.34f, 6.55f)
                curveToRelative(1.48f, 1.48f, 1.48f, 3.85f, 0.02f, 5.31f)
                lineToRelative(-7.37f, 6.58f)
                curveToRelative(-0.51f, 0.51f, -1.17f, 0.78f, -1.86f, 0.78f)
                close()
                moveTo(3.47f, 7.99f)
                curveToRelative(-1.36f, 0f, -2.47f, 1.12f, -2.47f, 2.51f)
                verticalLineToRelative(2.99f)
                curveToRelative(0f, 1.38f, 1.11f, 2.51f, 2.47f, 2.51f)
                horizontalLineTo(11.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.84f)
                curveToRelative(0f, 0.82f, 0.54f, 1.32f, 1.03f, 1.53f)
                curveToRelative(0.5f, 0.2f, 1.23f, 0.22f, 1.81f, -0.36f)
                curveToRelative(0f, 0f, 0.01f, -0.01f, 0.02f, -0.02f)
                lineToRelative(7.36f, -6.57f)
                curveToRelative(1.05f, -1.05f, 1.05f, -2.79f, -0.02f, -3.86f)
                lineTo(14.86f, 3.51f)
                curveToRelative(-0.6f, -0.6f, -1.33f, -0.59f, -1.83f, -0.38f)
                curveToRelative(-0.5f, 0.2f, -1.03f, 0.71f, -1.03f, 1.53f)
                verticalLineToRelative(2.84f)
                curveToRelative(0f, 0.13f, -0.05f, 0.26f, -0.15f, 0.35f)
                reflectiveCurveToRelative(-0.22f, 0.15f, -0.35f, 0.15f)
                horizontalLineTo(3.47f)
                close()
            }
        }.also { _Right = it}
