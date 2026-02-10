package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlenderPhone: ImageVector? = null

val Icons.Ss.BlenderPhone: ImageVector
    get() = _BlenderPhone ?: UXIcon(name = "BlenderPhone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 16f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(-0.77f, 0f, -1.46f, -0.32f, -1.96f, -0.83f)
                curveTo(0.71f, 13.87f, 0.01f, 11.44f, 0f, 9f)
                curveToRelative(-0.01f, -2.39f, 0.64f, -4.79f, 2.02f, -6.17f)
                curveToRelative(0.5f, -0.5f, 1.19f, -0.83f, 1.96f, -0.83f)
                horizontalLineToRelative(2.02f)
                reflectiveCurveToRelative(0f, 4f, 0f, 4f)
                horizontalLineToRelative(-2.59f)
                curveToRelative(-0.46f, 1.07f, -0.68f, 2.05f, -0.69f, 3f)
                curveToRelative(-0.01f, 1.0f, 0.23f, 1.98f, 0.69f, 3f)
                horizontalLineToRelative(2.59f)
                verticalLineToRelative(4f)
                close()
                moveTo(24f, 22f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-13f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(19f)
                verticalLineToRelative(-2f)
                close()
                moveTo(8f, 14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(13.18f)
                lineTo(24.01f, 0f)
                lineTo(8f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _BlenderPhone = it}
