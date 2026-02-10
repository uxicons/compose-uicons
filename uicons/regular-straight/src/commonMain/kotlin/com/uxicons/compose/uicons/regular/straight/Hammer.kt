package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hammer: ImageVector? = null

val Icons.Rs.Hammer: ImageVector
    get() = _Hammer ?: UXIcon(name = "Hammer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.99f, 10.19f)
                curveToRelative(-0.04f, -0.67f, -0.35f, -1.27f, -0.84f, -1.7f)
                lineToRelative(-6.88f, -6.23f)
                curveTo(12.22f, -1.3f, 8.07f, 0.12f, 6.45f, 1.37f)
                lineToRelative(-0.96f, 0.73f)
                lineToRelative(5.76f, 5.14f)
                lineTo(0.07f, 20.02f)
                lineToRelative(4.52f, 3.95f)
                lineTo(15.73f, 11.23f)
                lineToRelative(2.81f, 2.51f)
                curveToRelative(0.46f, 0.4f, 1.04f, 0.62f, 1.64f, 0.62f)
                curveToRelative(0.06f, 0f, 0.11f, -0.0f, 0.17f, -0.01f)
                curveToRelative(0.67f, -0.04f, 1.27f, -0.35f, 1.72f, -0.85f)
                lineToRelative(1.32f, -1.51f)
                curveToRelative(0.44f, -0.5f, 0.66f, -1.15f, 0.61f, -1.81f)
                close()
                moveTo(14.95f, 3.75f)
                lineToRelative(4.29f, 3.88f)
                lineToRelative(-1.99f, 2.28f)
                lineTo(8.78f, 2.36f)
                curveToRelative(1.31f, -0.51f, 3.62f, -0.84f, 6.17f, 1.39f)
                close()
                moveTo(4.4f, 21.14f)
                lineToRelative(-1.51f, -1.32f)
                lineTo(12.74f, 8.57f)
                lineToRelative(1.49f, 1.33f)
                lineTo(4.4f, 21.14f)
                close()
                moveTo(21.88f, 10.68f)
                lineToRelative(-1.32f, 1.51f)
                curveToRelative(-0.12f, 0.14f, -0.27f, 0.16f, -0.34f, 0.17f)
                curveToRelative(-0.08f, 0.01f, -0.23f, -0.01f, -0.35f, -0.12f)
                lineToRelative(-1.13f, -1.01f)
                lineToRelative(1.98f, -2.27f)
                lineToRelative(1.11f, 1.01f)
                curveToRelative(0.14f, 0.12f, 0.17f, 0.27f, 0.17f, 0.34f)
                curveToRelative(0.01f, 0.08f, -0.0f, 0.23f, -0.12f, 0.36f)
                close()
            }
        }.also { _Hammer = it}
