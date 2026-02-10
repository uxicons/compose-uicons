package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hammer: ImageVector? = null

val Icons.Ts.Hammer: ImageVector
    get() = _Hammer ?: UXIcon(name = "Hammer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.56f, 10.09f)
                lineTo(15.07f, 1.61f)
                curveTo(12.93f, -0.54f, 9.44f, -0.54f, 7.3f, 1.61f)
                lineToRelative(-0.35f, 0.35f)
                lineToRelative(5.78f, 5.78f)
                lineTo(0f, 20.46f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(12.72f, -12.72f)
                lineToRelative(3.06f, 3.06f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(0.28f, -0.28f, 0.44f, -0.66f, 0.44f, -1.06f)
                reflectiveCurveToRelative(-0.16f, -0.78f, -0.44f, -1.06f)
                close()
                moveTo(3.54f, 22.59f)
                lineToRelative(-2.12f, -2.12f)
                lineTo(13.43f, 8.45f)
                lineToRelative(2.12f, 2.12f)
                lineTo(3.54f, 22.59f)
                close()
                moveTo(8.38f, 1.98f)
                curveToRelative(1.76f, -1.41f, 4.36f, -1.3f, 5.99f, 0.33f)
                lineToRelative(6.01f, 6.01f)
                lineToRelative(-2.83f, 2.83f)
                lineTo(8.38f, 1.98f)
                close()
                moveTo(22.85f, 11.51f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(2.83f, -2.83f)
                lineToRelative(1.77f, 1.77f)
                curveToRelative(0.1f, 0.1f, 0.15f, 0.22f, 0.15f, 0.35f)
                curveToRelative(0f, 0.13f, -0.05f, 0.26f, -0.15f, 0.35f)
                close()
            }
        }.also { _Hammer = it}
