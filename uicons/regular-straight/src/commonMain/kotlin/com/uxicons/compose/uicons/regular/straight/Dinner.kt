package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dinner: ImageVector? = null

val Icons.Rs.Dinner: ImageVector
    get() = _Dinner ?: UXIcon(name = "Dinner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                curveToRelative(0f, -2.38f, -1.97f, -8f, -5.08f, -8f)
                curveToRelative(-3.06f, 0f, -4.92f, 5.56f, -4.92f, 8f)
                curveToRelative(0f, 2.41f, 1.72f, 4.43f, 4f, 4.9f)
                verticalLineToRelative(11.1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-11.1f)
                curveToRelative(2.28f, -0.47f, 4f, -2.48f, 4f, -4.9f)
                close()
                moveTo(19f, 11f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -2.17f, 1.69f, -6f, 2.92f, -6f)
                curveToRelative(1.27f, 0f, 3.08f, 3.88f, 3.08f, 6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(9f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5.41f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.71f, -2.71f)
                verticalLineToRelative(-4.59f)
                close()
                moveTo(16f, 17.27f)
                verticalLineToRelative(2.71f)
                curveToRelative(-1.67f, 1.26f, -3.75f, 2.02f, -6f, 2.02f)
                curveTo(4.49f, 22f, 0f, 17.51f, 0f, 12f)
                reflectiveCurveTo(4.49f, 2f, 10f, 2f)
                curveToRelative(1.17f, 0f, 2.28f, 0.21f, 3.33f, 0.58f)
                curveToRelative(-0.28f, 0.62f, -0.52f, 1.25f, -0.71f, 1.87f)
                curveToRelative(-0.82f, -0.29f, -1.7f, -0.45f, -2.62f, -0.45f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                curveToRelative(2.39f, 0f, 4.53f, -1.06f, 6f, -2.73f)
                close()
            }
        }.also { _Dinner = it}
