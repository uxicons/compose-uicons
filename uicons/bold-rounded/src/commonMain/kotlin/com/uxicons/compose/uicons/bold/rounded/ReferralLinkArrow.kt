package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferralLinkArrow: ImageVector? = null

val Icons.Br.ReferralLinkArrow: ImageVector
    get() = _ReferralLinkArrow ?: UXIcon(name = "ReferralLinkArrow") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.72f, 20.18f)
            lineToRelative(-3.06f, 3.06f)
            curveToRelative(-0.61f, 0.61f, -1.65f, 0.18f, -1.65f, -0.69f)
            verticalLineToRelative(-1.56f)
            horizontalLineTo(1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineTo(19.0f)
            verticalLineToRelative(-1.56f)
            curveToRelative(0f, -0.86f, 1.04f, -1.29f, 1.65f, -0.69f)
            lineToRelative(3.06f, 3.06f)
            curveToRelative(0.38f, 0.38f, 0.38f, 0.99f, 0f, 1.37f)
            close()
            moveTo(18.2f, 3.07f)
            curveToRelative(1.62f, 0.33f, 2.8f, 1.77f, 2.8f, 3.43f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
            horizontalLineToRelative(4f)
            curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
            curveToRelative(0f, -3.08f, -2.19f, -5.76f, -5.2f, -6.37f)
            curveToRelative(-0.82f, -0.16f, -1.6f, 0.36f, -1.77f, 1.17f)
            curveToRelative(-0.17f, 0.81f, 0.36f, 1.6f, 1.17f, 1.77f)
            close()
            moveTo(5.2f, 12.87f)
            curveToRelative(0.79f, 0.17f, 1.61f, -0.35f, 1.77f, -1.17f)
            curveToRelative(0.17f, -0.81f, -0.36f, -1.6f, -1.17f, -1.77f)
            curveToRelative(-1.62f, -0.33f, -2.8f, -1.77f, -2.8f, -3.43f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(4f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
            horizontalLineTo(6.5f)
            curveTo(2.92f, 0f, 0f, 2.92f, 0f, 6.5f)
            curveToRelative(0f, 3.08f, 2.19f, 5.76f, 5.2f, 6.37f)
            close()
        }
    }.also { _ReferralLinkArrow = it }
