package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CopyImage: ImageVector? = null

val Icons.Bs.CopyImage: ImageVector
    get() = _CopyImage ?: UXIcon(name = "CopyImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(11.5f)
                lineTo(5f, 17f)
                lineTo(5f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(8f, 14f)
                lineToRelative(5f, -5f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(4.7f, -4.78f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(8.5f, 5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(8f, 14f)
                close()
                moveTo(3f, 5.05f)
                curveToRelative(-1.69f, 0.25f, -3f, 1.69f, -3f, 3.45f)
                verticalLineToRelative(13.5f)
                lineTo(19f, 22f)
                verticalLineToRelative(-3f)
                lineTo(3f, 19f)
                lineTo(3f, 5.05f)
                close()
            }
        }.also { _CopyImage = it}
