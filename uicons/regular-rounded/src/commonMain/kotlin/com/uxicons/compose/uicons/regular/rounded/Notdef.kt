package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Notdef: ImageVector? = null

val Icons.Rr.Notdef: ImageVector
    get() = _Notdef ?: UXIcon(name = "Notdef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 0f)
                lineTo(8f, 0f)
                curveTo(5.24f, 0f, 3f, 2.24f, 3f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(21f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(13.24f, 12f)
                lineToRelative(5.65f, -7.77f)
                curveToRelative(0.07f, 0.25f, 0.11f, 0.5f, 0.11f, 0.77f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.27f, -0.05f, 0.52f, -0.11f, 0.77f)
                lineToRelative(-5.65f, -7.77f)
                close()
                moveTo(16f, 2f)
                curveToRelative(0.62f, 0f, 1.19f, 0.19f, 1.67f, 0.51f)
                lineToRelative(-5.67f, 7.79f)
                lineTo(6.33f, 2.51f)
                curveToRelative(0.48f, -0.32f, 1.05f, -0.51f, 1.67f, -0.51f)
                horizontalLineToRelative(8f)
                close()
                moveTo(5.11f, 19.77f)
                curveToRelative(-0.07f, -0.25f, -0.11f, -0.5f, -0.11f, -0.77f)
                lineTo(5f, 5f)
                curveToRelative(0f, -0.27f, 0.05f, -0.52f, 0.11f, -0.77f)
                lineToRelative(5.65f, 7.77f)
                lineToRelative(-5.65f, 7.77f)
                close()
                moveTo(8f, 22f)
                curveToRelative(-0.62f, 0f, -1.19f, -0.19f, -1.67f, -0.51f)
                lineToRelative(5.67f, -7.79f)
                lineToRelative(5.67f, 7.79f)
                curveToRelative(-0.48f, 0.32f, -1.05f, 0.51f, -1.67f, 0.51f)
                lineTo(8f, 22f)
                close()
            }
        }.also { _Notdef = it}
