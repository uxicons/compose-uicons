package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayMicrophone: ImageVector? = null

val Icons.Rs.PlayMicrophone: ImageVector
    get() = _PlayMicrophone ?: UXIcon(name = "PlayMicrophone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.53f, 16.17f)
                lineToRelative(-1.8f, -1.01f)
                curveToRelative(0.17f, -0.7f, 0.28f, -1.42f, 0.28f, -2.15f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 1.08f, -0.17f, 2.15f, -0.47f, 3.17f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.97f, 0f, 5.43f, 2.17f, 5.91f, 5f)
                horizontalLineToRelative(-3.91f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.66f)
                lineToRelative(5.38f, 3.03f)
                curveToRelative(0.17f, -0.66f, 0.28f, -1.33f, 0.28f, -2.03f)
                verticalLineToRelative(-4f)
                curveTo(20f, 3.59f, 16.41f, 0f, 12f, 0f)
                reflectiveCurveTo(4f, 3.59f, 4f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                verticalLineToRelative(-2f)
                curveToRelative(-2.97f, 0f, -5.43f, -2.17f, -5.91f, -5f)
                horizontalLineToRelative(3.91f)
                verticalLineToRelative(-2f)
                lineTo(6f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3.91f)
                curveToRelative(0.48f, -2.83f, 2.94f, -5f, 5.91f, -5f)
                close()
                moveTo(2f, 13f)
                lineTo(0f, 13f)
                curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                close()
                moveTo(14f, 13.1f)
                lineToRelative(9.71f, 5.46f)
                lineToRelative(-9.71f, 5.46f)
                lineTo(14f, 13.1f)
                close()
                moveTo(16f, 20.6f)
                lineToRelative(3.63f, -2.04f)
                lineToRelative(-3.63f, -2.04f)
                verticalLineToRelative(4.08f)
                close()
            }
        }.also { _PlayMicrophone = it}
