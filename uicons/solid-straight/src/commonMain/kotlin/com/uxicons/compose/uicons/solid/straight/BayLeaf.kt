package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BayLeaf: ImageVector? = null

val Icons.Ss.BayLeaf: ImageVector
    get() = _BayLeaf ?: UXIcon(name = "BayLeaf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.2f, 15f)
                horizontalLineToRelative(-10.78f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(9.24f)
                curveToRelative(-0.38f, 1.03f, -0.85f, 2.04f, -1.45f, 3f)
                close()
                moveTo(14f, 8.59f)
                lineTo(22.51f, 0.08f)
                curveToRelative(-1.27f, -0.1f, -4.79f, -0.26f, -8.51f, 0.67f)
                close()
                moveTo(23.26f, 10f)
                curveToRelative(0.93f, -3.72f, 0.77f, -7.24f, 0.67f, -8.51f)
                lineToRelative(-8.51f, 8.51f)
                close()
                moveTo(9f, 2.8f)
                verticalLineToRelative(10.79f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(-9.24f)
                curveToRelative(-1.03f, 0.38f, -2.04f, 0.85f, -3f, 1.45f)
                close()
                moveTo(7f, 4.33f)
                curveToRelative(-0.12f, 0.11f, -0.24f, 0.2f, -0.35f, 0.32f)
                curveToRelative(-5.1f, 5.11f, -4.75f, 13.72f, -4.57f, 15.86f)
                lineToRelative(4.92f, -4.92f)
                close()
                moveTo(8.41f, 17f)
                lineTo(3.49f, 21.92f)
                curveToRelative(0.46f, 0.04f, 1.19f, 0.08f, 2.13f, 0.08f)
                curveToRelative(3.5f, 0f, 9.71f, -0.63f, 13.73f, -4.65f)
                curveToRelative(0.11f, -0.11f, 0.21f, -0.24f, 0.32f, -0.35f)
                horizontalLineToRelative(-11.26f)
                close()
                moveTo(2.08f, 20.51f)
                lineTo(0.02f, 22.56f)
                lineTo(1.44f, 23.98f)
                lineTo(3.49f, 21.92f)
                curveToRelative(-0.02f, -0.0f, -1.41f, -1.39f, -1.41f, -1.41f)
                close()
            }
        }.also { _BayLeaf = it}
