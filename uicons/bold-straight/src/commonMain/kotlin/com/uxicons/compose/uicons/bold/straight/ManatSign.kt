package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManatSign: ImageVector? = null

val Icons.Bs.ManatSign: ImageVector
    get() = _ManatSign ?: UXIcon(name = "ManatSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-3f)
                verticalLineTo(13f)
                curveToRelative(0f, -3.34f, -2.36f, -6.15f, -5.5f, -6.84f)
                verticalLineTo(24f)
                horizontalLineToRelative(-3f)
                verticalLineTo(6.16f)
                curveToRelative(-3.14f, 0.69f, -5.5f, 3.49f, -5.5f, 6.84f)
                verticalLineToRelative(11f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                curveTo(2f, 8f, 5.69f, 3.84f, 10.5f, 3.11f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineTo(3.11f)
                curveToRelative(4.81f, 0.73f, 8.5f, 4.88f, 8.5f, 9.89f)
                close()
            }
        }.also { _ManatSign = it}
