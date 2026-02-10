package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mistletoe: ImageVector? = null

val Icons.Sr.Mistletoe: ImageVector
    get() = _Mistletoe ?: UXIcon(name = "Mistletoe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 5.98f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                close()
                moveTo(12.97f, 9.22f)
                curveTo(12.74f, 5.58f, 10.71f, 0.34f, 1.02f, 0f)
                curveTo(0.46f, -0.02f, 0f, 0.44f, 0f, 1.0f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 0.55f, 0.44f, 0.98f, 0.98f, 1.0f)
                curveToRelative(6.3f, 0.22f, 9.65f, 2.65f, 9.98f, 7.21f)
                curveTo(8.15f, 10.09f, 0.25f, 13.16f, 0.01f, 19.67f)
                curveToRelative(-0.08f, 2.05f, 1.34f, 3.95f, 3.37f, 4.26f)
                curveToRelative(2.48f, 0.38f, 4.62f, -1.54f, 4.62f, -3.95f)
                curveToRelative(0f, -4.92f, 2.79f, -7.75f, 4.0f, -8.75f)
                curveToRelative(1.19f, 0.99f, 3.98f, 3.83f, 4.0f, 8.69f)
                curveToRelative(0.01f, 2.01f, 1.52f, 3.79f, 3.52f, 4.03f)
                curveToRelative(2.42f, 0.29f, 4.48f, -1.61f, 4.48f, -3.97f)
                curveToRelative(0f, -6.95f, -8.44f, -9.99f, -11.03f, -10.77f)
                close()
                moveTo(8f, 6.98f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                close()
            }
        }.also { _Mistletoe = it}
