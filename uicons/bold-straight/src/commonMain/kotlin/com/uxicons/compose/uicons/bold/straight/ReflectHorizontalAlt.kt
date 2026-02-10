package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontalAlt: ImageVector? = null

val Icons.Bs.ReflectHorizontalAlt: ImageVector
    get() = _ReflectHorizontalAlt ?: UXIcon(name = "ReflectHorizontalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.86f, 10.06f)
                curveToRelative(-0.55f, 0.49f, -0.86f, 1.2f, -0.86f, 1.94f)
                reflectiveCurveToRelative(0.32f, 1.45f, 0.85f, 1.93f)
                lineToRelative(8.15f, 7.46f)
                lineTo(24f, 2.61f)
                lineToRelative(-8.14f, 7.45f)
                close()
                moveTo(21f, 14.57f)
                lineToRelative(-2.81f, -2.57f)
                lineToRelative(2.81f, -2.57f)
                verticalLineToRelative(5.14f)
                close()
                moveTo(0f, 2.61f)
                lineTo(0f, 21.38f)
                lineToRelative(8.13f, -7.44f)
                curveToRelative(0.55f, -0.49f, 0.87f, -1.2f, 0.87f, -1.94f)
                reflectiveCurveToRelative(-0.32f, -1.45f, -0.85f, -1.94f)
                lineTo(0f, 2.61f)
                close()
                moveTo(3f, 14.57f)
                verticalLineToRelative(-5.15f)
                lineToRelative(2.81f, 2.57f)
                lineToRelative(-2.81f, 2.57f)
                close()
                moveTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 24f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 0f)
                close()
            }
        }.also { _ReflectHorizontalAlt = it}
