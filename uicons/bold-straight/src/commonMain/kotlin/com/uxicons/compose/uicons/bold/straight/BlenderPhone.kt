package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlenderPhone: ImageVector? = null

val Icons.Bs.BlenderPhone: ImageVector
    get() = _BlenderPhone ?: UXIcon(name = "BlenderPhone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 16f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(-0.77f, 0f, -1.46f, -0.32f, -1.96f, -0.83f)
                curveTo(0.71f, 13.87f, 0.01f, 11.44f, 0f, 9f)
                curveToRelative(-0.01f, -2.39f, 0.64f, -4.79f, 2.02f, -6.17f)
                curveToRelative(0.5f, -0.5f, 1.19f, -0.83f, 1.96f, -0.83f)
                horizontalLineToRelative(2.02f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2.59f)
                curveToRelative(-0.46f, 1.07f, -0.68f, 2.05f, -0.69f, 3f)
                curveToRelative(-0.01f, 1.0f, 0.23f, 1.98f, 0.69f, 3f)
                horizontalLineToRelative(2.59f)
                verticalLineToRelative(4f)
                close()
                moveTo(24f, 20.5f)
                verticalLineToRelative(3.5f)
                lineTo(5f, 24f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.96f, 1.25f, -3.62f, 3f, -4.24f)
                lineTo(8f, 0f)
                horizontalLineToRelative(15.94f)
                lineToRelative(-2.72f, 16.34f)
                curveToRelative(1.63f, 0.68f, 2.79f, 2.29f, 2.79f, 4.16f)
                close()
                moveTo(11f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7.23f)
                lineToRelative(2.17f, -13f)
                horizontalLineToRelative(-9.4f)
                close()
                moveTo(21f, 20.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-10f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }.also { _BlenderPhone = it}
