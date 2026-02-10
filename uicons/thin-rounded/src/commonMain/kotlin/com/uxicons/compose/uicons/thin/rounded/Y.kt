package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Y: ImageVector? = null

val Icons.Tr.Y: ImageVector
    get() = _Y ?: UXIcon(name = "Y") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.81f, 0.11f)
                curveToRelative(-0.22f, -0.17f, -0.53f, -0.14f, -0.7f, 0.08f)
                lineTo(12f, 11.69f)
                lineTo(2.89f, 0.19f)
                curveToRelative(-0.17f, -0.22f, -0.49f, -0.25f, -0.7f, -0.08f)
                curveToRelative(-0.22f, 0.17f, -0.25f, 0.48f, -0.08f, 0.7f)
                lineTo(11.5f, 12.67f)
                verticalLineToRelative(10.83f)
                curveToRelative(-0.01f, 0.65f, 1.01f, 0.65f, 1f, 0f)
                verticalLineTo(12.67f)
                lineTo(21.89f, 0.81f)
                curveToRelative(0.17f, -0.22f, 0.14f, -0.53f, -0.08f, -0.7f)
                close()
            }
        }.also { _Y = it}
