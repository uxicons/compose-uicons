package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldMinus: ImageVector? = null

val Icons.Rr.ShieldMinus: ImageVector
    get() = _ShieldMinus ?: UXIcon(name = "ShieldMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.57f, 2.13f)
                lineTo(12.31f, 0.05f)
                curveToRelative(-0.2f, -0.07f, -0.42f, -0.07f, -0.63f, 0f)
                lineToRelative(-6.26f, 2.08f)
                curveToRelative(-2.05f, 0.68f, -3.43f, 2.59f, -3.43f, 4.75f)
                verticalLineToRelative(5.17f)
                curveToRelative(0f, 6.56f, 7.0f, 10.58f, 9.15f, 11.65f)
                curveToRelative(0f, 0f, 0.47f, 0.31f, 0.85f, 0.31f)
                reflectiveCurveToRelative(0.79f, -0.24f, 0.79f, -0.24f)
                curveToRelative(2.16f, -0.87f, 9.21f, -4.28f, 9.21f, -11.72f)
                verticalLineToRelative(-5.17f)
                curveToRelative(0f, -2.16f, -1.38f, -4.07f, -3.43f, -4.75f)
                close()
                moveTo(20f, 12.04f)
                curveToRelative(0f, 6.18f, -6.09f, 9.11f, -7.95f, 9.86f)
                curveToRelative(-1.89f, -0.94f, -8.05f, -4.45f, -8.05f, -9.86f)
                verticalLineToRelative(-5.17f)
                curveToRelative(0f, -1.29f, 0.83f, -2.44f, 2.06f, -2.85f)
                lineToRelative(5.94f, -1.97f)
                lineToRelative(5.94f, 1.97f)
                curveToRelative(1.23f, 0.41f, 2.06f, 1.55f, 2.06f, 2.85f)
                verticalLineToRelative(5.17f)
                close()
                moveTo(16f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _ShieldMinus = it}
