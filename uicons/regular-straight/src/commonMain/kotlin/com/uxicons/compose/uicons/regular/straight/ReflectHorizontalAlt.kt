package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontalAlt: ImageVector? = null

val Icons.Rs.ReflectHorizontalAlt: ImageVector
    get() = _ReflectHorizontalAlt ?: UXIcon(name = "ReflectHorizontalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.76f, 10.29f)
                curveToRelative(-0.49f, 0.44f, -0.76f, 1.05f, -0.76f, 1.71f)
                curveToRelative(0f, 0.65f, 0.28f, 1.27f, 0.75f, 1.69f)
                lineToRelative(8.25f, 7.55f)
                lineTo(24f, 2.75f)
                lineToRelative(-8.24f, 7.54f)
                close()
                moveTo(22f, 16.7f)
                lineToRelative(-4.9f, -4.49f)
                curveToRelative(-0.06f, -0.05f, -0.1f, -0.13f, -0.1f, -0.21f)
                curveToRelative(0f, -0.09f, 0.03f, -0.17f, 0.1f, -0.23f)
                lineToRelative(4.9f, -4.48f)
                verticalLineToRelative(9.41f)
                close()
                moveTo(0f, 2.75f)
                lineTo(0f, 21.24f)
                lineToRelative(8.24f, -7.54f)
                curveToRelative(0.48f, -0.43f, 0.76f, -1.05f, 0.76f, -1.7f)
                curveToRelative(0f, -0.66f, -0.27f, -1.27f, -0.75f, -1.71f)
                lineTo(0f, 2.75f)
                close()
                moveTo(6.9f, 12.22f)
                lineToRelative(-4.9f, 4.48f)
                lineTo(2f, 7.29f)
                lineToRelative(4.9f, 4.48f)
                curveToRelative(0.07f, 0.06f, 0.1f, 0.13f, 0.1f, 0.23f)
                curveToRelative(0f, 0.08f, -0.04f, 0.16f, -0.1f, 0.22f)
                close()
                moveTo(11f, 0f)
                horizontalLineToRelative(2f)
                lineTo(13f, 24f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                close()
            }
        }.also { _ReflectHorizontalAlt = it}
