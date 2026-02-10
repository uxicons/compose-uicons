package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserIndia: ImageVector? = null

val Icons.Sr.UserIndia: ImageVector
    get() = _UserIndia ?: UXIcon(name = "UserIndia") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 17.07f)
                curveToRelative(0.54f, 0.66f, 1.39f, 0.93f, 2f, 0.93f)
                reflectiveCurveToRelative(1.46f, -0.26f, 2f, -0.93f)
                verticalLineToRelative(6.92f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6.92f)
                close()
                moveTo(8f, 16.04f)
                curveToRelative(-0.29f, 0.06f, -0.62f, 0.17f, -1.0f, 0.39f)
                curveToRelative(-2.47f, 1.41f, -4.0f, 3.93f, -4.0f, 6.57f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-7.96f)
                close()
                moveTo(17.0f, 16.43f)
                curveToRelative(-0.37f, -0.21f, -0.7f, -0.33f, -0.99f, -0.38f)
                verticalLineToRelative(7.96f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -2.65f, -1.53f, -5.16f, -4.0f, -6.57f)
                close()
                moveTo(8.39f, 0.58f)
                curveToRelative(1.1f, -0.39f, 2.35f, -0.58f, 3.61f, -0.58f)
                curveToRelative(3.5f, 0f, 7f, 1.5f, 7f, 4.5f)
                curveToRelative(0f, 1.87f, -0.33f, 3.29f, -0.67f, 4.28f)
                curveToRelative(-1.55f, -0.85f, -5.88f, -3.46f, -9.94f, -8.2f)
                close()
                moveTo(5.67f, 8.78f)
                curveToRelative(-0.35f, -0.99f, -0.67f, -2.42f, -0.67f, -4.28f)
                curveToRelative(0f, -1.25f, 0.61f, -2.24f, 1.58f, -2.97f)
                curveToRelative(1.29f, 1.55f, 2.61f, 2.89f, 3.88f, 4.03f)
                curveToRelative(-2.11f, 1.69f, -3.9f, 2.74f, -4.78f, 3.22f)
                close()
                moveTo(17.74f, 10.74f)
                curveToRelative(-0.74f, 2.47f, -3.03f, 4.26f, -5.74f, 4.26f)
                reflectiveCurveToRelative(-4.99f, -1.8f, -5.74f, -4.26f)
                curveToRelative(0.82f, -0.42f, 3.04f, -1.66f, 5.73f, -3.85f)
                curveToRelative(2.69f, 2.2f, 4.92f, 3.43f, 5.74f, 3.85f)
                close()
            }
        }.also { _UserIndia = it}
