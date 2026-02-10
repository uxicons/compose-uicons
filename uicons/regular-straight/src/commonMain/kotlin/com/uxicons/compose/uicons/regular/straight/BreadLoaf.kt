package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadLoaf: ImageVector? = null

val Icons.Rs.BreadLoaf: ImageVector
    get() = _BreadLoaf ?: UXIcon(name = "BreadLoaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 3f)
                lineTo(3.5f, 3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 1.37f, 0.8f, 2.59f, 2f, 3.16f)
                verticalLineToRelative(11.34f)
                lineTo(22f, 21f)
                lineTo(22f, 9.66f)
                curveToRelative(1.2f, -0.57f, 2f, -1.79f, 2f, -3.16f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.2f, 7.97f)
                curveToRelative(-0.69f, -0.14f, -1.2f, -0.76f, -1.2f, -1.47f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(13.5f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.71f, -0.5f, 1.33f, -1.2f, 1.47f)
                lineToRelative(-0.8f, 0.16f)
                verticalLineToRelative(10.87f)
                lineTo(4f, 19f)
                lineTo(4f, 8.13f)
                lineToRelative(-0.8f, -0.16f)
                close()
                moveTo(20.8f, 7.97f)
                lineToRelative(-0.8f, 0.16f)
                verticalLineToRelative(10.87f)
                horizontalLineToRelative(-5f)
                lineTo(15f, 9.66f)
                curveToRelative(1.2f, -0.57f, 2f, -1.79f, 2f, -3.16f)
                curveToRelative(0f, -0.54f, -0.12f, -1.05f, -0.34f, -1.5f)
                horizontalLineToRelative(3.84f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                curveToRelative(0f, 0.71f, -0.5f, 1.33f, -1.2f, 1.47f)
                close()
            }
        }.also { _BreadLoaf = it}
