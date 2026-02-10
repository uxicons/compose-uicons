package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookCircleArrowUp: ImageVector? = null

val Icons.Sc.BookCircleArrowUp: ImageVector
    get() = _BookCircleArrowUp ?: UXIcon(name = "BookCircleArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 11f)
                curveToRelative(4.15f, 0f, 6f, 1.85f, 6f, 6f)
                reflectiveCurveToRelative(-1.85f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -1.85f, -6f, -6f)
                reflectiveCurveToRelative(1.85f, -6f, 6f, -6f)
                close()
                moveTo(16.48f, 13.68f)
                curveToRelative(-0.73f, 0.55f, -1.38f, 1.19f, -1.93f, 1.93f)
                curveToRelative(-0.44f, 0.54f, 0.0f, 1.42f, 0.7f, 1.4f)
                horizontalLineToRelative(0.75f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                reflectiveCurveToRelative(0.75f, 0f, 0.75f, 0f)
                curveToRelative(0.7f, 0.02f, 1.14f, -0.85f, 0.7f, -1.4f)
                curveToRelative(-0.55f, -0.73f, -1.2f, -1.38f, -1.93f, -1.93f)
                curveToRelative(-0.31f, -0.23f, -0.74f, -0.23f, -1.05f, 0f)
                close()
                moveTo(17f, 9f)
                curveToRelative(0.68f, 0f, 1.31f, 0.05f, 1.91f, 0.14f)
                curveToRelative(-0.21f, -3.36f, -0.69f, -6.17f, -0.72f, -6.31f)
                curveToRelative(-0.07f, -0.38f, -0.35f, -0.69f, -0.72f, -0.79f)
                curveToRelative(-0.15f, -0.04f, -3.82f, -1.04f, -7.46f, -1.04f)
                curveToRelative(-0.93f, 0f, -1.94f, 0.07f, -3f, 0.2f)
                verticalLineToRelative(14.8f)
                horizontalLineToRelative(2.04f)
                curveToRelative(0.34f, -4.58f, 3.07f, -7f, 7.96f, -7f)
                close()
                moveTo(5f, 16f)
                verticalLineToRelative(-14.49f)
                curveToRelative(-1.89f, 0.39f, -3.31f, 1.92f, -3.55f, 3.85f)
                curveToRelative(-0.21f, 1.66f, -0.45f, 4.16f, -0.45f, 6.65f)
                curveToRelative(0f, 1.75f, 0.12f, 3.51f, 0.27f, 4.98f)
                curveToRelative(0.94f, -0.72f, 2.03f, -0.98f, 2.73f, -0.98f)
                close()
                moveTo(9.04f, 18f)
                horizontalLineToRelative(-5.04f)
                curveToRelative(-0.18f, 0.0f, -1.73f, 0.1f, -2.29f, 1.67f)
                curveToRelative(0.55f, 1.47f, 1.81f, 2.57f, 3.42f, 2.86f)
                curveToRelative(1.77f, 0.31f, 3.4f, 0.47f, 4.87f, 0.47f)
                curveToRelative(0.35f, 0f, 0.7f, -0.01f, 1.05f, -0.03f)
                curveToRelative(-1.18f, -1.17f, -1.85f, -2.83f, -2.01f, -4.97f)
                close()
            }
        }.also { _BookCircleArrowUp = it}
