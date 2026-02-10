package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Friday: ImageVector? = null

val Icons.Bs.Friday: ImageVector
    get() = _Friday ?: UXIcon(name = "Friday") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                lineTo(3f, 10f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                lineTo(15f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(11f, 24f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(8f)
                close()
                moveTo(22f, 24f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8f)
                close()
                moveTo(19.83f, 20.54f)
                curveToRelative(0.02f, -0.01f, 0.04f, -0.02f, 0.06f, -0.04f)
                curveToRelative(-0.02f, 0.01f, -0.02f, 0.01f, -0.04f, 0.03f)
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
                close()
                moveTo(19.3f, 18.5f)
                curveToRelative(0f, -0.5f, -0.4f, -0.9f, -0.9f, -0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, -0.4f, 0.9f, -0.9f)
                close()
            }
        }.also { _Friday = it}
