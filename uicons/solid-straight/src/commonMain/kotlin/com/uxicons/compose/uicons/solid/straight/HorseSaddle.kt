package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorseSaddle: ImageVector? = null

val Icons.Ss.HorseSaddle: ImageVector
    get() = _HorseSaddle ?: UXIcon(name = "HorseSaddle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 19f)
                horizontalLineToRelative(-0.38f)
                lineToRelative(-0.62f, 5f)
                horizontalLineToRelative(-4.15f)
                lineToRelative(0.68f, -4.92f)
                curveToRelative(-0.11f, -0.36f, -0.25f, -0.76f, -0.4f, -1.17f)
                curveToRelative(-0.49f, -1.4f, -1.09f, -3.13f, -1.13f, -4.72f)
                curveToRelative(-1.32f, 1.08f, -2.0f, 3.02f, -2.0f, 5.81f)
                lineTo(0f, 19f)
                curveToRelative(0f, -5.68f, 2.55f, -7.73f, 4.68f, -8.45f)
                lineToRelative(0.15f, -0.05f)
                horizontalLineToRelative(0.06f)
                curveToRelative(0.73f, -0.91f, 1.84f, -1.5f, 3.1f, -1.5f)
                horizontalLineToRelative(0.01f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineToRelative(3.18f)
                close()
                moveTo(22.59f, 6.66f)
                curveToRelative(-1.79f, -0.86f, -2.96f, -2.17f, -3.4f, -3.91f)
                lineToRelative(-0.19f, -0.76f)
                lineTo(19.0f, 0f)
                curveToRelative(-1.43f, 0f, -2.62f, 1.0f, -2.92f, 2.34f)
                curveToRelative(-3.16f, 1.04f, -4.08f, 4.29f, -4.08f, 6.16f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.3f, -0.84f, 2.4f, -2f, 2.82f)
                verticalLineToRelative(3.18f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5.39f)
                lineToRelative(0.39f, -1.81f)
                curveToRelative(0.42f, -1.46f, 0.61f, -2.42f, 0.61f, -3.9f)
                verticalLineToRelative(-2.9f)
                lineToRelative(5f, -0.5f)
                verticalLineToRelative(-0.58f)
                curveToRelative(0f, -0.96f, -0.56f, -1.84f, -1.41f, -2.25f)
                close()
                moveTo(10f, 13f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _HorseSaddle = it}
