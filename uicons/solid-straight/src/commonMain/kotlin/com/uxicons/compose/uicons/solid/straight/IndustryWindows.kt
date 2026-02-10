package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndustryWindows: ImageVector? = null

val Icons.Ss.IndustryWindows: ImageVector
    get() = _IndustryWindows ?: UXIcon(name = "IndustryWindows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 11.1f)
                lineTo(19f, 5.84f)
                lineToRelative(-5f, 5.25f)
                lineTo(14f, 5.92f)
                lineToRelative(-5.89f, 5.71f)
                lineTo(5.08f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(21f, 24f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(24f, 5.83f)
                lineToRelative(-5f, 5.27f)
                close()
                moveTo(10f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(15f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(20f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _IndustryWindows = it}
