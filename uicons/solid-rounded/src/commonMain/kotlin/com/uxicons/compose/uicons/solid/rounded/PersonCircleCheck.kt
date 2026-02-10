package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonCircleCheck: ImageVector? = null

val Icons.Sr.PersonCircleCheck: ImageVector
    get() = _PersonCircleCheck ?: UXIcon(name = "PersonCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 18f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(21.71f, 16.3f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.03f)
                lineToRelative(-2.71f, 2.62f)
                curveToRelative(-0.14f, 0.14f, -0.38f, 0.14f, -0.52f, 0.0f)
                lineToRelative(-1.35f, -1.33f)
                curveToRelative(-0.4f, -0.39f, -1.03f, -0.38f, -1.41f, 0.01f)
                curveToRelative(-0.39f, 0.4f, -0.38f, 1.03f, 0.01f, 1.41f)
                lineToRelative(1.35f, 1.33f)
                curveToRelative(0.46f, 0.45f, 1.06f, 0.67f, 1.66f, 0.67f)
                reflectiveCurveToRelative(1.2f, -0.23f, 1.65f, -0.67f)
                lineToRelative(2.7f, -2.61f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.03f, -1.41f)
                close()
                moveTo(12f, 10f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.48f, 0.81f, 2.77f, 2f, 3.46f)
                verticalLineToRelative(6.54f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.03f, 0.76f, -3.88f, 2f, -5.29f)
                verticalLineToRelative(-2.71f)
                close()
            }
        }.also { _PersonCircleCheck = it}
