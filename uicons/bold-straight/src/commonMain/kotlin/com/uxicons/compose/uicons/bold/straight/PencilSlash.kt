package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilSlash: ImageVector? = null

val Icons.Bs.PencilSlash: ImageVector
    get() = _PencilSlash ?: UXIcon(name = "PencilSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.99f, 15.49f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-6.39f, 6.39f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.72f)
                lineToRelative(6.49f, -6.49f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-4.1f, 4.1f)
                lineToRelative(1.48f, 1.48f)
                lineToRelative(4f, -4f)
                close()
                moveTo(24.0f, 21.88f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.0f, 2.12f)
                lineTo(2.12f, 0.0f)
                lineToRelative(8.07f, 8.07f)
                lineToRelative(6.89f, -6.89f)
                curveToRelative(0.76f, -0.77f, 1.78f, -1.19f, 2.86f, -1.19f)
                reflectiveCurveToRelative(2.1f, 0.42f, 2.86f, 1.19f)
                curveToRelative(1.58f, 1.58f, 1.58f, 4.15f, 0f, 5.72f)
                lineToRelative(-6.89f, 6.89f)
                lineToRelative(8.07f, 8.07f)
                close()
                moveTo(12.32f, 10.2f)
                lineToRelative(1.48f, 1.48f)
                lineToRelative(3.35f, -3.35f)
                lineToRelative(-1.48f, -1.48f)
                lineToRelative(-3.35f, 3.35f)
                close()
            }
        }.also { _PencilSlash = it}
