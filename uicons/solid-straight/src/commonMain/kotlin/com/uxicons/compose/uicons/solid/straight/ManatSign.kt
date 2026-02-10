package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManatSign: ImageVector? = null

val Icons.Ss.ManatSign: ImageVector
    get() = _ManatSign ?: UXIcon(name = "ManatSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-2f)
                verticalLineTo(13f)
                curveToRelative(0f, -4.07f, -3.06f, -7.44f, -7f, -7.93f)
                verticalLineTo(24f)
                horizontalLineToRelative(-2f)
                verticalLineTo(5.07f)
                curveToRelative(-3.94f, 0.49f, -7f, 3.86f, -7f, 7.93f)
                verticalLineToRelative(11f)
                horizontalLineTo(2f)
                verticalLineTo(13f)
                curveTo(2f, 7.82f, 5.95f, 3.55f, 11f, 3.05f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(3.05f)
                curveToRelative(5.05f, 0.5f, 9f, 4.77f, 9f, 9.95f)
                close()
            }
        }.also { _ManatSign = it}
