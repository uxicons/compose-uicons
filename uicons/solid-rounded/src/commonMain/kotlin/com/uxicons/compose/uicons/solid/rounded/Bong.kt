package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bong: ImageVector? = null

val Icons.Sr.Bong: ImageVector
    get() = _Bong ?: UXIcon(name = "Bong") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.89f, 9.02f)
                curveToRelative(0.19f, 0.15f, 0.41f, 0.23f, 0.63f, 0.23f)
                curveToRelative(0.29f, 0f, 0.58f, -0.12f, 0.77f, -0.37f)
                curveToRelative(0.35f, -0.43f, 0.29f, -1.06f, -0.14f, -1.41f)
                lineToRelative(-3.06f, -2.5f)
                curveToRelative(-0.43f, -0.35f, -1.06f, -0.29f, -1.41f, 0.14f)
                curveToRelative(-0.35f, 0.43f, -0.29f, 1.06f, 0.14f, 1.41f)
                lineToRelative(0.75f, 0.62f)
                lineToRelative(-1.43f, 1.74f)
                curveToRelative(-0.67f, -0.45f, -1.39f, -0.83f, -2.17f, -1.13f)
                lineTo(16.0f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                verticalLineToRelative(5.75f)
                curveToRelative(-4.22f, 1.64f, -7f, 5.67f, -7f, 10.25f)
                curveToRelative(0.06f, 3.19f, 2.76f, 6f, 6.0f, 6f)
                horizontalLineToRelative(9.99f)
                curveToRelative(3.25f, 0f, 5.94f, -2.81f, 6.0f, -6f)
                curveToRelative(0f, -3.04f, -1.23f, -5.83f, -3.29f, -7.85f)
                lineToRelative(1.43f, -1.75f)
                lineToRelative(0.75f, 0.62f)
                close()
                moveTo(20f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 16f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Bong = it}
