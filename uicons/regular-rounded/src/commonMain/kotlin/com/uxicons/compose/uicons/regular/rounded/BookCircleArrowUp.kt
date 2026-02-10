package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookCircleArrowUp: ImageVector? = null

val Icons.Rr.BookCircleArrowUp: ImageVector
    get() = _BookCircleArrowUp ?: UXIcon(name = "BookCircleArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 22f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                lineTo(6f, 2f)
                horizontalLineToRelative(9f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(4f, 2.17f)
                verticalLineToRelative(13.83f)
                curveToRelative(-0.73f, 0f, -1.41f, 0.2f, -2f, 0.54f)
                lineTo(2f, 5f)
                curveToRelative(0f, -1.3f, 0.84f, -2.42f, 2f, -2.83f)
                close()
                moveTo(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(19.74f, 15.5f)
                curveToRelative(0.17f, 0.17f, 0.26f, 0.39f, 0.26f, 0.62f)
                curveToRelative(0f, 0.11f, -0.02f, 0.23f, -0.07f, 0.34f)
                curveToRelative(-0.14f, 0.33f, -0.46f, 0.54f, -0.81f, 0.54f)
                horizontalLineToRelative(-1.12f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.12f)
                curveToRelative(-0.35f, 0f, -0.68f, -0.21f, -0.81f, -0.54f)
                curveToRelative(-0.14f, -0.33f, -0.06f, -0.71f, 0.19f, -0.96f)
                lineToRelative(1.5f, -1.5f)
                curveToRelative(0.69f, -0.69f, 1.8f, -0.69f, 2.48f, 0f)
                lineToRelative(1.5f, 1.5f)
                close()
            }
        }.also { _BookCircleArrowUp = it}
