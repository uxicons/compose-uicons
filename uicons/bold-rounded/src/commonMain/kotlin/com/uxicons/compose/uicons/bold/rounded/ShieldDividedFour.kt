package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldDividedFour: ImageVector? = null

val Icons.Br.ShieldDividedFour: ImageVector
    get() = _ShieldDividedFour ?: UXIcon(name = "ShieldDividedFour") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.38f, 2.04f)
            lineTo(12.47f, 0.08f)
            curveToRelative(-0.01f, -0.01f, -0.03f, -0.0f, -0.05f, -0.01f)
            curveToRelative(-0.14f, -0.04f, -0.28f, -0.07f, -0.42f, -0.07f)
            reflectiveCurveToRelative(-0.29f, 0.03f, -0.42f, 0.07f)
            curveToRelative(-0.01f, 0.01f, -0.03f, 0.0f, -0.05f, 0.01f)
            lineToRelative(-5.91f, 1.96f)
            curveToRelative(-2.16f, 0.72f, -3.62f, 2.73f, -3.62f, 5.01f)
            verticalLineToRelative(5.11f)
            curveToRelative(0f, 6.52f, 6.85f, 10.45f, 8.95f, 11.5f)
            curveToRelative(0f, 0f, 0.64f, 0.35f, 1.05f, 0.35f)
            reflectiveCurveToRelative(0.95f, -0.27f, 0.95f, -0.27f)
            curveToRelative(2.12f, -0.85f, 9.04f, -4.21f, 9.04f, -11.58f)
            lineTo(22.0f, 7.05f)
            curveToRelative(0f, -2.28f, -1.45f, -4.29f, -3.62f, -5.01f)
            close()
            moveTo(19f, 7.05f)
            verticalLineToRelative(2.95f)
            horizontalLineToRelative(-5.5f)
            lineTo(13.5f, 3.58f)
            lineToRelative(3.94f, 1.31f)
            curveToRelative(0.93f, 0.31f, 1.56f, 1.18f, 1.56f, 2.16f)
            close()
            moveTo(6.56f, 4.88f)
            lineToRelative(3.94f, -1.31f)
            verticalLineToRelative(6.42f)
            lineTo(5f, 10f)
            verticalLineToRelative(-2.95f)
            curveToRelative(0f, -0.98f, 0.63f, -1.85f, 1.56f, -2.16f)
            close()
            moveTo(5.06f, 13f)
            horizontalLineToRelative(5.44f)
            verticalLineToRelative(6.95f)
            curveToRelative(-2.12f, -1.35f, -5.0f, -3.74f, -5.44f, -6.95f)
            close()
            moveTo(13.5f, 20.15f)
            verticalLineToRelative(-7.15f)
            horizontalLineToRelative(5.45f)
            curveToRelative(-0.4f, 3.71f, -3.34f, 5.99f, -5.45f, 7.15f)
            close()
        }
    }.also { _ShieldDividedFour = it }
