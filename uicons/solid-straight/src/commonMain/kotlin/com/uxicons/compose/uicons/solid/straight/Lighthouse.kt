package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lighthouse: ImageVector? = null

val Icons.Ss.Lighthouse: ImageVector
    get() = _Lighthouse ?: UXIcon(name = "Lighthouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 0.49f)
                lineToRelative(5f, 1.88f)
                verticalLineToRelative(2.14f)
                lineTo(0f, 2.62f)
                lineTo(0f, 0.49f)
                close()
                moveTo(0f, 10.51f)
                lineToRelative(5f, -1.88f)
                verticalLineToRelative(-2.14f)
                lineToRelative(-5f, 1.88f)
                verticalLineToRelative(2.14f)
                close()
                moveTo(24f, 0.49f)
                lineToRelative(-5f, 1.88f)
                verticalLineToRelative(2.14f)
                reflectiveCurveToRelative(5f, -1.88f, 5f, -1.88f)
                lineTo(24f, 0.49f)
                close()
                moveTo(24f, 8.38f)
                lineToRelative(-5f, -1.88f)
                verticalLineToRelative(2.14f)
                reflectiveCurveToRelative(5f, 1.88f, 5f, 1.88f)
                verticalLineToRelative(-2.14f)
                close()
                moveTo(19f, 22.15f)
                verticalLineToRelative(1.85f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                lineToRelative(0.01f, -2f)
                lineToRelative(1.99f, -14.08f)
                lineTo(7f, 2.5f)
                lineTo(12f, 0f)
                lineToRelative(5f, 2.5f)
                verticalLineToRelative(5.42f)
                lineToRelative(2f, 14.23f)
                close()
                moveTo(15f, 4f)
                horizontalLineToRelative(-6.0f)
                lineToRelative(-0.01f, 3f)
                horizontalLineToRelative(6.01f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _Lighthouse = it}
