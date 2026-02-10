package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleWarning: ImageVector? = null

val Icons.Rc.TriangleWarning: ImageVector
    get() = _TriangleWarning ?: UXIcon(name = "TriangleWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.98f, 19.7f)
                curveToRelative(-0.03f, -0.14f, -0.79f, -3.6f, -4.18f, -9.32f)
                curveToRelative(-3.26f, -5.51f, -5.86f, -7.88f, -6.14f, -8.13f)
                curveToRelative(-0.38f, -0.34f, -0.95f, -0.34f, -1.32f, 0f)
                curveToRelative(-0.28f, 0.25f, -2.88f, 2.62f, -6.14f, 8.13f)
                curveToRelative(-3.39f, 5.72f, -4.15f, 9.18f, -4.18f, 9.32f)
                curveToRelative(-0.1f, 0.5f, 0.18f, 1.0f, 0.67f, 1.16f)
                curveToRelative(0.14f, 0.05f, 3.56f, 1.14f, 10.31f, 1.14f)
                reflectiveCurveToRelative(10.17f, -1.09f, 10.31f, -1.14f)
                curveToRelative(0.48f, -0.16f, 0.77f, -0.66f, 0.67f, -1.16f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.44f, 0f, -7.37f, -0.5f, -8.76f, -0.8f)
                curveToRelative(0.43f, -1.33f, 1.46f, -4.06f, 3.68f, -7.79f)
                curveToRelative(2.23f, -3.77f, 4.13f, -5.99f, 5.08f, -7.0f)
                curveToRelative(0.96f, 1.01f, 2.85f, 3.23f, 5.08f, 7.0f)
                curveToRelative(2.21f, 3.74f, 3.25f, 6.46f, 3.68f, 7.79f)
                curveToRelative(-1.39f, 0.31f, -4.32f, 0.8f, -8.76f, 0.8f)
                close()
                moveTo(11f, 14f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(13f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _TriangleWarning = it}
