package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CopyImage: ImageVector? = null

val Icons.Ss.CopyImage: ImageVector
    get() = _CopyImage ?: UXIcon(name = "CopyImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 20f)
                verticalLineToRelative(2f)
                lineTo(0f, 22f)
                lineTo(0f, 9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(14f)
                lineTo(19f, 20f)
                close()
                moveTo(24f, 5f)
                verticalLineToRelative(13f)
                lineTo(5f, 18f)
                lineTo(5f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(8f, 6.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(22f, 4.77f)
                lineToRelative(-6.11f, 6.11f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(-5.59f, 5.59f)
                verticalLineToRelative(2.83f)
                lineToRelative(5.59f, -5.59f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(6.11f, -6.11f)
                verticalLineToRelative(-2.83f)
                close()
            }
        }.also { _CopyImage = it}
