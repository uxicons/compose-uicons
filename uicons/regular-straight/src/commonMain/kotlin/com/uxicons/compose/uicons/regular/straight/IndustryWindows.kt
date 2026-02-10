package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndustryWindows: ImageVector? = null

val Icons.Rs.IndustryWindows: ImageVector
    get() = _IndustryWindows ?: UXIcon(name = "IndustryWindows") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 0f)
                lineTo(5.81f, 0f)
                lineToRelative(2.31f, 10.63f)
                lineToRelative(5.89f, -4.71f)
                verticalLineToRelative(4.17f)
                lineToRelative(5f, -4.25f)
                verticalLineToRelative(4.26f)
                lineToRelative(5f, -4.27f)
                verticalLineToRelative(15.17f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(2f, 2f)
                lineTo(2f, 21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(21f, 22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(22f, 10.17f)
                lineToRelative(-3.31f, 2.83f)
                horizontalLineToRelative(-1.69f)
                verticalLineToRelative(-2.84f)
                lineToRelative(-3.34f, 2.84f)
                horizontalLineToRelative(-1.66f)
                verticalLineToRelative(-2.92f)
                lineToRelative(-3.65f, 2.92f)
                horizontalLineToRelative(-1.77f)
                lineTo(4.19f, 2f)
                lineTo(2f, 2f)
                close()
                moveTo(10f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(15f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(20f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _IndustryWindows = it}
