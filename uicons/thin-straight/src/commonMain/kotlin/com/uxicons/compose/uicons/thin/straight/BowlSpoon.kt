package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlSpoon: ImageVector? = null

val Icons.Ts.BowlSpoon: ImageVector
    get() = _BowlSpoon ?: UXIcon(name = "BowlSpoon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.4f, 11.0f)
                lineTo(2.6f, 11.0f)
                curveToRelative(-0.72f, 0f, -1.42f, 0.33f, -1.92f, 0.9f)
                curveToRelative(-0.54f, 0.64f, -0.78f, 1.48f, -0.65f, 2.33f)
                curveToRelative(0.81f, 5.22f, 4.55f, 8.16f, 7.55f, 9.71f)
                lineToRelative(0.11f, 0.06f)
                horizontalLineToRelative(8.61f)
                lineToRelative(0.11f, -0.06f)
                curveToRelative(3.0f, -1.55f, 6.75f, -4.49f, 7.55f, -9.71f)
                curveToRelative(0.13f, -0.85f, -0.11f, -1.69f, -0.65f, -2.33f)
                curveToRelative(-0.49f, -0.57f, -1.19f, -0.9f, -1.92f, -0.9f)
                close()
                moveTo(22.98f, 14.08f)
                curveToRelative(-0.73f, 4.74f, -4.14f, 7.46f, -6.92f, 8.92f)
                lineTo(7.94f, 23.0f)
                curveToRelative(-2.78f, -1.46f, -6.18f, -4.18f, -6.92f, -8.92f)
                curveToRelative(-0.09f, -0.56f, 0.07f, -1.11f, 0.42f, -1.52f)
                curveToRelative(0.31f, -0.36f, 0.72f, -0.55f, 1.16f, -0.55f)
                horizontalLineToRelative(18.8f)
                curveToRelative(0.44f, 0f, 0.85f, 0.2f, 1.16f, 0.55f)
                curveToRelative(0.35f, 0.41f, 0.51f, 0.97f, 0.42f, 1.52f)
                close()
                moveTo(11.97f, 4f)
                curveToRelative(-0.27f, -2.25f, -2.32f, -4f, -4.8f, -4f)
                curveTo(4.65f, 0f, 0f, 1.85f, 0f, 4.5f)
                reflectiveCurveToRelative(4.65f, 4.5f, 7.17f, 4.5f)
                curveToRelative(2.48f, 0f, 4.54f, -1.75f, 4.8f, -4f)
                horizontalLineToRelative(12.03f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-12.03f)
                close()
                moveTo(7.17f, 8f)
                curveToRelative(-2.27f, 0f, -6.17f, -1.73f, -6.17f, -3.5f)
                reflectiveCurveTo(4.9f, 1f, 7.17f, 1f)
                curveToRelative(2.11f, 0f, 3.83f, 1.57f, 3.83f, 3.5f)
                reflectiveCurveToRelative(-1.72f, 3.5f, -3.83f, 3.5f)
                close()
            }
        }.also { _BowlSpoon = it}
