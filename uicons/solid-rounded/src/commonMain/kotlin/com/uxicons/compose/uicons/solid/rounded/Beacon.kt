package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Beacon: ImageVector? = null

val Icons.Sr.Beacon: ImageVector
    get() = _Beacon ?: UXIcon(name = "Beacon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 24f)
                horizontalLineToRelative(-6.66f)
                curveTo(5.87f, 24f, 0.46f, 19.1f, 0.03f, 12.85f)
                curveTo(-0.21f, 9.38f, 1.06f, 5.97f, 3.51f, 3.52f)
                curveTo(5.97f, 1.06f, 9.38f, -0.21f, 12.85f, 0.03f)
                curveToRelative(6.25f, 0.43f, 11.15f, 5.84f, 11.15f, 12.31f)
                verticalLineToRelative(5.82f)
                curveToRelative(0f, 3.44f, -2.06f, 5.85f, -5f, 5.85f)
                close()
            }
        }.also { _Beacon = it}
