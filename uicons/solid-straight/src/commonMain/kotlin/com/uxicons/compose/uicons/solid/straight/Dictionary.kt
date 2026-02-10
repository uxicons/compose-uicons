package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dictionary: ImageVector? = null

val Icons.Ss.Dictionary: ImageVector
    get() = _Dictionary ?: UXIcon(name = "Dictionary") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.03f, 7.78f)
                lineToRelative(0.58f, 2.62f)
                horizontalLineToRelative(-1.41f)
                lineToRelative(0.65f, -2.68f)
                curveToRelative(0.02f, -0.07f, 0.05f, -0.12f, 0.1f, -0.12f)
                curveToRelative(0.01f, 0.01f, 0.06f, 0.06f, 0.08f, 0.18f)
                close()
                moveTo(22f, 2f)
                lineTo(22f, 18f)
                lineTo(4f, 18f)
                curveToRelative(-0.74f, -0.0f, -1.45f, 0.27f, -2f, 0.77f)
                lineTo(2f, 3f)
                curveTo(2f, 1.34f, 3.34f, 0f, 5f, 0f)
                horizontalLineToRelative(3f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(10.86f, 12.99f)
                lineToRelative(-1.27f, -5.57f)
                curveToRelative(-0.31f, -1.85f, -2.97f, -1.84f, -3.3f, -0.04f)
                lineToRelative(-1.29f, 5.61f)
                horizontalLineToRelative(1.58f)
                lineToRelative(0.24f, -0.99f)
                horizontalLineToRelative(2.15f)
                lineToRelative(0.22f, 0.99f)
                horizontalLineToRelative(1.67f)
                close()
                moveTo(13.5f, 8.4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.6f)
                close()
                moveTo(19f, 6f)
                horizontalLineToRelative(-4.55f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(2.56f)
                lineToRelative(-2.56f, 3.69f)
                verticalLineToRelative(1.72f)
                horizontalLineToRelative(4.55f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(-2.56f)
                lineToRelative(2.56f, -3.69f)
                verticalLineToRelative(-1.72f)
                close()
                moveTo(2f, 22f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                lineTo(22f, 24f)
                verticalLineToRelative(-4f)
                lineTo(4f, 20f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                close()
            }
        }.also { _Dictionary = it}
