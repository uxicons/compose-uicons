package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BriefcaseDollar: ImageVector? = null

val Icons.Ss.BriefcaseDollar: ImageVector
    get() = _BriefcaseDollar ?: UXIcon(name = "BriefcaseDollar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-17f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10.52f, 13.24f)
                lineTo(13.81f, 13.79f)
                curveToRelative(1.27f, 0.21f, 2.19f, 1.3f, 2.19f, 2.59f)
                curveToRelative(0f, 1.45f, -1.18f, 2.62f, -2.62f, 2.62f)
                horizontalLineToRelative(-0.38f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.34f, 0f, 0.62f, -0.28f, 0.62f, -0.62f)
                curveToRelative(0f, -0.31f, -0.22f, -0.56f, -0.52f, -0.62f)
                lineToRelative(-3.29f, -0.55f)
                curveToRelative(-1.27f, -0.21f, -2.19f, -1.3f, -2.19f, -2.59f)
                curveToRelative(0f, -1.45f, 1.18f, -2.62f, 2.62f, -2.62f)
                horizontalLineToRelative(0.38f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(-0.34f, 0f, -0.62f, 0.28f, -0.62f, 0.62f)
                curveToRelative(0f, 0.31f, 0.22f, 0.56f, 0.52f, 0.62f)
                close()
                moveTo(16f, 4f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                close()
            }
        }.also { _BriefcaseDollar = it}
