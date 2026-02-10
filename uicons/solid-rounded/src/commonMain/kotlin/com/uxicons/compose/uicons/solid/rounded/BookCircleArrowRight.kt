package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookCircleArrowRight: ImageVector? = null

val Icons.Sr.BookCircleArrowRight: ImageVector
    get() = _BookCircleArrowRight ?: UXIcon(name = "BookCircleArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.4f, 16.06f)
                curveToRelative(-0.87f, 0.1f, -1.7f, 0.44f, -2.4f, 0.96f)
                lineTo(0f, 5f)
                curveTo(0f, 2.62f, 1.67f, 0.57f, 4f, 0.1f)
                verticalLineToRelative(15.9f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.2f, 0f, -0.41f, 0.02f, -0.6f, 0.06f)
                close()
                moveTo(18f, 10f)
                curveToRelative(0.69f, 0f, 1.36f, 0.09f, 2f, 0.25f)
                verticalLineToRelative(-5.25f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(6f, 0f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(4.25f)
                curveToRelative(0.89f, -3.45f, 4.02f, -6f, 7.75f, -6f)
                close()
                moveTo(10f, 18f)
                lineTo(3f, 18f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(9.71f)
                curveToRelative(-1.66f, -1.47f, -2.71f, -3.61f, -2.71f, -6f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(21.0f, 16.76f)
                lineToRelative(-1.5f, -1.5f)
                curveToRelative(-0.25f, -0.25f, -0.63f, -0.33f, -0.96f, -0.19f)
                curveToRelative(-0.33f, 0.14f, -0.54f, 0.46f, -0.54f, 0.81f)
                verticalLineToRelative(1.12f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.12f)
                curveToRelative(0f, 0.35f, 0.21f, 0.68f, 0.54f, 0.81f)
                curveToRelative(0.11f, 0.04f, 0.22f, 0.07f, 0.34f, 0.07f)
                curveToRelative(0.23f, 0f, 0.45f, -0.09f, 0.62f, -0.26f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.69f, -0.69f, 0.69f, -1.8f, 0f, -2.48f)
                close()
            }
        }.also { _BookCircleArrowRight = it}
