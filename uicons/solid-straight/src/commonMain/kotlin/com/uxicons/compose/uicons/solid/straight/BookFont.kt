package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookFont: ImageVector? = null

val Icons.Ss.BookFont: ImageVector
    get() = _BookFont ?: UXIcon(name = "BookFont") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 6.99f)
                lineToRelative(1.08f, 3.03f)
                horizontalLineToRelative(-2.16f)
                lineToRelative(1.08f, -3.03f)
                close()
                moveTo(6f, 18f)
                lineTo(6f, 0f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(15.77f)
                curveToRelative(0.55f, -0.49f, 1.26f, -0.77f, 2f, -0.77f)
                horizontalLineToRelative(2f)
                close()
                moveTo(2f, 22f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                lineTo(22f, 24f)
                verticalLineToRelative(-4f)
                lineTo(4f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
                moveTo(22f, 2f)
                lineTo(22f, 18f)
                lineTo(8f, 18f)
                lineTo(8f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(19.63f, 14.02f)
                lineToRelative(-3.22f, -9.02f)
                curveToRelative(-0.22f, -0.6f, -0.77f, -0.99f, -1.41f, -0.99f)
                reflectiveCurveToRelative(-1.19f, 0.39f, -1.41f, 1f)
                lineToRelative(-3.22f, 9.02f)
                horizontalLineToRelative(2.12f)
                lineToRelative(0.71f, -2f)
                horizontalLineToRelative(3.59f)
                lineToRelative(0.71f, 2f)
                horizontalLineToRelative(2.12f)
                close()
            }
        }.also { _BookFont = it}
