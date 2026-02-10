package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkHorizontal: ImageVector? = null

val Icons.Rs.LinkHorizontal: ImageVector
    get() = _LinkHorizontal ?: UXIcon(name = "LinkHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                horizontalLineToRelative(1.47f)
                curveToRelative(-0.14f, 1.14f, -0.76f, 2f, -1.97f, 2f)
                curveToRelative(-2.24f, 0.26f, -4f, 2.2f, -4f, 4.5f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -1.78f, -1.04f, -3.3f, -2.54f, -4.03f)
                curveToRelative(0.24f, -0.63f, 0.4f, -1.29f, 0.48f, -1.99f)
                curveToRelative(2.38f, 0.97f, 4.06f, 3.3f, 4.06f, 6.02f)
                close()
                moveTo(2f, 8.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 2.3f, -1.76f, 4.24f, -4f, 4.5f)
                curveToRelative(-1.21f, 0f, -1.83f, 0.86f, -1.97f, 2f)
                horizontalLineToRelative(1.47f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                horizontalLineTo(6.5f)
                curveTo(2.92f, 2f, 0f, 4.92f, 0f, 8.5f)
                curveToRelative(0f, 2.72f, 1.68f, 5.05f, 4.06f, 6.02f)
                curveToRelative(0.08f, -0.69f, 0.25f, -1.35f, 0.48f, -1.99f)
                curveToRelative(-1.5f, -0.73f, -2.54f, -2.26f, -2.54f, -4.03f)
                close()
            }
        }.also { _LinkHorizontal = it}
