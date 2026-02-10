package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilRuler: ImageVector? = null

val Icons.Ss.PencilRuler: ImageVector
    get() = _PencilRuler ?: UXIcon(name = "PencilRuler") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.31f, 9.4f)
                lineTo(3.71f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3.71f)
                lineTo(14.6f, 5.69f)
                lineToRelative(3.71f, 3.71f)
                close()
                moveTo(23.23f, 0.77f)
                curveToRelative(-1.02f, -1.02f, -2.69f, -1.02f, -3.71f, 0f)
                lineToRelative(-3.5f, 3.5f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(1.02f, -1.02f, 1.02f, -2.69f, 0f, -3.71f)
                close()
                moveTo(9.73f, 4.83f)
                lineToRelative(-2.83f, 2.83f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.83f, -2.83f)
                lineTo(4.9f, -0.01f)
                lineTo(0.88f, 4.01f)
                curveTo(-0.29f, 5.18f, -0.29f, 7.08f, 0.88f, 8.25f)
                lineToRelative(4.18f, 4.18f)
                lineToRelative(6.14f, -6.14f)
                lineToRelative(-1.46f, -1.46f)
                close()
                moveTo(17.7f, 12.8f)
                lineToRelative(-6.14f, 6.14f)
                lineToRelative(4.18f, 4.18f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0f)
                lineToRelative(4.02f, -4.02f)
                lineToRelative(-3.42f, -3.42f)
                lineToRelative(-2.83f, 2.83f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.83f, -2.83f)
                lineToRelative(-1.46f, -1.46f)
                close()
            }
        }.also { _PencilRuler = it}
