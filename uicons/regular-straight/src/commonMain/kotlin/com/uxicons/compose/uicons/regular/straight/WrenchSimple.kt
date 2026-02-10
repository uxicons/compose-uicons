package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WrenchSimple: ImageVector? = null

val Icons.Rs.WrenchSimple: ImageVector
    get() = _WrenchSimple ?: UXIcon(name = "WrenchSimple") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 24f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.19f)
                lineToRelative(0.7f, -0.22f)
                curveToRelative(3.77f, -1.18f, 6.3f, -4.63f, 6.3f, -8.59f)
                curveToRelative(0f, -3.48f, -1.96f, -6.57f, -5f, -8.07f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(2.93f)
                curveToRelative(-3.04f, 1.5f, -5f, 4.59f, -5f, 8.07f)
                curveToRelative(0f, 3.95f, 2.53f, 7.4f, 6.3f, 8.59f)
                lineToRelative(0.7f, 0.22f)
                verticalLineToRelative(4.19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.75f)
                curveTo(3.78f, 19.61f, 1f, 15.58f, 1f, 11f)
                curveTo(1f, 6.17f, 4.09f, 1.95f, 8.7f, 0.51f)
                lineToRelative(1.3f, -0.41f)
                verticalLineTo(9f)
                horizontalLineToRelative(4f)
                verticalLineTo(0.1f)
                lineToRelative(1.3f, 0.41f)
                curveToRelative(4.61f, 1.45f, 7.7f, 5.67f, 7.7f, 10.49f)
                curveToRelative(0f, 4.58f, -2.78f, 8.61f, -7f, 10.25f)
                verticalLineToRelative(2.75f)
                close()
            }
        }.also { _WrenchSimple = it}
