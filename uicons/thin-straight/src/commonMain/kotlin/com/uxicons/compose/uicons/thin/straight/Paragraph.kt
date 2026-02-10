package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paragraph: ImageVector? = null

val Icons.Ts.Paragraph: ImageVector
    get() = _Paragraph ?: UXIcon(name = "Paragraph") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 0f)
                curveTo(3.59f, 0f, 0f, 3.59f, 0f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1f)
                lineTo(16f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(23f)
                horizontalLineToRelative(1f)
                lineTo(21f, 1f)
                horizontalLineToRelative(3f)
                lineTo(24f, 0f)
                lineTo(8f, 0f)
                close()
                moveTo(15f, 15f)
                horizontalLineToRelative(-7f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveTo(4.14f, 1f, 8f, 1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(14f)
                close()
            }
        }.also { _Paragraph = it}
