package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Book: ImageVector? = null

val Icons.Ts.Book: ImageVector
    get() = _Book ?: UXIcon(name = "Book") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(2f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(22f, 24f)
                lineTo(22f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(21f, 1.5f)
                lineTo(21f, 19f)
                lineTo(7f, 19f)
                lineTo(7f, 1f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(4.5f, 1f)
                horizontalLineToRelative(1.5f)
                lineTo(6f, 19f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.56f, 0f, -1.08f, 0.2f, -1.5f, 0.51f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21f, 20f)
                verticalLineToRelative(3f)
                lineTo(4.5f, 23f)
                close()
            }
        }.also { _Book = it}
