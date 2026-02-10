package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlSpoon: ImageVector? = null

val Icons.Rr.BowlSpoon: ImageVector
    get() = _BowlSpoon ?: UXIcon(name = "BowlSpoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.29f, 8f)
                curveToRelative(1.97f, 0f, 3.62f, -1.28f, 4.1f, -3f)
                horizontalLineToRelative(12.61f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-12.61f)
                curveToRelative(-0.47f, -1.72f, -2.12f, -3f, -4.1f, -3f)
                curveTo(4.13f, 0f, 0f, 1.56f, 0f, 4f)
                reflectiveCurveToRelative(4.13f, 4f, 6.29f, 4f)
                close()
                moveTo(6.29f, 2f)
                curveToRelative(1.24f, 0f, 2.25f, 0.9f, 2.25f, 2f)
                reflectiveCurveToRelative(-1.01f, 2f, -2.25f, 2f)
                curveToRelative(-1.73f, 0f, -4.29f, -1.31f, -4.29f, -2f)
                reflectiveCurveToRelative(2.57f, -2f, 4.29f, -2f)
                close()
                moveTo(23.33f, 12.5f)
                curveToRelative(-0.71f, -0.95f, -1.81f, -1.5f, -3.0f, -1.5f)
                lineTo(3.67f, 11f)
                curveToRelative(-1.19f, 0f, -2.28f, 0.55f, -3.0f, 1.5f)
                curveToRelative(-0.72f, 0.96f, -0.94f, 2.17f, -0.6f, 3.33f)
                curveToRelative(0.65f, 2.23f, 1.83f, 4.25f, 3.42f, 5.83f)
                curveToRelative(1.5f, 1.49f, 3.61f, 2.35f, 5.8f, 2.35f)
                horizontalLineToRelative(5.41f)
                curveToRelative(2.19f, 0f, 4.31f, -0.85f, 5.8f, -2.35f)
                curveToRelative(1.58f, -1.58f, 2.77f, -3.59f, 3.42f, -5.83f)
                curveToRelative(0.34f, -1.16f, 0.12f, -2.37f, -0.6f, -3.33f)
                close()
                moveTo(22.01f, 15.27f)
                curveToRelative(-0.55f, 1.88f, -1.58f, 3.65f, -2.91f, 4.97f)
                curveToRelative(-1.13f, 1.12f, -2.73f, 1.76f, -4.39f, 1.76f)
                horizontalLineToRelative(-5.41f)
                curveToRelative(-1.67f, 0f, -3.27f, -0.64f, -4.39f, -1.76f)
                curveToRelative(-1.33f, -1.32f, -2.36f, -3.09f, -2.91f, -4.97f)
                curveToRelative(-0.16f, -0.55f, -0.06f, -1.12f, 0.28f, -1.57f)
                curveToRelative(0.33f, -0.44f, 0.84f, -0.7f, 1.4f, -0.7f)
                horizontalLineToRelative(16.66f)
                curveToRelative(0.56f, 0f, 1.06f, 0.26f, 1.4f, 0.7f)
                curveToRelative(0.34f, 0.45f, 0.44f, 1.02f, 0.28f, 1.57f)
                close()
            }
        }.also { _BowlSpoon = it}
