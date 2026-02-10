package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointerText: ImageVector? = null

val Icons.Bs.PointerText: ImageVector
    get() = _PointerText ?: UXIcon(name = "PointerText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.16f, 0f, -2.2f, -0.45f, -3f, -1.17f)
                curveToRelative(-0.8f, 0.72f, -1.84f, 1.17f, -3f, 1.17f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                curveToRelative(1.16f, 0f, 2.2f, 0.45f, 3f, 1.17f)
                curveToRelative(0.8f, -0.72f, 1.84f, -1.17f, 3f, -1.17f)
                horizontalLineToRelative(3f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _PointerText = it}
