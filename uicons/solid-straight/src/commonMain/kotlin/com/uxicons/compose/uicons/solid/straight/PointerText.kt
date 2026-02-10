package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointerText: ImageVector? = null

val Icons.Ss.PointerText: ImageVector
    get() = _PointerText ?: UXIcon(name = "PointerText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4f)
                verticalLineTo(20f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.2f, 0f, -2.27f, -0.54f, -3f, -1.38f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.38f, -3f, 1.38f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                curveToRelative(1.2f, 0f, 2.27f, 0.54f, 3f, 1.38f)
                curveToRelative(0.73f, -0.84f, 1.8f, -1.38f, 3f, -1.38f)
                horizontalLineToRelative(3f)
                verticalLineTo(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
            }
        }.also { _PointerText = it}
