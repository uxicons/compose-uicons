package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ankh: ImageVector? = null

val Icons.Rc.Ankh: ImageVector
    get() = _Ankh ?: UXIcon(name = "Ankh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.39f, 14.08f)
                curveToRelative(-0.09f, -0.04f, -1.77f, -0.71f, -4.4f, -0.97f)
                curveToRelative(1.26f, -1.72f, 3.02f, -4.58f, 3.02f, -7.11f)
                curveToRelative(0f, -3.41f, -1.59f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 1.59f, -5f, 5f)
                curveToRelative(0f, 2.52f, 1.76f, 5.38f, 3.02f, 7.11f)
                curveToRelative(-2.63f, 0.26f, -4.32f, 0.94f, -4.4f, 0.97f)
                curveToRelative(-0.51f, 0.21f, -0.75f, 0.8f, -0.54f, 1.3f)
                reflectiveCurveToRelative(0.8f, 0.75f, 1.3f, 0.54f)
                curveToRelative(0.02f, -0.01f, 1.84f, -0.74f, 4.62f, -0.89f)
                verticalLineToRelative(6.97f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6.97f)
                curveToRelative(3.3f, 0.21f, 4.28f, 0.89f, 5f, 0.97f)
                curveToRelative(0.39f, 0f, 0.76f, -0.23f, 0.92f, -0.62f)
                curveToRelative(0.21f, -0.51f, -0.03f, -1.09f, -0.54f, -1.31f)
                close()
                moveTo(12f, 12.42f)
                curveToRelative(-1.23f, -1.6f, -3f, -4.35f, -3f, -6.42f)
                curveToRelative(0f, -2.3f, 0.7f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.7f, 3f, 3f)
                curveToRelative(0f, 2.06f, -1.77f, 4.82f, -3f, 6.42f)
                close()
            }
        }.also { _Ankh = it}
