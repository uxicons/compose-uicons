package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Paragraph: ImageVector? = null

val Icons.Ss.Paragraph: ImageVector
    get() = _Paragraph ?: UXIcon(name = "Paragraph") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                horizontalLineToRelative(-15.5f)
                curveTo(3.81f, 0f, 0f, 3.81f, 0f, 8.5f)
                reflectiveCurveToRelative(3.81f, 8.5f, 8.5f, 8.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                close()
            }
        }.also { _Paragraph = it}
