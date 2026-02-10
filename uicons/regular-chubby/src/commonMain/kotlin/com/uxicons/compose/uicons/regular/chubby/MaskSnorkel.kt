package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskSnorkel: ImageVector? = null

val Icons.Rc.MaskSnorkel: ImageVector
    get() = _MaskSnorkel ?: UXIcon(name = "MaskSnorkel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.79f, 14.28f)
                curveToRelative(2.71f, 0f, 5.62f, -1.61f, 5.62f, -6.13f)
                curveToRelative(0f, -4.41f, -3.1f, -6.65f, -9.21f, -6.65f)
                curveToRelative(-2.52f, -0.0f, -9.21f, -0.0f, -9.21f, 6.65f)
                curveToRelative(0f, 4.52f, 2.9f, 6.13f, 5.62f, 6.13f)
                curveToRelative(1.55f, 0f, 2.84f, -0.71f, 3.59f, -1.25f)
                curveToRelative(0.75f, 0.54f, 2.04f, 1.25f, 3.59f, 1.25f)
                close()
                moveTo(6.62f, 12.28f)
                curveToRelative(-1.65f, 0f, -3.62f, -0.72f, -3.62f, -4.13f)
                curveToRelative(0f, -3.35f, 2.02f, -4.65f, 7.21f, -4.65f)
                curveToRelative(6.39f, 0f, 7.21f, 2.48f, 7.21f, 4.65f)
                curveToRelative(0f, 3.42f, -1.97f, 4.13f, -3.62f, 4.13f)
                curveToRelative(-1.59f, 0f, -2.87f, -1.24f, -2.88f, -1.25f)
                curveToRelative(-0.19f, -0.2f, -0.45f, -0.29f, -0.71f, -0.29f)
                reflectiveCurveToRelative(-0.51f, 0.1f, -0.71f, 0.29f)
                curveToRelative(-0.01f, 0.01f, -1.29f, 1.25f, -2.88f, 1.25f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 1.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(13.35f)
                curveToRelative(0f, 2.52f, -2.26f, 4.65f, -4.93f, 4.65f)
                curveToRelative(-2.64f, 0f, -4.87f, -2.13f, -4.87f, -4.65f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 3.67f, 3.08f, 6.65f, 6.87f, 6.65f)
                curveToRelative(3.75f, 0f, 6.93f, -3.04f, 6.93f, -6.65f)
                verticalLineToRelative(-13.35f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _MaskSnorkel = it}
