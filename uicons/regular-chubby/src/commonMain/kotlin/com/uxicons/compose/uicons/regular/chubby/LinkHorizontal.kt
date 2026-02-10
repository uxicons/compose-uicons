package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LinkHorizontal: ImageVector? = null

val Icons.Rc.LinkHorizontal: ImageVector
    get() = _LinkHorizontal ?: UXIcon(name = "LinkHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.38f, 13.22f)
                curveToRelative(-0.96f, -0.77f, -1.38f, -1.72f, -1.38f, -3.07f)
                curveToRelative(0f, -2.55f, 0.71f, -5.15f, 6.02f, -5.15f)
                reflectiveCurveToRelative(6.02f, 2.6f, 6.02f, 5.15f)
                curveToRelative(0f, 1.35f, -0.43f, 2.3f, -1.38f, 3.07f)
                curveToRelative(-0.43f, 0.34f, -0.5f, 0.97f, -0.15f, 1.41f)
                curveToRelative(0.2f, 0.25f, 0.49f, 0.37f, 0.78f, 0.37f)
                curveToRelative(0.22f, 0f, 0.44f, -0.07f, 0.62f, -0.22f)
                curveToRelative(1.43f, -1.15f, 2.13f, -2.66f, 2.13f, -4.63f)
                curveToRelative(0f, -4.75f, -2.7f, -7.15f, -8.02f, -7.15f)
                reflectiveCurveToRelative(-8.02f, 2.41f, -8.02f, 7.15f)
                curveToRelative(0f, 1.96f, 0.7f, 3.47f, 2.13f, 4.62f)
                curveToRelative(0.43f, 0.35f, 1.06f, 0.28f, 1.41f, -0.15f)
                reflectiveCurveToRelative(0.28f, -1.06f, -0.15f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.87f, 9.22f)
                curveToRelative(-0.43f, -0.35f, -1.06f, -0.28f, -1.41f, 0.15f)
                curveToRelative(-0.35f, 0.43f, -0.28f, 1.06f, 0.15f, 1.41f)
                curveToRelative(0.96f, 0.77f, 1.38f, 1.72f, 1.38f, 3.07f)
                curveToRelative(0f, 2.55f, -0.71f, 5.15f, -6.02f, 5.15f)
                reflectiveCurveToRelative(-6.02f, -2.6f, -6.02f, -5.15f)
                curveToRelative(0f, -1.35f, 0.43f, -2.3f, 1.38f, -3.07f)
                curveToRelative(0.43f, -0.34f, 0.5f, -0.97f, 0.15f, -1.41f)
                curveToRelative(-0.35f, -0.43f, -0.98f, -0.5f, -1.41f, -0.15f)
                curveToRelative(-1.43f, 1.15f, -2.13f, 2.66f, -2.13f, 4.63f)
                curveToRelative(0f, 4.75f, 2.7f, 7.15f, 8.02f, 7.15f)
                reflectiveCurveToRelative(8.02f, -2.41f, 8.02f, -7.15f)
                curveToRelative(0f, -1.96f, -0.7f, -3.47f, -2.13f, -4.62f)
                close()
            }
        }.also { _LinkHorizontal = it}
