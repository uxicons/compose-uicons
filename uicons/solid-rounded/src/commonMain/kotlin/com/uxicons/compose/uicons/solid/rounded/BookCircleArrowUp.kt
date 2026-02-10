package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookCircleArrowUp: ImageVector? = null

val Icons.Sr.BookCircleArrowUp: ImageVector
    get() = _BookCircleArrowUp ?: UXIcon(name = "BookCircleArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.25f, 16f)
                horizontalLineToRelative(-4.25f)
                lineTo(6f, 0f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(5.25f)
                curveToRelative(-0.64f, -0.16f, -1.31f, -0.25f, -2f, -0.25f)
                curveToRelative(-3.73f, 0f, -6.86f, 2.55f, -7.75f, 6f)
                close()
                moveTo(2.4f, 16.06f)
                curveToRelative(-0.87f, 0.1f, -1.7f, 0.44f, -2.4f, 0.96f)
                lineTo(0f, 5f)
                curveTo(0f, 2.62f, 1.67f, 0.57f, 4f, 0.1f)
                verticalLineToRelative(15.9f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.2f, 0f, -0.41f, 0.02f, -0.6f, 0.06f)
                close()
                moveTo(12.71f, 24f)
                lineTo(3f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                curveToRelative(0f, 2.39f, 1.05f, 4.53f, 2.71f, 6f)
                close()
                moveTo(12f, 18f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                close()
                moveTo(19.24f, 15.0f)
                lineToRelative(1.5f, 1.5f)
                curveToRelative(0.17f, 0.17f, 0.26f, 0.39f, 0.26f, 0.62f)
                curveToRelative(0f, 0.11f, -0.02f, 0.23f, -0.07f, 0.34f)
                curveToRelative(-0.14f, 0.33f, -0.46f, 0.54f, -0.81f, 0.54f)
                horizontalLineToRelative(-1.12f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.12f)
                curveToRelative(-0.35f, 0f, -0.68f, -0.21f, -0.81f, -0.54f)
                curveToRelative(-0.14f, -0.33f, -0.06f, -0.71f, 0.19f, -0.96f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.69f, -0.69f, 1.8f, -0.69f, 2.48f, 0f)
                close()
            }
        }.also { _BookCircleArrowUp = it}
