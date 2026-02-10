package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EditMessage: ImageVector? = null

val Icons.Bs.EditMessage: ImageVector
    get() = _EditMessage ?: UXIcon(name = "EditMessage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 8.91f)
                lineToRelative(3f, -3f)
                verticalLineToRelative(14.09f)
                horizontalLineToRelative(-6.67f)
                lineToRelative(-3.71f, 3.06f)
                curveToRelative(-0.45f, 0.4f, -1.02f, 0.6f, -1.61f, 0.6f)
                curveToRelative(-0.59f, 0f, -1.2f, -0.21f, -1.68f, -0.64f)
                lineToRelative(-3.6f, -3.03f)
                lineTo(0f, 20f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(14.59f)
                lineToRelative(-3f, 3f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                lineTo(7.84f, 17f)
                lineToRelative(4.17f, 3.51f)
                lineToRelative(4.24f, -3.51f)
                horizontalLineToRelative(4.75f)
                lineTo(21f, 8.91f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                reflectiveCurveToRelative(-2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-7.28f, 7.28f)
                verticalLineToRelative(3.09f)
                close()
            }
        }.also { _EditMessage = it}
