package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dinner: ImageVector? = null

val Icons.Br.Dinner: ImageVector
    get() = _Dinner ?: UXIcon(name = "Dinner") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11f, 9.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.4f, -0.16f, 0.78f, -0.44f, 1.06f)
            lineToRelative(-2f, 2f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            lineToRelative(1.56f, -1.56f)
            verticalLineToRelative(-2.38f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(12.75f, 18.13f)
            curveToRelative(-0.98f, 0.57f, -2.11f, 0.87f, -3.25f, 0.87f)
            curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
            reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            curveTo(4.26f, 3f, 0f, 7.26f, 0f, 12.5f)
            reflectiveCurveToRelative(4.26f, 9.5f, 9.5f, 9.5f)
            curveToRelative(1.67f, 0f, 3.31f, -0.44f, 4.75f, -1.27f)
            curveToRelative(0.72f, -0.41f, 0.96f, -1.33f, 0.55f, -2.05f)
            curveToRelative(-0.41f, -0.72f, -1.33f, -0.96f, -2.05f, -0.55f)
            close()
            moveTo(20f, 12.79f)
            verticalLineToRelative(9.71f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-9.71f)
            curveToRelative(-2.31f, -0.66f, -4f, -2.77f, -4f, -5.29f)
            curveToRelative(0f, -2.64f, 2.09f, -7.5f, 5.5f, -7.5f)
            reflectiveCurveToRelative(5.5f, 4.86f, 5.5f, 7.5f)
            curveToRelative(0f, 2.51f, -1.7f, 4.63f, -4f, 5.29f)
            close()
            moveTo(21f, 7.5f)
            curveToRelative(0f, -1.77f, -1.52f, -4.5f, -2.5f, -4.5f)
            reflectiveCurveToRelative(-2.5f, 2.73f, -2.5f, 4.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _Dinner = it }
