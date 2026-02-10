package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReferralLinkArrow: ImageVector? = null

val Icons.Ts.ReferralLinkArrow: ImageVector
    get() = _ReferralLinkArrow ?: UXIcon(name = "ReferralLinkArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 6.5f)
                curveTo(0f, 2.92f, 2.92f, 0f, 6.5f, 0f)
                horizontalLineToRelative(4f)
                curveToRelative(3.58f, 0f, 6.5f, 2.92f, 6.5f, 6.5f)
                curveToRelative(0f, 1.29f, -0.38f, 2.49f, -1.03f, 3.5f)
                horizontalLineToRelative(-1.23f)
                curveToRelative(0.79f, -0.95f, 1.26f, -2.17f, 1.26f, -3.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                horizontalLineTo(6.5f)
                curveTo(3.47f, 1f, 1f, 3.47f, 1f, 6.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(0.53f)
                curveToRelative(0.31f, 0.36f, 0.64f, 0.69f, 1.0f, 1f)
                horizontalLineToRelative(-1.53f)
                curveTo(2.92f, 13f, 0f, 10.08f, 0f, 6.5f)
                close()
                moveTo(20.27f, 15.15f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.14f, 3.15f)
                horizontalLineTo(0f)
                verticalLineToRelative(1f)
                horizontalLineTo(22.7f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.3f, -3.3f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.52f, 0f, -2.1f)
                lineToRelative(-3.3f, -3.3f)
                close()
                moveTo(17.5f, 1f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                curveToRelative(0f, -1.33f, 0.47f, -2.55f, 1.26f, -3.5f)
                horizontalLineToRelative(-1.23f)
                curveToRelative(-0.65f, 1.01f, -1.03f, 2.21f, -1.03f, 3.5f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(4f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveTo(21.08f, 0f, 17.5f, 0f)
                horizontalLineToRelative(-1.53f)
                curveToRelative(0.36f, 0.3f, 0.7f, 0.64f, 1.0f, 1f)
                horizontalLineToRelative(0.53f)
                close()
            }
        }.also { _ReferralLinkArrow = it}
