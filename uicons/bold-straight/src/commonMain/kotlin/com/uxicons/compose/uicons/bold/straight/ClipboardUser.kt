package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardUser: ImageVector? = null

val Icons.Bs.ClipboardUser: ImageVector
    get() = _ClipboardUser ?: UXIcon(name = "ClipboardUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.66f, 2f)
                curveToRelative(-0.56f, -1.18f, -1.77f, -2f, -3.16f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.39f, 0f, -2.6f, 0.82f, -3.16f, 2f)
                lineTo(2f, 2f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(22f, 2f)
                horizontalLineToRelative(-5.34f)
                close()
                moveTo(19f, 20.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(5.5f, 21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(5f, 5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(15.5f)
                close()
                moveTo(12f, 8f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(14f, 14f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(2f)
                lineTo(7f, 19f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _ClipboardUser = it}
