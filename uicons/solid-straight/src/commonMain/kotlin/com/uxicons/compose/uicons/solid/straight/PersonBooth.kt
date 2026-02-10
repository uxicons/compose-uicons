package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBooth: ImageVector? = null

val Icons.Ss.PersonBooth: ImageVector
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
                moveTo(22.9f, 14f)
                curveToRelative(-0.67f, 0.69f, -2.51f, 2.83f, -2.85f, 6f)
                horizontalLineToRelative(3.95f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1.1f)
                close()
                moveTo(18f, 21f)
                curveToRelative(0f, -3.69f, 1.71f, -6.34f, 2.88f, -7.73f)
                curveToRelative(-5.46f, -3.22f, -6.59f, -8.95f, -6.82f, -11.27f)
                horizontalLineToRelative(2.01f)
                curveToRelative(0.25f, 2.2f, 1.4f, 7.43f, 6.67f, 10f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2.46f)
                lineToRelative(-2.6f, -3.72f)
                curveToRelative(-0.56f, -0.8f, -1.48f, -1.28f, -2.46f, -1.28f)
                horizontalLineToRelative(-0.48f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5.37f)
                curveToRelative(0f, 1.05f, 0.56f, 2.03f, 1.46f, 2.57f)
                lineToRelative(3.54f, 2.13f)
                verticalLineToRelative(4.93f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.07f)
                lineToRelative(-2f, -1.2f)
                verticalLineToRelative(-7.3f)
                lineToRelative(2.5f, 3.57f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _PersonBooth = it}
