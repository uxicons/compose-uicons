package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Friday: ImageVector? = null

val Icons.Ss.Friday: ImageVector
    get() = _Friday ?: UXIcon(name = "Friday") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.6f, 17.6f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.4f)
                close()
                moveTo(23.6f, 16f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8f)
                close()
                moveTo(19.85f, 20.54f)
                lineToRelative(1.05f, 3.46f)
                horizontalLineToRelative(-1.74f)
                lineToRelative(-0.87f, -3f)
                horizontalLineToRelative(-0.78f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                curveToRelative(0f, 0.85f, -0.42f, 1.59f, -1.07f, 2.04f)
                curveToRelative(0.02f, -0.01f, 0.04f, -0.02f, 0.06f, -0.04f)
                curveToRelative(-0.02f, 0.01f, -0.02f, 0.01f, -0.04f, 0.03f)
                close()
                moveTo(19.3f, 18.5f)
                curveToRelative(0f, -0.5f, -0.4f, -0.9f, -0.9f, -0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, -0.4f, 0.9f, -0.9f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-4f)
                lineTo(0f, 10f)
                close()
                moveTo(24f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                close()
            }
        }.also { _Friday = it}
