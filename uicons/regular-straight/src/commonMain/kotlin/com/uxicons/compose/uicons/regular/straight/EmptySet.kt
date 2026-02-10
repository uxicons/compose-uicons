package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmptySet: ImageVector? = null

val Icons.Rs.EmptySet: ImageVector
    get() = _EmptySet ?: UXIcon(name = "EmptySet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.86f, 1.56f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.41f, 3.41f)
                curveToRelative(-1.91f, -1.59f, -4.36f, -2.55f, -7.03f, -2.55f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                curveToRelative(0f, 2.67f, 0.96f, 5.13f, 2.55f, 7.03f)
                lineTo(0.14f, 22.44f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.41f, -3.41f)
                curveToRelative(1.91f, 1.59f, 4.36f, 2.55f, 7.03f, 2.55f)
                curveToRelative(6.07f, 0f, 11f, -4.93f, 11f, -11f)
                curveToRelative(0f, -2.67f, -0.96f, -5.12f, -2.55f, -7.03f)
                lineToRelative(3.41f, -3.41f)
                close()
                moveTo(3f, 12f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                curveToRelative(2.12f, 0f, 4.07f, 0.74f, 5.61f, 1.98f)
                lineToRelative(-12.64f, 12.64f)
                curveToRelative(-1.23f, -1.54f, -1.98f, -3.49f, -1.98f, -5.61f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                curveToRelative(-2.12f, 0f, -4.07f, -0.74f, -5.61f, -1.98f)
                lineToRelative(12.64f, -12.64f)
                curveToRelative(1.23f, 1.54f, 1.98f, 3.49f, 1.98f, 5.61f)
                close()
            }
        }.also { _EmptySet = it}
