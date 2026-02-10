package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBooth: ImageVector? = null

val Icons.Sr.PersonBooth: ImageVector
    get() = _PersonBooth ?: UXIcon(name = "PersonBooth") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 19.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(3.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(19.5f, 0f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-2.35f)
                reflectiveCurveToRelative(-2.4f, -3.43f, -2.4f, -3.43f)
                curveToRelative(-0.55f, -0.78f, -1.37f, -1.37f, -2.31f, -1.52f)
                curveToRelative(-2.11f, -0.34f, -3.94f, 1.29f, -3.94f, 3.35f)
                verticalLineToRelative(3.91f)
                curveToRelative(0f, 1.41f, 0.74f, 2.71f, 1.94f, 3.43f)
                lineToRelative(3.06f, 1.83f)
                verticalLineToRelative(4.43f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.43f)
                curveToRelative(0f, -0.7f, -0.37f, -1.35f, -0.97f, -1.71f)
                lineToRelative(-1.03f, -0.62f)
                verticalLineToRelative(-6.97f)
                lineToRelative(2.02f, 2.88f)
                curveToRelative(0.37f, 0.53f, 0.99f, 0.85f, 1.64f, 0.85f)
                horizontalLineToRelative(3.35f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3.52f)
                curveToRelative(-0.73f, 0f, -1.43f, -0.32f, -1.9f, -0.89f)
                curveToRelative(-0.48f, -0.57f, -0.69f, -1.32f, -0.56f, -2.06f)
                curveToRelative(0.45f, -2.65f, 1.79f, -4.64f, 2.81f, -5.8f)
                curveToRelative(-4.65f, -2.77f, -6.14f, -7.41f, -6.62f, -10.07f)
                curveToRelative(-0.1f, -0.54f, 0.27f, -1.06f, 0.81f, -1.16f)
                curveToRelative(0.56f, -0.1f, 1.06f, 0.27f, 1.16f, 0.81f)
                curveToRelative(0.44f, 2.46f, 1.88f, 6.9f, 6.54f, 9.18f)
                horizontalLineToRelative(1.28f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(19.98f, 19.39f)
                curveToRelative(-0.03f, 0.31f, 0.11f, 0.58f, 0.49f, 0.61f)
                horizontalLineToRelative(3.52f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1.13f)
                curveToRelative(-0.63f, 0.61f, -2.39f, 2.52f, -2.88f, 5.39f)
                close()
            }
        }.also { _PersonBooth = it}
