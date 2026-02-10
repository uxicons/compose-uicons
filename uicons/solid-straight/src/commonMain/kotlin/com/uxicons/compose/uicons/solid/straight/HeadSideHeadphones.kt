package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadSideHeadphones: ImageVector? = null

val Icons.Ss.HeadSideHeadphones: ImageVector
    get() = _HeadSideHeadphones ?: UXIcon(name = "HeadSideHeadphones") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 9f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(23.28f, 11.14f)
                curveToRelative(-1.18f, -2.71f, -2.29f, -5.26f, -3.48f, -6.72f)
                curveTo(17.88f, 1.86f, 15.07f, 0.31f, 12f, 0.04f)
                verticalLineToRelative(7.08f)
                curveToRelative(1.72f, 0.45f, 3f, 2.01f, 3f, 3.87f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.86f, 1.28f, -3.43f, 3f, -3.87f)
                lineTo(10f, 0.04f)
                curveToRelative(-0.18f, 0.02f, -0.36f, 0.04f, -0.55f, 0.06f)
                curveTo(4.46f, 0.79f, 0.5f, 4.95f, 0.05f, 9.98f)
                curveToRelative(-0.27f, 2.94f, 0.62f, 5.79f, 2.5f, 8.05f)
                curveToRelative(0.29f, 0.35f, 0.46f, 0.8f, 0.46f, 1.26f)
                verticalLineToRelative(4.71f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.25f)
                curveToRelative(1.5f, 0f, 2.78f, -1.12f, 2.97f, -2.61f)
                lineToRelative(0.45f, -3.39f)
                horizontalLineToRelative(2.33f)
                verticalLineToRelative(-2.21f)
                lineToRelative(-0.72f, -1.65f)
                close()
            }
        }.also { _HeadSideHeadphones = it}
