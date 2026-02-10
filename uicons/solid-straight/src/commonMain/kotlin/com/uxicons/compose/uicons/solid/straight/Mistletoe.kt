package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mistletoe: ImageVector? = null

val Icons.Ss.Mistletoe: ImageVector
    get() = _Mistletoe ?: UXIcon(name = "Mistletoe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 6f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                close()
                moveTo(12.97f, 9.23f)
                curveTo(12.73f, 5.47f, 10.57f, 0f, 0f, 0f)
                verticalLineToRelative(2f)
                curveToRelative(6.94f, 0f, 10.62f, 2.44f, 10.97f, 7.23f)
                curveToRelative(-2.86f, 0.89f, -10.97f, 4.04f, -10.97f, 10.77f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -4.92f, 2.79f, -7.75f, 4.0f, -8.75f)
                curveToRelative(1.2f, 1.0f, 4.0f, 3.85f, 4.0f, 8.75f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -6.95f, -8.44f, -9.99f, -11.03f, -10.77f)
                close()
                moveTo(8f, 7f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                close()
            }
        }.also { _Mistletoe = it}
