package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dinner: ImageVector? = null

val Icons.Rr.Dinner: ImageVector
    get() = _Dinner ?: UXIcon(name = "Dinner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                curveToRelative(0f, -2.38f, -1.97f, -8f, -5.08f, -8f)
                curveToRelative(-3.06f, 0f, -4.92f, 5.56f, -4.92f, 8f)
                curveToRelative(0f, 2.41f, 1.72f, 4.43f, 4f, 4.9f)
                verticalLineToRelative(10.1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-10.1f)
                curveToRelative(2.28f, -0.47f, 4f, -2.48f, 4f, -4.9f)
                close()
                moveTo(19f, 11f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -2.17f, 1.69f, -6f, 2.92f, -6f)
                curveToRelative(1.27f, 0f, 3.08f, 3.88f, 3.08f, 6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(10f, 7f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.27f, -0.1f, 0.52f, -0.29f, 0.71f)
                lineToRelative(-2f, 2f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.71f, -1.71f)
                verticalLineToRelative(-3.59f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(15.83f, 18.93f)
                curveToRelative(0.31f, 0.46f, 0.18f, 1.08f, -0.27f, 1.39f)
                curveToRelative(-1.65f, 1.1f, -3.57f, 1.69f, -5.56f, 1.69f)
                curveTo(4.49f, 22f, 0f, 17.51f, 0f, 12f)
                reflectiveCurveTo(4.49f, 2f, 10f, 2f)
                curveToRelative(0.75f, 0f, 1.5f, 0.08f, 2.22f, 0.25f)
                curveToRelative(0.54f, 0.12f, 0.88f, 0.66f, 0.75f, 1.2f)
                curveToRelative(-0.12f, 0.54f, -0.66f, 0.88f, -1.2f, 0.75f)
                curveToRelative(-0.58f, -0.13f, -1.18f, -0.2f, -1.78f, -0.2f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                curveToRelative(1.59f, 0f, 3.13f, -0.47f, 4.44f, -1.35f)
                curveToRelative(0.46f, -0.31f, 1.08f, -0.18f, 1.39f, 0.27f)
                close()
            }
        }.also { _Dinner = it}
