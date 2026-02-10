package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontal: ImageVector? = null

val Icons.Ss.ReflectHorizontal: ImageVector
    get() = _ReflectHorizontal ?: UXIcon(name = "ReflectHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 2.75f)
                lineTo(0f, 21.25f)
                lineToRelative(8.24f, -7.54f)
                curveToRelative(0.49f, -0.43f, 0.76f, -1.06f, 0.76f, -1.71f)
                reflectiveCurveToRelative(-0.28f, -1.28f, -0.76f, -1.7f)
                lineTo(0f, 2.75f)
                close()
                moveTo(15.75f, 10.29f)
                curveToRelative(-0.49f, 0.44f, -0.76f, 1.06f, -0.76f, 1.71f)
                reflectiveCurveToRelative(0.28f, 1.27f, 0.76f, 1.7f)
                lineToRelative(8.24f, 7.54f)
                lineTo(23.99f, 2.75f)
                lineToRelative(-8.24f, 7.54f)
                close()
                moveTo(11f, 0f)
                horizontalLineToRelative(2f)
                lineTo(13f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                close()
            }
        }.also { _ReflectHorizontal = it}
