package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ornament: ImageVector? = null

val Icons.Bs.Ornament: ImageVector
    get() = _Ornament ?: UXIcon(name = "Ornament") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 4.84f)
                verticalLineToRelative(-1.84f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(0.17f, -0.29f, 0.27f, -0.64f, 0.27f, -1f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.36f, 0.1f, 0.71f, 0.27f, 1f)
                horizontalLineToRelative(-2.27f)
                verticalLineToRelative(1.84f)
                curveToRelative(-3.53f, 1.55f, -6f, 5.07f, -6f, 9.16f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                curveToRelative(0f, -4.09f, -2.47f, -7.62f, -6f, -9.16f)
                close()
                moveTo(12f, 7f)
                curveToRelative(3.79f, 0f, 6.88f, 3.02f, 7.0f, 6.78f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(-3.46f, 3.46f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(-3.7f, 3.7f)
                curveToRelative(0f, -0.03f, -0.0f, -0.07f, -0.0f, -0.1f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-2.61f, 0f, -4.89f, -1.44f, -6.1f, -3.56f)
                lineToRelative(2.8f, -2.8f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(3.46f, -3.46f)
                lineToRelative(2.75f, 2.75f)
                curveToRelative(-1.17f, 2.24f, -3.51f, 3.77f, -6.21f, 3.77f)
                close()
            }
        }.also { _Ornament = it}
