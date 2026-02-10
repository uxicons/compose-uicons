package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MaskSnorkel: ImageVector? = null

val Icons.Tc.MaskSnorkel: ImageVector
    get() = _MaskSnorkel ?: UXIcon(name = "MaskSnorkel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.88f, 13.85f)
                curveToRelative(1.25f, 0f, 5.35f, -0.43f, 5.35f, -5.91f)
                curveToRelative(0f, -6.45f, -6.86f, -6.45f, -9.12f, -6.45f)
                curveToRelative(-4.24f, 0f, -9.12f, 0.73f, -9.12f, 6.45f)
                curveToRelative(0f, 5.48f, 4.09f, 5.91f, 5.35f, 5.91f)
                curveToRelative(1.74f, 0f, 3.14f, -0.95f, 3.77f, -1.46f)
                curveToRelative(0.63f, 0.51f, 2.03f, 1.46f, 3.77f, 1.46f)
                close()
                moveTo(6.35f, 12.85f)
                curveToRelative(-1.62f, 0f, -4.35f, -0.64f, -4.35f, -4.91f)
                curveToRelative(0f, -3.87f, 2.35f, -5.45f, 8.12f, -5.45f)
                curveToRelative(5.54f, 0f, 8.12f, 1.73f, 8.12f, 5.45f)
                curveToRelative(0f, 4.27f, -2.72f, 4.91f, -4.35f, 4.91f)
                curveToRelative(-1.91f, 0f, -3.4f, -1.46f, -3.42f, -1.48f)
                curveToRelative(-0.1f, -0.1f, -0.23f, -0.15f, -0.35f, -0.15f)
                reflectiveCurveToRelative(-0.26f, 0.05f, -0.35f, 0.15f)
                curveToRelative(-0.01f, 0.01f, -1.5f, 1.48f, -3.42f, 1.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(14.05f)
                curveToRelative(0f, 2.95f, -2.62f, 5.45f, -5.72f, 5.45f)
                curveToRelative(-3.07f, 0f, -5.66f, -2.49f, -5.66f, -5.45f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                curveToRelative(0f, 3.55f, 2.99f, 6.45f, 6.66f, 6.45f)
                curveToRelative(3.65f, 0f, 6.72f, -2.95f, 6.72f, -6.45f)
                verticalLineToRelative(-14.05f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _MaskSnorkel = it}
