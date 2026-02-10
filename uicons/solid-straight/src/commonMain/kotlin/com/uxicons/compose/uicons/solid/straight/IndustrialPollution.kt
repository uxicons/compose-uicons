package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IndustrialPollution: ImageVector? = null

val Icons.Ss.IndustrialPollution: ImageVector
    get() = _IndustrialPollution ?: UXIcon(name = "IndustrialPollution") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 3f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(1f, -2f, 3.35f, -3f, 5f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0.64f, 0f, 1.22f, 0.25f, 1.66f, 0.65f)
                curveToRelative(0.51f, -0.4f, 1.14f, -0.65f, 1.84f, -0.65f)
                curveToRelative(0.73f, 0f, 1.39f, 0.27f, 1.91f, 0.71f)
                curveToRelative(0.58f, -0.44f, 1.3f, -0.71f, 2.09f, -0.71f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                curveToRelative(-1.1f, 0f, -2.06f, -0.52f, -2.71f, -1.3f)
                curveToRelative(-0.39f, 0.19f, -0.83f, 0.3f, -1.29f, 0.3f)
                curveToRelative(-1.0f, 0f, -1.88f, -0.5f, -2.43f, -1.25f)
                curveToRelative(-0.33f, 0.16f, -0.69f, 0.25f, -1.07f, 0.25f)
                curveToRelative(-0.81f, 0f, -1.53f, -0.4f, -1.99f, -1f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.28f, -0.44f, -0.65f, -0.96f, -1.5f, -1f)
                close()
                moveTo(17f, 14.8f)
                lineTo(24f, 8.5f)
                verticalLineToRelative(12.5f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.7f)
                lineToRelative(7f, -5.8f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(15f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _IndustrialPollution = it}
