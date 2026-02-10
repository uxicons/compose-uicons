package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Images: ImageVector? = null

val Icons.Ts.Images: ImageVector
    get() = _Images ?: UXIcon(name = "Images") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(24f, 2.5f)
                verticalLineToRelative(13.5f)
                lineTo(4f, 16f)
                lineTo(4f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(5f, 2.5f)
                lineTo(5f, 14.82f)
                lineTo(13.03f, 6.79f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(6.67f, -6.67f)
                verticalLineToRelative(-0.92f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(6.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(23f, 15f)
                lineTo(23f, 4.83f)
                lineToRelative(-6.67f, 6.67f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-6.79f, 6.79f)
                lineTo(23f, 14.99f)
                close()
                moveTo(18.62f, 22.78f)
                lineTo(1.22f, 18.13f)
                lineToRelative(0.78f, -2.9f)
                verticalLineToRelative(-3.87f)
                lineTo(0f, 18.84f)
                lineToRelative(19.32f, 5.16f)
                lineToRelative(1.6f, -6f)
                horizontalLineToRelative(-1.03f)
                lineToRelative(-1.28f, 4.78f)
                close()
            }
        }.also { _Images = it}
