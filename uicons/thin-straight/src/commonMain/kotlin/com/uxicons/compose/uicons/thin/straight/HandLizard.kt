package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandLizard: ImageVector? = null

val Icons.Ts.HandLizard: ImageVector
    get() = _HandLizard ?: UXIcon(name = "HandLizard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                lineTo(14f, 23f)
                lineTo(14f, 15f)
                lineTo(6.5f, 15f)
                curveToRelative(-0.73f, 0f, -1.43f, -0.32f, -1.91f, -0.88f)
                curveToRelative(-0.48f, -0.56f, -0.68f, -1.3f, -0.56f, -2.04f)
                curveToRelative(0.19f, -1.19f, 1.3f, -2.08f, 2.57f, -2.08f)
                horizontalLineToRelative(3.39f)
                curveToRelative(0.56f, 0f, 1.1f, -0.24f, 1.48f, -0.66f)
                curveToRelative(0.38f, -0.42f, 0.56f, -0.97f, 0.51f, -1.55f)
                curveToRelative(-0.1f, -1f, -1.04f, -1.79f, -2.13f, -1.79f)
                lineTo(2.5f, 6f)
                curveToRelative(-0.73f, 0f, -1.43f, -0.32f, -1.91f, -0.88f)
                curveTo(0.12f, 4.56f, -0.09f, 3.82f, 0.03f, 3.08f)
                curveTo(0.23f, 1.9f, 1.33f, 1f, 2.61f, 1f)
                lineTo(12.68f, 1f)
                curveToRelative(3.18f, 0f, 6.14f, 1.58f, 7.9f, 4.23f)
                lineToRelative(1.82f, 2.73f)
                curveToRelative(1.04f, 1.57f, 1.6f, 3.39f, 1.6f, 5.27f)
                verticalLineToRelative(9.77f)
                close()
                moveTo(15f, 22f)
                horizontalLineToRelative(8f)
                lineTo(23f, 13.23f)
                curveToRelative(0f, -1.68f, -0.49f, -3.31f, -1.43f, -4.71f)
                lineToRelative(-1.82f, -2.73f)
                curveToRelative(-1.58f, -2.37f, -4.22f, -3.79f, -7.07f, -3.79f)
                lineTo(2.61f, 2f)
                curveToRelative(-0.79f, 0f, -1.47f, 0.54f, -1.59f, 1.24f)
                curveToRelative(-0.07f, 0.45f, 0.05f, 0.89f, 0.34f, 1.23f)
                curveToRelative(0.29f, 0.34f, 0.7f, 0.53f, 1.14f, 0.53f)
                horizontalLineToRelative(7.36f)
                curveToRelative(1.6f, 0f, 2.98f, 1.18f, 3.13f, 2.69f)
                curveToRelative(0.08f, 0.85f, -0.19f, 1.69f, -0.76f, 2.32f)
                curveToRelative(-0.57f, 0.63f, -1.38f, 0.99f, -2.22f, 0.99f)
                horizontalLineToRelative(-3.39f)
                curveToRelative(-0.79f, 0f, -1.47f, 0.54f, -1.59f, 1.24f)
                curveToRelative(-0.07f, 0.45f, 0.05f, 0.89f, 0.34f, 1.23f)
                curveToRelative(0.29f, 0.34f, 0.7f, 0.53f, 1.14f, 0.53f)
                lineTo(15f, 14f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _HandLizard = it}
