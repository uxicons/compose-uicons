package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlayMicrophone: ImageVector? = null

val Icons.Bs.PlayMicrophone: ImageVector
    get() = _PlayMicrophone ?: UXIcon(name = "PlayMicrophone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.93f, -0.13f, 1.85f, -0.37f, 2.73f)
                lineToRelative(-2.73f, -1.54f)
                curveToRelative(0.06f, -0.39f, 0.1f, -0.79f, 0.1f, -1.19f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(13f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.93f)
                lineToRelative(2.83f, 1.59f)
                curveToRelative(0.11f, -0.5f, 0.17f, -1.01f, 0.17f, -1.53f)
                lineTo(19f, 7f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveTo(5f, 3.14f, 5f, 7f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                verticalLineToRelative(-3f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(3f, 13.5f)
                verticalLineToRelative(-0.5f)
                lineTo(0f, 13f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 5.79f, 4.71f, 10.5f, 10.5f, 10.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                close()
                moveTo(14f, 24.02f)
                lineToRelative(9.71f, -5.46f)
                lineToRelative(-9.71f, -5.46f)
                verticalLineToRelative(10.92f)
                close()
            }
        }.also { _PlayMicrophone = it}
