package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _U: ImageVector? = null

val Icons.Br.U: ImageVector
    get() = _U ?: UXIcon(name = "U") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
            verticalLineTo(1.5f)
            curveToRelative(0.03f, -1.97f, 2.97f, -1.97f, 3f, 0f)
            verticalLineTo(14f)
            curveToRelative(0.3f, 9.25f, 13.71f, 9.25f, 14f, 0f)
            verticalLineTo(1.5f)
            curveToRelative(0.03f, -1.97f, 2.97f, -1.97f, 3f, 0f)
            verticalLineTo(14f)
            curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
            close()
        }
    }.also { _U = it }
