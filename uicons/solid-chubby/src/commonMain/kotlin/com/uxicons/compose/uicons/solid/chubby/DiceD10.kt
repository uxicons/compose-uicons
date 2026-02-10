package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiceD10: ImageVector? = null

val Icons.Sc.DiceD10: ImageVector
    get() = _DiceD10 ?: UXIcon(name = "DiceD10") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12.21f)
                curveToRelative(-0.47f, -1.05f, -2.08f, -4.4f, -4.5f, -6.84f)
                curveToRelative(-1.87f, -1.87f, -3.84f, -3.27f, -4.98f, -4.01f)
                lineToRelative(3.42f, 9.11f)
                lineToRelative(6.06f, 1.74f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.57f, 1.35f)
                curveToRelative(-1.12f, 0.71f, -3.04f, 2.06f, -4.99f, 4.03f)
                curveTo(2.85f, 8.12f, 1.32f, 11.61f, 1f, 12.4f)
                lineToRelative(6.14f, -1.91f)
                lineTo(10.57f, 1.35f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.04f, 3.24f)
                lineToRelative(-2.94f, 7.84f)
                lineToRelative(2.94f, 2.96f)
                lineToRelative(2.94f, -2.96f)
                lineToRelative(-2.94f, -7.84f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.06f, 15.9f)
                verticalLineToRelative(6.74f)
                curveToRelative(0.99f, -0.6f, 3.19f, -2.05f, 5.44f, -4.3f)
                curveToRelative(1.96f, -1.97f, 3.28f, -3.41f, 3.95f, -4.16f)
                lineToRelative(-5.97f, -1.71f)
                lineToRelative(-3.42f, 3.44f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.75f, 14.3f)
                curveToRelative(0.73f, 0.81f, 2.06f, 2.25f, 3.83f, 4.04f)
                curveToRelative(2.15f, 2.16f, 4.44f, 3.68f, 5.44f, 4.3f)
                verticalLineToRelative(-6.74f)
                lineToRelative(-3.41f, -3.43f)
                lineToRelative(-5.86f, 1.82f)
                close()
            }
        }.also { _DiceD10 = it}
