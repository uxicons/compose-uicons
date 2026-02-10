package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferralLinkArrow: ImageVector? = null

val Icons.Bs.ReferralLinkArrow: ImageVector
    get() = _ReferralLinkArrow ?: UXIcon(name = "ReferralLinkArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.01f, 6.5f)
                horizontalLineToRelative(-0.01f)
                curveTo(0f, 2.92f, 2.92f, 0f, 6.5f, 0f)
                horizontalLineToRelative(4f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(6.5f, 3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(0.01f, 1.67f, 1.18f, 3.08f, 2.77f, 3.41f)
                curveToRelative(0.42f, 0.95f, 1.02f, 1.83f, 1.78f, 2.59f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.17f, 0.17f, 0.28f, 0.35f, 0.46f, 0.5f)
                horizontalLineToRelative(-1.57f)
                curveToRelative(-1.8f, 0f, -3.37f, -0.76f, -4.55f, -1.93f)
                curveTo(0.73f, 9.93f, 0.04f, 8.46f, 0.01f, 6.5f)
                close()
                moveTo(16.46f, 0.5f)
                curveToRelative(0.76f, 0.76f, 1.36f, 1.64f, 1.78f, 2.59f)
                curveToRelative(1.58f, 0.33f, 2.75f, 1.74f, 2.77f, 3.41f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(4f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.03f, -1.96f, -0.72f, -3.43f, -1.87f, -4.57f)
                curveToRelative(-1.18f, -1.17f, -2.75f, -1.93f, -4.55f, -1.93f)
                horizontalLineToRelative(-1.57f)
                curveToRelative(0.17f, 0.15f, 0.29f, 0.34f, 0.46f, 0.5f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(20f, 15.0f)
                verticalLineToRelative(3f)
                lineTo(0f, 18.0f)
                verticalLineToRelative(3f)
                lineTo(20f, 21.0f)
                verticalLineToRelative(3f)
                lineToRelative(3.71f, -3.79f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(-3.71f, -3.79f)
                close()
            }
        }.also { _ReferralLinkArrow = it}
