package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _X: ImageVector? = null

val Icons.Sr.X: ImageVector
    get() = _X ?: UXIcon(name = "X") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.29f, 12f)
                lineTo(21.77f, 1.63f)
                curveToRelative(0.35f, -0.43f, 0.29f, -1.06f, -0.14f, -1.41f)
                curveToRelative(-0.43f, -0.35f, -1.06f, -0.29f, -1.41f, 0.14f)
                lineTo(12f, 10.42f)
                lineTo(3.77f, 0.37f)
                curveToRelative(-0.35f, -0.43f, -0.98f, -0.49f, -1.41f, -0.14f)
                curveToRelative(-0.43f, 0.35f, -0.49f, 0.98f, -0.14f, 1.41f)
                lineTo(10.71f, 12f)
                lineTo(2.23f, 22.37f)
                curveToRelative(-0.35f, 0.43f, -0.29f, 1.06f, 0.14f, 1.41f)
                curveToRelative(0.19f, 0.15f, 0.41f, 0.23f, 0.63f, 0.23f)
                curveToRelative(0.29f, 0f, 0.58f, -0.12f, 0.78f, -0.37f)
                lineTo(12f, 13.58f)
                lineToRelative(8.23f, 10.05f)
                curveToRelative(0.2f, 0.24f, 0.48f, 0.37f, 0.78f, 0.37f)
                curveToRelative(0.22f, 0f, 0.45f, -0.07f, 0.63f, -0.23f)
                curveToRelative(0.43f, -0.35f, 0.49f, -0.98f, 0.14f, -1.41f)
                lineTo(13.29f, 12f)
                close()
            }
        }.also { _X = it}
