package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Capsules: ImageVector? = null

val Icons.Sr.Capsules: ImageVector
    get() = _Capsules ?: UXIcon(name = "Capsules") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 11f)
                verticalLineToRelative(-5f)
                curveTo(0f, 2.69f, 2.69f, 0f, 6f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                verticalLineToRelative(5f)
                lineTo(0f, 11f)
                close()
                moveTo(0f, 13f)
                verticalLineToRelative(5f)
                curveTo(0f, 21.31f, 2.69f, 24f, 6f, 24f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                verticalLineToRelative(-5f)
                lineTo(0f, 13f)
                close()
                moveTo(14f, 6f)
                verticalLineToRelative(5.89f)
                lineToRelative(5.92f, -3.16f)
                lineToRelative(-2.4f, -4.49f)
                curveToRelative(-1.08f, -2.02f, -3.14f, -3.19f, -5.29f, -3.23f)
                curveToRelative(1.1f, 1.37f, 1.76f, 3.11f, 1.76f, 5.0f)
                close()
                moveTo(23.28f, 15.01f)
                lineToRelative(-2.4f, -4.49f)
                lineToRelative(-6.88f, 3.67f)
                verticalLineToRelative(3.81f)
                curveToRelative(0f, 1.32f, -0.33f, 2.57f, -0.9f, 3.67f)
                curveToRelative(1.8f, 2.28f, 5.02f, 3.02f, 7.67f, 1.61f)
                curveToRelative(2.97f, -1.59f, 4.1f, -5.3f, 2.51f, -8.27f)
                close()
            }
        }.also { _Capsules = it}
