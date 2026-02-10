package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleQuarter: ImageVector? = null

val Icons.Sr.CircleQuarter: ImageVector
    get() = _CircleQuarter ?: UXIcon(name = "CircleQuarter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 13f)
                horizontalLineTo(3.04f)
                curveToRelative(-0.93f, 0f, -1.8f, -0.42f, -2.38f, -1.15f)
                curveToRelative(-0.58f, -0.73f, -0.8f, -1.68f, -0.59f, -2.6f)
                horizontalLineTo(0.08f)
                curveTo(1.12f, 4.72f, 4.72f, 1.12f, 9.26f, 0.08f)
                curveToRelative(0.92f, -0.21f, 1.86f, 0f, 2.6f, 0.59f)
                curveToRelative(0.73f, 0.58f, 1.15f, 1.45f, 1.15f, 2.38f)
                verticalLineTo(12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _CircleQuarter = it}
