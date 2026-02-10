package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeSimple: ImageVector? = null

val Icons.Bs.CodeSimple: ImageVector
    get() = _CodeSimple ?: UXIcon(name = "CodeSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.39f, 21.68f)
                lineTo(0.92f, 14.21f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0f, -4.24f)
                lineTo(8.44f, 2.44f)
                lineToRelative(2.12f, 2.12f)
                lineTo(3.04f, 12.09f)
                lineToRelative(7.47f, 7.47f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(23.12f, 14.21f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                lineTo(15.6f, 2.44f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(7.53f, 7.53f)
                lineToRelative(-7.47f, 7.47f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(7.47f, -7.47f)
                close()
            }
        }.also { _CodeSimple = it}
