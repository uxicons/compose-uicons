package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Up: ImageVector? = null

val Icons.Tr.Up: ImageVector
    get() = _Up ?: UXIcon(name = "Up") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.49f, 24f)
                horizontalLineToRelative(-2.99f)
                curveToRelative(-1.94f, 0f, -3.51f, -1.56f, -3.51f, -3.47f)
                verticalLineToRelative(-7.53f)
                reflectiveCurveToRelative(-2.33f, 0f, -2.33f, 0f)
                curveToRelative(-1.1f, 0f, -2.04f, -0.63f, -2.45f, -1.65f)
                reflectiveCurveToRelative(-0.19f, -2.12f, 0.58f, -2.9f)
                lineTo(9.34f, 1.12f)
                curveToRelative(1.48f, -1.48f, 3.85f, -1.48f, 5.31f, -0.02f)
                lineToRelative(6.58f, 7.37f)
                curveToRelative(0.77f, 0.77f, 0.98f, 1.88f, 0.57f, 2.89f)
                curveToRelative(-0.42f, 1.01f, -1.35f, 1.64f, -2.45f, 1.65f)
                horizontalLineToRelative(-2.35f)
                verticalLineToRelative(7.53f)
                curveToRelative(0f, 1.92f, -1.57f, 3.47f, -3.51f, 3.47f)
                close()
                moveTo(7.5f, 12f)
                curveToRelative(0.13f, 0f, 0.26f, 0.05f, 0.35f, 0.15f)
                curveToRelative(0.09f, 0.09f, 0.15f, 0.22f, 0.15f, 0.35f)
                verticalLineToRelative(8.03f)
                curveToRelative(0f, 1.36f, 1.12f, 2.47f, 2.5f, 2.47f)
                horizontalLineToRelative(2.99f)
                curveToRelative(1.38f, 0f, 2.51f, -1.11f, 2.51f, -2.47f)
                verticalLineTo(12.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.84f)
                curveToRelative(0.81f, 0f, 1.32f, -0.53f, 1.53f, -1.03f)
                curveToRelative(0.2f, -0.5f, 0.22f, -1.23f, -0.36f, -1.81f)
                curveToRelative(0f, 0f, -0.01f, -0.01f, -0.02f, -0.02f)
                lineTo(13.92f, 1.78f)
                curveToRelative(-1.05f, -1.05f, -2.79f, -1.04f, -3.86f, 0.02f)
                lineTo(3.51f, 9.14f)
                curveToRelative(-0.6f, 0.6f, -0.59f, 1.33f, -0.38f, 1.83f)
                curveToRelative(0.2f, 0.5f, 0.71f, 1.03f, 1.53f, 1.03f)
                horizontalLineToRelative(2.84f)
                close()
            }
        }.also { _Up = it}
