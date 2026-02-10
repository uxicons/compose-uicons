package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RegistrationPaper: ImageVector? = null

val Icons.Sr.RegistrationPaper: ImageVector
    get() = _RegistrationPaper ?: UXIcon(name = "RegistrationPaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(21.31f, 0f, 18f, 0f)
                close()
                moveTo(21.68f, 5.71f)
                lineToRelative(-2.7f, 2.61f)
                curveToRelative(-0.45f, 0.45f, -1.05f, 0.67f, -1.65f, 0.67f)
                reflectiveCurveToRelative(-1.2f, -0.23f, -1.66f, -0.67f)
                lineToRelative(-1.35f, -1.33f)
                curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.01f)
                lineToRelative(1.35f, 1.33f)
                curveToRelative(0.14f, 0.14f, 0.38f, 0.14f, 0.52f, -0.0f)
                lineToRelative(2.71f, -2.62f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
                close()
                moveTo(3f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-1f)
                curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(23.99f, 21.17f)
                curveToRelative(-0.01f, 0.16f, -0.03f, 0.28f, -0.05f, 0.33f)
                curveToRelative(-0.43f, 1.45f, -1.77f, 2.5f, -3.35f, 2.5f)
                horizontalLineToRelative(-9.35f)
                curveToRelative(0.48f, -0.72f, 0.76f, -1.58f, 0.76f, -2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.17f, 0f, 2.1f, 1.0f, 1.99f, 2.17f)
                close()
                moveTo(10f, 21.5f)
                curveToRelative(0f, 1.47f, -1.26f, 2.64f, -2.76f, 2.49f)
                curveToRelative(-1.3f, -0.13f, -2.24f, -1.32f, -2.24f, -2.63f)
                lineTo(5f, 1.5f)
                curveToRelative(0f, -0.54f, -0.12f, -1.04f, -0.34f, -1.5f)
                horizontalLineToRelative(8.06f)
                curveToRelative(-1.67f, 1.47f, -2.73f, 3.61f, -2.73f, 6f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                curveToRelative(0.69f, 0f, 1.36f, -0.1f, 2f, -0.26f)
                verticalLineToRelative(3.26f)
                horizontalLineToRelative(-5.5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                close()
            }
        }.also { _RegistrationPaper = it}
