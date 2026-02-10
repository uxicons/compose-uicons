package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lighthouse: ImageVector? = null

val Icons.Bs.Lighthouse: ImageVector
    get() = _Lighthouse ?: UXIcon(name = "Lighthouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 9.12f)
                lineToRelative(-5f, 1.88f)
                verticalLineToRelative(-3.2f)
                lineToRelative(5f, -1.88f)
                verticalLineToRelative(3.2f)
                close()
                moveTo(5f, 1.88f)
                lineTo(0f, 0f)
                verticalLineToRelative(3.2f)
                lineToRelative(5f, 1.88f)
                lineTo(5f, 1.88f)
                close()
                moveTo(17f, 8.37f)
                lineToRelative(2f, 11.13f)
                verticalLineToRelative(4.5f)
                lineTo(5f, 24f)
                lineToRelative(0.02f, -4.77f)
                lineToRelative(1.98f, -10.87f)
                lineTo(7f, 2.5f)
                lineTo(12f, 0f)
                lineToRelative(5f, 2.5f)
                verticalLineToRelative(5.87f)
                close()
                moveTo(9.99f, 5f)
                lineToRelative(-0.01f, 2f)
                horizontalLineToRelative(4.02f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4.01f)
                close()
                moveTo(16f, 19.64f)
                lineToRelative(-1.73f, -9.63f)
                horizontalLineToRelative(-4.52f)
                lineToRelative(-1.75f, 9.63f)
                verticalLineToRelative(1.36f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.36f)
                close()
                moveTo(19f, 9.12f)
                lineToRelative(5f, 1.88f)
                verticalLineToRelative(-3.2f)
                lineToRelative(-5f, -1.88f)
                verticalLineToRelative(3.2f)
                close()
                moveTo(19f, 1.88f)
                verticalLineToRelative(3.2f)
                lineToRelative(5f, -1.88f)
                lineTo(24f, 0f)
                lineToRelative(-5f, 1.88f)
                close()
            }
        }.also { _Lighthouse = it}
