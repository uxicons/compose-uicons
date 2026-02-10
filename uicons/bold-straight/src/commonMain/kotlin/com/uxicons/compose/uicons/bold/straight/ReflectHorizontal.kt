package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontal: ImageVector? = null

val Icons.Bs.ReflectHorizontal: ImageVector
    get() = _ReflectHorizontal ?: UXIcon(name = "ReflectHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 2.61f)
                lineTo(0f, 21.39f)
                lineToRelative(8.13f, -7.44f)
                curveToRelative(0.55f, -0.49f, 0.87f, -1.2f, 0.87f, -1.94f)
                reflectiveCurveToRelative(-0.32f, -1.45f, -0.86f, -1.93f)
                lineTo(0f, 2.61f)
                close()
                moveTo(3.01f, 14.57f)
                verticalLineToRelative(-5.15f)
                lineToRelative(2.81f, 2.57f)
                lineToRelative(-2.81f, 2.57f)
                close()
                moveTo(15.87f, 10.05f)
                curveToRelative(-0.55f, 0.5f, -0.87f, 1.2f, -0.87f, 1.94f)
                reflectiveCurveToRelative(0.32f, 1.45f, 0.86f, 1.93f)
                lineToRelative(8.14f, 7.45f)
                lineTo(24f, 2.62f)
                lineToRelative(-8.13f, 7.44f)
                close()
                moveTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 24f)
                horizontalLineToRelative(-3f)
                lineTo(10.5f, 0f)
                close()
            }
        }.also { _ReflectHorizontal = it}
