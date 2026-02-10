package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilRuler: ImageVector? = null

val Icons.Sr.PencilRuler: ImageVector
    get() = _PencilRuler ?: UXIcon(name = "PencilRuler") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.52f, 5.78f)
                lineToRelative(3.71f, 3.71f)
                lineTo(4.88f, 22.83f)
                curveToRelative(-0.75f, 0.75f, -1.77f, 1.17f, -2.83f, 1.17f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2.05f)
                curveToRelative(0f, -1.06f, 0.42f, -2.08f, 1.17f, -2.83f)
                lineTo(14.52f, 5.78f)
                close()
                moveTo(23.14f, 0.85f)
                curveToRelative(-1.02f, -1.02f, -2.69f, -1.02f, -3.71f, 0f)
                lineToRelative(-3.51f, 3.51f)
                lineToRelative(3.71f, 3.71f)
                lineToRelative(3.51f, -3.51f)
                curveToRelative(1.02f, -1.02f, 1.02f, -2.69f, 0f, -3.71f)
                close()
                moveTo(12.27f, 5.2f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(-2.25f, 2.25f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(-1.26f, -1.26f)
                curveTo(6.73f, -0.34f, 4.51f, -0.34f, 3.15f, 1.02f)
                lineTo(1.02f, 3.15f)
                curveToRelative(-1.37f, 1.37f, -1.37f, 3.58f, 0f, 4.95f)
                lineToRelative(4.17f, 4.17f)
                lineToRelative(7.07f, -7.07f)
                close()
                moveTo(11.73f, 18.8f)
                lineToRelative(4.17f, 4.17f)
                curveToRelative(1.37f, 1.37f, 3.58f, 1.37f, 4.95f, 0f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(1.37f, -1.37f, 1.37f, -3.58f, 0f, -4.95f)
                lineToRelative(-1.26f, -1.26f)
                lineToRelative(-2.25f, 2.25f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                curveToRelative(-0.2f, -0.2f, -0.29f, -0.45f, -0.29f, -0.71f)
                reflectiveCurveToRelative(0.1f, -0.51f, 0.29f, -0.71f)
                lineToRelative(2.25f, -2.25f)
                lineToRelative(-1.5f, -1.5f)
                lineToRelative(-7.07f, 7.07f)
                close()
            }
        }.also { _PencilRuler = it}
