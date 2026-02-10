package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndustryWindows: ImageVector? = null

val Icons.Bs.IndustryWindows: ImageVector
    get() = _IndustryWindows ?: UXIcon(name = "IndustryWindows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 24f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(0f, 0f)
                lineTo(6.54f, 0f)
                lineToRelative(2.08f, 10.05f)
                lineToRelative(5.38f, -4.98f)
                verticalLineToRelative(4.43f)
                lineToRelative(5f, -4.24f)
                verticalLineToRelative(4.25f)
                lineToRelative(5f, -4.26f)
                verticalLineToRelative(15.25f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(3f, 3f)
                lineTo(3f, 20.5f)
                curveToRelative(0f, 0.28f, 0.23f, 0.5f, 0.5f, 0.5f)
                lineTo(20.5f, 21f)
                curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
                lineTo(21f, 11.75f)
                lineToRelative(-2.65f, 2.25f)
                horizontalLineToRelative(-2.35f)
                verticalLineToRelative(-2.26f)
                lineToRelative(-2.67f, 2.26f)
                horizontalLineToRelative(-2.33f)
                verticalLineToRelative(-2.07f)
                lineToRelative(-2.23f, 2.07f)
                horizontalLineToRelative(-2.4f)
                lineTo(4.1f, 3f)
                horizontalLineToRelative(-1.1f)
                close()
                moveTo(9f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(14f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _IndustryWindows = it}
