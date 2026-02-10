package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideHeadphones: ImageVector? = null

val Icons.Sr.HeadSideHeadphones: ImageVector
    get() = _HeadSideHeadphones ?: UXIcon(name = "HeadSideHeadphones") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 9f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(19.8f, 4.42f)
                curveTo(17.88f, 1.86f, 15.07f, 0.31f, 12f, 0.04f)
                verticalLineToRelative(7.08f)
                curveToRelative(1.72f, 0.45f, 3f, 2.01f, 3f, 3.87f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.86f, 1.28f, -3.43f, 3f, -3.87f)
                lineTo(10f, 0.04f)
                curveToRelative(-0.18f, 0.02f, -0.36f, 0.04f, -0.55f, 0.06f)
                curveTo(4.46f, 0.79f, 0.5f, 4.95f, 0.05f, 9.98f)
                curveToRelative(-0.25f, 2.77f, 0.54f, 5.5f, 2.21f, 7.69f)
                curveToRelative(0.48f, 0.62f, 0.74f, 1.46f, 0.74f, 2.35f)
                verticalLineToRelative(0.97f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(0.49f)
                curveToRelative(2.5f, 0f, 4.63f, -1.87f, 4.96f, -4.34f)
                lineToRelative(0.22f, -1.66f)
                horizontalLineToRelative(0.33f)
                curveToRelative(1.3f, 0f, 2f, -1.03f, 2f, -2f)
                curveToRelative(0f, -1.42f, -2.93f, -7.01f, -4.2f, -8.58f)
                close()
            }
        }.also { _HeadSideHeadphones = it}
