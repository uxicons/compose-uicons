package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RampLoading: ImageVector? = null

val Icons.Sr.RampLoading: ImageVector
    get() = _RampLoading ?: UXIcon(name = "RampLoading") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.68f, 19.66f)
                curveToRelative(0.47f, 0.94f, 0.42f, 2.03f, -0.13f, 2.92f)
                curveToRelative(-0.55f, 0.89f, -1.5f, 1.42f, -2.55f, 1.42f)
                horizontalLineTo(5.0f)
                curveToRelative(-1.05f, 0f, -2.0f, -0.53f, -2.55f, -1.42f)
                curveToRelative(-0.55f, -0.89f, -0.6f, -1.98f, -0.13f, -2.92f)
                lineToRelative(2.72f, -5.45f)
                curveToRelative(0.68f, -1.36f, 2.05f, -2.21f, 3.58f, -2.21f)
                horizontalLineToRelative(6.76f)
                curveToRelative(1.52f, 0f, 2.9f, 0.85f, 3.58f, 2.21f)
                lineToRelative(2.72f, 5.45f)
                close()
                moveTo(3.26f, 13.32f)
                curveToRelative(1.02f, -2.04f, 3.08f, -3.32f, 5.37f, -3.32f)
                horizontalLineToRelative(6.76f)
                curveToRelative(2.29f, 0f, 4.34f, 1.27f, 5.37f, 3.32f)
                lineToRelative(1.25f, 2.5f)
                verticalLineTo(5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineTo(7f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineTo(15.83f)
                lineToRelative(1.26f, -2.51f)
                close()
            }
        }.also { _RampLoading = it}
