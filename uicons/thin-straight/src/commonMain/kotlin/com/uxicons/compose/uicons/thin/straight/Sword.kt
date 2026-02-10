package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sword: ImageVector? = null

val Icons.Ts.Sword: ImageVector
    get() = _Sword ?: UXIcon(name = "Sword") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.56f, 0.43f)
                curveToRelative(-0.36f, -0.36f, -0.88f, -0.52f, -1.43f, -0.39f)
                lineToRelative(-3.6f, 1.18f)
                lineTo(6.13f, 13.62f)
                curveToRelative(-2.19f, -1.29f, -4.31f, -1.63f, -5.13f, -1.63f)
                verticalLineToRelative(1f)
                curveToRelative(0.96f, 0f, 3.91f, 0.52f, 6.45f, 2.84f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(4f, 4f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(4.95f, -4.95f)
                curveToRelative(2.32f, 2.54f, 2.84f, 5.49f, 2.84f, 6.45f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.82f, -0.33f, -2.94f, -1.63f, -5.13f)
                lineToRelative(12.31f, -12.31f)
                lineToRelative(1.28f, -3.73f)
                curveToRelative(0.11f, -0.5f, -0.04f, -1.02f, -0.4f, -1.38f)
                close()
                moveTo(23.0f, 1.55f)
                lineToRelative(-1.11f, 3.38f)
                lineToRelative(-12.08f, 12.08f)
                curveToRelative(-0.37f, -0.52f, -0.8f, -1.04f, -1.29f, -1.53f)
                curveToRelative(-0.5f, -0.5f, -1.01f, -0.92f, -1.53f, -1.29f)
                lineTo(19.07f, 2.1f)
                lineToRelative(3.33f, -1.09f)
                curveToRelative(0.17f, -0.04f, 0.34f, 0.01f, 0.46f, 0.14f)
                reflectiveCurveToRelative(0.17f, 0.29f, 0.15f, 0.41f)
                close()
            }
        }.also { _Sword = it}
