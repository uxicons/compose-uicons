package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rhombus: ImageVector? = null

val Icons.Rc.Rhombus: ImageVector
    get() = _Rhombus ?: UXIcon(name = "Rhombus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 23.0f)
                curveToRelative(-0.66f, 0f, -1.33f, -0.2f, -1.91f, -0.58f)
                curveToRelative(-3.34f, -2.25f, -6.15f, -5.1f, -8.36f, -8.5f)
                curveToRelative(-0.76f, -1.17f, -0.76f, -2.67f, 0f, -3.84f)
                curveTo(3.94f, 6.69f, 6.75f, 3.83f, 10.09f, 1.58f)
                curveToRelative(1.16f, -0.78f, 2.66f, -0.78f, 3.82f, 0f)
                curveToRelative(3.34f, 2.25f, 6.15f, 5.1f, 8.36f, 8.5f)
                curveToRelative(0.76f, 1.17f, 0.76f, 2.67f, 0f, 3.84f)
                curveToRelative(-2.21f, 3.4f, -5.02f, 6.25f, -8.36f, 8.5f)
                curveToRelative(-0.58f, 0.39f, -1.24f, 0.58f, -1.91f, 0.58f)
                close()
                moveTo(11.21f, 20.76f)
                curveToRelative(0.48f, 0.32f, 1.1f, 0.32f, 1.59f, 0f)
                curveToRelative(3.12f, -2.09f, 5.74f, -4.76f, 7.8f, -7.93f)
                curveToRelative(0.33f, -0.5f, 0.33f, -1.15f, 0f, -1.66f)
                curveToRelative(-2.06f, -3.17f, -4.68f, -5.83f, -7.8f, -7.93f)
                curveToRelative(-0.48f, -0.32f, -1.1f, -0.32f, -1.59f, 0f)
                curveToRelative(-3.12f, 2.09f, -5.74f, 4.76f, -7.8f, 7.93f)
                curveToRelative(-0.33f, 0.5f, -0.33f, 1.15f, 0f, 1.66f)
                curveToRelative(2.06f, 3.17f, 4.68f, 5.83f, 7.8f, 7.93f)
                close()
            }
        }.also { _Rhombus = it}
