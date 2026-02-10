package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Images: ImageVector? = null

val Icons.Rs.Images: ImageVector
    get() = _Images ?: UXIcon(name = "Images") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.98f, 18f)
                horizontalLineToRelative(2.07f)
                lineToRelative(-1.54f, 5.67f)
                lineTo(0.17f, 18.69f)
                lineTo(3f, 8.28f)
                verticalLineToRelative(7.63f)
                lineToRelative(-0.37f, 1.37f)
                lineToRelative(14.48f, 3.93f)
                lineToRelative(0.87f, -3.21f)
                close()
                moveTo(10.5f, 7f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(13f)
                lineTo(5f, 16f)
                lineTo(5f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7f, 3f)
                lineTo(7f, 13.67f)
                lineToRelative(7.74f, -7.74f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(3.96f, -3.96f)
                lineTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(8f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(22f, 14f)
                verticalLineToRelative(-5.9f)
                lineToRelative(-3.96f, 3.96f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-5.24f, 5.24f)
                horizontalLineToRelative(12.5f)
                close()
            }
        }.also { _Images = it}
