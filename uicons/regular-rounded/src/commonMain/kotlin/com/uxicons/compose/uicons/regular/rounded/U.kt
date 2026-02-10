package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _U: ImageVector? = null

val Icons.Rr.U: ImageVector
    get() = _U ?: UXIcon(name = "U") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                verticalLineTo(1f)
                curveToRelative(0.01f, -1.31f, 2.0f, -1.31f, 2f, 0f)
                verticalLineTo(14f)
                curveToRelative(0.38f, 10.59f, 15.63f, 10.58f, 16f, 0f)
                verticalLineTo(1f)
                curveToRelative(0.01f, -1.31f, 2.0f, -1.31f, 2f, 0f)
                verticalLineTo(14f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _U = it}
