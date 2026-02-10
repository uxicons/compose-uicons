package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayMicrophone: ImageVector? = null

val Icons.Ss.PlayMicrophone: ImageVector
    get() = _PlayMicrophone ?: UXIcon(name = "PlayMicrophone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 21.98f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                curveTo(4.93f, 23.98f, 0f, 19.04f, 0f, 12.98f)
                lineTo(2f, 12.98f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                close()
                moveTo(24f, 12.98f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.74f, -0.1f, 1.46f, -0.27f, 2.15f)
                lineToRelative(1.8f, 1.01f)
                curveToRelative(0.3f, -1.0f, 0.47f, -2.07f, 0.47f, -3.17f)
                close()
                moveTo(14f, 24f)
                lineToRelative(9.71f, -5.46f)
                lineToRelative(-9.71f, -5.46f)
                verticalLineToRelative(10.92f)
                close()
                moveTo(14.38f, 11f)
                lineToRelative(5.41f, 3.04f)
                curveToRelative(0.09f, -0.34f, 0.16f, -0.69f, 0.21f, -1.04f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4.93f)
                curveToRelative(-0.49f, -3.94f, -3.86f, -7f, -7.93f, -7f)
                reflectiveCurveTo(4.56f, 3.06f, 4.07f, 7f)
                horizontalLineToRelative(4.93f)
                verticalLineToRelative(2f)
                lineTo(4f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(4.07f, 13f)
                curveToRelative(0.49f, 3.94f, 3.86f, 7f, 7.93f, 7f)
                lineTo(12f, 11f)
                horizontalLineToRelative(2.38f)
                close()
            }
        }.also { _PlayMicrophone = it}
