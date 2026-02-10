package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraSlash: ImageVector? = null

val Icons.Bs.CameraSlash: ImageVector
    get() = _CameraSlash ?: UXIcon(name = "CameraSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 18f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -0.32f, 0.03f, -0.62f, 0.1f, -0.92f)
                lineToRelative(5.33f, 5.33f)
                curveToRelative(-0.3f, 0.06f, -0.61f, 0.1f, -0.92f, 0.1f)
                close()
                moveTo(23.96f, 21.84f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(4.32f, 4.32f)
                lineToRelative(2.14f, -2.36f)
                horizontalLineToRelative(6.76f)
                lineToRelative(2.71f, 3f)
                horizontalLineToRelative(1.41f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(12.38f)
                lineToRelative(0.96f, 0.96f)
                close()
                moveTo(8.61f, 6.49f)
                lineToRelative(2.59f, 2.59f)
                curveToRelative(0.26f, -0.05f, 0.53f, -0.07f, 0.81f, -0.07f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 0.28f, -0.03f, 0.54f, -0.07f, 0.81f)
                lineToRelative(3.57f, 3.57f)
                verticalLineToRelative(-9.38f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.74f)
                lineToRelative(-2.71f, -3f)
                horizontalLineToRelative(-4.1f)
                lineToRelative(-1.34f, 1.49f)
                close()
                moveTo(3.95f, 20f)
                verticalLineToRelative(-11.05f)
                lineToRelative(-2.4f, -2.4f)
                curveToRelative(-0.38f, 0.56f, -0.6f, 1.23f, -0.6f, 1.95f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(17.05f)
                lineToRelative(-3f, -3f)
                lineTo(3.95f, 20.0f)
                close()
            }
        }.also { _CameraSlash = it}
