package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Y: ImageVector? = null

val Icons.Rr.Y: ImageVector
    get() = _Y ?: UXIcon(name = "Y") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.63f, 0.23f)
                curveToRelative(-0.43f, -0.35f, -1.06f, -0.29f, -1.41f, 0.14f)
                lineTo(12f, 10.42f)
                lineTo(3.77f, 0.37f)
                curveToRelative(-0.35f, -0.43f, -0.98f, -0.49f, -1.41f, -0.14f)
                curveToRelative(-0.43f, 0.35f, -0.49f, 0.98f, -0.14f, 1.41f)
                lineTo(11f, 12.36f)
                verticalLineToRelative(10.64f)
                curveToRelative(0.01f, 1.31f, 2.0f, 1.31f, 2f, 0f)
                verticalLineTo(12.36f)
                lineTo(21.77f, 1.63f)
                curveToRelative(0.35f, -0.43f, 0.29f, -1.06f, -0.14f, -1.41f)
                close()
            }
        }.also { _Y = it}
