package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BriefcaseArrowRight: ImageVector? = null

val Icons.Ts.BriefcaseArrowRight: ImageVector
    get() = _BriefcaseArrowRight ?: UXIcon(name = "BriefcaseArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.06f, 13.44f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.54f, 0f, 2.12f)
                lineToRelative(-4.24f, 4.24f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.1f, -4.1f)
                lineTo(6f, 14.99f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10.21f)
                lineToRelative(-4.1f, -4.1f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.24f, 4.24f)
                close()
                moveTo(24f, 6.5f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.5f)
                lineTo(6f, 1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(7f, 4f)
                horizontalLineToRelative(10f)
                lineTo(17f, 1.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(7.5f, 1f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(23f, 6.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 23f)
                lineTo(23f, 23f)
                lineTo(23f, 6.5f)
                close()
            }
        }.also { _BriefcaseArrowRight = it}
