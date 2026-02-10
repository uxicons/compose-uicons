package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Beacon: ImageVector? = null

val Icons.Tr.Beacon: ImageVector
    get() = _Beacon ?: UXIcon(name = "Beacon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.85f, 0.03f)
                curveTo(9.37f, -0.21f, 5.97f, 1.06f, 3.51f, 3.51f)
                curveTo(1.06f, 5.97f, -0.21f, 9.38f, 0.03f, 12.85f)
                curveToRelative(0.43f, 6.25f, 5.85f, 11.15f, 12.32f, 11.15f)
                horizontalLineToRelative(6.15f)
                curveToRelative(3.39f, 0f, 5.5f, -2.07f, 5.5f, -5.4f)
                verticalLineToRelative(-6.25f)
                curveTo(24f, 5.88f, 19.1f, 0.46f, 12.85f, 0.03f)
                close()
                moveTo(23f, 18.6f)
                curveToRelative(0f, 2.75f, -1.68f, 4.4f, -4.5f, 4.4f)
                horizontalLineToRelative(-6.15f)
                curveToRelative(-5.95f, 0f, -10.93f, -4.49f, -11.33f, -10.21f)
                curveToRelative(-0.22f, -3.19f, 0.94f, -6.31f, 3.19f, -8.56f)
                curveToRelative(2.07f, -2.07f, 4.88f, -3.22f, 7.79f, -3.22f)
                curveToRelative(0.25f, 0f, 0.51f, 0f, 0.77f, 0.03f)
                curveToRelative(5.73f, 0.4f, 10.21f, 5.37f, 10.21f, 11.33f)
                verticalLineToRelative(6.25f)
                close()
            }
        }.also { _Beacon = it}
