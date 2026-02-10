package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenNibSlash: ImageVector? = null

val Icons.Bs.PenNibSlash: ImageVector
    get() = _PenNibSlash ?: UXIcon(name = "PenNibSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.26f, 17.14f)
                lineToRelative(1.83f, -5.6f)
                lineToRelative(2.87f, -2.87f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.07f, 2.07f)
                lineToRelative(-4.38f, -4.38f)
                lineToRelative(2.07f, -2.07f)
                lineTo(15.34f, 0.04f)
                lineToRelative(-2.87f, 2.87f)
                lineToRelative(-5.6f, 1.83f)
                lineTo(2.16f, 0.04f)
                lineTo(0.04f, 2.16f)
                lineTo(21.84f, 23.96f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-4.7f, -4.7f)
                close()
                moveTo(12.86f, 5.94f)
                lineToRelative(5.2f, 5.2f)
                lineToRelative(-1.18f, 3.62f)
                lineToRelative(-7.63f, -7.63f)
                lineToRelative(3.62f, -1.18f)
                close()
                moveTo(12.94f, 17.88f)
                lineToRelative(2.5f, 2.5f)
                lineTo(0f, 24f)
                lineTo(3.62f, 8.57f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-1.44f, 6.14f)
                lineToRelative(2.34f, -2.34f)
                curveToRelative(0.05f, -0.77f, 0.54f, -1.41f, 1.21f, -1.69f)
                lineToRelative(2.6f, 2.6f)
                curveToRelative(-0.29f, 0.67f, -0.92f, 1.16f, -1.69f, 1.21f)
                lineToRelative(-2.34f, 2.34f)
                lineToRelative(6.14f, -1.44f)
                close()
            }
        }.also { _PenNibSlash = it}
