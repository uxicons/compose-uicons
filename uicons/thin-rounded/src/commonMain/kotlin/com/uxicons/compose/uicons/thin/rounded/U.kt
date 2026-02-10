package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _U: ImageVector? = null

val Icons.Tr.U: ImageVector
    get() = _U ?: UXIcon(name = "U") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                verticalLineTo(0.5f)
                curveToRelative(-0.01f, -0.65f, 1.01f, -0.65f, 1f, 0f)
                verticalLineTo(14f)
                curveToRelative(0.45f, 11.93f, 17.55f, 11.92f, 18f, 0f)
                verticalLineTo(0.5f)
                curveToRelative(-0.01f, -0.65f, 1.01f, -0.65f, 1f, 0f)
                verticalLineTo(14f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _U = it}
