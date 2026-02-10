package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paragraph: ImageVector? = null

val Icons.Bs.Paragraph: ImageVector
    get() = _Paragraph ?: UXIcon(name = "Paragraph") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                horizontalLineToRelative(-15.5f)
                curveTo(3.81f, 0f, 0f, 3.81f, 0f, 8.5f)
                reflectiveCurveToRelative(3.81f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                lineTo(16f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(3f)
                lineTo(21f, 3f)
                horizontalLineToRelative(3f)
                lineTo(24f, 0f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(-4.5f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(11f)
                close()
            }
        }.also { _Paragraph = it}
