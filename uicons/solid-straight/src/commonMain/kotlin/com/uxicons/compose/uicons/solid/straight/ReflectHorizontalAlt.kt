package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontalAlt: ImageVector? = null

val Icons.Ss.ReflectHorizontalAlt: ImageVector
    get() = _ReflectHorizontalAlt ?: UXIcon(name = "ReflectHorizontalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.76f, 10.29f)
                curveToRelative(-0.49f, 0.44f, -0.76f, 1.05f, -0.76f, 1.71f)
                curveToRelative(0f, 0.65f, 0.28f, 1.27f, 0.75f, 1.69f)
                lineToRelative(8.25f, 7.55f)
                verticalLineTo(2.75f)
                lineToRelative(-8.24f, 7.54f)
                close()
                moveTo(0f, 2.75f)
                verticalLineTo(21.24f)
                lineToRelative(8.24f, -7.54f)
                curveToRelative(0.48f, -0.43f, 0.76f, -1.05f, 0.76f, -1.7f)
                curveToRelative(0f, -0.66f, -0.27f, -1.27f, -0.75f, -1.71f)
                lineTo(0f, 2.75f)
                close()
                moveTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineTo(24f)
                horizontalLineToRelative(-2f)
                verticalLineTo(0f)
                close()
            }
        }.also { _ReflectHorizontalAlt = it}
