package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Recipe: ImageVector? = null

val Icons.Ss.Recipe: ImageVector
    get() = _Recipe ?: UXIcon(name = "Recipe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.97f, 0f)
                curveToRelative(0.64f, 0.84f, 1.03f, 1.87f, 1.03f, 3f)
                curveToRelative(0f, 1.6f, -0.77f, 3.07f, -2f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                lineTo(4f, 11f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(7f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-11.03f)
                close()
                moveTo(13f, 19f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
                moveTo(10f, 9f)
                lineTo(2f, 9f)
                verticalLineToRelative(-3.17f)
                curveToRelative(-1.16f, -0.41f, -2f, -1.52f, -2f, -2.83f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                curveToRelative(0.49f, 0f, 0.96f, 0.12f, 1.4f, 0.36f)
                curveTo(5.4f, -0.11f, 6.6f, -0.11f, 7.61f, 0.36f)
                curveToRelative(0.43f, -0.23f, 0.91f, -0.36f, 1.4f, -0.36f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.3f, -0.84f, 2.42f, -2f, 2.83f)
                verticalLineToRelative(3.17f)
                close()
                moveTo(19f, 23.41f)
                verticalLineToRelative(-4.41f)
                horizontalLineToRelative(4.41f)
                lineToRelative(-4.41f, 4.41f)
                close()
            }
        }.also { _Recipe = it}
