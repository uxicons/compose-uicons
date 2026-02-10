package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonCircleQuestion: ImageVector? = null

val Icons.Rs.PersonCircleQuestion: ImageVector
    get() = _PersonCircleQuestion ?: UXIcon(name = "PersonCircleQuestion") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.5f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                close()
                moveTo(22f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 2.41f, 1.72f, 4.43f, 4f, 4.9f)
                verticalLineToRelative(-1.9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.9f)
                curveToRelative(2.28f, -0.47f, 4f, -2.48f, 4f, -4.9f)
                close()
                moveTo(10f, 11.35f)
                curveToRelative(-1.25f, 1.54f, -2f, 3.51f, -2f, 5.65f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                lineTo(0f, 17f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.64f, 0f, 2.97f, 1.32f, 3.0f, 2.95f)
                curveToRelative(0f, 0.02f, 0.0f, 2.4f, 0.0f, 2.4f)
                close()
                moveTo(8f, 9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(17.54f, 13.05f)
                curveToRelative(-0.89f, -0.16f, -1.78f, 0.08f, -2.46f, 0.65f)
                curveToRelative(-0.68f, 0.57f, -1.07f, 1.41f, -1.07f, 2.3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.3f, 0.13f, -0.58f, 0.36f, -0.77f)
                curveToRelative(0.23f, -0.19f, 0.53f, -0.27f, 0.83f, -0.22f)
                curveToRelative(0.39f, 0.07f, 0.72f, 0.4f, 0.79f, 0.79f)
                curveToRelative(0.09f, 0.53f, -0.21f, 0.91f, -0.5f, 1.07f)
                curveToRelative(-0.44f, 0.24f, -1.48f, 0.81f, -1.48f, 2.12f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -0.05f, 0f, -0.12f, 0.45f, -0.37f)
                curveToRelative(1.12f, -0.62f, 1.73f, -1.89f, 1.51f, -3.16f)
                curveToRelative(-0.21f, -1.21f, -1.21f, -2.21f, -2.42f, -2.42f)
                close()
            }
        }.also { _PersonCircleQuestion = it}
