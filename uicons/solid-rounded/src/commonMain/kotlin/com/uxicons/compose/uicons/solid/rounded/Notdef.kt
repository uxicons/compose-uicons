package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notdef: ImageVector? = null

val Icons.Sr.Notdef: ImageVector
    get() = _Notdef ?: UXIcon(name = "Notdef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.24f, 12f)
                lineTo(20.24f, 2.38f)
                curveToRelative(0.48f, 0.77f, 0.76f, 1.66f, 0.76f, 2.62f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.97f, -0.29f, 1.86f, -0.76f, 2.62f)
                lineToRelative(-7f, -9.62f)
                close()
                moveTo(12f, 10.3f)
                lineTo(18.84f, 0.89f)
                curveToRelative(-0.81f, -0.56f, -1.78f, -0.89f, -2.84f, -0.89f)
                lineTo(8f, 0f)
                curveToRelative(-1.06f, 0f, -2.03f, 0.33f, -2.84f, 0.89f)
                lineToRelative(6.84f, 9.41f)
                close()
                moveTo(12f, 13.7f)
                lineToRelative(-6.84f, 9.41f)
                curveToRelative(0.81f, 0.56f, 1.78f, 0.89f, 2.84f, 0.89f)
                horizontalLineToRelative(8f)
                curveToRelative(1.06f, 0f, 2.03f, -0.33f, 2.84f, -0.89f)
                lineToRelative(-6.84f, -9.41f)
                close()
                moveTo(3.76f, 2.38f)
                curveToRelative(-0.48f, 0.77f, -0.76f, 1.66f, -0.76f, 2.62f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.97f, 0.29f, 1.86f, 0.76f, 2.62f)
                lineToRelative(7f, -9.62f)
                lineTo(3.76f, 2.38f)
                close()
            }
        }.also { _Notdef = it}
