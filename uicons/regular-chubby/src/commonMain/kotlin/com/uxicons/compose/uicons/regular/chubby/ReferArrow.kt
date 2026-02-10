package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferArrow: ImageVector? = null

val Icons.Rc.ReferArrow: ImageVector
    get() = _ReferArrow ?: UXIcon(name = "ReferArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.49f, 12f)
                curveToRelative(3.75f, 0f, 5.5f, -1.75f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-1.75f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 1.75f, -5.5f, 5.5f)
                reflectiveCurveToRelative(1.75f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(9.49f, 3f)
                curveToRelative(2.65f, 0f, 3.5f, 0.85f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-0.85f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -0.85f, -3.5f, -3.5f)
                reflectiveCurveToRelative(0.85f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(14.13f, 15.82f)
                curveToRelative(-0.18f, 0.52f, -0.74f, 0.8f, -1.27f, 0.62f)
                curveToRelative(-0.89f, -0.3f, -1.99f, -0.45f, -3.37f, -0.45f)
                curveToRelative(-4.68f, 0f, -6.38f, 1.58f, -6.49f, 6.03f)
                curveToRelative(-0.01f, 0.55f, -0.48f, 0.99f, -1.03f, 0.97f)
                curveToRelative(-0.55f, -0.01f, -0.99f, -0.47f, -0.97f, -1.03f)
                curveToRelative(0.15f, -5.51f, 2.77f, -7.97f, 8.49f, -7.97f)
                curveToRelative(1.6f, 0f, 2.91f, 0.18f, 4.01f, 0.55f)
                curveToRelative(0.52f, 0.18f, 0.8f, 0.74f, 0.62f, 1.27f)
                close()
                moveTo(22.99f, 17f)
                curveToRelative(0.01f, 0.21f, -0.09f, 0.42f, -0.19f, 0.6f)
                curveToRelative(-0.91f, 1.21f, -1.99f, 2.29f, -3.2f, 3.2f)
                curveToRelative(-0.44f, 0.33f, -1.07f, 0.24f, -1.4f, -0.2f)
                curveToRelative(-0.33f, -0.44f, -0.24f, -1.07f, 0.2f, -1.4f)
                curveToRelative(0.49f, -0.37f, 0.95f, -0.77f, 1.38f, -1.2f)
                horizontalLineToRelative(-0.78f)
                curveToRelative(-0.3f, 0.01f, -3f, 0.17f, -3f, 4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.75f, 3.27f, -6f, 5f, -6f)
                horizontalLineToRelative(0.78f)
                curveToRelative(-0.44f, -0.43f, -0.89f, -0.83f, -1.38f, -1.2f)
                curveToRelative(-0.44f, -0.33f, -0.53f, -0.96f, -0.2f, -1.4f)
                curveToRelative(0.33f, -0.44f, 0.96f, -0.53f, 1.4f, -0.2f)
                curveToRelative(1.21f, 0.91f, 2.29f, 1.99f, 3.2f, 3.2f)
                curveToRelative(0.12f, 0.18f, 0.19f, 0.39f, 0.19f, 0.6f)
                close()
            }
        }.also { _ReferArrow = it}
