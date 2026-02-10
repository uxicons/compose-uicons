package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayMicrophone: ImageVector? = null

val Icons.Ts.PlayMicrophone: ImageVector
    get() = _PlayMicrophone ?: UXIcon(name = "PlayMicrophone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 23f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                curveTo(4.93f, 24f, 0f, 19.07f, 0f, 13f)
                lineTo(1f, 13f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                close()
                moveTo(12f, 1f)
                curveToRelative(3.16f, 0f, 5.84f, 2.11f, 6.71f, 5f)
                horizontalLineToRelative(-4.71f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.92f)
                curveToRelative(0.05f, 0.33f, 0.08f, 0.66f, 0.08f, 1f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, -0.08f, 1.09f, -0.21f, 1.61f)
                lineToRelative(0.9f, 0.51f)
                curveToRelative(0.19f, -0.68f, 0.3f, -1.39f, 0.3f, -2.12f)
                verticalLineToRelative(-4f)
                curveTo(20f, 3.59f, 16.41f, 0f, 12f, 0f)
                reflectiveCurveTo(4f, 3.59f, 4f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                verticalLineToRelative(-1f)
                curveToRelative(-3.16f, 0f, -5.84f, -2.11f, -6.71f, -5f)
                horizontalLineToRelative(4.71f)
                verticalLineToRelative(-1f)
                lineTo(5.08f, 13f)
                curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                lineTo(5f, 9.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.34f, 0.03f, -0.67f, 0.08f, -1f)
                horizontalLineToRelative(4.92f)
                verticalLineToRelative(-1f)
                lineTo(5.29f, 6f)
                curveToRelative(0.86f, -2.89f, 3.54f, -5f, 6.71f, -5f)
                close()
                moveTo(14f, 12.99f)
                lineToRelative(9.73f, 5.47f)
                lineToRelative(-9.73f, 5.47f)
                lineTo(14f, 12.99f)
                close()
                moveTo(15f, 22.23f)
                lineToRelative(6.69f, -3.76f)
                lineToRelative(-6.69f, -3.76f)
                verticalLineToRelative(7.53f)
                close()
                moveTo(24f, 13f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 0.96f, -0.14f, 1.88f, -0.4f, 2.75f)
                lineToRelative(0.9f, 0.51f)
                curveToRelative(0.32f, -1.03f, 0.49f, -2.13f, 0.49f, -3.26f)
                close()
            }
        }.also { _PlayMicrophone = it}
