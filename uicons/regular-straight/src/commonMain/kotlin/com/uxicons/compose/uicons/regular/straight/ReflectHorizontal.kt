package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontal: ImageVector? = null

val Icons.Rs.ReflectHorizontal: ImageVector
    get() = _ReflectHorizontal ?: UXIcon(name = "ReflectHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.25f, 10.3f)
                lineTo(0f, 2.75f)
                lineTo(0f, 21.25f)
                lineToRelative(8.24f, -7.54f)
                curveToRelative(0.49f, -0.43f, 0.76f, -1.06f, 0.76f, -1.71f)
                reflectiveCurveToRelative(-0.28f, -1.28f, -0.76f, -1.7f)
                close()
                moveTo(6.9f, 12.23f)
                lineToRelative(-4.89f, 4.48f)
                lineTo(2.01f, 7.29f)
                lineToRelative(4.9f, 4.49f)
                curveToRelative(0.09f, 0.08f, 0.1f, 0.17f, 0.1f, 0.22f)
                reflectiveCurveToRelative(-0.01f, 0.14f, -0.11f, 0.23f)
                close()
                moveTo(15.76f, 10.29f)
                curveToRelative(-0.49f, 0.44f, -0.76f, 1.06f, -0.76f, 1.71f)
                reflectiveCurveToRelative(0.28f, 1.27f, 0.76f, 1.7f)
                lineToRelative(8.24f, 7.54f)
                lineTo(24f, 2.75f)
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
