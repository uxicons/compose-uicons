package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spyware: ImageVector? = null

val Icons.Bs.Spyware: ImageVector
    get() = _Spyware ?: UXIcon(name = "Spyware") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 1f)
                horizontalLineToRelative(-17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-18.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(9.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(21f, 20f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(18f)
                close()
                moveTo(5f, 18f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.26f, -1.76f, 1.24f, -5f, 3f, -5f)
                curveToRelative(1.04f, 0f, 1.68f, 0.79f, 2.2f, 1.43f)
                curveToRelative(0.08f, 0.1f, 0.2f, 0.24f, 0.3f, 0.36f)
                curveToRelative(0.11f, -0.12f, 0.22f, -0.26f, 0.3f, -0.36f)
                curveToRelative(0.52f, -0.64f, 1.16f, -1.43f, 2.2f, -1.43f)
                curveToRelative(1.77f, 0f, 2.75f, 3.24f, 3f, 5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _Spyware = it}
