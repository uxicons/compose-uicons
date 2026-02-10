package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlenderPhone: ImageVector? = null

val Icons.Rs.BlenderPhone: ImageVector
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
                moveTo(24f, 21f)
                verticalLineToRelative(3f)
                lineTo(5f, 24f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.86f, 1.28f, -3.43f, 3f, -3.87f)
                lineTo(8f, 0f)
                horizontalLineToRelative(16.01f)
                lineToRelative(-2.85f, 17.17f)
                curveToRelative(1.65f, 0.5f, 2.85f, 2.02f, 2.85f, 3.83f)
                close()
                moveTo(10f, 2f)
                verticalLineToRelative(3f)
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
                verticalLineToRelative(2f)
                horizontalLineToRelative(9.15f)
                lineToRelative(2.5f, -15f)
                horizontalLineToRelative(-11.65f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-11f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _BlenderPhone = it}
