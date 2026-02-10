package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferralLinkArrow: ImageVector? = null

val Icons.Rs.ReferralLinkArrow: ImageVector
    get() = _ReferralLinkArrow ?: UXIcon(name = "ReferralLinkArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.42f, 17.59f)
                curveToRelative(0.77f, 0.78f, 0.77f, 2.04f, 0f, 2.81f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineTo(21.01f)
                lineToRelative(-2.3f, -2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.3f, 3.3f)
                close()
                moveTo(17.71f, 2.02f)
                curveToRelative(2.38f, 0.11f, 4.29f, 2.07f, 4.29f, 4.48f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                curveToRelative(0f, -0.93f, 0.28f, -1.78f, 0.76f, -2.5f)
                horizontalLineToRelative(-2.26f)
                curveToRelative(-0.32f, 0.77f, -0.5f, 1.61f, -0.5f, 2.5f)
                curveToRelative(0f, 0f, 0f, 0.02f, 0.0f, 0.05f)
                curveToRelative(0.03f, 3.56f, 2.93f, 6.45f, 6.5f, 6.45f)
                horizontalLineToRelative(4f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveTo(21.08f, 0f, 17.5f, 0f)
                horizontalLineToRelative(-1.53f)
                curveToRelative(0.68f, 0.58f, 1.27f, 1.26f, 1.75f, 2.02f)
                close()
                moveTo(6.5f, 13f)
                horizontalLineToRelative(1.53f)
                curveToRelative(-0.68f, -0.58f, -1.27f, -1.26f, -1.75f, -2.02f)
                curveToRelative(-2.38f, -0.11f, -4.29f, -2.07f, -4.29f, -4.48f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(4f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 0.93f, -0.28f, 1.78f, -0.76f, 2.5f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.32f, -0.77f, 0.5f, -1.61f, 0.5f, -2.5f)
                curveToRelative(0f, 0f, 0f, -0.02f, -0.0f, -0.05f)
                curveToRelative(-0.03f, -3.56f, -2.93f, -6.45f, -6.5f, -6.45f)
                horizontalLineTo(6.5f)
                curveTo(2.92f, 0f, 0f, 2.92f, 0f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                close()
            }
        }.also { _ReferralLinkArrow = it}
