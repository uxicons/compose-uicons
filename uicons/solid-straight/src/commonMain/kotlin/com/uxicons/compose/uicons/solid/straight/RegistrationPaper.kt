package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RegistrationPaper: ImageVector? = null

val Icons.Ss.RegistrationPaper: ImageVector
    get() = _RegistrationPaper ?: UXIcon(name = "RegistrationPaper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(21.31f, 0f, 18f, 0f)
                close()
                moveTo(18.62f, 8.41f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.59f, -1.41f, 0.59f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.04f, -0.21f, -1.41f, -0.59f)
                lineToRelative(-2.01f, -2.01f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.01f, 2.01f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.62f, 3.62f)
                close()
                moveTo(3f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(0f, 5f)
                lineTo(0f, 1.5f)
                curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(20f, 17f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.47f, -1.26f, 2.64f, -2.76f, 2.49f)
                curveToRelative(-1.3f, -0.13f, -2.24f, -1.32f, -2.24f, -2.63f)
                lineTo(5f, 1.5f)
                curveToRelative(0f, -0.54f, -0.12f, -1.04f, -0.34f, -1.5f)
                horizontalLineToRelative(8.05f)
                curveToRelative(-1.66f, 1.47f, -2.71f, 3.61f, -2.71f, 6f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                curveToRelative(0.69f, 0f, 1.36f, -0.09f, 2f, -0.25f)
                verticalLineToRelative(3.25f)
                close()
                moveTo(12f, 19f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-9.26f)
                curveToRelative(0.48f, -0.72f, 0.76f, -1.58f, 0.76f, -2.5f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }.also { _RegistrationPaper = it}
