package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ghost: ImageVector? = null

val Icons.Bs.Ghost: ImageVector
    get() = _Ghost ?: UXIcon(name = "Ghost") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(6.49f, 0f, 2f, 4.49f, 2f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(2.59f)
                curveToRelative(0.21f, -0.58f, 0.76f, -1f, 1.41f, -1f)
                reflectiveCurveToRelative(1.2f, 0.42f, 1.41f, 1f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.21f, -0.58f, 0.76f, -1f, 1.41f, -1f)
                reflectiveCurveToRelative(1.2f, 0.42f, 1.41f, 1f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.21f, -0.58f, 0.76f, -1f, 1.41f, -1f)
                reflectiveCurveToRelative(1.2f, 0.42f, 1.41f, 1f)
                horizontalLineToRelative(2.59f)
                verticalLineToRelative(-14f)
                curveTo(22f, 4.49f, 17.51f, 0f, 12f, 0f)
                close()
                moveTo(15f, 21.17f)
                curveToRelative(-0.8f, -0.72f, -1.84f, -1.17f, -3f, -1.17f)
                reflectiveCurveToRelative(-2.2f, 0.45f, -3f, 1.17f)
                curveToRelative(-0.8f, -0.72f, -1.84f, -1.17f, -3f, -1.17f)
                curveToRelative(-0.34f, 0f, -0.68f, 0.04f, -1f, 0.12f)
                verticalLineToRelative(-10.12f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                verticalLineToRelative(10.12f)
                curveToRelative(-0.32f, -0.07f, -0.66f, -0.12f, -1f, -0.12f)
                curveToRelative(-1.16f, 0f, -2.2f, 0.45f, -3f, 1.17f)
                close()
                moveTo(10f, 10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Ghost = it}
