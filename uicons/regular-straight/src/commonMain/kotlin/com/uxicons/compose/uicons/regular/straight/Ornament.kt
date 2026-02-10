package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ornament: ImageVector? = null

val Icons.Rs.Ornament: ImageVector
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
                moveTo(12f, 6f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                curveToRelative(0f, 0.18f, -0.01f, 0.37f, -0.02f, 0.55f)
                lineToRelative(-3.96f, -3.96f)
                lineToRelative(-4.04f, 4.04f)
                lineToRelative(-3.85f, -3.85f)
                lineToRelative(-4.09f, 4.09f)
                curveToRelative(-0.03f, -0.28f, -0.05f, -0.57f, -0.05f, -0.86f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.31f, 0f, -6.16f, -2.02f, -7.37f, -4.89f)
                lineToRelative(3.5f, -3.5f)
                lineToRelative(3.85f, 3.85f)
                lineToRelative(4.04f, -4.04f)
                lineToRelative(3.45f, 3.45f)
                curveToRelative(-1.16f, 3f, -4.07f, 5.13f, -7.47f, 5.13f)
                close()
            }
        }.also { _Ornament = it}
