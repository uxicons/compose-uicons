package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _C: ImageVector? = null

val Icons.Rr.C: ImageVector
    get() = _C ?: UXIcon(name = "C") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24f)
                horizontalLineToRelative(-1f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                verticalLineToRelative(-4f)
                curveTo(2f, 4.49f, 6.49f, 0f, 12f, 0f)
                horizontalLineToRelative(1f)
                curveToRelative(3.82f, 0f, 7.26f, 2.13f, 8.96f, 5.55f)
                curveToRelative(0.25f, 0.49f, 0.04f, 1.09f, -0.45f, 1.34f)
                curveToRelative(-0.5f, 0.24f, -1.09f, 0.04f, -1.34f, -0.45f)
                curveToRelative(-1.36f, -2.74f, -4.11f, -4.45f, -7.17f, -4.45f)
                horizontalLineToRelative(-1f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                horizontalLineToRelative(1f)
                curveToRelative(3.01f, 0f, 5.73f, -1.66f, 7.11f, -4.33f)
                curveToRelative(0.25f, -0.49f, 0.86f, -0.68f, 1.35f, -0.43f)
                curveToRelative(0.49f, 0.25f, 0.68f, 0.86f, 0.43f, 1.35f)
                curveToRelative(-1.73f, 3.34f, -5.13f, 5.42f, -8.89f, 5.42f)
                close()
            }
        }.also { _C = it}
