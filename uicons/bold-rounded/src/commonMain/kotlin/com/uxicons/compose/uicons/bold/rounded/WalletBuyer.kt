package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletBuyer: ImageVector? = null

val Icons.Br.WalletBuyer: ImageVector
    get() = _WalletBuyer ?: UXIcon(name = "WalletBuyer") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 8.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
            lineTo(4f, 8f)
            curveToRelative(-0.35f, 0f, -0.68f, -0.06f, -1f, -0.14f)
            verticalLineToRelative(10.14f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            lineTo(0f, 4f)
            curveTo(0f, 1.78f, 1.78f, 0.02f, 4.06f, 0f)
            horizontalLineToRelative(18.44f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(4.07f, 3f)
            curveToRelative(-0.6f, 0.01f, -1.07f, 0.44f, -1.07f, 1f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(16.5f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            close()
            moveTo(22f, 15f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
            reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
            close()
            moveTo(19f, 19f)
            curveToRelative(-2.28f, 0f, -4.22f, 1.4f, -4.93f, 3.36f)
            curveToRelative(-0.29f, 0.8f, 0.32f, 1.64f, 1.2f, 1.64f)
            horizontalLineToRelative(7.45f)
            curveToRelative(0.88f, 0f, 1.49f, -0.84f, 1.2f, -1.64f)
            curveToRelative(-0.71f, -1.96f, -2.65f, -3.36f, -4.93f, -3.36f)
            close()
        }
    }.also { _WalletBuyer = it }
