package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dinner: ImageVector? = null

val Icons.Sr.Dinner: ImageVector
    get() = _Dinner ?: UXIcon(name = "Dinner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8f)
                curveToRelative(0f, -1.28f, 0.42f, -3.44f, 1.33f, -5.42f)
                curveToRelative(-1.04f, -0.37f, -2.16f, -0.58f, -3.33f, -0.58f)
                curveTo(4.48f, 2f, 0f, 6.48f, 0f, 12f)
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                curveToRelative(2.25f, 0f, 4.33f, -0.76f, 6f, -2.01f)
                verticalLineToRelative(-5.66f)
                curveToRelative(-2.39f, -1.14f, -4f, -3.58f, -4f, -6.32f)
                close()
                moveTo(11f, 12f)
                curveToRelative(0f, 0.27f, -0.1f, 0.52f, -0.29f, 0.71f)
                lineToRelative(-2f, 2f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.71f, -1.71f)
                verticalLineToRelative(-3.59f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(24f, 8f)
                curveToRelative(0f, -2.38f, -1.97f, -8f, -5.08f, -8f)
                curveToRelative(-3.06f, 0f, -4.92f, 5.56f, -4.92f, 8f)
                curveToRelative(0f, 2.41f, 1.72f, 4.43f, 4f, 4.9f)
                verticalLineToRelative(10.1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-10.1f)
                curveToRelative(2.28f, -0.47f, 4f, -2.48f, 4f, -4.9f)
                close()
            }
        }.also { _Dinner = it}
