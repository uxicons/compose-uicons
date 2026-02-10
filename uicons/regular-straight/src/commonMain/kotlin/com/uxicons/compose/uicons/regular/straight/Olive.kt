package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Olive: ImageVector? = null

val Icons.Rs.Olive: ImageVector
    get() = _Olive ?: UXIcon(name = "Olive") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.02f, 2.98f)
                curveTo(16.66f, -1.38f, 9.06f, -0.89f, 4.09f, 4.09f)
                curveTo(1.7f, 6.48f, 0.26f, 9.54f, 0.03f, 12.71f)
                curveToRelative(-0.23f, 3.23f, 0.82f, 6.17f, 2.95f, 8.31f)
                curveToRelative(2.0f, 2.0f, 4.66f, 2.97f, 7.45f, 2.97f)
                curveToRelative(3.31f, 0f, 6.78f, -1.38f, 9.48f, -4.08f)
                curveToRelative(2.39f, -2.39f, 3.83f, -5.45f, 4.06f, -8.62f)
                curveToRelative(0.23f, -3.23f, -0.82f, -6.17f, -2.95f, -8.31f)
                close()
                moveTo(21.98f, 11.15f)
                curveToRelative(-0.19f, 2.69f, -1.43f, 5.3f, -3.48f, 7.35f)
                curveToRelative(-4.19f, 4.19f, -10.52f, 4.69f, -14.1f, 1.11f)
                curveToRelative(-1.72f, -1.72f, -2.56f, -4.11f, -2.37f, -6.75f)
                curveToRelative(0.19f, -2.69f, 1.43f, -5.3f, 3.48f, -7.35f)
                curveToRelative(2.31f, -2.31f, 5.27f, -3.5f, 8.06f, -3.5f)
                curveToRelative(2.27f, 0f, 4.43f, 0.79f, 6.04f, 2.39f)
                curveToRelative(1.72f, 1.72f, 2.56f, 4.11f, 2.37f, 6.75f)
                close()
                moveTo(17.71f, 6.29f)
                curveToRelative(1.36f, 1.36f, 1.7f, 3.23f, 0.76f, 4.17f)
                reflectiveCurveToRelative(-2.81f, 0.61f, -4.17f, -0.76f)
                reflectiveCurveToRelative(-1.7f, -3.23f, -0.76f, -4.17f)
                reflectiveCurveToRelative(2.81f, -0.61f, 4.17f, 0.76f)
                close()
            }
        }.also { _Olive = it}
