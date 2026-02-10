package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellRay: ImageVector? = null

val Icons.Rs.DumbbellRay: ImageVector
    get() = _DumbbellRay ?: UXIcon(name = "DumbbellRay") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 17f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                lineTo(21f, 14f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                close()
                moveTo(18f, 17f)
                lineTo(6f, 17f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                lineTo(20f, 12f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                close()
                moveTo(1f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(2f)
                lineTo(1f, 19f)
                verticalLineToRelative(3f)
                lineTo(3f, 22f)
                lineTo(3f, 14f)
                lineTo(1f, 14f)
                verticalLineToRelative(3f)
                close()
                moveTo(6.88f, 9.22f)
                curveToRelative(-0.37f, -0.49f, -0.47f, -1.11f, -0.3f, -1.7f)
                lineTo(9.18f, 0f)
                horizontalLineToRelative(6.47f)
                lineToRelative(-1.54f, 4f)
                horizontalLineToRelative(1.77f)
                curveToRelative(0.7f, 0f, 1.35f, 0.39f, 1.68f, 1.0f)
                curveToRelative(0.33f, 0.62f, 0.3f, 1.37f, -0.09f, 1.95f)
                lineToRelative(-5.12f, 7.04f)
                horizontalLineToRelative(-2.98f)
                lineToRelative(0.97f, -4f)
                horizontalLineToRelative(-1.93f)
                curveToRelative(-0.61f, 0f, -1.18f, -0.28f, -1.54f, -0.78f)
                close()
                moveTo(8.52f, 8.03f)
                lineToRelative(3.1f, -0.03f)
                horizontalLineToRelative(1.27f)
                lineToRelative(-0.68f, 2.8f)
                lineToRelative(3.52f, -4.84f)
                lineToRelative(-4.53f, 0.05f)
                lineToRelative(1.54f, -4f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(-2.08f, 6.03f)
                close()
            }
        }.also { _DumbbellRay = it}
