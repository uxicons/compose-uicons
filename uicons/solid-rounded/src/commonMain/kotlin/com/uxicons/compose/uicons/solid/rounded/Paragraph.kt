package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paragraph: ImageVector? = null

val Icons.Sr.Paragraph: ImageVector
    get() = _Paragraph ?: UXIcon(name = "Paragraph") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 0f)
                horizontalLineToRelative(-14.5f)
                curveTo(3.81f, 0f, 0f, 3.81f, 0f, 8.5f)
                reflectiveCurveToRelative(3.81f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Paragraph = it}
