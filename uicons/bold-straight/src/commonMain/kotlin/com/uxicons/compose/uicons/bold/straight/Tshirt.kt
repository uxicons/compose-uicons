package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tshirt: ImageVector? = null

val Icons.Bs.Tshirt: ImageVector
    get() = _Tshirt ?: UXIcon(name = "Tshirt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.67f, 1.21f)
                curveToRelative(-1.49f, -0.8f, -3.06f, -1.21f, -4.67f, -1.21f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.61f, 0f, -3.18f, 0.41f, -4.67f, 1.21f)
                curveTo(1.27f, 2.31f, 0f, 4.48f, 0f, 6.88f)
                verticalLineToRelative(6.12f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-6.12f)
                curveToRelative(0f, -2.4f, -1.27f, -4.57f, -3.33f, -5.67f)
                close()
                moveTo(21f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.12f)
                curveToRelative(0f, -1.29f, 0.67f, -2.45f, 1.75f, -3.03f)
                curveToRelative(1.05f, -0.56f, 2.41f, -0.85f, 3.52f, -0.85f)
                curveToRelative(0.81f, 1.21f, 2.17f, 2f, 3.73f, 2f)
                reflectiveCurveToRelative(2.93f, -0.8f, 3.73f, -2f)
                curveToRelative(1.11f, 0f, 2.47f, 0.29f, 3.52f, 0.85f)
                curveToRelative(1.08f, 0.58f, 1.75f, 1.74f, 1.75f, 3.03f)
                verticalLineToRelative(3.12f)
                close()
            }
        }.also { _Tshirt = it}
