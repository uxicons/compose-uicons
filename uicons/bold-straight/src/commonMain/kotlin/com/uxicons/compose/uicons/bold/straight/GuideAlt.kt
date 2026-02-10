package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GuideAlt: ImageVector? = null

val Icons.Bs.GuideAlt: ImageVector
    get() = _GuideAlt ?: UXIcon(name = "GuideAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.59f, 21f)
                lineTo(4f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.07f)
                curveToRelative(-0.04f, -0.33f, -0.07f, -0.66f, -0.07f, -1f)
                curveToRelative(0f, -0.69f, 0.1f, -1.36f, 0.26f, -2f)
                horizontalLineToRelative(-1.26f)
                lineTo(9f, 3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7.07f)
                curveToRelative(1.08f, 0.14f, 2.1f, 0.49f, 3f, 1.01f)
                lineTo(22f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(4f, 0f)
                curveTo(1.79f, 0f, 0f, 1.79f, 0f, 4f)
                verticalLineToRelative(16f)
                curveTo(0f, 22.21f, 1.79f, 24f, 4f, 24f)
                horizontalLineToRelative(8.72f)
                curveToRelative(-0.93f, -0.82f, -1.66f, -1.84f, -2.13f, -3f)
                close()
                moveTo(4f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.06f, -1f, 0.14f)
                lineTo(3f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(19f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _GuideAlt = it}
