package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBooth: ImageVector? = null

val Icons.Rs.PersonBooth: ImageVector
    get() = _PersonBooth ?: UXIcon(name = "PersonBooth") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(0f, 18.36f)
                verticalLineToRelative(5.64f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.4f)
                lineToRelative(-1.57f, -0.94f)
                curveToRelative(-0.15f, -0.09f, -0.29f, -0.19f, -0.43f, -0.3f)
                close()
                moveTo(11f, 24f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.69f, 1.71f, -6.34f, 2.88f, -7.73f)
                curveToRelative(-5.07f, -2.99f, -6.41f, -8.15f, -6.76f, -10.72f)
                curveToRelative(-0.07f, 0.14f, -0.13f, 0.29f, -0.13f, 0.46f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(-5.02f)
                lineToRelative(-1.98f, -2.83f)
                verticalLineToRelative(4.83f)
                lineToRelative(-2f, -1.2f)
                verticalLineToRelative(-5.81f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5.37f)
                curveToRelative(0f, 0.35f, 0.19f, 0.68f, 0.48f, 0.86f)
                lineToRelative(4.51f, 2.71f)
                verticalLineToRelative(6.07f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.93f)
                lineToRelative(-3.54f, -2.13f)
                curveToRelative(-0.9f, -0.54f, -1.46f, -1.52f, -1.46f, -2.57f)
                verticalLineToRelative(-5.37f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.96f)
                curveToRelative(0.98f, 0f, 1.9f, 0.48f, 2.46f, 1.28f)
                lineToRelative(2.6f, 3.72f)
                horizontalLineToRelative(1.98f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 14f)
                curveToRelative(-0.67f, 0.69f, -2.61f, 2.83f, -2.95f, 6f)
                horizontalLineToRelative(2.95f)
                close()
                moveTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-5.93f)
                curveToRelative(0.25f, 2.2f, 1.4f, 7.43f, 6.68f, 10f)
                horizontalLineToRelative(0.25f)
                verticalLineToRelative(-9f)
                close()
            }
        }.also { _PersonBooth = it}
