package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointerText: ImageVector? = null

val Icons.Ts.PointerText: ImageVector
    get() = _PointerText ?: UXIcon(name = "PointerText") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 3.5f)
                verticalLineTo(20.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.28f, 0f, -2.39f, -0.7f, -3f, -1.73f)
                curveToRelative(-0.61f, 1.03f, -1.72f, 1.73f, -3f, 1.73f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                curveToRelative(1.28f, 0f, 2.39f, 0.7f, 3f, 1.73f)
                curveToRelative(0.61f, -1.03f, 1.72f, -1.73f, 3f, -1.73f)
                horizontalLineToRelative(3f)
                verticalLineTo(1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                close()
            }
        }.also { _PointerText = it}
